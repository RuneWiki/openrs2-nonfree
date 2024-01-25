import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class196 implements Runnable {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!et;")
	private final Class65 aClass65_7 = new Class65();

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public int anInt5544 = 0;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Z")
	private boolean aBoolean399 = false;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!dq;)V")
	public Class196(@OriginalArg(0) Class51 arg0) {
		@Pc(20) Class181 local20 = arg0.method1385(5, this);
		while (local20.anInt5298 == 0) {
			Static83.method1499(10L);
		}
		if (local20.anInt5298 == 2) {
			throw new RuntimeException();
		}
		this.aThread4 = (Thread) local20.anObject7;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBLclient!vc;)Lclient!sp;")
	public Class3_Sub3_Sub11_Sub2 method4601(@OriginalArg(0) int arg0, @OriginalArg(2) Class253 arg1) {
		@Pc(9) Class3_Sub3_Sub11_Sub2 local9 = new Class3_Sub3_Sub11_Sub2();
		local9.anInt6415 = 1;
		@Pc(15) Class65 local15 = this.aClass65_7;
		synchronized (this.aClass65_7) {
			@Pc(23) Class3_Sub3_Sub11_Sub2 local23 = (Class3_Sub3_Sub11_Sub2) this.aClass65_7.method1684();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong243 == (long) arg0 && arg1 == local23.aClass253_4 && local23.anInt6415 == 2) {
					local9.aByteArray108 = local23.aByteArray108;
					local9.aBoolean437 = false;
					return local9;
				}
				local23 = (Class3_Sub3_Sub11_Sub2) this.aClass65_7.method1688();
			}
		}
		local9.aByteArray108 = arg1.method5843(arg0);
		local9.aBoolean438 = true;
		local9.aBoolean437 = false;
		return local9;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([BLclient!vc;ZI)Lclient!sp;")
	public Class3_Sub3_Sub11_Sub2 method4602(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class253 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub3_Sub11_Sub2 local7 = new Class3_Sub3_Sub11_Sub2();
		local7.aLong243 = arg2;
		local7.aByteArray108 = arg0;
		local7.anInt6415 = 2;
		local7.aBoolean438 = false;
		local7.aClass253_4 = arg1;
		this.method4606(local7);
		return local7;
	}

	@OriginalMember(owner = "client!qc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean399) {
			@Pc(6) Class65 local6 = this.aClass65_7;
			@Pc(14) Class3_Sub3_Sub11_Sub2 local14;
			synchronized (this.aClass65_7) {
				local14 = (Class3_Sub3_Sub11_Sub2) this.aClass65_7.method1685();
				if (local14 == null) {
					try {
						this.aClass65_7.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt5544--;
			}
			try {
				if (local14.anInt6415 == 2) {
					local14.aClass253_4.method5848((int) local14.aLong243, local14.aByteArray108.length, local14.aByteArray108);
				} else if (local14.anInt6415 == 3) {
					local14.aByteArray108 = local14.aClass253_4.method5843((int) local14.aLong243);
				}
			} catch (@Pc(72) Exception local72) {
				Static120.method1926(null, local72);
			}
			local14.aBoolean437 = false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZILclient!vc;)Lclient!sp;")
	public Class3_Sub3_Sub11_Sub2 method4604(@OriginalArg(1) int arg0, @OriginalArg(2) Class253 arg1) {
		@Pc(7) Class3_Sub3_Sub11_Sub2 local7 = new Class3_Sub3_Sub11_Sub2();
		local7.anInt6415 = 3;
		local7.aBoolean438 = false;
		local7.aLong243 = arg0;
		local7.aClass253_4 = arg1;
		this.method4606(local7);
		return local7;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!sp;)V")
	private void method4606(@OriginalArg(1) Class3_Sub3_Sub11_Sub2 arg0) {
		@Pc(2) Class65 local2 = this.aClass65_7;
		synchronized (this.aClass65_7) {
			this.aClass65_7.method1686(arg0);
			this.anInt5544++;
			this.aClass65_7.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)V")
	public void method4607() {
		this.aBoolean399 = true;
		@Pc(9) Class65 local9 = this.aClass65_7;
		synchronized (this.aClass65_7) {
			this.aClass65_7.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread4 = null;
	}
}
