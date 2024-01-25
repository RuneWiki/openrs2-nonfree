import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class319 implements Runnable {

	@OriginalMember(owner = "client!th", name = "n", descriptor = "Lclient!je;")
	private final Class171 aClass171_7 = new Class171();

	@OriginalMember(owner = "client!th", name = "o", descriptor = "Z")
	private boolean aBoolean656 = false;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "I")
	public int anInt8522 = 0;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!rj;)V")
	public Class319(@OriginalArg(0) Class287 arg0) {
		@Pc(20) Class347 local20 = arg0.method6533(5, this);
		while (local20.anInt9172 == 0) {
			Static459.method6498(10L);
		}
		if (local20.anInt9172 == 2) {
			throw new RuntimeException();
		}
		this.aThread7 = (Thread) local20.anObject49;
	}

	@OriginalMember(owner = "client!th", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean656) {
			@Pc(10) Class171 local10 = this.aClass171_7;
			@Pc(18) Class2_Sub3_Sub5_Sub1 local18;
			synchronized (this.aClass171_7) {
				local18 = (Class2_Sub3_Sub5_Sub1) this.aClass171_7.method3787();
				if (local18 == null) {
					try {
						this.aClass171_7.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt8522--;
			}
			try {
				if (local18.anInt4966 == 2) {
					local18.aClass207_2.method4560(local18.aByteArray58.length, local18.aByteArray58, (int) local18.aLong260);
				} else if (local18.anInt4966 == 3) {
					local18.aByteArray58 = local18.aClass207_2.method4558((int) local18.aLong260);
				}
			} catch (@Pc(80) Exception local80) {
				Static58.method946(null, local80);
			}
			local18.aBoolean501 = false;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLclient!kf;)V")
	private void method7076(@OriginalArg(1) Class2_Sub3_Sub5_Sub1 arg0) {
		@Pc(2) Class171 local2 = this.aClass171_7;
		synchronized (this.aClass171_7) {
			this.aClass171_7.method3791(arg0);
			this.anInt8522++;
			this.aClass171_7.notifyAll();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
	public void method7077() {
		this.aBoolean656 = true;
		@Pc(9) Class171 local9 = this.aClass171_7;
		synchronized (this.aClass171_7) {
			this.aClass171_7.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
		this.aThread7 = null;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!lf;)Lclient!kf;")
	public Class2_Sub3_Sub5_Sub1 method7078(@OriginalArg(0) int arg0, @OriginalArg(2) Class207 arg1) {
		@Pc(7) Class2_Sub3_Sub5_Sub1 local7 = new Class2_Sub3_Sub5_Sub1();
		local7.aLong260 = arg0;
		local7.anInt4966 = 3;
		local7.aClass207_2 = arg1;
		local7.aBoolean499 = false;
		this.method7076(local7);
		return local7;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([BZLclient!lf;I)Lclient!kf;")
	public Class2_Sub3_Sub5_Sub1 method7079(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class207 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub3_Sub5_Sub1 local7 = new Class2_Sub3_Sub5_Sub1();
		local7.aBoolean499 = false;
		local7.aLong260 = arg2;
		local7.anInt4966 = 2;
		local7.aByteArray58 = arg0;
		local7.aClass207_2 = arg1;
		this.method7076(local7);
		return local7;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!lf;I)Lclient!kf;")
	public Class2_Sub3_Sub5_Sub1 method7080(@OriginalArg(1) Class207 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub3_Sub5_Sub1 local9 = new Class2_Sub3_Sub5_Sub1();
		local9.anInt4966 = 1;
		@Pc(15) Class171 local15 = this.aClass171_7;
		synchronized (this.aClass171_7) {
			@Pc(32) Class2_Sub3_Sub5_Sub1 local32 = (Class2_Sub3_Sub5_Sub1) this.aClass171_7.method3796();
			while (true) {
				if (local32 == null) {
					break;
				}
				if ((long) arg1 == local32.aLong260 && arg0 == local32.aClass207_2 && local32.anInt4966 == 2) {
					local9.aByteArray58 = local32.aByteArray58;
					local9.aBoolean501 = false;
					return local9;
				}
				local32 = (Class2_Sub3_Sub5_Sub1) this.aClass171_7.method3786();
			}
		}
		local9.aByteArray58 = arg0.method4558(arg1);
		local9.aBoolean499 = true;
		local9.aBoolean501 = false;
		return local9;
	}
}
