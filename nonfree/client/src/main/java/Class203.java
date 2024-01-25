import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class203 implements Runnable {

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Lclient!nf;")
	private final Class170 aClass170_5 = new Class170();

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "Z")
	private boolean aBoolean349 = false;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	public int anInt5504 = 0;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!qn;)V")
	public Class203(@OriginalArg(0) Class209 arg0) {
		@Pc(20) Class122 local20 = arg0.method4687(this, 5);
		while (local20.anInt3557 == 0) {
			Static88.method4161(10L);
		}
		if (local20.anInt3557 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject7;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!wi;B)V")
	private void method4592(@OriginalArg(0) Class6_Sub2_Sub11_Sub2 arg0) {
		@Pc(2) Class170 local2 = this.aClass170_5;
		synchronized (this.aClass170_5) {
			this.aClass170_5.method4001(arg0);
			this.anInt5504++;
			this.aClass170_5.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public void method4593() {
		this.aBoolean349 = true;
		@Pc(9) Class170 local9 = this.aClass170_5;
		synchronized (this.aClass170_5) {
			this.aClass170_5.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!ek;I)Lclient!wi;")
	public Class6_Sub2_Sub11_Sub2 method4594(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class6_Sub2_Sub11_Sub2 local7 = new Class6_Sub2_Sub11_Sub2();
		local7.aBoolean490 = false;
		local7.anInt7799 = 3;
		local7.aClass63_6 = arg0;
		local7.aLong225 = arg1;
		this.method4592(local7);
		return local7;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ek;II)Lclient!wi;")
	public Class6_Sub2_Sub11_Sub2 method4596(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class6_Sub2_Sub11_Sub2 local9 = new Class6_Sub2_Sub11_Sub2();
		local9.anInt7799 = 1;
		@Pc(15) Class170 local15 = this.aClass170_5;
		synchronized (this.aClass170_5) {
			@Pc(23) Class6_Sub2_Sub11_Sub2 local23 = (Class6_Sub2_Sub11_Sub2) this.aClass170_5.method4006();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong225 == (long) arg1 && local23.aClass63_6 == arg0 && local23.anInt7799 == 2) {
					local9.aByteArray95 = local23.aByteArray95;
					local9.aBoolean491 = false;
					return local9;
				}
				local23 = (Class6_Sub2_Sub11_Sub2) this.aClass170_5.method4000();
			}
		}
		local9.aByteArray95 = arg0.method1657(arg1);
		local9.aBoolean490 = true;
		local9.aBoolean491 = false;
		return local9;
	}

	@OriginalMember(owner = "client!qc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean349) {
			@Pc(10) Class170 local10 = this.aClass170_5;
			@Pc(18) Class6_Sub2_Sub11_Sub2 local18;
			synchronized (this.aClass170_5) {
				local18 = (Class6_Sub2_Sub11_Sub2) this.aClass170_5.method4003();
				if (local18 == null) {
					try {
						this.aClass170_5.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt5504--;
			}
			try {
				if (local18.anInt7799 == 2) {
					local18.aClass63_6.method1661(local18.aByteArray95, (int) local18.aLong225, local18.aByteArray95.length);
				} else if (local18.anInt7799 == 3) {
					local18.aByteArray95 = local18.aClass63_6.method1657((int) local18.aLong225);
				}
			} catch (@Pc(78) Exception local78) {
				Static390.method5741(local78, null);
			}
			local18.aBoolean491 = false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ek;II[B)Lclient!wi;")
	public Class6_Sub2_Sub11_Sub2 method4599(@OriginalArg(0) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class6_Sub2_Sub11_Sub2 local7 = new Class6_Sub2_Sub11_Sub2();
		local7.aByteArray95 = arg2;
		local7.anInt7799 = 2;
		local7.aLong225 = arg1;
		local7.aClass63_6 = arg0;
		local7.aBoolean490 = false;
		this.method4592(local7);
		return local7;
	}
}
