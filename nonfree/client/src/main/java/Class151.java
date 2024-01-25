import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class151 implements Runnable {

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Lclient!go;")
	private final Class87 aClass87_10 = new Class87();

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
	public int anInt3729 = 0;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "Z")
	private boolean aBoolean287 = false;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!is;)V")
	public Class151(@OriginalArg(0) Class111 arg0) {
		@Pc(20) Class182 local20 = arg0.method2819(this, 5);
		while (local20.anInt4498 == 0) {
			Static358.method2028(10L);
		}
		if (local20.anInt4498 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject6;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!q;IB)Lclient!qg;")
	public Class2_Sub10_Sub9_Sub2 method3431(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class2_Sub10_Sub9_Sub2 local9 = new Class2_Sub10_Sub9_Sub2();
		local9.anInt4817 = 1;
		@Pc(20) Class87 local20 = this.aClass87_10;
		synchronized (this.aClass87_10) {
			@Pc(28) Class2_Sub10_Sub9_Sub2 local28 = (Class2_Sub10_Sub9_Sub2) this.aClass87_10.method2353();
			while (true) {
				if (local28 == null) {
					break;
				}
				if (local28.aLong206 == (long) arg1 && local28.aClass197_2 == arg0 && local28.anInt4817 == 2) {
					local9.aBoolean362 = false;
					local9.aByteArray87 = local28.aByteArray87;
					return local9;
				}
				local28 = (Class2_Sub10_Sub9_Sub2) this.aClass87_10.method2352();
			}
		}
		local9.aByteArray87 = arg0.method4169(arg1);
		local9.aBoolean365 = true;
		local9.aBoolean362 = false;
		return local9;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILclient!q;I)Lclient!qg;")
	public Class2_Sub10_Sub9_Sub2 method3432(@OriginalArg(0) int arg0, @OriginalArg(1) Class197 arg1) {
		@Pc(7) Class2_Sub10_Sub9_Sub2 local7 = new Class2_Sub10_Sub9_Sub2();
		local7.anInt4817 = 3;
		local7.aBoolean365 = false;
		local7.aClass197_2 = arg1;
		local7.aLong206 = arg0;
		this.method3435(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLclient!qg;)V")
	private void method3435(@OriginalArg(1) Class2_Sub10_Sub9_Sub2 arg0) {
		@Pc(6) Class87 local6 = this.aClass87_10;
		synchronized (this.aClass87_10) {
			this.aClass87_10.method2360(arg0);
			this.anInt3729++;
			this.aClass87_10.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[BILclient!q;)Lclient!qg;")
	public Class2_Sub10_Sub9_Sub2 method3437(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class197 arg2) {
		@Pc(7) Class2_Sub10_Sub9_Sub2 local7 = new Class2_Sub10_Sub9_Sub2();
		local7.aClass197_2 = arg2;
		local7.anInt4817 = 2;
		local7.aLong206 = arg1;
		local7.aBoolean365 = false;
		local7.aByteArray87 = arg0;
		this.method3435(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean287) {
			@Pc(10) Class87 local10 = this.aClass87_10;
			@Pc(18) Class2_Sub10_Sub9_Sub2 local18;
			synchronized (this.aClass87_10) {
				local18 = (Class2_Sub10_Sub9_Sub2) this.aClass87_10.method2359();
				if (local18 == null) {
					try {
						this.aClass87_10.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt3729--;
			}
			try {
				if (local18.anInt4817 == 2) {
					local18.aClass197_2.method4170((int) local18.aLong206, local18.aByteArray87, local18.aByteArray87.length);
				} else if (local18.anInt4817 == 3) {
					local18.aByteArray87 = local18.aClass197_2.method4169((int) local18.aLong206);
				}
			} catch (@Pc(74) Exception local74) {
				Static142.method2676(local74, null);
			}
			local18.aBoolean362 = false;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V")
	public void method3438() {
		this.aBoolean287 = true;
		@Pc(9) Class87 local9 = this.aClass87_10;
		synchronized (this.aClass87_10) {
			this.aClass87_10.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread2 = null;
	}
}
