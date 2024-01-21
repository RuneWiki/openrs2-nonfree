import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
	protected int anInt466;

	@OriginalMember(owner = "client!pd", name = "eb", descriptor = "[I")
	protected int[] anIntArray68;

	@OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
	protected int anInt471;

	@OriginalMember(owner = "client!pd", name = "lb", descriptor = "I")
	private int anInt470;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I")
	@Override
	public final int method2984() {
		return this.anInt470;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37 && this.method323()) {
			@Pc(25) int[] local25 = local11[1];
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[2];
			@Pc(49) int local49 = (this.anInt466 == Static90.anInt2352 ? arg0 : this.anInt466 * arg0 / Static90.anInt2352) * this.anInt471;
			@Pc(55) int local55;
			@Pc(63) int local63;
			if (this.anInt471 == Static129.anInt3118) {
				for (local55 = 0; local55 < Static129.anInt3118; local55++) {
					local63 = this.anIntArray68[local49++];
					local33[local55] = (local63 & 0xFF) << 4;
					local25[local55] = local63 >> 4 & 0xFF0;
					local29[local55] = local63 >> 12 & 0xFF0;
				}
			} else {
				for (local55 = 0; local55 < Static129.anInt3118; local55++) {
					local63 = this.anInt471 * local55 / Static129.anInt3118;
					@Pc(111) int local111 = this.anIntArray68[local63 + local49];
					local33[local55] = (local111 & 0xFF) << 4;
					local25[local55] = local111 >> 4 & 0xFF0;
					local29[local55] = local111 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public final void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt470 = arg0.method2353();
		}
	}

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "(I)Z")
	protected final boolean method323() {
		if (this.anIntArray68 != null) {
			return true;
		} else if (this.anInt470 >= 0) {
			@Pc(22) Class2_Sub2_Sub3_Sub2 local22 = Static144.method2439(this.anInt470, Static118.aClass43_29);
			local22.method390();
			this.anIntArray68 = local22.anIntArray81;
			this.anInt466 = local22.anInt571;
			this.anInt471 = local22.anInt567;
			return true;
		} else {
			return false;
		}
	}
}
