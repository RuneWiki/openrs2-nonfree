import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
	private int anInt5945 = 0;

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "Lclient!sc;")
	private final Class193 aClass193_1 = new Class193();

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	@Override
	public void method4733(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	@Override
	public void method4729() {
		while (super.anInt5928 != super.anInt5932) {
			this.method4740();
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
	private void method4740() {
		@Pc(8) int local8 = super.anInt5932++;
		if (super.anInt5932 >= 5000) {
			super.anInt5932 = 0;
		}
		this.anInt5945 = super.aByteArray67[local8];
		@Pc(32) Object local32 = super.anObjectArray36[local8];
		super.anObjectArray36[local8] = null;
		if (this.anInt5945 == 21) {
			Static73.method1340(this.aClass193_1, (Class217) local32);
		} else if (this.anInt5945 == 20) {
			@Pc(55) Class217 local55 = (Class217) local32;
			if (local55.aClass1_Sub5_2 != null) {
				local55.aClass1_Sub5_2.method5840(Static355.aClass75_10);
			}
			if (local55.aClass1_Sub5_3 != null) {
				local55.aClass1_Sub5_3.method5840(Static355.aClass75_10);
			}
			if (local55.aClass1_Sub1_2 != null) {
				local55.aClass1_Sub1_2.method5840(Static355.aClass75_10);
			}
			if (local55.aClass1_Sub1_3 != null) {
				local55.aClass1_Sub1_3.method5840(Static355.aClass75_10);
			}
			if (local55.aClass1_Sub2_1 != null) {
				local55.aClass1_Sub2_1.method5840(Static355.aClass75_10);
			}
			for (@Pc(98) Class182 local98 = local55.aClass182_3; local98 != null; local98 = local98.aClass182_2) {
				local98.aClass1_Sub3_2.method5840(Static355.aClass75_10);
			}
		} else if (this.anInt5945 >= 30 && this.anInt5945 <= 33) {
			Static355.aClass75_10.o(3000.0F, super.aFloatArray33[local8] * 1.5F);
			((Class64) local32).method5441(Static444.anInt7531, Static340.anInt6288, Static251.anInt4730, Static200.aBooleanArrayArray2, this.anInt5945 - 30 == 0);
		} else if (this.anInt5945 >= 40 && this.anInt5945 <= 43) {
			Static355.aClass75_10.o(3000.0F, super.aFloatArray33[local8] * 1.5F);
			((Class64) local32).method5441(Static444.anInt7531, Static340.anInt6288, Static251.anInt4730, Static435.aBooleanArrayArray6, this.anInt5945 - 40 == 0);
		} else if (this.anInt5945 == 22) {
			Static355.aClass75_10.fa(-1, 1583160, 40, 127);
		} else if (this.anInt5945 == 23) {
			Static355.aClass75_10.S();
		} else if (this.anInt5945 == 24) {
			Static355.aClass75_10.method2628(0, null);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V")
	@Override
	public void method4736(@OriginalArg(0) int arg0) {
		super.aByteArray67[super.anInt5928] = (byte) arg0;
		super.anInt5928++;
		if (super.anInt5928 >= 5000) {
			super.anInt5928 = 0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!tg;B)V")
	@Override
	public void method4728(@OriginalArg(0) Class217 arg0) {
		super.anInt5932--;
		if (super.anInt5932 < 0) {
			super.anInt5932 = 4999;
		}
		super.aByteArray67[super.anInt5932] = 21;
		super.anObjectArray36[super.anInt5932] = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!tg;I)V")
	@Override
	public void method4730(@OriginalArg(0) Class217 arg0) {
		super.aByteArray67[super.anInt5928] = 20;
		super.anObjectArray36[super.anInt5928] = arg0;
		super.anInt5928++;
		if (super.anInt5928 >= 5000) {
			super.anInt5928 = 0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
	@Override
	public void method4735() {
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!na;IBFZ)V")
	@Override
	public void method4738(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3) {
		super.aByteArray67[super.anInt5928] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray36[super.anInt5928] = arg0;
		super.aFloatArray33[super.anInt5928] = arg2;
		super.anInt5928++;
		if (super.anInt5928 >= 5000) {
			super.anInt5928 = 0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZLclient!tg;)V")
	@Override
	public void method4737(@OriginalArg(1) Class217 arg0) {
		super.aByteArray67[super.anInt5928] = 21;
		super.anObjectArray36[super.anInt5928] = arg0;
		super.anInt5928++;
		if (super.anInt5928 >= 5000) {
			super.anInt5928 = 0;
		}
	}
}
