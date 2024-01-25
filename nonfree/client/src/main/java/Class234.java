import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class234 implements Runnable {

	@OriginalMember(owner = "client!su", name = "j", descriptor = "Lclient!tk;")
	private final Class239 aClass239_9 = new Class239();

	@OriginalMember(owner = "client!su", name = "k", descriptor = "I")
	public int anInt6136 = 0;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "Z")
	private boolean aBoolean430 = false;

	@OriginalMember(owner = "client!su", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class234(@OriginalArg(0) Class196 arg0) {
		@Pc(20) Class45 local20 = arg0.method3896(5, this);
		while (local20.anInt1129 == 0) {
			Static435.method5777(10L);
		}
		if (local20.anInt1129 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject5;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BILclient!ht;)Lclient!ef;")
	public Class4_Sub2_Sub2_Sub2 method4923(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1) {
		@Pc(9) Class4_Sub2_Sub2_Sub2 local9 = new Class4_Sub2_Sub2_Sub2();
		local9.anInt1667 = 1;
		@Pc(15) Class239 local15 = this.aClass239_9;
		synchronized (this.aClass239_9) {
			@Pc(25) Class4_Sub2_Sub2_Sub2 local25 = (Class4_Sub2_Sub2_Sub2) this.aClass239_9.method5125();
			while (true) {
				if (local25 == null) {
					break;
				}
				if (local25.aLong208 == (long) arg0 && arg1 == local25.aClass117_1 && local25.anInt1667 == 2) {
					local9.aBoolean113 = false;
					local9.aByteArray10 = local25.aByteArray10;
					return local9;
				}
				local25 = (Class4_Sub2_Sub2_Sub2) this.aClass239_9.method5120();
			}
		}
		local9.aByteArray10 = arg1.method2250(arg0);
		local9.aBoolean113 = false;
		local9.aBoolean114 = true;
		return local9;
	}

	@OriginalMember(owner = "client!su", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean430) {
			@Pc(10) Class239 local10 = this.aClass239_9;
			@Pc(18) Class4_Sub2_Sub2_Sub2 local18;
			synchronized (this.aClass239_9) {
				local18 = (Class4_Sub2_Sub2_Sub2) this.aClass239_9.method5119();
				if (local18 == null) {
					try {
						this.aClass239_9.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt6136--;
			}
			try {
				if (local18.anInt1667 == 2) {
					local18.aClass117_1.method2251((int) local18.aLong208, local18.aByteArray10.length, local18.aByteArray10);
				} else if (local18.anInt1667 == 3) {
					local18.aByteArray10 = local18.aClass117_1.method2250((int) local18.aLong208);
				}
			} catch (@Pc(76) Exception local76) {
				Static33.method448(local76, null);
			}
			local18.aBoolean113 = false;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ILclient!ht;I)Lclient!ef;")
	public Class4_Sub2_Sub2_Sub2 method4926(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub2_Sub2_Sub2 local12 = new Class4_Sub2_Sub2_Sub2();
		local12.aClass117_1 = arg0;
		local12.anInt1667 = 3;
		local12.aLong208 = arg1;
		local12.aBoolean114 = false;
		this.method4927(local12);
		return local12;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!ef;Z)V")
	private void method4927(@OriginalArg(0) Class4_Sub2_Sub2_Sub2 arg0) {
		@Pc(6) Class239 local6 = this.aClass239_9;
		synchronized (this.aClass239_9) {
			this.aClass239_9.method5126(arg0);
			this.anInt6136++;
			this.aClass239_9.notifyAll();
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "([BILclient!ht;I)Lclient!ef;")
	public Class4_Sub2_Sub2_Sub2 method4928(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub2_Sub2_Sub2 local7 = new Class4_Sub2_Sub2_Sub2();
		local7.aClass117_1 = arg1;
		local7.aLong208 = arg2;
		local7.anInt1667 = 2;
		local7.aByteArray10 = arg0;
		local7.aBoolean114 = false;
		this.method4927(local7);
		return local7;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	public void method4929() {
		this.aBoolean430 = true;
		@Pc(9) Class239 local9 = this.aClass239_9;
		synchronized (this.aClass239_9) {
			this.aClass239_9.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread3 = null;
	}
}
