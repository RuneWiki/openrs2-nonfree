import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class239 implements Runnable {

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "Lclient!sc;")
	private final Class302 aClass302_10 = new Class302();

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "Z")
	private boolean aBoolean553 = false;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
	public int anInt7671 = 0;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!gh;)V")
	public Class239(@OriginalArg(0) Class118 arg0) {
		@Pc(20) Class301 local20 = arg0.method3410(5, this);
		while (local20.anInt8915 == 0) {
			Static214.method4061(10L);
		}
		if (local20.anInt8915 == 2) {
			throw new RuntimeException();
		}
		this.aThread6 = (Thread) local20.anObject18;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILclient!rfa;)Lclient!sa;")
	public Class8_Sub5_Sub13_Sub2 method6344(@OriginalArg(1) int arg0, @OriginalArg(2) Class291 arg1) {
		@Pc(9) Class8_Sub5_Sub13_Sub2 local9 = new Class8_Sub5_Sub13_Sub2();
		local9.anInt8869 = 1;
		@Pc(15) Class302 local15 = this.aClass302_10;
		synchronized (this.aClass302_10) {
			@Pc(28) Class8_Sub5_Sub13_Sub2 local28 = (Class8_Sub5_Sub13_Sub2) this.aClass302_10.method7327();
			while (true) {
				if (local28 == null) {
					break;
				}
				if ((long) arg0 == local28.aLong275 && arg1 == local28.aClass291_4 && local28.anInt8869 == 2) {
					local9.aByteArray82 = local28.aByteArray82;
					local9.aBoolean624 = false;
					return local9;
				}
				local28 = (Class8_Sub5_Sub13_Sub2) this.aClass302_10.method7326();
			}
		}
		local9.aByteArray82 = arg1.method7155(arg0);
		local9.aBoolean624 = false;
		local9.aBoolean623 = true;
		return local9;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[BLclient!rfa;Z)Lclient!sa;")
	public Class8_Sub5_Sub13_Sub2 method6345(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class291 arg2) {
		@Pc(7) Class8_Sub5_Sub13_Sub2 local7 = new Class8_Sub5_Sub13_Sub2();
		local7.aClass291_4 = arg2;
		local7.aByteArray82 = arg1;
		local7.aLong275 = arg0;
		local7.anInt8869 = 2;
		local7.aBoolean623 = false;
		this.method6347(local7);
		return local7;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public void method6346() {
		this.aBoolean553 = true;
		@Pc(9) Class302 local9 = this.aClass302_10;
		synchronized (this.aClass302_10) {
			this.aClass302_10.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
		this.aThread6 = null;
	}

	@OriginalMember(owner = "client!oj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean553) {
			@Pc(10) Class302 local10 = this.aClass302_10;
			@Pc(18) Class8_Sub5_Sub13_Sub2 local18;
			synchronized (this.aClass302_10) {
				local18 = (Class8_Sub5_Sub13_Sub2) this.aClass302_10.method7330();
				if (local18 == null) {
					try {
						this.aClass302_10.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt7671--;
			}
			try {
				if (local18.anInt8869 == 2) {
					local18.aClass291_4.method7156((int) local18.aLong275, local18.aByteArray82, local18.aByteArray82.length);
				} else if (local18.anInt8869 == 3) {
					local18.aByteArray82 = local18.aClass291_4.method7155((int) local18.aLong275);
				}
			} catch (@Pc(78) Exception local78) {
				Static596.method8231(null, local78);
			}
			local18.aBoolean624 = false;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!sa;I)V")
	private void method6347(@OriginalArg(0) Class8_Sub5_Sub13_Sub2 arg0) {
		@Pc(6) Class302 local6 = this.aClass302_10;
		synchronized (this.aClass302_10) {
			this.aClass302_10.method7328(arg0);
			this.anInt7671++;
			this.aClass302_10.notifyAll();
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!rfa;II)Lclient!sa;")
	public Class8_Sub5_Sub13_Sub2 method6349(@OriginalArg(0) Class291 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class8_Sub5_Sub13_Sub2 local16 = new Class8_Sub5_Sub13_Sub2();
		local16.anInt8869 = 3;
		local16.aClass291_4 = arg0;
		local16.aLong275 = arg1;
		local16.aBoolean623 = false;
		this.method6347(local16);
		return local16;
	}
}
