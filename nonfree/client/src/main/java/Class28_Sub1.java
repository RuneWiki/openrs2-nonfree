import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
	private int anInt864 = 0;

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!lj;")
	private final Class64 aClass64_1 = new Class64();

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	private void method794() {
		@Pc(8) int local8 = super.anInt6460++;
		if (super.anInt6460 >= 5000) {
			super.anInt6460 = 0;
		}
		this.anInt864 = super.aByteArray93[local8];
		@Pc(34) Object local34 = super.anObjectArray35[local8];
		super.anObjectArray35[local8] = null;
		if (this.anInt864 == 21) {
			Static230.method3968(this.aClass64_1, (Class51) local34);
		} else if (this.anInt864 == 20) {
			@Pc(61) Class51 local61 = (Class51) local34;
			if (local61.aClass25_Sub2_1 != null) {
				local61.aClass25_Sub2_1.method5583(Static98.aClass59_3);
			}
			if (local61.aClass25_Sub2_2 != null) {
				local61.aClass25_Sub2_2.method5583(Static98.aClass59_3);
			}
			if (local61.aClass25_Sub3_2 != null) {
				local61.aClass25_Sub3_2.method5583(Static98.aClass59_3);
			}
			if (local61.aClass25_Sub3_1 != null) {
				local61.aClass25_Sub3_1.method5583(Static98.aClass59_3);
			}
			if (local61.aClass25_Sub4_1 != null) {
				local61.aClass25_Sub4_1.method5583(Static98.aClass59_3);
			}
			for (@Pc(108) Class103 local108 = local61.aClass103_1; local108 != null; local108 = local108.aClass103_2) {
				local108.aClass25_Sub1_1.method5583(Static98.aClass59_3);
			}
		} else if (this.anInt864 >= 30 && this.anInt864 <= 33) {
			Static98.aClass59_3.method4859(3000.0F, super.aFloatArray29[local8] * 1.5F);
			((Class3) local34).method5635(Static210.anInt5625, Static103.anInt2249, Static98.anInt2185, Static240.aBooleanArrayArray31, this.anInt864 - 30 == 0);
		} else if (this.anInt864 >= 40 && this.anInt864 <= 43) {
			Static98.aClass59_3.method4859(3000.0F, super.aFloatArray29[local8] * 1.5F);
			((Class3) local34).method5635(Static210.anInt5625, Static103.anInt2249, Static98.anInt2185, Static187.aBooleanArrayArray43, this.anInt864 - 40 == 0);
		} else if (this.anInt864 == 22) {
			Static98.aClass59_3.method4822();
		} else if (this.anInt864 == 23) {
			Static98.aClass59_3.method4858();
			return;
		} else if (this.anInt864 == 24) {
			Static98.aClass59_3.method4885(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!dn;I)V")
	@Override
	public void method5715(@OriginalArg(0) Class51 arg0) {
		super.aByteArray93[super.anInt6462] = 21;
		super.anObjectArray35[super.anInt6462] = arg0;
		super.anInt6462++;
		if (super.anInt6462 >= 5000) {
			super.anInt6462 = 0;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	@Override
	public void method5716() {
		while (super.anInt6460 != super.anInt6462) {
			this.method794();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)V")
	@Override
	public void method5711(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!dn;B)V")
	@Override
	public void method5717(@OriginalArg(0) Class51 arg0) {
		super.aByteArray93[super.anInt6462] = 20;
		super.anObjectArray35[super.anInt6462] = arg0;
		super.anInt6462++;
		if (super.anInt6462 >= 5000) {
			super.anInt6462 = 0;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
	@Override
	public void method5719(@OriginalArg(0) int arg0) {
		super.aByteArray93[super.anInt6462] = (byte) arg0;
		super.anInt6462++;
		if (super.anInt6462 >= 5000) {
			super.anInt6462 = 0;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
	@Override
	public void method5718() {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!dn;)V")
	@Override
	public void method5710(@OriginalArg(1) Class51 arg0) {
		super.anInt6460--;
		if (super.anInt6460 < 0) {
			super.anInt6460 = 4999;
		}
		super.aByteArray93[super.anInt6460] = 21;
		super.anObjectArray35[super.anInt6460] = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IFLclient!ac;ZI)V")
	@Override
	public void method5712(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3) {
		super.aByteArray93[super.anInt6462] = (byte) (arg3 ? arg0 + 40 : arg0 + 30);
		super.anObjectArray35[super.anInt6462] = arg2;
		super.aFloatArray29[super.anInt6462] = arg1;
		super.anInt6462++;
		if (super.anInt6462 >= 5000) {
			super.anInt6462 = 0;
		}
	}
}
