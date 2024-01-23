import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class3_Sub2_Sub32 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pg", name = "P", descriptor = "[I")
	private int[] anIntArray462;

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
	private int anInt4185;

	@OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
	private int anInt4187;

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
	private int anInt4181 = -1;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub32() {
		super(0, false);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt4181 = arg1.method3948();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	@Override
	public void method4962() {
		super.method4962();
		this.anIntArray462 = null;
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)I")
	@Override
	public int method4957() {
		return this.anInt4181;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)Z")
	private boolean method3513() {
		if (this.anIntArray462 != null) {
			return true;
		} else if (this.anInt4181 >= 0) {
			@Pc(22) int local22 = Static22.anInt421;
			@Pc(24) int local24 = Static62.anInt1150;
			@Pc(35) int local35 = Static135.anInterface2_1.method2892(this.anInt4181).aBoolean98 ? 64 : 128;
			this.anIntArray462 = Static135.anInterface2_1.method2891(1.0F, local35, this.anInt4181, local35);
			this.anInt4187 = local35;
			this.anInt4185 = local35;
			Static10.method156(local24, local22);
			return this.anIntArray462 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319 && this.method3513()) {
			@Pc(35) int local35 = this.anInt4187 * (this.anInt4185 == Static62.anInt1150 ? arg0 : arg0 * this.anInt4185 / Static62.anInt1150);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[2];
			@Pc(47) int[] local47 = local11[1];
			@Pc(57) int local57;
			@Pc(66) int local66;
			if (Static22.anInt421 == this.anInt4187) {
				for (local57 = 0; local57 < Static22.anInt421; local57++) {
					local66 = this.anIntArray462[local35++];
					local43[local57] = (local66 & 0xFF) << 4;
					local47[local57] = local66 >> 4 & 0xFF0;
					local39[local57] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static22.anInt421; local57++) {
					local66 = local57 * this.anInt4187 / Static22.anInt421;
					@Pc(118) int local118 = this.anIntArray462[local66 + local35];
					local43[local57] = (local118 & 0xFF) << 4;
					local47[local57] = local118 >> 4 & 0xFF0;
					local39[local57] = local118 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
