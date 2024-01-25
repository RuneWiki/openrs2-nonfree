import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class266 implements Runnable {

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "Lclient!ak;")
	private final Class15 aClass15_13 = new Class15();

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
	public int anInt7947 = 0;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "Z")
	private boolean aBoolean553 = false;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!hga;)V")
	public Class266(@OriginalArg(0) Class138 arg0) {
		@Pc(20) Class304 local20 = arg0.method3577(5, this);
		while (local20.anInt8838 == 0) {
			Static258.method4293(10L);
		}
		if (local20.anInt8838 == 2) {
			throw new RuntimeException();
		}
		this.aThread5 = (Thread) local20.anObject16;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!lp;II)Lclient!om;")
	public Class3_Sub4_Sub9_Sub1 method6902(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub4_Sub9_Sub1 local15 = new Class3_Sub4_Sub9_Sub1();
		local15.anInt7475 = 3;
		local15.aClass209_5 = arg0;
		local15.aBoolean723 = false;
		local15.aLong274 = arg1;
		this.method6905(local15);
		return local15;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([BZILclient!lp;)Lclient!om;")
	public Class3_Sub4_Sub9_Sub1 method6903(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class209 arg2) {
		@Pc(12) Class3_Sub4_Sub9_Sub1 local12 = new Class3_Sub4_Sub9_Sub1();
		local12.anInt7475 = 2;
		local12.aBoolean723 = false;
		local12.aByteArray79 = arg0;
		local12.aClass209_5 = arg2;
		local12.aLong274 = arg1;
		this.method6905(local12);
		return local12;
	}

	@OriginalMember(owner = "client!pt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean553) {
			@Pc(6) Class15 local6 = this.aClass15_13;
			@Pc(14) Class3_Sub4_Sub9_Sub1 local14;
			synchronized (this.aClass15_13) {
				local14 = (Class3_Sub4_Sub9_Sub1) this.aClass15_13.method902();
				if (local14 == null) {
					try {
						this.aClass15_13.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt7947--;
			}
			try {
				if (local14.anInt7475 == 2) {
					local14.aClass209_5.method5312((int) local14.aLong274, local14.aByteArray79.length, local14.aByteArray79);
				} else if (local14.anInt7475 == 3) {
					local14.aByteArray79 = local14.aClass209_5.method5314((int) local14.aLong274);
				}
			} catch (@Pc(76) Exception local76) {
				Static335.method5467(null, local76);
			}
			local14.aBoolean724 = false;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!om;I)V")
	private void method6905(@OriginalArg(0) Class3_Sub4_Sub9_Sub1 arg0) {
		@Pc(6) Class15 local6 = this.aClass15_13;
		synchronized (this.aClass15_13) {
			this.aClass15_13.method901(arg0);
			this.anInt7947++;
			this.aClass15_13.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(B)V")
	public void method6907() {
		this.aBoolean553 = true;
		@Pc(9) Class15 local9 = this.aClass15_13;
		synchronized (this.aClass15_13) {
			this.aClass15_13.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BILclient!lp;)Lclient!om;")
	public Class3_Sub4_Sub9_Sub1 method6909(@OriginalArg(1) int arg0, @OriginalArg(2) Class209 arg1) {
		@Pc(9) Class3_Sub4_Sub9_Sub1 local9 = new Class3_Sub4_Sub9_Sub1();
		local9.anInt7475 = 1;
		@Pc(15) Class15 local15 = this.aClass15_13;
		synchronized (this.aClass15_13) {
			@Pc(23) Class3_Sub4_Sub9_Sub1 local23 = (Class3_Sub4_Sub9_Sub1) this.aClass15_13.method897();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg0 == local23.aLong274 && local23.aClass209_5 == arg1 && local23.anInt7475 == 2) {
					local9.aByteArray79 = local23.aByteArray79;
					local9.aBoolean724 = false;
					return local9;
				}
				local23 = (Class3_Sub4_Sub9_Sub1) this.aClass15_13.method898();
			}
		}
		local9.aByteArray79 = arg1.method5314(arg0);
		local9.aBoolean724 = false;
		local9.aBoolean723 = true;
		return local9;
	}
}
