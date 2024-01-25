import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public class Class3_Sub3_Sub12 extends Class3_Sub3 {

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
	protected int anInt1904;

	@OriginalMember(owner = "client!jo", name = "K", descriptor = "[I")
	protected int[] anIntArray111;

	@OriginalMember(owner = "client!jo", name = "Q", descriptor = "I")
	protected int anInt1909;

	@OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
	private int anInt1903 = -1;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub12() {
		super(0, false);
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)I")
	@Override
	public final int method5732() {
		return this.anInt1903;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(Z)Z")
	protected final boolean method1565() {
		if (this.anIntArray111 != null) {
			return true;
		} else if (this.anInt1903 >= 0) {
			@Pc(27) Class149 local27 = Static44.anInt901 >= 0 ? Static366.method3895(Static241.aClass100_97, Static44.anInt901, this.anInt1903) : Static366.method3887(Static241.aClass100_97, this.anInt1903);
			local27.method3889();
			this.anIntArray111 = local27.method3891();
			this.anInt1909 = local27.anInt4569;
			this.anInt1904 = local27.anInt4572;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public final void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1903 = arg0.method3649();
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144 && this.method1565()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(52) int local52 = this.anInt1909 * (this.anInt1904 == Static182.anInt3888 ? arg0 : arg0 * this.anInt1904 / Static182.anInt3888);
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt1909 == Static131.anInt2755) {
				for (local62 = 0; local62 < Static131.anInt2755; local62++) {
					local71 = this.anIntArray111[local52++];
					local36[local62] = (local71 & 0xFF) << 4;
					local32[local62] = local71 >> 4 & 0xFF0;
					local28[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static131.anInt2755; local62++) {
					local71 = local62 * this.anInt1909 / Static131.anInt2755;
					@Pc(78) int local78 = this.anIntArray111[local71 + local52];
					local36[local62] = (local78 & 0xFF) << 4;
					local32[local62] = local78 >> 4 & 0xFF0;
					local28[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	@Override
	public final void method5724() {
		super.method5724();
		this.anIntArray111 = null;
	}
}
