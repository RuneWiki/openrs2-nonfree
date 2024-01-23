import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public class Class3_Sub2_Sub11 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
	protected int anInt1904;

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "[I")
	protected int[] anIntArray190;

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
	protected int anInt1907;

	@OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
	private int anInt1916 = -1;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub11() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319 && this.method1661()) {
			@Pc(29) int[] local29 = local7[0];
			@Pc(33) int[] local33 = local7[1];
			@Pc(37) int[] local37 = local7[2];
			@Pc(53) int local53 = (this.anInt1904 == Static62.anInt1150 ? arg0 : this.anInt1904 * arg0 / Static62.anInt1150) * this.anInt1907;
			@Pc(63) int local63;
			@Pc(77) int local77;
			if (this.anInt1907 == Static22.anInt421) {
				for (local63 = 0; local63 < Static22.anInt421; local63++) {
					local77 = this.anIntArray190[local53++];
					local37[local63] = (local77 & 0xFF) << 4;
					local33[local63] = local77 >> 4 & 0xFF0;
					local29[local63] = local77 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static22.anInt421; local63++) {
					local77 = this.anInt1907 * local63 / Static22.anInt421;
					@Pc(85) int local85 = this.anIntArray190[local53 + local77];
					local37[local63] = (local85 & 0xFF) << 4;
					local33[local63] = local85 >> 4 & 0xFF0;
					local29[local63] = local85 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	@Override
	public final void method4962() {
		super.method4962();
		this.anIntArray190 = null;
	}

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "(I)Z")
	protected final boolean method1661() {
		if (this.anIntArray190 != null) {
			return true;
		} else if (this.anInt1916 < 0) {
			return false;
		} else {
			@Pc(37) Class3_Sub4_Sub12_Sub2 local37 = Static129.anInt2461 >= 0 ? Static216.method3551(Static129.anInt2461, Static129.aClass155_55, this.anInt1916) : Static140.method2389(Static129.aClass155_55, this.anInt1916);
			local37.method4723();
			this.anInt1907 = local37.anInt5728;
			this.anIntArray190 = local37.anIntArray596;
			this.anInt1904 = local37.anInt5729;
			return true;
		}
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)I")
	@Override
	public final int method4960() {
		return this.anInt1916;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public final void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt1916 = arg1.method3948();
		}
	}
}
