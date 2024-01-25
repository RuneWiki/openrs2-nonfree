import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class120_Sub1 extends Class120 {

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "[I")
	public static final int[] anIntArray398 = new int[99];

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
	private int anInt5864 = 0;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Lclient!is;")
	private final Class121 aClass121_1 = new Class121();

	static {
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 99; local24++) {
			@Pc(29) int local29 = local24 + 1;
			@Pc(42) int local42 = (int) ((double) local29 + Math.pow(2.0D, (double) local29 / 7.0D) * 300.0D);
			local22 += local42;
			anIntArray398[local24] = local22 / 4;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	@Override
	public void method6079() {
		while (super.anInt7403 != super.anInt7401) {
			this.method4902();
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(BLclient!hg;)V")
	@Override
	public void method6078(@OriginalArg(1) Class101 arg0) {
		super.aByteArray91[super.anInt7401] = 21;
		super.anObjectArray35[super.anInt7401] = arg0;
		super.anInt7401++;
		if (super.anInt7401 >= 5000) {
			super.anInt7401 = 0;
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
	private void method4902() {
		@Pc(8) int local8 = super.anInt7403++;
		if (super.anInt7403 >= 5000) {
			super.anInt7403 = 0;
		}
		this.anInt5864 = super.aByteArray91[local8];
		@Pc(40) Object local40 = super.anObjectArray35[local8];
		super.anObjectArray35[local8] = null;
		if (this.anInt5864 == 21) {
			Static399.method5889(this.aClass121_1, (Class101) local40);
		} else if (this.anInt5864 == 20) {
			@Pc(58) Class101 local58 = (Class101) local40;
			if (local58.aClass3_Sub3_2 != null) {
				local58.aClass3_Sub3_2.method5937(Static165.aClass66_8);
			}
			if (local58.aClass3_Sub3_1 != null) {
				local58.aClass3_Sub3_1.method5937(Static165.aClass66_8);
			}
			if (local58.aClass3_Sub1_2 != null) {
				local58.aClass3_Sub1_2.method5937(Static165.aClass66_8);
			}
			if (local58.aClass3_Sub1_3 != null) {
				local58.aClass3_Sub1_3.method5937(Static165.aClass66_8);
			}
			if (local58.aClass3_Sub5_1 != null) {
				local58.aClass3_Sub5_1.method5937(Static165.aClass66_8);
			}
			for (@Pc(101) Class145 local101 = local58.aClass145_1; local101 != null; local101 = local101.aClass145_2) {
				local101.aClass3_Sub2_2.method5937(Static165.aClass66_8);
			}
		} else if (this.anInt5864 >= 30 && this.anInt5864 <= 33) {
			Static165.aClass66_8.method5055(3000.0F, super.aFloatArray29[local8] * 1.5F);
			((Class86) local40).method6595(Static6.anInt253, Static370.anInt6673, Static195.anInt7212, Static202.aBooleanArrayArray7, this.anInt5864 - 30 == 0);
		} else if (this.anInt5864 >= 40 && this.anInt5864 <= 43) {
			Static165.aClass66_8.method5055(3000.0F, super.aFloatArray29[local8] * 1.5F);
			((Class86) local40).method6595(Static6.anInt253, Static370.anInt6673, Static195.anInt7212, Static59.aBooleanArrayArray4, this.anInt5864 - 40 == 0);
		} else if (this.anInt5864 == 22) {
			Static165.aClass66_8.method5042();
		} else if (this.anInt5864 == 23) {
			Static165.aClass66_8.method5002();
		} else if (this.anInt5864 == 24) {
			Static165.aClass66_8.method5000(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!hg;I)V")
	@Override
	public void method6073(@OriginalArg(0) Class101 arg0) {
		super.aByteArray91[super.anInt7401] = 20;
		super.anObjectArray35[super.anInt7401] = arg0;
		super.anInt7401++;
		if (super.anInt7401 >= 5000) {
			super.anInt7401 = 0;
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	@Override
	public void method6080() {
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
	@Override
	public void method6076(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLclient!hg;)V")
	@Override
	public void method6072(@OriginalArg(1) Class101 arg0) {
		super.anInt7403--;
		if (super.anInt7403 < 0) {
			super.anInt7403 = 4999;
		}
		super.aByteArray91[super.anInt7403] = 21;
		super.anObjectArray35[super.anInt7403] = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!og;IIFZ)V")
	@Override
	public void method6071(@OriginalArg(0) Class86 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3) {
		super.aByteArray91[super.anInt7401] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray35[super.anInt7401] = arg0;
		super.aFloatArray29[super.anInt7401] = arg2;
		super.anInt7401++;
		if (super.anInt7401 >= 5000) {
			super.anInt7401 = 0;
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V")
	@Override
	public void method6077(@OriginalArg(0) int arg0) {
		super.aByteArray91[super.anInt7401] = (byte) arg0;
		super.anInt7401++;
		if (super.anInt7401 >= 5000) {
			super.anInt7401 = 0;
		}
	}
}
