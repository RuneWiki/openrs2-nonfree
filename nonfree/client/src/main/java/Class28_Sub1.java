import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
	private int anInt2323 = 0;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "Lclient!jk;")
	private final Class82 aClass82_1 = new Class82();

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!sm;ZBIF)V")
	@Override
	public void method3468(@OriginalArg(0) Class41 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		super.aByteArray60[super.anInt3663] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray4[super.anInt3663] = arg0;
		super.aFloatArray25[super.anInt3663] = arg3;
		super.anInt3663++;
		if (super.anInt3663 >= 5000) {
			super.anInt3663 = 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!uk;I)V")
	@Override
	public void method3471(@OriginalArg(0) Class204 arg0) {
		super.aByteArray60[super.anInt3663] = 20;
		super.anObjectArray4[super.anInt3663] = arg0;
		super.anInt3663++;
		if (super.anInt3663 >= 5000) {
			super.anInt3663 = 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!uk;)V")
	@Override
	public void method3467(@OriginalArg(1) Class204 arg0) {
		super.anInt3657--;
		if (super.anInt3657 < 0) {
			super.anInt3657 = 4999;
		}
		super.aByteArray60[super.anInt3657] = 21;
		super.anObjectArray4[super.anInt3657] = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	@Override
	public void method3464() {
		while (super.anInt3657 != super.anInt3663) {
			this.method2116();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
	@Override
	public void method3469(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
	private void method2116() {
		@Pc(14) int local14 = super.anInt3657++;
		if (super.anInt3657 >= 5000) {
			super.anInt3657 = 0;
		}
		this.anInt2323 = super.aByteArray60[local14];
		@Pc(40) Object local40 = super.anObjectArray4[local14];
		super.anObjectArray4[local14] = null;
		if (this.anInt2323 == 21) {
			Static318.method5341(this.aClass82_1, (Class204) local40);
		} else if (this.anInt2323 == 20) {
			@Pc(175) Class204 local175 = (Class204) local40;
			if (local175.aClass5_Sub1_1 != null) {
				local175.aClass5_Sub1_1.method5686(Static271.aClass2_12);
			}
			if (local175.aClass5_Sub1_2 != null) {
				local175.aClass5_Sub1_2.method5686(Static271.aClass2_12);
			}
			if (local175.aClass5_Sub4_2 != null) {
				local175.aClass5_Sub4_2.method5686(Static271.aClass2_12);
			}
			if (local175.aClass5_Sub4_1 != null) {
				local175.aClass5_Sub4_1.method5686(Static271.aClass2_12);
			}
			if (local175.aClass5_Sub5_1 != null) {
				local175.aClass5_Sub5_1.method5686(Static271.aClass2_12);
			}
			for (@Pc(222) Class17 local222 = local175.aClass17_3; local222 != null; local222 = local222.aClass17_1) {
				local222.aClass5_Sub3_1.method5686(Static271.aClass2_12);
			}
		} else if (this.anInt2323 < 30 || this.anInt2323 > 33) {
			if (this.anInt2323 >= 40 && this.anInt2323 <= 43) {
				Static271.aClass2_12.method3320(3000.0F, super.aFloatArray25[local14] * 1.5F);
				((Class41) local40).method5416(Static199.anInt4061, Static268.anInt5167, Static346.anInt6451, Static134.aBooleanArrayArray13, this.anInt2323 - 40 == 0);
				return;
			}
			if (this.anInt2323 == 22) {
				Static271.aClass2_12.method3332();
				return;
			}
			if (this.anInt2323 == 23) {
				Static271.aClass2_12.method3256();
				return;
			}
			if (this.anInt2323 == 24) {
				Static271.aClass2_12.method3260(0, null);
				return;
			}
		} else {
			Static271.aClass2_12.method3320(3000.0F, super.aFloatArray25[local14] * 1.5F);
			((Class41) local40).method5416(Static199.anInt4061, Static268.anInt5167, Static346.anInt6451, Static57.aBooleanArrayArray7, this.anInt2323 - 30 == 0);
			return;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	@Override
	public void method3465() {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!uk;)V")
	@Override
	public void method3474(@OriginalArg(1) Class204 arg0) {
		super.aByteArray60[super.anInt3663] = 21;
		super.anObjectArray4[super.anInt3663] = arg0;
		super.anInt3663++;
		if (super.anInt3663 >= 5000) {
			super.anInt3663 = 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	@Override
	public void method3473(@OriginalArg(1) int arg0) {
		super.aByteArray60[super.anInt3663] = (byte) arg0;
		super.anInt3663++;
		if (super.anInt3663 >= 5000) {
			super.anInt3663 = 0;
		}
	}
}
