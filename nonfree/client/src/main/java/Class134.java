import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class134 implements Runnable {

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Lclient!wf;")
	private final Class260 aClass260_7 = new Class260();

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public int anInt3347 = 0;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	static {
		new Class151(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class134(@OriginalArg(0) Class124 arg0) {
		@Pc(20) Class215 local20 = arg0.method2529(this, 5);
		while (local20.anInt5791 == 0) {
			Static252.method2874(10L);
		}
		if (local20.anInt5791 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject10;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLclient!oc;I)Lclient!bq;")
	public Class1_Sub3_Sub2_Sub1 method2783(@OriginalArg(1) Class178 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub3_Sub2_Sub1 local7 = new Class1_Sub3_Sub2_Sub1();
		local7.aLong216 = arg1;
		local7.aClass178_1 = arg0;
		local7.anInt700 = 3;
		local7.aBoolean525 = false;
		this.method2789(local7);
		return local7;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public void method2784() {
		this.aBoolean254 = true;
		@Pc(9) Class260 local9 = this.aClass260_7;
		synchronized (this.aClass260_7) {
			this.aClass260_7.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!oc;I)Lclient!bq;")
	public Class1_Sub3_Sub2_Sub1 method2785(@OriginalArg(0) int arg0, @OriginalArg(1) Class178 arg1) {
		@Pc(9) Class1_Sub3_Sub2_Sub1 local9 = new Class1_Sub3_Sub2_Sub1();
		local9.anInt700 = 1;
		@Pc(15) Class260 local15 = this.aClass260_7;
		synchronized (this.aClass260_7) {
			@Pc(32) Class1_Sub3_Sub2_Sub1 local32 = (Class1_Sub3_Sub2_Sub1) this.aClass260_7.method5553();
			while (true) {
				if (local32 == null) {
					break;
				}
				if ((long) arg0 == local32.aLong216 && local32.aClass178_1 == arg1 && local32.anInt700 == 2) {
					local9.aBoolean524 = false;
					local9.aByteArray4 = local32.aByteArray4;
					return local9;
				}
				local32 = (Class1_Sub3_Sub2_Sub1) this.aClass260_7.method5556();
			}
		}
		local9.aByteArray4 = arg1.method3528(arg0);
		local9.aBoolean524 = false;
		local9.aBoolean525 = true;
		return local9;
	}

	@OriginalMember(owner = "client!kf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean254) {
			@Pc(6) Class260 local6 = this.aClass260_7;
			@Pc(14) Class1_Sub3_Sub2_Sub1 local14;
			synchronized (this.aClass260_7) {
				local14 = (Class1_Sub3_Sub2_Sub1) this.aClass260_7.method5550();
				if (local14 == null) {
					try {
						this.aClass260_7.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt3347--;
			}
			try {
				if (local14.anInt700 == 2) {
					local14.aClass178_1.method3530(local14.aByteArray4.length, local14.aByteArray4, (int) local14.aLong216);
				} else if (local14.anInt700 == 3) {
					local14.aByteArray4 = local14.aClass178_1.method3528((int) local14.aLong216);
				}
			} catch (@Pc(72) Exception local72) {
				Static211.method2815(local72, null);
			}
			local14.aBoolean524 = false;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[BBLclient!oc;)Lclient!bq;")
	public Class1_Sub3_Sub2_Sub1 method2788(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class178 arg2) {
		@Pc(7) Class1_Sub3_Sub2_Sub1 local7 = new Class1_Sub3_Sub2_Sub1();
		local7.aByteArray4 = arg1;
		local7.aBoolean525 = false;
		local7.aLong216 = arg0;
		local7.aClass178_1 = arg2;
		local7.anInt700 = 2;
		this.method2789(local7);
		return local7;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!bq;Z)V")
	private void method2789(@OriginalArg(0) Class1_Sub3_Sub2_Sub1 arg0) {
		@Pc(2) Class260 local2 = this.aClass260_7;
		synchronized (this.aClass260_7) {
			this.aClass260_7.method5557(arg0);
			this.anInt3347++;
			this.aClass260_7.notifyAll();
		}
	}
}
