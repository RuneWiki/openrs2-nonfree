import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class309 implements Runnable {

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "Lclient!ut;")
	private final Class367 aClass367_11 = new Class367();

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "Z")
	private boolean aBoolean626 = false;

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
	public int anInt7987 = 0;

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!lc;)V")
	public Class309(@OriginalArg(0) Class207 arg0) {
		@Pc(20) Class281 local20 = arg0.method4587(5, this);
		while (local20.anInt7338 == 0) {
			Static491.method6679(10L);
		}
		if (local20.anInt7338 == 2) {
			throw new RuntimeException();
		}
		this.aThread5 = (Thread) local20.anObject17;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!os;I)V")
	private void method6945(@OriginalArg(0) Class4_Sub5_Sub2_Sub2 arg0) {
		@Pc(2) Class367 local2 = this.aClass367_11;
		synchronized (this.aClass367_11) {
			this.aClass367_11.method8310(arg0);
			this.anInt7987++;
			this.aClass367_11.notifyAll();
		}
	}

	@OriginalMember(owner = "client!rda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean626) {
			@Pc(10) Class367 local10 = this.aClass367_11;
			@Pc(18) Class4_Sub5_Sub2_Sub2 local18;
			synchronized (this.aClass367_11) {
				local18 = (Class4_Sub5_Sub2_Sub2) this.aClass367_11.method8311();
				if (local18 == null) {
					try {
						this.aClass367_11.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt7987--;
			}
			try {
				if (local18.anInt6912 == 2) {
					local18.aClass343_8.method7515((int) local18.aLong306, local18.aByteArray67.length, local18.aByteArray67);
				} else if (local18.anInt6912 == 3) {
					local18.aByteArray67 = local18.aClass343_8.method7514((int) local18.aLong306);
				}
			} catch (@Pc(78) Exception local78) {
				Static357.method4765(local78, (String) null);
			}
			local18.aBoolean535 = false;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
	public void method6946() {
		this.aBoolean626 = true;
		@Pc(9) Class367 local9 = this.aClass367_11;
		synchronized (this.aClass367_11) {
			this.aClass367_11.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BLclient!tc;[BI)Lclient!os;")
	public Class4_Sub5_Sub2_Sub2 method6948(@OriginalArg(1) Class343 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub5_Sub2_Sub2 local12 = new Class4_Sub5_Sub2_Sub2();
		local12.aClass343_8 = arg0;
		local12.aByteArray67 = arg1;
		local12.aBoolean537 = false;
		local12.anInt6912 = 2;
		local12.aLong306 = (long) arg2;
		this.method6945(local12);
		return local12;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IBLclient!tc;)Lclient!os;")
	public Class4_Sub5_Sub2_Sub2 method6949(@OriginalArg(0) int arg0, @OriginalArg(2) Class343 arg1) {
		@Pc(7) Class4_Sub5_Sub2_Sub2 local7 = new Class4_Sub5_Sub2_Sub2();
		local7.aBoolean537 = false;
		local7.aClass343_8 = arg1;
		local7.anInt6912 = 3;
		local7.aLong306 = (long) arg0;
		this.method6945(local7);
		return local7;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!tc;II)Lclient!os;")
	public Class4_Sub5_Sub2_Sub2 method6950(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class4_Sub5_Sub2_Sub2 local9 = new Class4_Sub5_Sub2_Sub2();
		local9.anInt6912 = 1;
		@Pc(15) Class367 local15 = this.aClass367_11;
		synchronized (this.aClass367_11) {
			@Pc(23) Class4_Sub5_Sub2_Sub2 local23 = (Class4_Sub5_Sub2_Sub2) this.aClass367_11.method8308();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong306 && arg0 == local23.aClass343_8 && local23.anInt6912 == 2) {
					local9.aBoolean535 = false;
					local9.aByteArray67 = local23.aByteArray67;
					return local9;
				}
				local23 = (Class4_Sub5_Sub2_Sub2) this.aClass367_11.method8309();
			}
		}
		local9.aByteArray67 = arg0.method7514(arg1);
		local9.aBoolean535 = false;
		local9.aBoolean537 = true;
		return local9;
	}
}
