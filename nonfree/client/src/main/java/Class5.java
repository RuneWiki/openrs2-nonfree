import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class5 implements Runnable {

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "Lclient!mn;")
	private final Class211 aClass211_1 = new Class211();

	@OriginalMember(owner = "client!aca", name = "m", descriptor = "Z")
	private boolean aBoolean6 = false;

	@OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
	public int anInt79 = 0;

	@OriginalMember(owner = "client!aca", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!wea;)V")
	public Class5(@OriginalArg(0) Class370 arg0) {
		@Pc(20) Class240 local20 = arg0.method9071(this, 5);
		while (local20.anInt7566 == 0) {
			Static190.method3914(10L);
		}
		if (local20.anInt7566 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject13;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "([BLclient!nw;BI)Lclient!qh;")
	public Class2_Sub6_Sub8_Sub2 method108(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class233 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub6_Sub8_Sub2 local13 = new Class2_Sub6_Sub8_Sub2();
		local13.aByteArray110 = arg0;
		local13.aBoolean600 = false;
		local13.aClass233_3 = arg1;
		local13.aLong267 = arg2;
		local13.anInt8427 = 2;
		this.method109(local13);
		return local13;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!qh;I)V")
	private void method109(@OriginalArg(0) Class2_Sub6_Sub8_Sub2 arg0) {
		@Pc(6) Class211 local6 = this.aClass211_1;
		synchronized (this.aClass211_1) {
			this.aClass211_1.method6002(arg0);
			this.anInt79++;
			this.aClass211_1.notifyAll();
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
	public void method110() {
		this.aBoolean6 = true;
		@Pc(9) Class211 local9 = this.aClass211_1;
		synchronized (this.aClass211_1) {
			this.aClass211_1.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!nw;IB)Lclient!qh;")
	public Class2_Sub6_Sub8_Sub2 method113(@OriginalArg(0) Class233 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub6_Sub8_Sub2 local7 = new Class2_Sub6_Sub8_Sub2();
		local7.aBoolean600 = false;
		local7.anInt8427 = 3;
		local7.aLong267 = arg1;
		local7.aClass233_3 = arg0;
		this.method109(local7);
		return local7;
	}

	@OriginalMember(owner = "client!aca", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean6) {
			@Pc(6) Class211 local6 = this.aClass211_1;
			@Pc(14) Class2_Sub6_Sub8_Sub2 local14;
			synchronized (this.aClass211_1) {
				local14 = (Class2_Sub6_Sub8_Sub2) this.aClass211_1.method6005();
				if (local14 == null) {
					try {
						this.aClass211_1.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt79--;
			}
			try {
				if (local14.anInt8427 == 2) {
					local14.aClass233_3.method6304(local14.aByteArray110.length, (int) local14.aLong267, local14.aByteArray110);
				} else if (local14.anInt8427 == 3) {
					local14.aByteArray110 = local14.aClass233_3.method6305((int) local14.aLong267);
				}
			} catch (@Pc(76) Exception local76) {
				Static408.method6625(null, local76);
			}
			local14.aBoolean601 = false;
		}
	}

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(Lclient!nw;IB)Lclient!qh;")
	public Class2_Sub6_Sub8_Sub2 method114(@OriginalArg(0) Class233 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class2_Sub6_Sub8_Sub2 local14 = new Class2_Sub6_Sub8_Sub2();
		local14.anInt8427 = 1;
		@Pc(20) Class211 local20 = this.aClass211_1;
		synchronized (this.aClass211_1) {
			@Pc(28) Class2_Sub6_Sub8_Sub2 local28 = (Class2_Sub6_Sub8_Sub2) this.aClass211_1.method6008();
			while (true) {
				if (local28 == null) {
					break;
				}
				if (local28.aLong267 == (long) arg1 && local28.aClass233_3 == arg0 && local28.anInt8427 == 2) {
					local14.aByteArray110 = local28.aByteArray110;
					local14.aBoolean601 = false;
					return local14;
				}
				local28 = (Class2_Sub6_Sub8_Sub2) this.aClass211_1.method6000();
			}
		}
		local14.aByteArray110 = arg0.method6305(arg1);
		local14.aBoolean600 = true;
		local14.aBoolean601 = false;
		return local14;
	}
}
