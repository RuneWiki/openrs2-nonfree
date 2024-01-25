import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class30 implements Runnable {

	@OriginalMember(owner = "client!br", name = "d", descriptor = "[I")
	public static final int[] anIntArray59;

	@OriginalMember(owner = "client!br", name = "e", descriptor = "Lclient!cn;")
	private final Class44 aClass44_2 = new Class44();

	@OriginalMember(owner = "client!br", name = "g", descriptor = "I")
	public int anInt663 = 0;

	@OriginalMember(owner = "client!br", name = "k", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	static {
		new Class209("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
		anIntArray59 = new int[99];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 99; local12++) {
			@Pc(17) int local17 = local12 + 1;
			@Pc(30) int local30 = (int) (Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D + (double) local17);
			local10 += local30;
			anIntArray59[local12] = local10 / 4;
		}
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!dr;)V")
	public Class30(@OriginalArg(0) Class59 arg0) {
		@Pc(20) Class138 local20 = arg0.method1372(this, 5);
		while (local20.anInt3723 == 0) {
			Static81.method1477(10L);
		}
		if (local20.anInt3723 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject7;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IB[BLclient!va;)Lclient!mo;")
	public Class2_Sub5_Sub6_Sub2 method569(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class248 arg2) {
		@Pc(7) Class2_Sub5_Sub6_Sub2 local7 = new Class2_Sub5_Sub6_Sub2();
		local7.aLong211 = arg0;
		local7.aByteArray95 = arg1;
		local7.aBoolean337 = false;
		local7.aClass248_4 = arg2;
		local7.anInt4702 = 2;
		this.method574(local7);
		return local7;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IILclient!va;)Lclient!mo;")
	public Class2_Sub5_Sub6_Sub2 method571(@OriginalArg(1) int arg0, @OriginalArg(2) Class248 arg1) {
		@Pc(7) Class2_Sub5_Sub6_Sub2 local7 = new Class2_Sub5_Sub6_Sub2();
		local7.aBoolean337 = false;
		local7.aLong211 = arg0;
		local7.anInt4702 = 3;
		local7.aClass248_4 = arg1;
		this.method574(local7);
		return local7;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!va;I)Lclient!mo;")
	public Class2_Sub5_Sub6_Sub2 method572(@OriginalArg(1) Class248 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class2_Sub5_Sub6_Sub2 local17 = new Class2_Sub5_Sub6_Sub2();
		local17.anInt4702 = 1;
		@Pc(23) Class44 local23 = this.aClass44_2;
		synchronized (this.aClass44_2) {
			@Pc(31) Class2_Sub5_Sub6_Sub2 local31 = (Class2_Sub5_Sub6_Sub2) this.aClass44_2.method802();
			while (true) {
				if (local31 == null) {
					break;
				}
				if ((long) arg1 == local31.aLong211 && arg0 == local31.aClass248_4 && local31.anInt4702 == 2) {
					local17.aBoolean336 = false;
					local17.aByteArray95 = local31.aByteArray95;
					return local17;
				}
				local31 = (Class2_Sub5_Sub6_Sub2) this.aClass44_2.method803();
			}
		}
		local17.aByteArray95 = arg0.method5438(arg1);
		local17.aBoolean336 = false;
		local17.aBoolean337 = true;
		return local17;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
	public void method573() {
		this.aBoolean37 = true;
		@Pc(9) Class44 local9 = this.aClass44_2;
		synchronized (this.aClass44_2) {
			this.aClass44_2.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!br", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean37) {
			@Pc(6) Class44 local6 = this.aClass44_2;
			@Pc(14) Class2_Sub5_Sub6_Sub2 local14;
			synchronized (this.aClass44_2) {
				local14 = (Class2_Sub5_Sub6_Sub2) this.aClass44_2.method800();
				if (local14 == null) {
					try {
						this.aClass44_2.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt663--;
			}
			try {
				if (local14.anInt4702 == 2) {
					local14.aClass248_4.method5436(local14.aByteArray95, local14.aByteArray95.length, (int) local14.aLong211);
				} else if (local14.anInt4702 == 3) {
					local14.aByteArray95 = local14.aClass248_4.method5438((int) local14.aLong211);
				}
			} catch (@Pc(70) Exception local70) {
				Static361.method4904(local70, null);
			}
			local14.aBoolean336 = false;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!mo;I)V")
	private void method574(@OriginalArg(0) Class2_Sub5_Sub6_Sub2 arg0) {
		@Pc(2) Class44 local2 = this.aClass44_2;
		synchronized (this.aClass44_2) {
			this.aClass44_2.method799(arg0);
			this.anInt663++;
			this.aClass44_2.notifyAll();
		}
	}
}
