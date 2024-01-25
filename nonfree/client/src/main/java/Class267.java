import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class267 implements Runnable {

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "Lclient!ns;")
	private final Class231 aClass231_11 = new Class231();

	@OriginalMember(owner = "client!pt", name = "r", descriptor = "Z")
	private boolean aBoolean648 = false;

	@OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
	public int anInt8099 = 0;

	@OriginalMember(owner = "client!pt", name = "s", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!fl;)V")
	public Class267(@OriginalArg(0) Class104 arg0) {
		@Pc(20) Class159 local20 = arg0.method3127(5, this);
		while (local20.anInt5910 == 0) {
			Static344.method5698(10L);
		}
		if (local20.anInt5910 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject13;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BILclient!bg;)Lclient!rba;")
	public Class6_Sub5_Sub12_Sub2 method6807(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1) {
		@Pc(7) Class6_Sub5_Sub12_Sub2 local7 = new Class6_Sub5_Sub12_Sub2();
		local7.aLong254 = (long) arg0;
		local7.anInt8553 = 3;
		local7.aClass26_4 = arg1;
		local7.aBoolean681 = false;
		this.method6813(local7);
		return local7;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([BBLclient!bg;I)Lclient!rba;")
	public Class6_Sub5_Sub12_Sub2 method6810(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class6_Sub5_Sub12_Sub2 local12 = new Class6_Sub5_Sub12_Sub2();
		local12.aLong254 = (long) arg2;
		local12.aClass26_4 = arg1;
		local12.aByteArray80 = arg0;
		local12.aBoolean681 = false;
		local12.anInt8553 = 2;
		this.method6813(local12);
		return local12;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!rba;)V")
	private void method6813(@OriginalArg(1) Class6_Sub5_Sub12_Sub2 arg0) {
		@Pc(2) Class231 local2 = this.aClass231_11;
		synchronized (this.aClass231_11) {
			this.aClass231_11.method6048(arg0);
			this.anInt8099++;
			this.aClass231_11.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean648) {
			@Pc(10) Class231 local10 = this.aClass231_11;
			@Pc(18) Class6_Sub5_Sub12_Sub2 local18;
			synchronized (this.aClass231_11) {
				local18 = (Class6_Sub5_Sub12_Sub2) this.aClass231_11.method6052();
				if (local18 == null) {
					try {
						this.aClass231_11.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt8099--;
			}
			try {
				if (local18.anInt8553 == 2) {
					local18.aClass26_4.method1343(local18.aByteArray80.length, (int) local18.aLong254, local18.aByteArray80);
				} else if (local18.anInt8553 == 3) {
					local18.aByteArray80 = local18.aClass26_4.method1338((int) local18.aLong254);
				}
			} catch (@Pc(78) Exception local78) {
				Static358.method5809(local78, (String) null);
			}
			local18.aBoolean682 = false;
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V")
	public void method6814() {
		this.aBoolean648 = true;
		@Pc(14) Class231 local14 = this.aClass231_11;
		synchronized (this.aClass231_11) {
			this.aClass231_11.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!bg;I)Lclient!rba;")
	public Class6_Sub5_Sub12_Sub2 method6815(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class6_Sub5_Sub12_Sub2 local9 = new Class6_Sub5_Sub12_Sub2();
		local9.anInt8553 = 1;
		@Pc(15) Class231 local15 = this.aClass231_11;
		synchronized (this.aClass231_11) {
			@Pc(23) Class6_Sub5_Sub12_Sub2 local23 = (Class6_Sub5_Sub12_Sub2) this.aClass231_11.method6055();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong254 && arg0 == local23.aClass26_4 && local23.anInt8553 == 2) {
					local9.aByteArray80 = local23.aByteArray80;
					local9.aBoolean682 = false;
					return local9;
				}
				local23 = (Class6_Sub5_Sub12_Sub2) this.aClass231_11.method6050();
			}
		}
		local9.aByteArray80 = arg0.method1338(arg1);
		local9.aBoolean682 = false;
		local9.aBoolean681 = true;
		return local9;
	}
}
