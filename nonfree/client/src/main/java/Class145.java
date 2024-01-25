import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class145 implements Runnable {

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "Lclient!mq;")
	private final Class163 aClass163_5 = new Class163();

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "Z")
	private boolean aBoolean371 = false;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
	public int anInt4107 = 0;

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!nt;)V")
	public Class145(@OriginalArg(0) Class177 arg0) {
		@Pc(20) Class253 local20 = arg0.method3840(this, 5);
		while (local20.anInt6669 == 0) {
			Static331.method4343(10L);
		}
		if (local20.anInt6669 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject9;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILclient!wk;I)Lclient!ep;")
	public Class1_Sub3_Sub7_Sub1 method3213(@OriginalArg(1) Class271 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class1_Sub3_Sub7_Sub1 local9 = new Class1_Sub3_Sub7_Sub1();
		local9.anInt1385 = 1;
		@Pc(15) Class163 local15 = this.aClass163_5;
		synchronized (this.aClass163_5) {
			@Pc(23) Class1_Sub3_Sub7_Sub1 local23 = (Class1_Sub3_Sub7_Sub1) this.aClass163_5.method3658();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong235 && arg0 == local23.aClass271_1 && local23.anInt1385 == 2) {
					local9.aByteArray16 = local23.aByteArray16;
					local9.aBoolean646 = false;
					return local9;
				}
				local23 = (Class1_Sub3_Sub7_Sub1) this.aClass163_5.method3655();
			}
		}
		local9.aByteArray16 = arg0.method5847(arg1);
		local9.aBoolean645 = true;
		local9.aBoolean646 = false;
		return local9;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!ep;I)V")
	private void method3214(@OriginalArg(0) Class1_Sub3_Sub7_Sub1 arg0) {
		@Pc(12) Class163 local12 = this.aClass163_5;
		synchronized (this.aClass163_5) {
			this.aClass163_5.method3657(arg0);
			this.anInt4107++;
			this.aClass163_5.notifyAll();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!wk;I[BI)Lclient!ep;")
	public Class1_Sub3_Sub7_Sub1 method3216(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) Class1_Sub3_Sub7_Sub1 local7 = new Class1_Sub3_Sub7_Sub1();
		local7.aByteArray16 = arg2;
		local7.anInt1385 = 2;
		local7.aClass271_1 = arg0;
		local7.aBoolean645 = false;
		local7.aLong235 = arg1;
		this.method3214(local7);
		return local7;
	}

	@OriginalMember(owner = "client!kv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean371) {
			@Pc(10) Class163 local10 = this.aClass163_5;
			@Pc(18) Class1_Sub3_Sub7_Sub1 local18;
			synchronized (this.aClass163_5) {
				local18 = (Class1_Sub3_Sub7_Sub1) this.aClass163_5.method3654();
				if (local18 == null) {
					try {
						this.aClass163_5.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt4107--;
			}
			try {
				if (local18.anInt1385 == 2) {
					local18.aClass271_1.method5845((int) local18.aLong235, local18.aByteArray16, local18.aByteArray16.length);
				} else if (local18.anInt1385 == 3) {
					local18.aByteArray16 = local18.aClass271_1.method5847((int) local18.aLong235);
				}
			} catch (@Pc(80) Exception local80) {
				Static338.method4409(local80, null);
			}
			local18.aBoolean646 = false;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!wk;ZI)Lclient!ep;")
	public Class1_Sub3_Sub7_Sub1 method3217(@OriginalArg(0) Class271 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub3_Sub7_Sub1 local7 = new Class1_Sub3_Sub7_Sub1();
		local7.aBoolean645 = false;
		local7.aClass271_1 = arg0;
		local7.aLong235 = arg1;
		local7.anInt1385 = 3;
		this.method3214(local7);
		return local7;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
	public void method3218() {
		this.aBoolean371 = true;
		@Pc(9) Class163 local9 = this.aClass163_5;
		synchronized (this.aClass163_5) {
			this.aClass163_5.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
		this.aThread1 = null;
	}
}
