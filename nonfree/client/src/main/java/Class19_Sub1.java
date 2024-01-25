import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	private int anInt356 = 0;

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "Lclient!rs;")
	private final Class103 aClass103_1 = new Class103();

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)V")
	@Override
	public void method5303(@OriginalArg(1) int arg0) {
		super.aByteArray93[super.anInt6073] = (byte) arg0;
		super.anInt6073++;
		if (super.anInt6073 >= 5000) {
			super.anInt6073 = 0;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	@Override
	public void method5301(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZLclient!mi;F)V")
	@Override
	public void method5304(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class149 arg2, @OriginalArg(4) float arg3) {
		super.aByteArray93[super.anInt6073] = (byte) (arg1 ? arg0 + 40 : arg0 + 30);
		super.anObjectArray35[super.anInt6073] = arg2;
		super.aFloatArray27[super.anInt6073] = arg3;
		super.anInt6073++;
		if (super.anInt6073 >= 5000) {
			super.anInt6073 = 0;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	@Override
	public void method5298() {
		while (super.anInt6073 != super.anInt6070) {
			this.method270();
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	private void method270() {
		@Pc(14) int local14 = super.anInt6070++;
		if (super.anInt6070 >= 5000) {
			super.anInt6070 = 0;
		}
		this.anInt356 = super.aByteArray93[local14];
		@Pc(40) Object local40 = super.anObjectArray35[local14];
		super.anObjectArray35[local14] = null;
		if (this.anInt356 == 21) {
			Static84.method1454(this.aClass103_1, (Class188) local40);
		} else if (this.anInt356 == 20) {
			@Pc(62) Class188 local62 = (Class188) local40;
			if (local62.aClass1_Sub5_2 != null) {
				local62.aClass1_Sub5_2.method6023(Static59.aClass48_2);
			}
			if (local62.aClass1_Sub5_1 != null) {
				local62.aClass1_Sub5_1.method6023(Static59.aClass48_2);
			}
			if (local62.aClass1_Sub3_3 != null) {
				local62.aClass1_Sub3_3.method6023(Static59.aClass48_2);
			}
			if (local62.aClass1_Sub3_2 != null) {
				local62.aClass1_Sub3_2.method6023(Static59.aClass48_2);
			}
			if (local62.aClass1_Sub1_2 != null) {
				local62.aClass1_Sub1_2.method6023(Static59.aClass48_2);
			}
			for (@Pc(107) Class168 local107 = local62.aClass168_2; local107 != null; local107 = local107.aClass168_1) {
				local107.aClass1_Sub2_1.method6023(Static59.aClass48_2);
			}
		} else if (this.anInt356 >= 30 && this.anInt356 <= 33) {
			Static59.aClass48_2.method2460(3000.0F, super.aFloatArray27[local14] * 1.5F);
			((Class149) local40).method5833(Static284.anInt5626, Static373.anInt6861, Static113.anInt5764, Static133.aBooleanArrayArray3, this.anInt356 - 30 == 0);
		} else if (this.anInt356 >= 40 && this.anInt356 <= 43) {
			Static59.aClass48_2.method2460(3000.0F, super.aFloatArray27[local14] * 1.5F);
			((Class149) local40).method5833(Static284.anInt5626, Static373.anInt6861, Static113.anInt5764, Static66.aBooleanArrayArray1, this.anInt356 - 40 == 0);
		} else if (this.anInt356 == 22) {
			Static59.aClass48_2.method2521();
		} else if (this.anInt356 == 23) {
			Static59.aClass48_2.method2533();
		} else if (this.anInt356 == 24) {
			Static59.aClass48_2.method2474(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5305(@OriginalArg(1) Class188 arg0) {
		super.anInt6070--;
		if (super.anInt6070 < 0) {
			super.anInt6070 = 4999;
		}
		super.aByteArray93[super.anInt6070] = 21;
		super.anObjectArray35[super.anInt6070] = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5307(@OriginalArg(0) Class188 arg0) {
		super.aByteArray93[super.anInt6073] = 21;
		super.anObjectArray35[super.anInt6073] = arg0;
		super.anInt6073++;
		if (super.anInt6073 >= 5000) {
			super.anInt6073 = 0;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5299(@OriginalArg(0) Class188 arg0) {
		super.aByteArray93[super.anInt6073] = 20;
		super.anObjectArray35[super.anInt6073] = arg0;
		super.anInt6073++;
		if (super.anInt6073 >= 5000) {
			super.anInt6073 = 0;
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	@Override
	public void method5300() {
	}
}
