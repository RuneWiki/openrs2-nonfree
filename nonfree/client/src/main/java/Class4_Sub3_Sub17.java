import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public class Class4_Sub3_Sub17 extends Class4_Sub3 {

	@OriginalMember(owner = "client!wc", name = "bb", descriptor = "[I")
	protected int[] anIntArray164;

	@OriginalMember(owner = "client!wc", name = "db", descriptor = "I")
	protected int anInt1801;

	@OriginalMember(owner = "client!wc", name = "hb", descriptor = "I")
	protected int anInt1805;

	@OriginalMember(owner = "client!wc", name = "ib", descriptor = "I")
	private int anInt1806;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84 && this.method1444()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(56) int local56 = this.anInt1801 * (this.anInt1805 == Static61.anInt1639 ? arg0 : this.anInt1805 * arg0 / Static61.anInt1639);
			@Pc(66) int local66;
			@Pc(75) int local75;
			if (Static134.anInt3188 == this.anInt1801) {
				for (local66 = 0; local66 < Static134.anInt3188; local66++) {
					local75 = this.anIntArray164[local56++];
					local36[local66] = (local75 & 0xFF) << 4;
					local32[local66] = local75 >> 4 & 0xFF0;
					local28[local66] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local66 = 0; local66 < Static134.anInt3188; local66++) {
					local75 = local66 * this.anInt1801 / Static134.anInt3188;
					@Pc(82) int local82 = this.anIntArray164[local75 + local56];
					local36[local66] = (local82 & 0xFF) << 4;
					local32[local66] = local82 >> 4 & 0xFF0;
					local28[local66] = local82 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public final void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1806 = arg1.method1252();
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(Z)Z")
	protected final boolean method1444() {
		if (this.anIntArray164 != null) {
			return true;
		} else if (this.anInt1806 >= 0) {
			@Pc(17) Class4_Sub1_Sub7_Sub2 local17 = Static50.method955(this.anInt1806, Static91.aClass62_25);
			local17.method2546();
			this.anInt1801 = local17.anInt3405;
			this.anIntArray164 = local17.anIntArray323;
			this.anInt1805 = local17.anInt3404;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
	@Override
	public final int method3152() {
		return this.anInt1806;
	}
}
