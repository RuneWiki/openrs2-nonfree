import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
	private int anInt931 = 0;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "Lclient!qf;")
	private final Class34 aClass34_1 = new Class34();

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!iq;)V")
	@Override
	public void method1897(@OriginalArg(1) Class118 arg0) {
		super.anInt2460--;
		if (super.anInt2460 < 0) {
			super.anInt2460 = 4999;
		}
		super.aByteArray30[super.anInt2460] = 21;
		super.anObjectArray4[super.anInt2460] = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!iq;B)V")
	@Override
	public void method1888(@OriginalArg(0) Class118 arg0) {
		super.aByteArray30[super.anInt2462] = 21;
		super.anObjectArray4[super.anInt2462] = arg0;
		super.anInt2462++;
		if (super.anInt2462 >= 5000) {
			super.anInt2462 = 0;
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(BLclient!iq;)V")
	@Override
	public void method1898(@OriginalArg(1) Class118 arg0) {
		super.aByteArray30[super.anInt2462] = 20;
		super.anObjectArray4[super.anInt2462] = arg0;
		super.anInt2462++;
		if (super.anInt2462 >= 5000) {
			super.anInt2462 = 0;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
	@Override
	public void method1893() {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	@Override
	public void method1892(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	@Override
	public void method1889() {
		while (super.anInt2462 != super.anInt2460) {
			this.method644();
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
	private void method644() {
		@Pc(14) int local14 = super.anInt2460++;
		if (super.anInt2460 >= 5000) {
			super.anInt2460 = 0;
		}
		this.anInt931 = super.aByteArray30[local14];
		@Pc(40) Object local40 = super.anObjectArray4[local14];
		super.anObjectArray4[local14] = null;
		if (this.anInt931 == 21) {
			Static274.method3902(this.aClass34_1, (Class118) local40);
		} else if (this.anInt931 == 20) {
			@Pc(64) Class118 local64 = (Class118) local40;
			if (local64.aClass7_Sub4_2 != null) {
				local64.aClass7_Sub4_2.method5267(Static255.aClass172_9);
			}
			if (local64.aClass7_Sub4_1 != null) {
				local64.aClass7_Sub4_1.method5267(Static255.aClass172_9);
			}
			if (local64.aClass7_Sub3_3 != null) {
				local64.aClass7_Sub3_3.method5267(Static255.aClass172_9);
			}
			if (local64.aClass7_Sub3_2 != null) {
				local64.aClass7_Sub3_2.method5267(Static255.aClass172_9);
			}
			if (local64.aClass7_Sub1_1 != null) {
				local64.aClass7_Sub1_1.method5267(Static255.aClass172_9);
			}
			for (@Pc(107) Class179 local107 = local64.aClass179_2; local107 != null; local107 = local107.aClass179_3) {
				local107.aClass7_Sub2_2.method5267(Static255.aClass172_9);
			}
		} else if (this.anInt931 >= 30 && this.anInt931 <= 33) {
			Static255.aClass172_9.o(3000.0F, super.aFloatArray6[local14] * 1.5F);
			((Class159) local40).method4833(Static310.anInt5498, Static111.anInt2450, Static80.anInt2001, Static313.aBooleanArrayArray6, this.anInt931 - 30 == 0);
		} else if (this.anInt931 >= 40 && this.anInt931 <= 43) {
			Static255.aClass172_9.o(3000.0F, super.aFloatArray6[local14] * 1.5F);
			((Class159) local40).method4833(Static310.anInt5498, Static111.anInt2450, Static80.anInt2001, Static14.aBooleanArrayArray1, this.anInt931 - 40 == 0);
		} else if (this.anInt931 == 22) {
			Static255.aClass172_9.fa(-1, 1583160, 40, 127);
		} else if (this.anInt931 == 23) {
			Static255.aClass172_9.S();
			return;
		} else if (this.anInt931 == 24) {
			Static255.aClass172_9.method5485(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)V")
	@Override
	public void method1896(@OriginalArg(1) int arg0) {
		super.aByteArray30[super.anInt2462] = (byte) arg0;
		super.anInt2462++;
		if (super.anInt2462 >= 5000) {
			super.anInt2462 = 0;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(FZILclient!na;B)V")
	@Override
	public void method1891(@OriginalArg(0) float arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class159 arg3) {
		super.aByteArray30[super.anInt2462] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray4[super.anInt2462] = arg3;
		super.aFloatArray6[super.anInt2462] = arg0;
		super.anInt2462++;
		if (super.anInt2462 >= 5000) {
			super.anInt2462 = 0;
		}
	}
}
