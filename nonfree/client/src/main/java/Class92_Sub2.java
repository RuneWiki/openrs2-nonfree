import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class92_Sub2 extends Class92 {

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
	private int anInt4053 = 0;

	@OriginalMember(owner = "client!ln", name = "I", descriptor = "Lclient!rm;")
	private final Class220 aClass220_1 = new Class220();

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)V")
	@Override
	public void method3223(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZFLclient!ta;II)V")
	@Override
	public void method3213(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class165 arg2, @OriginalArg(3) int arg3) {
		super.aByteArray55[super.anInt4042] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
		super.anObjectArray35[super.anInt4042] = arg2;
		super.aFloatArray8[super.anInt4042] = arg1;
		super.anInt4042++;
		if (super.anInt4042 >= 5000) {
			super.anInt4042 = 0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(Lclient!rr;I)V")
	@Override
	public void method3220(@OriginalArg(0) Class223 arg0) {
		super.aByteArray55[super.anInt4042] = 21;
		super.anObjectArray35[super.anInt4042] = arg0;
		super.anInt4042++;
		if (super.anInt4042 >= 5000) {
			super.anInt4042 = 0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
	@Override
	public void method3222(@OriginalArg(0) int arg0) {
		super.aByteArray55[super.anInt4042] = (byte) arg0;
		super.anInt4042++;
		if (super.anInt4042 >= 5000) {
			super.anInt4042 = 0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!rr;I)V")
	@Override
	public void method3214(@OriginalArg(0) Class223 arg0) {
		super.anInt4048--;
		if (super.anInt4048 < 0) {
			super.anInt4048 = 4999;
		}
		super.aByteArray55[super.anInt4048] = 21;
		super.anObjectArray35[super.anInt4048] = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
	private void method3225() {
		@Pc(8) int local8 = super.anInt4048++;
		if (super.anInt4048 >= 5000) {
			super.anInt4048 = 0;
		}
		this.anInt4053 = super.aByteArray55[local8];
		@Pc(34) Object local34 = super.anObjectArray35[local8];
		super.anObjectArray35[local8] = null;
		if (this.anInt4053 == 21) {
			Static248.method3339(this.aClass220_1, (Class223) local34);
		} else if (this.anInt4053 == 20) {
			@Pc(159) Class223 local159 = (Class223) local34;
			if (local159.aClass26_Sub3_2 != null) {
				local159.aClass26_Sub3_2.method5713(Static268.aClass51_8);
			}
			if (local159.aClass26_Sub3_1 != null) {
				local159.aClass26_Sub3_1.method5713(Static268.aClass51_8);
			}
			if (local159.aClass26_Sub1_2 != null) {
				local159.aClass26_Sub1_2.method5713(Static268.aClass51_8);
			}
			if (local159.aClass26_Sub1_1 != null) {
				local159.aClass26_Sub1_1.method5713(Static268.aClass51_8);
			}
			if (local159.aClass26_Sub4_2 != null) {
				local159.aClass26_Sub4_2.method5713(Static268.aClass51_8);
			}
			for (@Pc(202) Class270 local202 = local159.aClass270_1; local202 != null; local202 = local202.aClass270_3) {
				local202.aClass26_Sub2_2.method5713(Static268.aClass51_8);
			}
		} else if (this.anInt4053 >= 30 && this.anInt4053 <= 33) {
			Static268.aClass51_8.g(3000.0F, super.aFloatArray8[local8] * 1.5F);
			((Class165) local34).method3575(Static408.anInt6461, Static72.anInt1379, Static133.anInt2523, Static262.aBooleanArrayArray20, this.anInt4053 - 30 == 0);
		} else if (this.anInt4053 >= 40 && this.anInt4053 <= 43) {
			Static268.aClass51_8.g(3000.0F, super.aFloatArray8[local8] * 1.5F);
			((Class165) local34).method3575(Static408.anInt6461, Static72.anInt1379, Static133.anInt2523, Static454.aBooleanArrayArray22, this.anInt4053 - 40 == 0);
		} else if (this.anInt4053 == 22) {
			Static268.aClass51_8.AA(-1, 1583160, 40, 127);
		} else if (this.anInt4053 == 23) {
			Static268.aClass51_8.l();
			return;
		} else if (this.anInt4053 == 24) {
			Static268.aClass51_8.method5318(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!rr;)V")
	@Override
	public void method3221(@OriginalArg(1) Class223 arg0) {
		super.aByteArray55[super.anInt4042] = 20;
		super.anObjectArray35[super.anInt4042] = arg0;
		super.anInt4042++;
		if (super.anInt4042 >= 5000) {
			super.anInt4042 = 0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	@Override
	public void method3216() {
		while (super.anInt4048 != super.anInt4042) {
			this.method3225();
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
	@Override
	public void method3218() {
	}
}
