import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class381 implements Runnable {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!gq;")
	private final Class149 aClass149_10 = new Class149();

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Z")
	private boolean aBoolean777 = false;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
	public int anInt10570 = 0;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!mca;)V")
	public Class381(@OriginalArg(0) Class230 arg0) {
		@Pc(20) Class366 local20 = arg0.method5358(this, 5);
		while (local20.anInt10206 == 0) {
			Static351.method5279(10L);
		}
		if (local20.anInt10206 == 2) {
			throw new RuntimeException();
		}
		this.aThread7 = (Thread) local20.anObject18;
	}

	@OriginalMember(owner = "client!wd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean777) {
			@Pc(10) Class149 local10 = this.aClass149_10;
			@Pc(18) Class5_Sub5_Sub7_Sub2 local18;
			synchronized (this.aClass149_10) {
				local18 = (Class5_Sub5_Sub7_Sub2) this.aClass149_10.method2886();
				if (local18 == null) {
					try {
						this.aClass149_10.wait();
					} catch (@Pc(26) InterruptedException local26) {
					}
					continue;
				}
				this.anInt10570--;
			}
			try {
				if (local18.anInt8201 == 2) {
					local18.aClass223_3.method5244(local18.aByteArray82, (int) local18.aLong312, local18.aByteArray82.length);
				} else if (local18.anInt8201 == 3) {
					local18.aByteArray82 = local18.aClass223_3.method5246((int) local18.aLong312);
				}
			} catch (@Pc(83) Exception local83) {
				Static405.method5934((String) null, local83);
			}
			local18.aBoolean613 = false;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public void method9063() {
		this.aBoolean777 = true;
		@Pc(9) Class149 local9 = this.aClass149_10;
		synchronized (this.aClass149_10) {
			this.aClass149_10.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread7 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!qp;I)V")
	private void method9064(@OriginalArg(0) Class5_Sub5_Sub7_Sub2 arg0) {
		@Pc(16) Class149 local16 = this.aClass149_10;
		synchronized (this.aClass149_10) {
			this.aClass149_10.method2889(arg0);
			this.anInt10570++;
			this.aClass149_10.notifyAll();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!lp;IB[B)Lclient!qp;")
	public Class5_Sub5_Sub7_Sub2 method9065(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) Class5_Sub5_Sub7_Sub2 local15 = new Class5_Sub5_Sub7_Sub2();
		local15.aBoolean615 = false;
		local15.aByteArray82 = arg2;
		local15.aClass223_3 = arg0;
		local15.aLong312 = (long) arg1;
		local15.anInt8201 = 2;
		this.method9064(local15);
		return local15;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!lp;II)Lclient!qp;")
	public Class5_Sub5_Sub7_Sub2 method9067(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class5_Sub5_Sub7_Sub2 local9 = new Class5_Sub5_Sub7_Sub2();
		local9.anInt8201 = 1;
		@Pc(21) Class149 local21 = this.aClass149_10;
		synchronized (this.aClass149_10) {
			@Pc(29) Class5_Sub5_Sub7_Sub2 local29 = (Class5_Sub5_Sub7_Sub2) this.aClass149_10.method2890();
			while (true) {
				if (local29 == null) {
					break;
				}
				if ((long) arg1 == local29.aLong312 && arg0 == local29.aClass223_3 && local29.anInt8201 == 2) {
					local9.aByteArray82 = local29.aByteArray82;
					local9.aBoolean613 = false;
					return local9;
				}
				local29 = (Class5_Sub5_Sub7_Sub2) this.aClass149_10.method2894();
			}
		}
		local9.aByteArray82 = arg0.method5246(arg1);
		local9.aBoolean615 = true;
		local9.aBoolean613 = false;
		return local9;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!lp;I)Lclient!qp;")
	public Class5_Sub5_Sub7_Sub2 method9068(@OriginalArg(1) Class223 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class5_Sub5_Sub7_Sub2 local7 = new Class5_Sub5_Sub7_Sub2();
		local7.aBoolean615 = false;
		local7.anInt8201 = 3;
		local7.aClass223_3 = arg0;
		local7.aLong312 = (long) arg1;
		this.method9064(local7);
		return local7;
	}
}
