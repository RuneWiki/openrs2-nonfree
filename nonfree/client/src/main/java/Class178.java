import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class178 implements Runnable {

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "Lclient!ql;")
	private final Class169 aClass169_10 = new Class169();

	@OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
	public int anInt5507 = 0;

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "Z")
	private boolean aBoolean460 = false;

	@OriginalMember(owner = "client!ro", name = "q", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class178(@OriginalArg(0) Class215 arg0) {
		@Pc(20) Class193 local20 = arg0.method5654(this, 5);
		while (local20.anInt5986 == 0) {
			Static163.method2863(10L);
		}
		if (local20.anInt5986 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject7;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!v;II[B)Lclient!mn;")
	public Class1_Sub2_Sub10_Sub1 method4814(@OriginalArg(0) Class203 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) Class1_Sub2_Sub10_Sub1 local12 = new Class1_Sub2_Sub10_Sub1();
		local12.aLong213 = arg1;
		local12.aByteArray45 = arg2;
		local12.aBoolean470 = false;
		local12.anInt3912 = 2;
		local12.aClass203_6 = arg0;
		this.method4819(local12);
		return local12;
	}

	@OriginalMember(owner = "client!ro", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean460) {
			@Pc(6) Class169 local6 = this.aClass169_10;
			@Pc(14) Class1_Sub2_Sub10_Sub1 local14;
			synchronized (this.aClass169_10) {
				local14 = (Class1_Sub2_Sub10_Sub1) this.aClass169_10.method4476();
				if (local14 == null) {
					try {
						this.aClass169_10.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt5507--;
			}
			try {
				if (local14.anInt3912 == 2) {
					local14.aClass203_6.method5500(local14.aByteArray45, (int) local14.aLong213, local14.aByteArray45.length);
				} else if (local14.anInt3912 == 3) {
					local14.aByteArray45 = local14.aClass203_6.method5496((int) local14.aLong213);
				}
			} catch (@Pc(76) Exception local76) {
				Static268.method4816(null, local76);
			}
			local14.aBoolean471 = false;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZILclient!v;)Lclient!mn;")
	public Class1_Sub2_Sub10_Sub1 method4817(@OriginalArg(1) int arg0, @OriginalArg(2) Class203 arg1) {
		@Pc(7) Class1_Sub2_Sub10_Sub1 local7 = new Class1_Sub2_Sub10_Sub1();
		local7.aBoolean470 = false;
		local7.aClass203_6 = arg1;
		local7.aLong213 = arg0;
		local7.anInt3912 = 3;
		this.method4819(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!mn;)V")
	private void method4819(@OriginalArg(1) Class1_Sub2_Sub10_Sub1 arg0) {
		@Pc(2) Class169 local2 = this.aClass169_10;
		synchronized (this.aClass169_10) {
			this.aClass169_10.method4475(arg0);
			this.anInt5507++;
			this.aClass169_10.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
	public void method4821() {
		this.aBoolean460 = true;
		@Pc(9) Class169 local9 = this.aClass169_10;
		synchronized (this.aClass169_10) {
			this.aClass169_10.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BILclient!v;)Lclient!mn;")
	public Class1_Sub2_Sub10_Sub1 method4822(@OriginalArg(1) int arg0, @OriginalArg(2) Class203 arg1) {
		@Pc(9) Class1_Sub2_Sub10_Sub1 local9 = new Class1_Sub2_Sub10_Sub1();
		local9.anInt3912 = 1;
		@Pc(15) Class169 local15 = this.aClass169_10;
		synchronized (this.aClass169_10) {
			@Pc(25) Class1_Sub2_Sub10_Sub1 local25 = (Class1_Sub2_Sub10_Sub1) this.aClass169_10.method4480();
			while (true) {
				if (local25 == null) {
					break;
				}
				if (local25.aLong213 == (long) arg0 && arg1 == local25.aClass203_6 && local25.anInt3912 == 2) {
					local9.aBoolean471 = false;
					local9.aByteArray45 = local25.aByteArray45;
					return local9;
				}
				local25 = (Class1_Sub2_Sub10_Sub1) this.aClass169_10.method4474();
			}
		}
		local9.aByteArray45 = arg1.method5496(arg0);
		local9.aBoolean470 = true;
		local9.aBoolean471 = false;
		return local9;
	}
}
