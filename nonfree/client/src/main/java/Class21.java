import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class21 implements Runnable {

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Lclient!er;")
	private final Class56 aClass56_2 = new Class56();

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
	public int anInt597 = 0;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class21(@OriginalArg(0) Class15 arg0) {
		@Pc(20) Class205 local20 = arg0.method287(5, this);
		while (local20.anInt6370 == 0) {
			Static15.method5425(10L);
		}
		if (local20.anInt6370 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject7;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ug;I)Lclient!pk;")
	public Class14_Sub2_Sub16_Sub1 method648(@OriginalArg(0) int arg0, @OriginalArg(1) Class199 arg1) {
		@Pc(9) Class14_Sub2_Sub16_Sub1 local9 = new Class14_Sub2_Sub16_Sub1();
		local9.anInt4823 = 1;
		@Pc(15) Class56 local15 = this.aClass56_2;
		synchronized (this.aClass56_2) {
			@Pc(23) Class14_Sub2_Sub16_Sub1 local23 = (Class14_Sub2_Sub16_Sub1) this.aClass56_2.method1923();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg0 == local23.aLong208 && arg1 == local23.aClass199_4 && local23.anInt4823 == 2) {
					local9.aByteArray143 = local23.aByteArray143;
					local9.aBoolean428 = false;
					return local9;
				}
				local23 = (Class14_Sub2_Sub16_Sub1) this.aClass56_2.method1920();
			}
		}
		local9.aByteArray143 = arg1.method5480(arg0);
		local9.aBoolean427 = true;
		local9.aBoolean428 = false;
		return local9;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	public void method650() {
		this.aBoolean27 = true;
		@Pc(9) Class56 local9 = this.aClass56_2;
		synchronized (this.aClass56_2) {
			this.aClass56_2.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(32) InterruptedException local32) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!pk;B)V")
	private void method651(@OriginalArg(0) Class14_Sub2_Sub16_Sub1 arg0) {
		@Pc(6) Class56 local6 = this.aClass56_2;
		synchronized (this.aClass56_2) {
			this.aClass56_2.method1922(arg0);
			this.anInt597++;
			this.aClass56_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ug;II)Lclient!pk;")
	public Class14_Sub2_Sub16_Sub1 method653(@OriginalArg(0) Class199 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class14_Sub2_Sub16_Sub1 local7 = new Class14_Sub2_Sub16_Sub1();
		local7.aClass199_4 = arg0;
		local7.aLong208 = arg1;
		local7.aBoolean427 = false;
		local7.anInt4823 = 3;
		this.method651(local7);
		return local7;
	}

	@OriginalMember(owner = "client!bi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean27) {
			@Pc(10) Class56 local10 = this.aClass56_2;
			@Pc(18) Class14_Sub2_Sub16_Sub1 local18;
			synchronized (this.aClass56_2) {
				local18 = (Class14_Sub2_Sub16_Sub1) this.aClass56_2.method1917();
				if (local18 == null) {
					try {
						this.aClass56_2.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt597--;
			}
			try {
				if (local18.anInt4823 == 2) {
					local18.aClass199_4.method5478(local18.aByteArray143, (int) local18.aLong208, local18.aByteArray143.length);
				} else if (local18.anInt4823 == 3) {
					local18.aByteArray143 = local18.aClass199_4.method5480((int) local18.aLong208);
				}
			} catch (@Pc(78) Exception local78) {
				Static47.method1149(local78, null);
			}
			local18.aBoolean428 = false;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([BLclient!ug;IZ)Lclient!pk;")
	public Class14_Sub2_Sub16_Sub1 method654(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class14_Sub2_Sub16_Sub1 local12 = new Class14_Sub2_Sub16_Sub1();
		local12.aBoolean427 = false;
		local12.aClass199_4 = arg1;
		local12.anInt4823 = 2;
		local12.aByteArray143 = arg0;
		local12.aLong208 = arg2;
		this.method651(local12);
		return local12;
	}
}
