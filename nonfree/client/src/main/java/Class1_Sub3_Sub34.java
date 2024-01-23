import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public class Class1_Sub3_Sub34 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ve", name = "Y", descriptor = "I")
	protected int anInt3565;

	@OriginalMember(owner = "client!ve", name = "ab", descriptor = "[I")
	protected int[] anIntArray384;

	@OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
	protected int anInt3569;

	@OriginalMember(owner = "client!ve", name = "X", descriptor = "I")
	private int anInt3564 = -1;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub34() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)Z")
	protected final boolean method2870() {
		if (this.anIntArray384 != null) {
			return true;
		} else if (this.anInt3564 >= 0) {
			@Pc(18) Class1_Sub1_Sub8_Sub1 local18 = Static142.method2346(Static19.aClass86_6, this.anInt3564);
			local18.method2432();
			this.anIntArray384 = local18.anIntArray310;
			this.anInt3569 = local18.anInt2985;
			this.anInt3565 = local18.anInt2984;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
	@Override
	public final void method3470() {
		super.method3470();
		this.anIntArray384 = null;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)I")
	@Override
	public final int method3464() {
		return this.anInt3564;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public final void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3564 = arg1.method2178();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90 && this.method2870()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[2];
			@Pc(52) int local52 = (Static30.anInt572 == this.anInt3569 ? arg0 : this.anInt3569 * arg0 / Static30.anInt572) * this.anInt3565;
			@Pc(56) int[] local56 = local16[1];
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt3565 == Static76.anInt1531) {
				for (local62 = 0; local62 < Static76.anInt1531; local62++) {
					local71 = this.anIntArray384[local52++];
					local32[local62] = (local71 & 0xFF) << 4;
					local56[local62] = local71 >> 4 & 0xFF0;
					local28[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static76.anInt1531; local62++) {
					local71 = this.anInt3565 * local62 / Static76.anInt1531;
					@Pc(79) int local79 = this.anIntArray384[local52 + local71];
					local32[local62] = (local79 & 0xFF) << 4;
					local56[local62] = local79 >> 4 & 0xFF0;
					local28[local62] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
