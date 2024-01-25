import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class135_Sub2 extends Class135 {

	@OriginalMember(owner = "client!t", name = "G", descriptor = "I")
	private int anInt5797 = 0;

	@OriginalMember(owner = "client!t", name = "y", descriptor = "Lclient!mp;")
	private final Class141 aClass141_1 = new Class141();

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(BI)V")
	@Override
	public void method5047(@OriginalArg(1) int arg0) {
		super.aByteArray68[super.anInt5782] = (byte) arg0;
		super.anInt5782++;
		if (super.anInt5782 >= 5000) {
			super.anInt5782 = 0;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	@Override
	public void method5041() {
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(FIZILclient!ck;)V")
	@Override
	public void method5042(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class12 arg3) {
		super.aByteArray68[super.anInt5782] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray34[super.anInt5782] = arg3;
		super.aFloatArray28[super.anInt5782] = arg0;
		super.anInt5782++;
		if (super.anInt5782 >= 5000) {
			super.anInt5782 = 0;
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	@Override
	public void method5043() {
		while (super.anInt5782 != super.anInt5785) {
			this.method5051();
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	private void method5051() {
		@Pc(8) int local8 = super.anInt5785++;
		if (super.anInt5785 >= 5000) {
			super.anInt5785 = 0;
		}
		this.anInt5797 = super.aByteArray68[local8];
		@Pc(42) Object local42 = super.anObjectArray34[local8];
		super.anObjectArray34[local8] = null;
		if (this.anInt5797 == 21) {
			Static266.method4802(this.aClass141_1, (Class83) local42);
		} else if (this.anInt5797 == 20) {
			@Pc(176) Class83 local176 = (Class83) local42;
			if (local176.aClass10_Sub2_1 != null) {
				local176.aClass10_Sub2_1.method5822(Static176.aClass105_10);
			}
			if (local176.aClass10_Sub2_2 != null) {
				local176.aClass10_Sub2_2.method5822(Static176.aClass105_10);
			}
			if (local176.aClass10_Sub4_2 != null) {
				local176.aClass10_Sub4_2.method5822(Static176.aClass105_10);
			}
			if (local176.aClass10_Sub4_1 != null) {
				local176.aClass10_Sub4_1.method5822(Static176.aClass105_10);
			}
			if (local176.aClass10_Sub3_1 != null) {
				local176.aClass10_Sub3_1.method5822(Static176.aClass105_10);
			}
			for (@Pc(219) Class59 local219 = local176.aClass59_2; local219 != null; local219 = local219.aClass59_1) {
				local219.aClass10_Sub1_1.method5822(Static176.aClass105_10);
			}
		} else if (this.anInt5797 >= 30 && this.anInt5797 <= 33) {
			Static176.aClass105_10.method4207(3000.0F, super.aFloatArray28[local8] * 1.5F);
			((Class12) local42).method2703(Static97.anInt1886, Static349.anInt6708, Static131.anInt2605, Static50.aBooleanArrayArray1, this.anInt5797 - 30 == 0);
		} else if (this.anInt5797 >= 40 && this.anInt5797 <= 43) {
			Static176.aClass105_10.method4207(3000.0F, super.aFloatArray28[local8] * 1.5F);
			((Class12) local42).method2703(Static97.anInt1886, Static349.anInt6708, Static131.anInt2605, Static296.aBooleanArrayArray8, this.anInt5797 - 40 == 0);
		} else if (this.anInt5797 == 22) {
			Static176.aClass105_10.method4226();
		} else if (this.anInt5797 == 23) {
			Static176.aClass105_10.method4272();
			return;
		} else if (this.anInt5797 == 24) {
			Static176.aClass105_10.method4242(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)V")
	@Override
	public void method5037(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLclient!gk;)V")
	@Override
	public void method5044(@OriginalArg(1) Class83 arg0) {
		super.aByteArray68[super.anInt5782] = 20;
		super.anObjectArray34[super.anInt5782] = arg0;
		super.anInt5782++;
		if (super.anInt5782 >= 5000) {
			super.anInt5782 = 0;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!gk;Z)V")
	@Override
	public void method5039(@OriginalArg(0) Class83 arg0) {
		super.anInt5785--;
		if (super.anInt5785 < 0) {
			super.anInt5785 = 4999;
		}
		super.aByteArray68[super.anInt5785] = 21;
		super.anObjectArray34[super.anInt5785] = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!gk;B)V")
	@Override
	public void method5045(@OriginalArg(0) Class83 arg0) {
		super.aByteArray68[super.anInt5782] = 21;
		super.anObjectArray34[super.anInt5782] = arg0;
		super.anInt5782++;
		if (super.anInt5782 >= 5000) {
			super.anInt5782 = 0;
		}
	}
}
