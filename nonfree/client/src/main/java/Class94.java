import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eia")
public final class Class94 implements Runnable {

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "Lclient!dr;")
	private final Class80 aClass80_2 = new Class80();

	@OriginalMember(owner = "client!eia", name = "j", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!eia", name = "m", descriptor = "I")
	public int anInt2090 = 0;

	@OriginalMember(owner = "client!eia", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(Lclient!kk;)V")
	public Class94(@OriginalArg(0) Class192 arg0) {
		@Pc(20) Class330 local20 = arg0.method4334(this, 5);
		while (local20.anInt9132 == 0) {
			Static452.method7478(10L);
		}
		if (local20.anInt9132 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject19;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILclient!mi;I[B)Lclient!jk;")
	public Class5_Sub4_Sub12_Sub2 method1909(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class5_Sub4_Sub12_Sub2 local7 = new Class5_Sub4_Sub12_Sub2();
		local7.aByteArray38 = arg2;
		local7.aLong273 = (long) arg0;
		local7.anInt4406 = 2;
		local7.aBoolean360 = false;
		local7.aClass229_2 = arg1;
		this.method1914(local7);
		return local7;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lclient!mi;II)Lclient!jk;")
	public Class5_Sub4_Sub12_Sub2 method1911(@OriginalArg(0) Class229 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class5_Sub4_Sub12_Sub2 local14 = new Class5_Sub4_Sub12_Sub2();
		local14.anInt4406 = 1;
		@Pc(20) Class80 local20 = this.aClass80_2;
		synchronized (this.aClass80_2) {
			@Pc(28) Class5_Sub4_Sub12_Sub2 local28 = (Class5_Sub4_Sub12_Sub2) this.aClass80_2.method1538();
			while (true) {
				if (local28 == null) {
					break;
				}
				if ((long) arg1 == local28.aLong273 && local28.aClass229_2 == arg0 && local28.anInt4406 == 2) {
					local14.aByteArray38 = local28.aByteArray38;
					local14.aBoolean358 = false;
					return local14;
				}
				local28 = (Class5_Sub4_Sub12_Sub2) this.aClass80_2.method1536();
			}
		}
		local14.aByteArray38 = arg0.method5598(arg1);
		local14.aBoolean360 = true;
		local14.aBoolean358 = false;
		return local14;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
	public void method1912() {
		this.aBoolean164 = true;
		@Pc(9) Class80 local9 = this.aClass80_2;
		synchronized (this.aClass80_2) {
			this.aClass80_2.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILclient!jk;)V")
	private void method1914(@OriginalArg(1) Class5_Sub4_Sub12_Sub2 arg0) {
		@Pc(2) Class80 local2 = this.aClass80_2;
		synchronized (this.aClass80_2) {
			this.aClass80_2.method1537(arg0);
			this.anInt2090++;
			this.aClass80_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!eia", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean164) {
			@Pc(10) Class80 local10 = this.aClass80_2;
			@Pc(18) Class5_Sub4_Sub12_Sub2 local18;
			synchronized (this.aClass80_2) {
				local18 = (Class5_Sub4_Sub12_Sub2) this.aClass80_2.method1543();
				if (local18 == null) {
					try {
						this.aClass80_2.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt2090--;
			}
			try {
				if (local18.anInt4406 == 2) {
					local18.aClass229_2.method5593(local18.aByteArray38.length, local18.aByteArray38, (int) local18.aLong273);
				} else if (local18.anInt4406 == 3) {
					local18.aByteArray38 = local18.aClass229_2.method5598((int) local18.aLong273);
				}
			} catch (@Pc(78) Exception local78) {
				Static280.method4194((String) null, local78);
			}
			local18.aBoolean358 = false;
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(BILclient!mi;)Lclient!jk;")
	public Class5_Sub4_Sub12_Sub2 method1915(@OriginalArg(1) int arg0, @OriginalArg(2) Class229 arg1) {
		@Pc(12) Class5_Sub4_Sub12_Sub2 local12 = new Class5_Sub4_Sub12_Sub2();
		local12.aLong273 = (long) arg0;
		local12.aBoolean360 = false;
		local12.aClass229_2 = arg1;
		local12.anInt4406 = 3;
		this.method1914(local12);
		return local12;
	}
}
