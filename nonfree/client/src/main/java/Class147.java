import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class147 implements Runnable {

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Lclient!ut;")
	private final Class358 aClass358_6 = new Class358();

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
	public int anInt4196 = 0;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "Z")
	private boolean aBoolean344 = false;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!oq;)V")
	public Class147(@OriginalArg(0) Class268 arg0) {
		@Pc(20) Class331 local20 = arg0.method6340(this, 5);
		while (local20.anInt9108 == 0) {
			Static579.method8004(10L);
		}
		if (local20.anInt9108 == 2) {
			throw new RuntimeException();
		}
		this.aThread5 = (Thread) local20.anObject20;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!cr;I[B)Lclient!pq;")
	public Class5_Sub3_Sub11_Sub2 method3556(@OriginalArg(1) Class71 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class5_Sub3_Sub11_Sub2 local7 = new Class5_Sub3_Sub11_Sub2();
		local7.aLong297 = (long) arg1;
		local7.aByteArray74 = arg2;
		local7.anInt7777 = 2;
		local7.aBoolean663 = false;
		local7.aClass71_4 = arg0;
		this.method3561(local7);
		return local7;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!cr;I)Lclient!pq;")
	public Class5_Sub3_Sub11_Sub2 method3557(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1) {
		@Pc(9) Class5_Sub3_Sub11_Sub2 local9 = new Class5_Sub3_Sub11_Sub2();
		local9.anInt7777 = 1;
		@Pc(21) Class358 local21 = this.aClass358_6;
		synchronized (this.aClass358_6) {
			@Pc(29) Class5_Sub3_Sub11_Sub2 local29 = (Class5_Sub3_Sub11_Sub2) this.aClass358_6.method8322();
			while (true) {
				if (local29 == null) {
					break;
				}
				if (local29.aLong297 == (long) arg0 && local29.aClass71_4 == arg1 && local29.anInt7777 == 2) {
					local9.aByteArray74 = local29.aByteArray74;
					local9.aBoolean664 = false;
					return local9;
				}
				local29 = (Class5_Sub3_Sub11_Sub2) this.aClass358_6.method8328();
			}
		}
		local9.aByteArray74 = arg1.method1858(arg0);
		local9.aBoolean663 = true;
		local9.aBoolean664 = false;
		return local9;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public void method3558() {
		this.aBoolean344 = true;
		@Pc(17) Class358 local17 = this.aClass358_6;
		synchronized (this.aClass358_6) {
			this.aClass358_6.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!hh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean344) {
			@Pc(10) Class358 local10 = this.aClass358_6;
			@Pc(18) Class5_Sub3_Sub11_Sub2 local18;
			synchronized (this.aClass358_6) {
				local18 = (Class5_Sub3_Sub11_Sub2) this.aClass358_6.method8326();
				if (local18 == null) {
					try {
						this.aClass358_6.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt4196--;
			}
			try {
				if (local18.anInt7777 == 2) {
					local18.aClass71_4.method1859(local18.aByteArray74.length, (int) local18.aLong297, local18.aByteArray74);
				} else if (local18.anInt7777 == 3) {
					local18.aByteArray74 = local18.aClass71_4.method1858((int) local18.aLong297);
				}
			} catch (@Pc(76) Exception local76) {
				Static234.method3615(local76, (String) null);
			}
			local18.aBoolean664 = false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILclient!cr;)Lclient!pq;")
	public Class5_Sub3_Sub11_Sub2 method3560(@OriginalArg(1) int arg0, @OriginalArg(2) Class71 arg1) {
		@Pc(7) Class5_Sub3_Sub11_Sub2 local7 = new Class5_Sub3_Sub11_Sub2();
		local7.aBoolean663 = false;
		local7.aClass71_4 = arg1;
		local7.aLong297 = (long) arg0;
		local7.anInt7777 = 3;
		this.method3561(local7);
		return local7;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLclient!pq;)V")
	private void method3561(@OriginalArg(1) Class5_Sub3_Sub11_Sub2 arg0) {
		@Pc(2) Class358 local2 = this.aClass358_6;
		synchronized (this.aClass358_6) {
			this.aClass358_6.method8329(arg0);
			this.anInt4196++;
			this.aClass358_6.notifyAll();
		}
	}
}
