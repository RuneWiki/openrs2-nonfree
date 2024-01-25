import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class269 implements Runnable {

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "Lclient!an;")
	private final Class18 aClass18_4 = new Class18();

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	public int anInt7839 = 0;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "Z")
	private boolean aBoolean539 = false;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class269(@OriginalArg(0) Class354 arg0) {
		@Pc(20) Class234 local20 = arg0.method8231(this, 5);
		while (local20.anInt6717 == 0) {
			Static63.method1019(10L);
		}
		if (local20.anInt6717 == 2) {
			throw new RuntimeException();
		}
		this.aThread5 = (Thread) local20.anObject16;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!vp;I)Lclient!g;")
	public Class4_Sub5_Sub3_Sub2 method6530(@OriginalArg(0) int arg0, @OriginalArg(1) Class345 arg1) {
		@Pc(9) Class4_Sub5_Sub3_Sub2 local9 = new Class4_Sub5_Sub3_Sub2();
		local9.anInt3163 = 1;
		@Pc(15) Class18 local15 = this.aClass18_4;
		synchronized (this.aClass18_4) {
			@Pc(23) Class4_Sub5_Sub3_Sub2 local23 = (Class4_Sub5_Sub3_Sub2) this.aClass18_4.method221();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong257 == (long) arg0 && local23.aClass345_1 == arg1 && local23.anInt3163 == 2) {
					local9.aBoolean279 = false;
					local9.aByteArray31 = local23.aByteArray31;
					return local9;
				}
				local23 = (Class4_Sub5_Sub3_Sub2) this.aClass18_4.method218();
			}
		}
		local9.aByteArray31 = arg1.method8096(arg0);
		local9.aBoolean279 = false;
		local9.aBoolean278 = true;
		return local9;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public void method6531() {
		this.aBoolean539 = true;
		@Pc(9) Class18 local9 = this.aClass18_4;
		synchronized (this.aClass18_4) {
			this.aClass18_4.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!vp;[BI)Lclient!g;")
	public Class4_Sub5_Sub3_Sub2 method6532(@OriginalArg(1) Class345 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub5_Sub3_Sub2 local7 = new Class4_Sub5_Sub3_Sub2();
		local7.aClass345_1 = arg0;
		local7.aLong257 = arg2;
		local7.aBoolean278 = false;
		local7.aByteArray31 = arg1;
		local7.anInt3163 = 2;
		this.method6536(local7);
		return local7;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!vp;)Lclient!g;")
	public Class4_Sub5_Sub3_Sub2 method6535(@OriginalArg(1) int arg0, @OriginalArg(2) Class345 arg1) {
		@Pc(7) Class4_Sub5_Sub3_Sub2 local7 = new Class4_Sub5_Sub3_Sub2();
		local7.aLong257 = arg0;
		local7.aBoolean278 = false;
		local7.aClass345_1 = arg1;
		local7.anInt3163 = 3;
		this.method6536(local7);
		return local7;
	}

	@OriginalMember(owner = "client!qc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean539) {
			@Pc(10) Class18 local10 = this.aClass18_4;
			@Pc(18) Class4_Sub5_Sub3_Sub2 local18;
			synchronized (this.aClass18_4) {
				local18 = (Class4_Sub5_Sub3_Sub2) this.aClass18_4.method226();
				if (local18 == null) {
					try {
						this.aClass18_4.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt7839--;
			}
			try {
				if (local18.anInt3163 == 2) {
					local18.aClass345_1.method8095(local18.aByteArray31, local18.aByteArray31.length, (int) local18.aLong257);
				} else if (local18.anInt3163 == 3) {
					local18.aByteArray31 = local18.aClass345_1.method8096((int) local18.aLong257);
				}
			} catch (@Pc(76) Exception local76) {
				Static205.method3450(null, local76);
			}
			local18.aBoolean279 = false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!g;)V")
	private void method6536(@OriginalArg(1) Class4_Sub5_Sub3_Sub2 arg0) {
		@Pc(2) Class18 local2 = this.aClass18_4;
		synchronized (this.aClass18_4) {
			this.aClass18_4.method219(arg0);
			this.anInt7839++;
			this.aClass18_4.notifyAll();
		}
	}
}
