import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!um", name = "P", descriptor = "[I")
	public static int[] anIntArray570 = new int[4096];

	@OriginalMember(owner = "client!um", name = "F", descriptor = "I")
	private int anInt5223;

	@OriginalMember(owner = "client!um", name = "L", descriptor = "I")
	private int anInt5228;

	@OriginalMember(owner = "client!um", name = "Q", descriptor = "[I")
	private int[] anIntArray571;

	@OriginalMember(owner = "client!um", name = "T", descriptor = "I")
	private int anInt5233 = -1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray570[local4] = Static120.method2192(local4);
		}
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(0, false);
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)I")
	@Override
	public int method4455() {
		return this.anInt5233;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V")
	@Override
	public void method4458() {
		super.method4458();
		this.anIntArray571 = null;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190 && this.method4344()) {
			@Pc(43) int local43 = (this.anInt5223 == Static213.anInt5511 ? arg0 : arg0 * this.anInt5223 / Static213.anInt5511) * this.anInt5228;
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			@Pc(55) int[] local55 = local17[0];
			@Pc(61) int local61;
			@Pc(71) int local71;
			if (Static6.anInt4960 == this.anInt5228) {
				for (local61 = 0; local61 < Static6.anInt4960; local61++) {
					local71 = this.anIntArray571[local43++];
					local51[local61] = (local71 & 0xFF) << 4;
					local47[local61] = local71 >> 4 & 0xFF0;
					local55[local61] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static6.anInt4960; local61++) {
					local71 = this.anInt5228 * local61 / Static6.anInt4960;
					@Pc(78) int local78 = this.anIntArray571[local71 + local43];
					local51[local61] = (local78 & 0xFF) << 4;
					local47[local61] = local78 >> 4 & 0xFF0;
					local55[local61] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)Z")
	private boolean method4344() {
		if (this.anIntArray571 != null) {
			return true;
		} else if (this.anInt5233 < 0) {
			return false;
		} else {
			@Pc(28) int local28 = Static6.anInt4960;
			@Pc(30) int local30 = Static213.anInt5511;
			@Pc(41) int local41 = Static87.anInterface1_1.method1449(this.anInt5233).aBoolean526 ? 64 : 128;
			this.anIntArray571 = Static87.anInterface1_1.method1450(local41, this.anInt5233, local41, 1.0F);
			this.anInt5228 = local41;
			this.anInt5223 = local41;
			Static62.method1108(local30, local28);
			return this.anIntArray571 != null;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5233 = arg0.method1879();
		}
	}
}
