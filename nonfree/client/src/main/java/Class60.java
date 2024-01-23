import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class60 implements Runnable {

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "Lclient!oh;")
	private Class99 aClass99_8 = new Class99();

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
	public int anInt2774 = 0;

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class60() {
		@Pc(20) Class145 local20 = Static38.aClass28_1.method719(this, 5);
		while (local20.anInt5354 == 0) {
			Static30.method587(10L);
		}
		if (local20.anInt5354 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject7;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
	public void method2107() {
		this.aBoolean148 = true;
		@Pc(9) Class99 local9 = this.aClass99_8;
		synchronized (this.aClass99_8) {
			this.aClass99_8.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!ig", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean148) {
			@Pc(10) Class99 local10 = this.aClass99_8;
			@Pc(18) Class1_Sub2_Sub5_Sub1 local18;
			synchronized (this.aClass99_8) {
				local18 = (Class1_Sub2_Sub5_Sub1) this.aClass99_8.method2963();
				if (local18 == null) {
					try {
						this.aClass99_8.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt2774--;
			}
			try {
				if (local18.anInt1918 == 2) {
					local18.aClass71_1.method2350(local18.aByteArray24, (int) local18.aLong185, local18.aByteArray24.length);
				} else if (local18.anInt1918 == 3) {
					local18.aByteArray24 = local18.aClass71_1.method2351((int) local18.aLong185);
				}
			} catch (@Pc(78) Exception local78) {
				Static57.method1101(null, local78);
			}
			local18.aBoolean222 = false;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!ff;)V")
	private void method2108(@OriginalArg(1) Class1_Sub2_Sub5_Sub1 arg0) {
		@Pc(12) Class99 local12 = this.aClass99_8;
		synchronized (this.aClass99_8) {
			this.aClass99_8.method2973(arg0);
			this.anInt2774++;
			this.aClass99_8.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([BBILclient!kb;)Lclient!ff;")
	public Class1_Sub2_Sub5_Sub1 method2110(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class71 arg2) {
		@Pc(7) Class1_Sub2_Sub5_Sub1 local7 = new Class1_Sub2_Sub5_Sub1();
		local7.aClass71_1 = arg2;
		local7.anInt1918 = 2;
		local7.aLong185 = arg1;
		local7.aByteArray24 = arg0;
		local7.aBoolean221 = false;
		this.method2108(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!kb;IB)Lclient!ff;")
	public Class1_Sub2_Sub5_Sub1 method2111(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub2_Sub5_Sub1 local7 = new Class1_Sub2_Sub5_Sub1();
		local7.aClass71_1 = arg0;
		local7.aBoolean221 = false;
		local7.aLong185 = arg1;
		local7.anInt1918 = 3;
		this.method2108(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lclient!kb;IB)Lclient!ff;")
	public Class1_Sub2_Sub5_Sub1 method2112(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class1_Sub2_Sub5_Sub1 local9 = new Class1_Sub2_Sub5_Sub1();
		local9.anInt1918 = 1;
		@Pc(15) Class99 local15 = this.aClass99_8;
		synchronized (this.aClass99_8) {
			@Pc(32) Class1_Sub2_Sub5_Sub1 local32 = (Class1_Sub2_Sub5_Sub1) this.aClass99_8.method2970();
			while (true) {
				if (local32 == null) {
					break;
				}
				if ((long) arg1 == local32.aLong185 && arg0 == local32.aClass71_1 && local32.anInt1918 == 2) {
					local9.aByteArray24 = local32.aByteArray24;
					local9.aBoolean222 = false;
					return local9;
				}
				local32 = (Class1_Sub2_Sub5_Sub1) this.aClass99_8.method2969();
			}
		}
		local9.aByteArray24 = arg0.method2351(arg1);
		local9.aBoolean221 = true;
		local9.aBoolean222 = false;
		return local9;
	}
}
