import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class179 implements Runnable {

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "Lclient!bl;")
	private Class17 aClass17_9 = new Class17();

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "Z")
	private boolean aBoolean449 = false;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
	public int anInt5880 = 0;

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class179() {
		@Pc(20) Class118 local20 = Static13.aClass84_3.method1958(this, 5);
		while (local20.anInt3187 == 0) {
			Static275.method4233(10L);
		}
		if (local20.anInt3187 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject3;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
	public void method4525() {
		this.aBoolean449 = true;
		@Pc(10) Class17 local10 = this.aClass17_9;
		synchronized (this.aClass17_9) {
			this.aClass17_9.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!wj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean449) {
			@Pc(12) Class17 local12 = this.aClass17_9;
			@Pc(19) Class1_Sub2_Sub1_Sub2 local19;
			synchronized (this.aClass17_9) {
				local19 = (Class1_Sub2_Sub1_Sub2) this.aClass17_9.method463();
				if (local19 == null) {
					try {
						this.aClass17_9.wait();
					} catch (@Pc(26) InterruptedException local26) {
					}
					continue;
				}
				this.anInt5880--;
			}
			try {
				if (local19.anInt3091 == 2) {
					local19.aClass159_2.method4023(local19.aByteArray66, local19.aByteArray66.length, (int) local19.aLong197);
				} else if (local19.anInt3091 == 3) {
					local19.aByteArray66 = local19.aClass159_2.method4024((int) local19.aLong197);
				}
			} catch (@Pc(79) Exception local79) {
				Static6.method149(local79, null);
			}
			local19.aBoolean233 = false;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!tm;B)Lclient!mi;")
	public Class1_Sub2_Sub1_Sub2 method4526(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1) {
		@Pc(9) Class1_Sub2_Sub1_Sub2 local9 = new Class1_Sub2_Sub1_Sub2();
		local9.anInt3091 = 1;
		@Pc(16) Class17 local16 = this.aClass17_9;
		synchronized (this.aClass17_9) {
			@Pc(23) Class1_Sub2_Sub1_Sub2 local23 = (Class1_Sub2_Sub1_Sub2) this.aClass17_9.method469();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong197 == (long) arg0 && arg1 == local23.aClass159_2 && local23.anInt3091 == 2) {
					local9.aBoolean233 = false;
					local9.aByteArray66 = local23.aByteArray66;
					return local9;
				}
				local23 = (Class1_Sub2_Sub1_Sub2) this.aClass17_9.method466();
			}
		}
		local9.aByteArray66 = arg1.method4024(arg0);
		local9.aBoolean233 = false;
		local9.aBoolean231 = true;
		return local9;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!tm;IB[B)Lclient!mi;")
	public Class1_Sub2_Sub1_Sub2 method4528(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class1_Sub2_Sub1_Sub2 local7 = new Class1_Sub2_Sub1_Sub2();
		local7.aClass159_2 = arg0;
		local7.aBoolean231 = false;
		local7.aLong197 = arg1;
		local7.aByteArray66 = arg2;
		local7.anInt3091 = 2;
		this.method4531(local7);
		return local7;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BILclient!tm;)Lclient!mi;")
	public Class1_Sub2_Sub1_Sub2 method4530(@OriginalArg(1) int arg0, @OriginalArg(2) Class159 arg1) {
		@Pc(3) Class1_Sub2_Sub1_Sub2 local3 = new Class1_Sub2_Sub1_Sub2();
		local3.aBoolean231 = false;
		local3.aLong197 = arg0;
		local3.aClass159_2 = arg1;
		local3.anInt3091 = 3;
		this.method4531(local3);
		return local3;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!mi;)V")
	private void method4531(@OriginalArg(1) Class1_Sub2_Sub1_Sub2 arg0) {
		@Pc(3) Class17 local3 = this.aClass17_9;
		synchronized (this.aClass17_9) {
			this.aClass17_9.method462(arg0);
			this.anInt5880++;
			this.aClass17_9.notifyAll();
		}
	}
}
