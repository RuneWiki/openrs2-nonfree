import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class38 implements Runnable {

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "Lclient!gba;")
	private final Class104 aClass104_1 = new Class104();

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
	public int anInt1024 = 0;

	@OriginalMember(owner = "client!bw", name = "q", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!gaa;)V")
	public Class38(@OriginalArg(0) Class102 arg0) {
		@Pc(20) Class157 local20 = arg0.method2391(5, this);
		while (local20.anInt4742 == 0) {
			Static209.method3565(10L);
		}
		if (local20.anInt4742 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject12;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IILclient!km;)Lclient!wq;")
	public Class1_Sub1_Sub4_Sub2 method980(@OriginalArg(1) int arg0, @OriginalArg(2) Class167 arg1) {
		@Pc(7) Class1_Sub1_Sub4_Sub2 local7 = new Class1_Sub1_Sub4_Sub2();
		local7.anInt9134 = 3;
		local7.aClass167_4 = arg1;
		local7.aBoolean636 = false;
		local7.aLong394 = arg0;
		this.method983(local7);
		return local7;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IILclient!km;[B)Lclient!wq;")
	public Class1_Sub1_Sub4_Sub2 method981(@OriginalArg(1) int arg0, @OriginalArg(2) Class167 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class1_Sub1_Sub4_Sub2 local7 = new Class1_Sub1_Sub4_Sub2();
		local7.aClass167_4 = arg1;
		local7.aByteArray126 = arg2;
		local7.aLong394 = arg0;
		local7.anInt9134 = 2;
		local7.aBoolean636 = false;
		this.method983(local7);
		return local7;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IBLclient!km;)Lclient!wq;")
	public Class1_Sub1_Sub4_Sub2 method982(@OriginalArg(0) int arg0, @OriginalArg(2) Class167 arg1) {
		@Pc(9) Class1_Sub1_Sub4_Sub2 local9 = new Class1_Sub1_Sub4_Sub2();
		local9.anInt9134 = 1;
		@Pc(15) Class104 local15 = this.aClass104_1;
		synchronized (this.aClass104_1) {
			@Pc(23) Class1_Sub1_Sub4_Sub2 local23 = (Class1_Sub1_Sub4_Sub2) this.aClass104_1.method2414();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong394 == (long) arg0 && local23.aClass167_4 == arg1 && local23.anInt9134 == 2) {
					local9.aByteArray126 = local23.aByteArray126;
					local9.aBoolean639 = false;
					return local9;
				}
				local23 = (Class1_Sub1_Sub4_Sub2) this.aClass104_1.method2417();
			}
		}
		local9.aByteArray126 = arg1.method4293(arg0);
		local9.aBoolean636 = true;
		local9.aBoolean639 = false;
		return local9;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!wq;I)V")
	private void method983(@OriginalArg(0) Class1_Sub1_Sub4_Sub2 arg0) {
		@Pc(12) Class104 local12 = this.aClass104_1;
		synchronized (this.aClass104_1) {
			this.aClass104_1.method2420(arg0);
			this.anInt1024++;
			this.aClass104_1.notifyAll();
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V")
	public void method984() {
		this.aBoolean67 = true;
		@Pc(9) Class104 local9 = this.aClass104_1;
		synchronized (this.aClass104_1) {
			this.aClass104_1.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!bw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean67) {
			@Pc(6) Class104 local6 = this.aClass104_1;
			@Pc(14) Class1_Sub1_Sub4_Sub2 local14;
			synchronized (this.aClass104_1) {
				local14 = (Class1_Sub1_Sub4_Sub2) this.aClass104_1.method2418();
				if (local14 == null) {
					try {
						this.aClass104_1.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt1024--;
			}
			try {
				if (local14.anInt9134 == 2) {
					local14.aClass167_4.method4291(local14.aByteArray126, (int) local14.aLong394, local14.aByteArray126.length);
				} else if (local14.anInt9134 == 3) {
					local14.aByteArray126 = local14.aClass167_4.method4293((int) local14.aLong394);
				}
			} catch (@Pc(70) Exception local70) {
				Static234.method4051(local70, null);
			}
			local14.aBoolean639 = false;
		}
	}
}
