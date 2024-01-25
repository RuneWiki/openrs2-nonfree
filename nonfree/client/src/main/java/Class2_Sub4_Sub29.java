import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public class Class2_Sub4_Sub29 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "[I")
	protected int[] anIntArray628;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
	protected int anInt8481;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
	protected int anInt8484;

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
	private int anInt8477 = -1;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub29() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
	@Override
	public final void method8890() {
		super.method8890();
		this.anIntArray628 = null;
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)Z")
	protected final boolean method7298() {
		if (this.anIntArray628 != null) {
			return true;
		} else if (this.anInt8477 >= 0) {
			@Pc(28) Class139 local28 = Static60.anInt1448 < 0 ? Static654.method3450(Static565.aClass238_258, this.anInt8477) : Static654.method3455(Static565.aClass238_258, Static60.anInt1448, this.anInt8477);
			local28.method3462();
			this.anIntArray628 = local28.method3452();
			this.anInt8481 = local28.anInt3983;
			this.anInt8484 = local28.anInt3984;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)I")
	@Override
	public final int method8893() {
		return this.anInt8477;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public final void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8477 = arg0.method2825();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188 && this.method7298()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(56) int local56 = this.anInt8484 * (this.anInt8481 == Static118.anInt2485 ? arg0 : arg0 * this.anInt8481 / Static118.anInt2485);
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (this.anInt8484 == Static395.anInt6816) {
				for (local62 = 0; local62 < Static395.anInt6816; local62++) {
					local70 = this.anIntArray628[local56++];
					local36[local62] = (local70 & 0xFF) << 4;
					local32[local62] = local70 >> 4 & 0xFF0;
					local28[local62] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static395.anInt6816; local62++) {
					local70 = local62 * this.anInt8484 / Static395.anInt6816;
					@Pc(118) int local118 = this.anIntArray628[local70 + local56];
					local36[local62] = (local118 & 0xFF) << 4;
					local32[local62] = local118 >> 4 & 0xFF0;
					local28[local62] = local118 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
