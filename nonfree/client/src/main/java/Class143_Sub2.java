import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class143_Sub2 extends Class143 {

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
	private int anInt6466 = 0;

	@OriginalMember(owner = "client!rs", name = "v", descriptor = "Lclient!at;")
	private final Class17 aClass17_1 = new Class17();

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V")
	@Override
	public void method5057() {
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
	@Override
	public void method5054() {
		while (super.anInt6454 != super.anInt6458) {
			this.method5060();
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(Lclient!kf;I)V")
	@Override
	public void method5050(@OriginalArg(0) Class137 arg0) {
		super.aByteArray74[super.anInt6458] = 21;
		super.anObjectArray5[super.anInt6458] = arg0;
		super.anInt6458++;
		if (super.anInt6458 >= 5000) {
			super.anInt6458 = 0;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5052(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5053(@OriginalArg(0) int arg0) {
		super.aByteArray74[super.anInt6458] = (byte) arg0;
		super.anInt6458++;
		if (super.anInt6458 >= 5000) {
			super.anInt6458 = 0;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!kf;B)V")
	@Override
	public void method5056(@OriginalArg(0) Class137 arg0) {
		super.aByteArray74[super.anInt6458] = 20;
		super.anObjectArray5[super.anInt6458] = arg0;
		super.anInt6458++;
		if (super.anInt6458 >= 5000) {
			super.anInt6458 = 0;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!kf;I)V")
	@Override
	public void method5049(@OriginalArg(0) Class137 arg0) {
		super.anInt6454--;
		if (super.anInt6454 < 0) {
			super.anInt6454 = 4999;
		}
		super.aByteArray74[super.anInt6454] = 21;
		super.anObjectArray5[super.anInt6454] = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
	private void method5060() {
		@Pc(16) int local16 = super.anInt6454++;
		if (super.anInt6454 >= 5000) {
			super.anInt6454 = 0;
		}
		this.anInt6466 = super.aByteArray74[local16];
		@Pc(42) Object local42 = super.anObjectArray5[local16];
		super.anObjectArray5[local16] = null;
		if (this.anInt6466 == 21) {
			Static154.method2451(this.aClass17_1, (Class137) local42);
		} else if (this.anInt6466 == 20) {
			@Pc(169) Class137 local169 = (Class137) local42;
			if (local169.aClass47_Sub2_1 != null) {
				local169.aClass47_Sub2_1.method5732(Static74.aClass121_3);
			}
			if (local169.aClass47_Sub2_2 != null) {
				local169.aClass47_Sub2_2.method5732(Static74.aClass121_3);
			}
			if (local169.aClass47_Sub4_1 != null) {
				local169.aClass47_Sub4_1.method5732(Static74.aClass121_3);
			}
			if (local169.aClass47_Sub4_2 != null) {
				local169.aClass47_Sub4_2.method5732(Static74.aClass121_3);
			}
			if (local169.aClass47_Sub5_1 != null) {
				local169.aClass47_Sub5_1.method5732(Static74.aClass121_3);
			}
			for (@Pc(212) Class167 local212 = local169.aClass167_1; local212 != null; local212 = local212.aClass167_2) {
				local212.aClass47_Sub1_2.method5732(Static74.aClass121_3);
			}
		} else if (this.anInt6466 >= 30 && this.anInt6466 <= 33) {
			Static74.aClass121_3.o(3000.0F, super.aFloatArray40[local16] * 1.5F);
			((Class70) local42).method4266(Static59.anInt1066, Static161.anInt2868, Static370.anInt7659, Static6.aBooleanArrayArray3, this.anInt6466 - 30 == 0);
		} else if (this.anInt6466 >= 40 && this.anInt6466 <= 43) {
			Static74.aClass121_3.o(3000.0F, super.aFloatArray40[local16] * 1.5F);
			((Class70) local42).method4266(Static59.anInt1066, Static161.anInt2868, Static370.anInt7659, Static418.aBooleanArrayArray11, this.anInt6466 - 40 == 0);
		} else if (this.anInt6466 == 22) {
			Static74.aClass121_3.fa(-1, 1583160, 40, 127);
		} else if (this.anInt6466 == 23) {
			Static74.aClass121_3.S();
		} else if (this.anInt6466 == 24) {
			Static74.aClass121_3.method4591(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZFBLclient!na;I)V")
	@Override
	public void method5051(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class70 arg2, @OriginalArg(4) int arg3) {
		super.aByteArray74[super.anInt6458] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
		super.anObjectArray5[super.anInt6458] = arg2;
		super.aFloatArray40[super.anInt6458] = arg1;
		super.anInt6458++;
		if (super.anInt6458 >= 5000) {
			super.anInt6458 = 0;
		}
	}
}
