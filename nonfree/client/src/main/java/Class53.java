import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class53 implements Runnable {

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "Lclient!se;")
	private final Class180 aClass180_5 = new Class180();

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
	public int anInt1887 = 0;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class53(@OriginalArg(0) Class134 arg0) {
		@Pc(20) Class185 local20 = arg0.method3762(5, this);
		while (local20.anInt5682 == 0) {
			Static249.method4396(10L);
		}
		if (local20.anInt5682 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject4;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!hc;)V")
	private void method1712(@OriginalArg(1) Class4_Sub4_Sub2_Sub2 arg0) {
		@Pc(6) Class180 local6 = this.aClass180_5;
		synchronized (this.aClass180_5) {
			this.aClass180_5.method4840(arg0);
			this.anInt1887++;
			this.aClass180_5.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ef", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean130) {
			@Pc(10) Class180 local10 = this.aClass180_5;
			@Pc(18) Class4_Sub4_Sub2_Sub2 local18;
			synchronized (this.aClass180_5) {
				local18 = (Class4_Sub4_Sub2_Sub2) this.aClass180_5.method4839();
				if (local18 == null) {
					try {
						this.aClass180_5.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt1887--;
			}
			try {
				if (local18.anInt2751 == 2) {
					local18.aClass214_1.method5526(local18.aByteArray44, local18.aByteArray44.length, (int) local18.aLong222);
				} else if (local18.anInt2751 == 3) {
					local18.aByteArray44 = local18.aClass214_1.method5529((int) local18.aLong222);
				}
			} catch (@Pc(74) Exception local74) {
				Static289.method4874(null, local74);
			}
			local18.aBoolean197 = false;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!we;II)Lclient!hc;")
	public Class4_Sub4_Sub2_Sub2 method1715(@OriginalArg(0) Class214 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class4_Sub4_Sub2_Sub2 local9 = new Class4_Sub4_Sub2_Sub2();
		local9.anInt2751 = 1;
		@Pc(15) Class180 local15 = this.aClass180_5;
		synchronized (this.aClass180_5) {
			@Pc(23) Class4_Sub4_Sub2_Sub2 local23 = (Class4_Sub4_Sub2_Sub2) this.aClass180_5.method4838();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong222 && arg0 == local23.aClass214_1 && local23.anInt2751 == 2) {
					local9.aByteArray44 = local23.aByteArray44;
					local9.aBoolean197 = false;
					return local9;
				}
				local23 = (Class4_Sub4_Sub2_Sub2) this.aClass180_5.method4843();
			}
		}
		local9.aByteArray44 = arg0.method5529(arg1);
		local9.aBoolean197 = false;
		local9.aBoolean198 = true;
		return local9;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!we;I[B)Lclient!hc;")
	public Class4_Sub4_Sub2_Sub2 method1716(@OriginalArg(1) Class214 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class4_Sub4_Sub2_Sub2 local7 = new Class4_Sub4_Sub2_Sub2();
		local7.aByteArray44 = arg2;
		local7.aClass214_1 = arg0;
		local7.aBoolean198 = false;
		local7.anInt2751 = 2;
		local7.aLong222 = arg1;
		this.method1712(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public void method1719() {
		this.aBoolean130 = true;
		@Pc(9) Class180 local9 = this.aClass180_5;
		synchronized (this.aClass180_5) {
			this.aClass180_5.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!we;B)Lclient!hc;")
	public Class4_Sub4_Sub2_Sub2 method1720(@OriginalArg(0) int arg0, @OriginalArg(1) Class214 arg1) {
		@Pc(7) Class4_Sub4_Sub2_Sub2 local7 = new Class4_Sub4_Sub2_Sub2();
		local7.anInt2751 = 3;
		local7.aBoolean198 = false;
		local7.aLong222 = arg0;
		local7.aClass214_1 = arg1;
		this.method1712(local7);
		return local7;
	}
}
