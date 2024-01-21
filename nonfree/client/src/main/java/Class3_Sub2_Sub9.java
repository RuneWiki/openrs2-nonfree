import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public class Class3_Sub2_Sub9 extends Class3_Sub2 {

	@OriginalMember(owner = "client!s", name = "db", descriptor = "I")
	protected int anInt1105;

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "I")
	protected int anInt1106;

	@OriginalMember(owner = "client!s", name = "ob", descriptor = "[I")
	protected int[] anIntArray57;

	@OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
	private int anInt1104 = -1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub9() {
		super(0, false);
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(B)I")
	@Override
	public final int method3336() {
		return this.anInt1104;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public final void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1104 = arg0.method1270();
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)Z")
	protected final boolean method831() {
		if (this.anIntArray57 != null) {
			return true;
		} else if (this.anInt1104 >= 0) {
			@Pc(26) Class3_Sub3_Sub2_Sub1 local26 = Static17.method306(Static170.aClass52_13, this.anInt1104);
			local26.method180();
			this.anIntArray57 = local26.anIntArray6;
			this.anInt1106 = local26.anInt164;
			this.anInt1105 = local26.anInt165;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135 && this.method831()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[2];
			@Pc(36) int[] local36 = local16[1];
			@Pc(56) int local56 = (Static97.anInt2014 == this.anInt1105 ? arg0 : arg0 * this.anInt1105 / Static97.anInt2014) * this.anInt1106;
			@Pc(66) int local66;
			@Pc(75) int local75;
			if (Static190.anInt3865 == this.anInt1106) {
				for (local66 = 0; local66 < Static190.anInt3865; local66++) {
					local75 = this.anIntArray57[local56++];
					local32[local66] = (local75 & 0xFF) << 4;
					local36[local66] = local75 >> 4 & 0xFF0;
					local28[local66] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local66 = 0; local66 < Static190.anInt3865; local66++) {
					local75 = this.anInt1106 * local66 / Static190.anInt3865;
					@Pc(83) int local83 = this.anIntArray57[local56 + local75];
					local32[local66] = (local83 & 0xFF) << 4;
					local36[local66] = local83 >> 4 & 0xFF0;
					local28[local66] = local83 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V")
	@Override
	public final void method3331() {
		super.method3331();
		this.anIntArray57 = null;
	}
}
