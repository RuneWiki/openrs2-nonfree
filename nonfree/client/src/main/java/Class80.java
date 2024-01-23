import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class80 implements Runnable {

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Lclient!nb;")
	private Class104 aClass104_7 = new Class104();

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
	public int anInt2993 = 0;

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "Z")
	private boolean aBoolean151 = false;

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	public Class80() {
		@Pc(20) Class43 local20 = Static43.aClass66_1.method1615(5, this);
		while (local20.anInt1456 == 0) {
			Static230.method4022(10L);
		}
		if (local20.anInt1456 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject3;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!lc;I)Lclient!b;")
	public Class1_Sub2_Sub1_Sub1 method2267(@OriginalArg(1) Class90 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class1_Sub2_Sub1_Sub1 local9 = new Class1_Sub2_Sub1_Sub1();
		local9.anInt361 = 1;
		@Pc(22) Class104 local22 = this.aClass104_7;
		synchronized (this.aClass104_7) {
			@Pc(29) Class1_Sub2_Sub1_Sub1 local29 = (Class1_Sub2_Sub1_Sub1) this.aClass104_7.method3152();
			while (true) {
				if (local29 == null) {
					break;
				}
				if ((long) arg1 == local29.aLong198 && local29.aClass90_1 == arg0 && local29.anInt361 == 2) {
					local9.aBoolean102 = false;
					local9.aByteArray4 = local29.aByteArray4;
					return local9;
				}
				local29 = (Class1_Sub2_Sub1_Sub1) this.aClass104_7.method3151();
			}
		}
		local9.aByteArray4 = arg0.method2777(arg1);
		local9.aBoolean102 = false;
		local9.aBoolean103 = true;
		return local9;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!lc;[BZI)Lclient!b;")
	public Class1_Sub2_Sub1_Sub1 method2269(@OriginalArg(0) Class90 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub2_Sub1_Sub1 local7 = new Class1_Sub2_Sub1_Sub1();
		local7.aClass90_1 = arg0;
		local7.aByteArray4 = arg1;
		local7.aBoolean103 = false;
		local7.anInt361 = 2;
		local7.aLong198 = arg2;
		this.method2277(local7);
		return local7;
	}

	@OriginalMember(owner = "client!jm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean151) {
			@Pc(8) Class104 local8 = this.aClass104_7;
			@Pc(15) Class1_Sub2_Sub1_Sub1 local15;
			synchronized (this.aClass104_7) {
				local15 = (Class1_Sub2_Sub1_Sub1) this.aClass104_7.method3149();
				if (local15 == null) {
					try {
						this.aClass104_7.wait();
					} catch (@Pc(31) InterruptedException local31) {
					}
					continue;
				}
				this.anInt2993--;
			}
			try {
				if (local15.anInt361 == 2) {
					local15.aClass90_1.method2775((int) local15.aLong198, local15.aByteArray4, local15.aByteArray4.length);
				} else if (local15.anInt361 == 3) {
					local15.aByteArray4 = local15.aClass90_1.method2777((int) local15.aLong198);
				}
			} catch (@Pc(80) Exception local80) {
				Static217.method3829(null, local80);
			}
			local15.aBoolean102 = false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!b;I)V")
	private void method2277(@OriginalArg(0) Class1_Sub2_Sub1_Sub1 arg0) {
		@Pc(3) Class104 local3 = this.aClass104_7;
		synchronized (this.aClass104_7) {
			this.aClass104_7.method3145(arg0);
			this.anInt2993++;
			this.aClass104_7.notifyAll();
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	public void method2278() {
		this.aBoolean151 = true;
		@Pc(18) Class104 local18 = this.aClass104_7;
		synchronized (this.aClass104_7) {
			this.aClass104_7.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZILclient!lc;)Lclient!b;")
	public Class1_Sub2_Sub1_Sub1 method2279(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		@Pc(7) Class1_Sub2_Sub1_Sub1 local7 = new Class1_Sub2_Sub1_Sub1();
		local7.aBoolean103 = false;
		local7.aClass90_1 = arg1;
		local7.aLong198 = arg0;
		local7.anInt361 = 3;
		this.method2277(local7);
		return local7;
	}
}
