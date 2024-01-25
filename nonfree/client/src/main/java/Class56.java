import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class56 implements Runnable {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!we;")
	private final Class212 aClass212_2 = new Class212();

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
	public int anInt1357 = 0;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!ne;)V")
	public Class56(@OriginalArg(0) Class139 arg0) {
		@Pc(20) Class16 local20 = arg0.method3855(this, 5);
		while (local20.anInt381 == 0) {
			Static20.method408(10L);
		}
		if (local20.anInt381 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!nf;I)Lclient!sb;")
	public Class5_Sub1_Sub4_Sub2 method1302(@OriginalArg(1) Class140 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class5_Sub1_Sub4_Sub2 local17 = new Class5_Sub1_Sub4_Sub2();
		local17.aClass140_3 = arg0;
		local17.aBoolean468 = false;
		local17.anInt5646 = 3;
		local17.aLong234 = arg1;
		this.method1304(local17);
		return local17;
	}

	@OriginalMember(owner = "client!ee", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean91) {
			@Pc(10) Class212 local10 = this.aClass212_2;
			@Pc(18) Class5_Sub1_Sub4_Sub2 local18;
			synchronized (this.aClass212_2) {
				local18 = (Class5_Sub1_Sub4_Sub2) this.aClass212_2.method5937();
				if (local18 == null) {
					try {
						this.aClass212_2.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt1357--;
			}
			try {
				if (local18.anInt5646 == 2) {
					local18.aClass140_3.method3883(local18.aByteArray89.length, (int) local18.aLong234, local18.aByteArray89);
				} else if (local18.anInt5646 == 3) {
					local18.aByteArray89 = local18.aClass140_3.method3884((int) local18.aLong234);
				}
			} catch (@Pc(78) Exception local78) {
				Static114.method1992(local78, null);
			}
			local18.aBoolean467 = false;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!sb;I)V")
	private void method1304(@OriginalArg(0) Class5_Sub1_Sub4_Sub2 arg0) {
		@Pc(6) Class212 local6 = this.aClass212_2;
		synchronized (this.aClass212_2) {
			this.aClass212_2.method5936(arg0);
			this.anInt1357++;
			this.aClass212_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public void method1305() {
		this.aBoolean91 = true;
		@Pc(9) Class212 local9 = this.aClass212_2;
		synchronized (this.aClass212_2) {
			this.aClass212_2.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!nf;I)Lclient!sb;")
	public Class5_Sub1_Sub4_Sub2 method1306(@OriginalArg(1) Class140 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5_Sub1_Sub4_Sub2 local9 = new Class5_Sub1_Sub4_Sub2();
		local9.anInt5646 = 1;
		@Pc(15) Class212 local15 = this.aClass212_2;
		synchronized (this.aClass212_2) {
			@Pc(23) Class5_Sub1_Sub4_Sub2 local23 = (Class5_Sub1_Sub4_Sub2) this.aClass212_2.method5943();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong234 && arg0 == local23.aClass140_3 && local23.anInt5646 == 2) {
					local9.aBoolean467 = false;
					local9.aByteArray89 = local23.aByteArray89;
					return local9;
				}
				local23 = (Class5_Sub1_Sub4_Sub2) this.aClass212_2.method5939();
			}
		}
		local9.aByteArray89 = arg0.method3884(arg1);
		local9.aBoolean468 = true;
		local9.aBoolean467 = false;
		return local9;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!nf;[BIZ)Lclient!sb;")
	public Class5_Sub1_Sub4_Sub2 method1311(@OriginalArg(0) Class140 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub1_Sub4_Sub2 local7 = new Class5_Sub1_Sub4_Sub2();
		local7.aBoolean468 = false;
		local7.aClass140_3 = arg0;
		local7.anInt5646 = 2;
		local7.aLong234 = arg2;
		local7.aByteArray89 = arg1;
		this.method1304(local7);
		return local7;
	}
}
