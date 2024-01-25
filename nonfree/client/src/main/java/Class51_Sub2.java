import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class51_Sub2 extends Class51 {

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
	private int anInt2678 = 0;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "Lclient!vd;")
	private final Class188 aClass188_1 = new Class188();

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIFLclient!dh;Z)V")
	@Override
	public void method2512(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) boolean arg3) {
		super.aByteArray46[super.anInt2672] = (byte) (arg3 ? arg0 + 40 : arg0 + 30);
		super.anObjectArray4[super.anInt2672] = arg2;
		super.aFloatArray8[super.anInt2672] = arg1;
		super.anInt2672++;
		if (super.anInt2672 >= 5000) {
			super.anInt2672 = 0;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
	@Override
	public void method2516(@OriginalArg(1) int arg0) {
		super.aByteArray46[super.anInt2672] = (byte) arg0;
		super.anInt2672++;
		if (super.anInt2672 >= 5000) {
			super.anInt2672 = 0;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ui;B)V")
	@Override
	public void method2513(@OriginalArg(0) Class227 arg0) {
		super.aByteArray46[super.anInt2672] = 21;
		super.anObjectArray4[super.anInt2672] = arg0;
		super.anInt2672++;
		if (super.anInt2672 >= 5000) {
			super.anInt2672 = 0;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	@Override
	public void method2511(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	@Override
	public void method2510() {
		while (super.anInt2672 != super.anInt2674) {
			this.method2518();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ui;I)V")
	@Override
	public void method2508(@OriginalArg(0) Class227 arg0) {
		super.anInt2674--;
		if (super.anInt2674 < 0) {
			super.anInt2674 = 4999;
		}
		super.aByteArray46[super.anInt2674] = 21;
		super.anObjectArray4[super.anInt2674] = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
	@Override
	public void method2515() {
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!ui;)V")
	@Override
	public void method2514(@OriginalArg(1) Class227 arg0) {
		super.aByteArray46[super.anInt2672] = 20;
		super.anObjectArray4[super.anInt2672] = arg0;
		super.anInt2672++;
		if (super.anInt2672 >= 5000) {
			super.anInt2672 = 0;
		}
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
	private void method2518() {
		@Pc(8) int local8 = super.anInt2674++;
		if (super.anInt2674 >= 5000) {
			super.anInt2674 = 0;
		}
		this.anInt2678 = super.aByteArray46[local8];
		@Pc(34) Object local34 = super.anObjectArray4[local8];
		super.anObjectArray4[local8] = null;
		if (this.anInt2678 == 21) {
			Static140.method5081(this.aClass188_1, (Class227) local34);
		} else if (this.anInt2678 == 20) {
			@Pc(164) Class227 local164 = (Class227) local34;
			if (local164.aClass12_Sub2_2 != null) {
				local164.aClass12_Sub2_2.method5449(Static315.aClass82_7);
			}
			if (local164.aClass12_Sub2_3 != null) {
				local164.aClass12_Sub2_3.method5449(Static315.aClass82_7);
			}
			if (local164.aClass12_Sub4_3 != null) {
				local164.aClass12_Sub4_3.method5449(Static315.aClass82_7);
			}
			if (local164.aClass12_Sub4_2 != null) {
				local164.aClass12_Sub4_2.method5449(Static315.aClass82_7);
			}
			if (local164.aClass12_Sub5_2 != null) {
				local164.aClass12_Sub5_2.method5449(Static315.aClass82_7);
			}
			for (@Pc(207) Class164 local207 = local164.aClass164_25; local207 != null; local207 = local207.aClass164_19) {
				local207.aClass12_Sub1_2.method5449(Static315.aClass82_7);
			}
		} else if (this.anInt2678 >= 30 && this.anInt2678 <= 33) {
			Static315.aClass82_7.method4516(3000.0F, super.aFloatArray8[local8] * 1.5F);
			((Class33) local34).method4070(Static33.anInt702, Static345.anInt6083, Static273.anInt4882, Static227.aBooleanArrayArray5, this.anInt2678 - 30 == 0);
		} else if (this.anInt2678 >= 40 && this.anInt2678 <= 43) {
			Static315.aClass82_7.method4516(3000.0F, super.aFloatArray8[local8] * 1.5F);
			((Class33) local34).method4070(Static33.anInt702, Static345.anInt6083, Static273.anInt4882, Static15.aBooleanArrayArray1, this.anInt2678 - 40 == 0);
		} else if (this.anInt2678 == 22) {
			Static315.aClass82_7.method4544();
		} else if (this.anInt2678 == 23) {
			Static315.aClass82_7.method4495();
		} else if (this.anInt2678 == 24) {
			Static315.aClass82_7.method4489(0, null);
			return;
		}
	}
}
