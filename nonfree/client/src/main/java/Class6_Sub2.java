import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!th", name = "t", descriptor = "I")
	private int anInt6235 = 0;

	@OriginalMember(owner = "client!th", name = "z", descriptor = "Lclient!cg;")
	private final Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(FZILclient!ta;I)V")
	@Override
	public void method5189(@OriginalArg(0) float arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class149 arg3) {
		super.aByteArray80[super.anInt6223] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray4[super.anInt6223] = arg3;
		super.aFloatArray28[super.anInt6223] = arg0;
		super.anInt6223++;
		if (super.anInt6223 >= 5000) {
			super.anInt6223 = 0;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!fq;I)V")
	@Override
	public void method5186(@OriginalArg(0) Class80 arg0) {
		super.aByteArray80[super.anInt6223] = 20;
		super.anObjectArray4[super.anInt6223] = arg0;
		super.anInt6223++;
		if (super.anInt6223 >= 5000) {
			super.anInt6223 = 0;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!fq;)V")
	@Override
	public void method5194(@OriginalArg(1) Class80 arg0) {
		super.anInt6227--;
		if (super.anInt6227 < 0) {
			super.anInt6227 = 4999;
		}
		super.aByteArray80[super.anInt6227] = 21;
		super.anObjectArray4[super.anInt6227] = arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLclient!fq;)V")
	@Override
	public void method5195(@OriginalArg(1) Class80 arg0) {
		super.aByteArray80[super.anInt6223] = 21;
		super.anObjectArray4[super.anInt6223] = arg0;
		super.anInt6223++;
		if (super.anInt6223 >= 5000) {
			super.anInt6223 = 0;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	@Override
	public void method5192() {
		while (super.anInt6223 != super.anInt6227) {
			this.method5201();
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V")
	@Override
	public void method5191(@OriginalArg(0) int arg0) {
		super.aByteArray80[super.anInt6223] = (byte) arg0;
		super.anInt6223++;
		if (super.anInt6223 >= 5000) {
			super.anInt6223 = 0;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
	@Override
	public void method5185() {
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	@Override
	public void method5188(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
	private void method5201() {
		@Pc(8) int local8 = super.anInt6227++;
		if (super.anInt6227 >= 5000) {
			super.anInt6227 = 0;
		}
		this.anInt6235 = super.aByteArray80[local8];
		@Pc(42) Object local42 = super.anObjectArray4[local8];
		super.anObjectArray4[local8] = null;
		if (this.anInt6235 == 21) {
			Static251.method3764(this.aClass37_1, (Class80) local42);
		} else if (this.anInt6235 == 20) {
			@Pc(175) Class80 local175 = (Class80) local42;
			if (local175.aClass31_Sub3_3 != null) {
				local175.aClass31_Sub3_3.method5969(Static242.aClass39_7);
			}
			if (local175.aClass31_Sub3_2 != null) {
				local175.aClass31_Sub3_2.method5969(Static242.aClass39_7);
			}
			if (local175.aClass31_Sub4_2 != null) {
				local175.aClass31_Sub4_2.method5969(Static242.aClass39_7);
			}
			if (local175.aClass31_Sub4_1 != null) {
				local175.aClass31_Sub4_1.method5969(Static242.aClass39_7);
			}
			if (local175.aClass31_Sub1_2 != null) {
				local175.aClass31_Sub1_2.method5969(Static242.aClass39_7);
			}
			for (@Pc(218) Class22 local218 = local175.aClass22_2; local218 != null; local218 = local218.aClass22_1) {
				local218.aClass31_Sub2_1.method5969(Static242.aClass39_7);
			}
		} else if (this.anInt6235 >= 30 && this.anInt6235 <= 33) {
			Static242.aClass39_7.g(3000.0F, super.aFloatArray28[local8] * 1.5F);
			((Class149) local42).method3569(Static398.anInt6395, Static350.anInt5829, Static75.anInt1695, Static23.aBooleanArrayArray4, this.anInt6235 - 30 == 0);
		} else if (this.anInt6235 >= 40 && this.anInt6235 <= 43) {
			Static242.aClass39_7.g(3000.0F, super.aFloatArray28[local8] * 1.5F);
			((Class149) local42).method3569(Static398.anInt6395, Static350.anInt5829, Static75.anInt1695, Static390.aBooleanArrayArray8, this.anInt6235 - 40 == 0);
		} else if (this.anInt6235 == 22) {
			Static242.aClass39_7.AA(-1, 1583160, 40, 127);
		} else if (this.anInt6235 == 23) {
			Static242.aClass39_7.l();
			return;
		} else if (this.anInt6235 == 24) {
			Static242.aClass39_7.method4560(0, null);
			return;
		}
	}
}
