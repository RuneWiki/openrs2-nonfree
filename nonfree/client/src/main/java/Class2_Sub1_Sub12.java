import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hb", name = "fb", descriptor = "I")
	private int anInt1567;

	@OriginalMember(owner = "client!hb", name = "hb", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!hb", name = "ub", descriptor = "I")
	private int anInt1576;

	@OriginalMember(owner = "client!hb", name = "qb", descriptor = "I")
	private int anInt1573;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1573 = arg0.method2353();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)I")
	@Override
	public int method2979() {
		return this.anInt1573;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)Z")
	private boolean method1099() {
		if (this.anIntArray238 != null) {
			return true;
		} else if (this.anInt1573 >= 0) {
			@Pc(30) int local30 = Static170.anInterface2_2.method1659(this.anInt1573) ? 64 : 128;
			this.anIntArray238 = Static170.anInterface2_2.method1660(this.anInt1573);
			this.anInt1567 = local30;
			this.anInt1576 = local30;
			return this.anIntArray238 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37 && this.method1099()) {
			@Pc(45) int local45 = this.anInt1576 * (Static90.anInt2352 == this.anInt1567 ? arg0 : arg0 * this.anInt1567 / Static90.anInt2352);
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[1];
			@Pc(57) int[] local57 = local11[2];
			@Pc(63) int local63;
			@Pc(71) int local71;
			if (this.anInt1576 == Static129.anInt3118) {
				for (local63 = 0; local63 < Static129.anInt3118; local63++) {
					local71 = this.anIntArray238[local45++];
					local57[local63] = (local71 & 0xFF) << 4;
					local53[local63] = local71 >> 4 & 0xFF0;
					local49[local63] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static129.anInt3118; local63++) {
					local71 = local63 * this.anInt1576 / Static129.anInt3118;
					@Pc(119) int local119 = this.anIntArray238[local71 + local45];
					local57[local63] = (local119 & 0xFF) << 4;
					local53[local63] = local119 >> 4 & 0xFF0;
					local49[local63] = local119 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
