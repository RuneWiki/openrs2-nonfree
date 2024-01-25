import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class217 implements Runnable {

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "Lclient!st;")
	private final Class280 aClass280_9 = new Class280();

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
	public int anInt6159 = 0;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "Z")
	private boolean aBoolean464 = false;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!dj;)V")
	public Class217(@OriginalArg(0) Class71 arg0) {
		@Pc(20) Class55 local20 = arg0.method1988(this, 5);
		while (local20.anInt1481 == 0) {
			Static17.method388(10L);
		}
		if (local20.anInt1481 == 2) {
			throw new RuntimeException();
		}
		this.aThread4 = (Thread) local20.anObject5;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!oba;II)Lclient!kv;")
	public Class12_Sub4_Sub9_Sub1 method5152(@OriginalArg(0) Class224 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class12_Sub4_Sub9_Sub1 local13 = new Class12_Sub4_Sub9_Sub1();
		local13.aClass224_5 = arg0;
		local13.aLong247 = arg1;
		local13.aBoolean622 = false;
		local13.anInt5317 = 3;
		this.method5157(local13);
		return local13;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public void method5153() {
		this.aBoolean464 = true;
		@Pc(9) Class280 local9 = this.aClass280_9;
		synchronized (this.aClass280_9) {
			this.aClass280_9.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread4 = null;
	}

	@OriginalMember(owner = "client!ni", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean464) {
			@Pc(10) Class280 local10 = this.aClass280_9;
			@Pc(18) Class12_Sub4_Sub9_Sub1 local18;
			synchronized (this.aClass280_9) {
				local18 = (Class12_Sub4_Sub9_Sub1) this.aClass280_9.method6888();
				if (local18 == null) {
					try {
						this.aClass280_9.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt6159--;
			}
			try {
				if (local18.anInt5317 == 2) {
					local18.aClass224_5.method5418((int) local18.aLong247, local18.aByteArray60, local18.aByteArray60.length);
				} else if (local18.anInt5317 == 3) {
					local18.aByteArray60 = local18.aClass224_5.method5420((int) local18.aLong247);
				}
			} catch (@Pc(78) Exception local78) {
				Static508.method7541(local78, null);
			}
			local18.aBoolean623 = false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(Lclient!oba;II)Lclient!kv;")
	public Class12_Sub4_Sub9_Sub1 method5154(@OriginalArg(0) Class224 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class12_Sub4_Sub9_Sub1 local9 = new Class12_Sub4_Sub9_Sub1();
		local9.anInt5317 = 1;
		@Pc(15) Class280 local15 = this.aClass280_9;
		synchronized (this.aClass280_9) {
			@Pc(23) Class12_Sub4_Sub9_Sub1 local23 = (Class12_Sub4_Sub9_Sub1) this.aClass280_9.method6892();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong247 && arg0 == local23.aClass224_5 && local23.anInt5317 == 2) {
					local9.aBoolean623 = false;
					local9.aByteArray60 = local23.aByteArray60;
					return local9;
				}
				local23 = (Class12_Sub4_Sub9_Sub1) this.aClass280_9.method6895();
			}
		}
		local9.aByteArray60 = arg0.method5420(arg1);
		local9.aBoolean623 = false;
		local9.aBoolean622 = true;
		return local9;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!oba;IZ[B)Lclient!kv;")
	public Class12_Sub4_Sub9_Sub1 method5155(@OriginalArg(0) Class224 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class12_Sub4_Sub9_Sub1 local7 = new Class12_Sub4_Sub9_Sub1();
		local7.aByteArray60 = arg2;
		local7.aLong247 = arg1;
		local7.anInt5317 = 2;
		local7.aBoolean622 = false;
		local7.aClass224_5 = arg0;
		this.method5157(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!kv;I)V")
	private void method5157(@OriginalArg(0) Class12_Sub4_Sub9_Sub1 arg0) {
		@Pc(6) Class280 local6 = this.aClass280_9;
		synchronized (this.aClass280_9) {
			this.aClass280_9.method6894(arg0);
			this.anInt6159++;
			this.aClass280_9.notifyAll();
		}
	}
}
