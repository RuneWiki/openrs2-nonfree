import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
	private int anInt5032 = 0;

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "Lclient!pi;")
	private final Class93 aClass93_1 = new Class93();

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
	@Override
	public void method5374(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIFLclient!fo;Z)V")
	@Override
	public void method5384(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class84 arg2, @OriginalArg(4) boolean arg3) {
		super.aByteArray83[super.anInt6500] = (byte) (arg3 ? arg0 + 40 : arg0 + 30);
		super.anObjectArray36[super.anInt6500] = arg2;
		super.aFloatArray30[super.anInt6500] = arg1;
		super.anInt6500++;
		if (super.anInt6500 >= 5000) {
			super.anInt6500 = 0;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!oh;I)V")
	@Override
	public void method5380(@OriginalArg(0) Class189 arg0) {
		super.anInt6505--;
		if (super.anInt6505 < 0) {
			super.anInt6505 = 4999;
		}
		super.aByteArray83[super.anInt6505] = 21;
		super.anObjectArray36[super.anInt6505] = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
	@Override
	public void method5381() {
		while (super.anInt6505 != super.anInt6500) {
			this.method4440();
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)V")
	@Override
	public void method5379(@OriginalArg(0) int arg0) {
		super.aByteArray83[super.anInt6500] = (byte) arg0;
		super.anInt6500++;
		if (super.anInt6500 >= 5000) {
			super.anInt6500 = 0;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
	@Override
	public void method5375() {
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
	private void method4440() {
		@Pc(18) int local18 = super.anInt6505++;
		if (super.anInt6505 >= 5000) {
			super.anInt6505 = 0;
		}
		this.anInt5032 = super.aByteArray83[local18];
		@Pc(42) Object local42 = super.anObjectArray36[local18];
		super.anObjectArray36[local18] = null;
		if (this.anInt5032 == 21) {
			Static367.method5805(this.aClass93_1, (Class189) local42);
		} else if (this.anInt5032 == 20) {
			@Pc(161) Class189 local161 = (Class189) local42;
			if (local161.aClass3_Sub1_1 != null) {
				local161.aClass3_Sub1_1.method5792(Static291.aClass28_132);
			}
			if (local161.aClass3_Sub1_2 != null) {
				local161.aClass3_Sub1_2.method5792(Static291.aClass28_132);
			}
			if (local161.aClass3_Sub4_3 != null) {
				local161.aClass3_Sub4_3.method5792(Static291.aClass28_132);
			}
			if (local161.aClass3_Sub4_2 != null) {
				local161.aClass3_Sub4_2.method5792(Static291.aClass28_132);
			}
			if (local161.aClass3_Sub5_1 != null) {
				local161.aClass3_Sub5_1.method5792(Static291.aClass28_132);
			}
			for (@Pc(204) Class242 local204 = local161.aClass242_2; local204 != null; local204 = local204.aClass242_4) {
				local204.aClass3_Sub3_2.method5792(Static291.aClass28_132);
			}
		} else if (this.anInt5032 < 30 || this.anInt5032 > 33) {
			if (this.anInt5032 >= 40 && this.anInt5032 <= 43) {
				Static291.aClass28_132.method3581(3000.0F, super.aFloatArray30[local18] * 1.5F);
				((Class84) local42).method5324(Static165.anInt2942, Static97.anInt1799, Static99.anInt1813, Static87.aBooleanArrayArray3, this.anInt5032 - 40 == 0);
				return;
			}
			if (this.anInt5032 == 22) {
				Static291.aClass28_132.method3528();
				return;
			}
			if (this.anInt5032 == 23) {
				Static291.aClass28_132.method3546();
				return;
			}
			if (this.anInt5032 == 24) {
				Static291.aClass28_132.method3504(0, null);
				return;
			}
		} else {
			Static291.aClass28_132.method3581(3000.0F, super.aFloatArray30[local18] * 1.5F);
			((Class84) local42).method5324(Static165.anInt2942, Static97.anInt1799, Static99.anInt1813, Static27.aBooleanArrayArray2, this.anInt5032 - 30 == 0);
			return;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLclient!oh;)V")
	@Override
	public void method5382(@OriginalArg(1) Class189 arg0) {
		super.aByteArray83[super.anInt6500] = 20;
		super.anObjectArray36[super.anInt6500] = arg0;
		super.anInt6500++;
		if (super.anInt6500 >= 5000) {
			super.anInt6500 = 0;
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(Lclient!oh;I)V")
	@Override
	public void method5383(@OriginalArg(0) Class189 arg0) {
		super.aByteArray83[super.anInt6500] = 21;
		super.anObjectArray36[super.anInt6500] = arg0;
		super.anInt6500++;
		if (super.anInt6500 >= 5000) {
			super.anInt6500 = 0;
		}
	}
}
