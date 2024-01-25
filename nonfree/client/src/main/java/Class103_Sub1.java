import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!s", name = "r", descriptor = "I")
	private int anInt5557 = 0;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!nb;")
	private final Class4 aClass4_1 = new Class4();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!dh;I)V")
	@Override
	public void method5630(@OriginalArg(0) Class45 arg0) {
		super.aByteArray94[super.anInt6719] = 20;
		super.anObjectArray35[super.anInt6719] = arg0;
		super.anInt6719++;
		if (super.anInt6719 >= 5000) {
			super.anInt6719 = 0;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZLclient!dh;)V")
	@Override
	public void method5640(@OriginalArg(1) Class45 arg0) {
		super.aByteArray94[super.anInt6719] = 21;
		super.anObjectArray35[super.anInt6719] = arg0;
		super.anInt6719++;
		if (super.anInt6719 >= 5000) {
			super.anInt6719 = 0;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BLclient!dh;)V")
	@Override
	public void method5632(@OriginalArg(1) Class45 arg0) {
		super.anInt6725--;
		if (super.anInt6725 < 0) {
			super.anInt6725 = 4999;
		}
		super.aByteArray94[super.anInt6725] = 21;
		super.anObjectArray35[super.anInt6725] = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	@Override
	public void method5629(@OriginalArg(1) int arg0) {
		super.aByteArray94[super.anInt6719] = (byte) arg0;
		super.anInt6719++;
		if (super.anInt6719 >= 5000) {
			super.anInt6719 = 0;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	@Override
	public void method5634() {
		while (super.anInt6719 != super.anInt6725) {
			this.method4663();
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(II)V")
	@Override
	public void method5636(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZFIILclient!da;)V")
	@Override
	public void method5627(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class22 arg3) {
		super.aByteArray94[super.anInt6719] = (byte) (arg0 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray35[super.anInt6719] = arg3;
		super.aFloatArray30[super.anInt6719] = arg1;
		super.anInt6719++;
		if (super.anInt6719 >= 5000) {
			super.anInt6719 = 0;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	@Override
	public void method5638() {
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
	private void method4663() {
		@Pc(8) int local8 = super.anInt6725++;
		if (super.anInt6725 >= 5000) {
			super.anInt6725 = 0;
		}
		this.anInt5557 = super.aByteArray94[local8];
		@Pc(36) Object local36 = super.anObjectArray35[local8];
		super.anObjectArray35[local8] = null;
		if (this.anInt5557 == 21) {
			Static293.method5300(this.aClass4_1, (Class45) local36);
		} else if (this.anInt5557 == 20) {
			@Pc(154) Class45 local154 = (Class45) local36;
			if (local154.aClass5_Sub5_1 != null) {
				local154.aClass5_Sub5_1.method5331(Static140.aClass122_3);
			}
			if (local154.aClass5_Sub5_2 != null) {
				local154.aClass5_Sub5_2.method5331(Static140.aClass122_3);
			}
			if (local154.aClass5_Sub1_1 != null) {
				local154.aClass5_Sub1_1.method5331(Static140.aClass122_3);
			}
			if (local154.aClass5_Sub1_2 != null) {
				local154.aClass5_Sub1_2.method5331(Static140.aClass122_3);
			}
			if (local154.aClass5_Sub3_1 != null) {
				local154.aClass5_Sub3_1.method5331(Static140.aClass122_3);
			}
			for (@Pc(197) Class160 local197 = local154.aClass160_1; local197 != null; local197 = local197.aClass160_3) {
				local197.aClass5_Sub4_1.method5331(Static140.aClass122_3);
			}
		} else if (this.anInt5557 >= 30 && this.anInt5557 <= 33) {
			Static140.aClass122_3.method4744(3000.0F, super.aFloatArray30[local8] * 1.5F);
			((Class22) local36).method4669(Static74.anInt1441, Static89.anInt6705, Static14.anInt494, Static192.aBooleanArrayArray9, this.anInt5557 - 30 == 0);
		} else if (this.anInt5557 >= 40 && this.anInt5557 <= 43) {
			Static140.aClass122_3.method4744(3000.0F, super.aFloatArray30[local8] * 1.5F);
			((Class22) local36).method4669(Static74.anInt1441, Static89.anInt6705, Static14.anInt494, Static108.aBooleanArrayArray15, this.anInt5557 - 40 == 0);
		} else if (this.anInt5557 == 22) {
			Static140.aClass122_3.method4758();
		} else if (this.anInt5557 == 23) {
			Static140.aClass122_3.method4755();
			return;
		} else if (this.anInt5557 == 24) {
			Static140.aClass122_3.method4742(0, null);
			return;
		}
	}
}
