import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public class Class11_Sub2_Sub29 extends Class11_Sub2 {

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
	protected int anInt4919;

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
	protected int anInt4923;

	@OriginalMember(owner = "client!tg", name = "J", descriptor = "[I")
	protected int[] anIntArray383;

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
	private int anInt4921 = -1;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub29() {
		super(0, false);
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)Z")
	protected final boolean method4304() {
		if (this.anIntArray383 != null) {
			return true;
		} else if (this.anInt4921 >= 0) {
			@Pc(30) Class125 local30 = Static99.anInt822 >= 0 ? Static368.method2857(Static252.aClass144_96, Static99.anInt822, this.anInt4921) : Static368.method2865(Static252.aClass144_96, this.anInt4921);
			local30.method2871();
			this.anIntArray383 = local30.method2858();
			this.anInt4923 = local30.anInt3501;
			this.anInt4919 = local30.anInt3499;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public final void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4921 = arg0.method5187();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85 && this.method4304()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(52) int local52 = this.anInt4919 * (this.anInt4923 == Static113.anInt2160 ? arg0 : arg0 * this.anInt4923 / Static113.anInt2160);
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (Static339.anInt6549 == this.anInt4919) {
				for (local58 = 0; local58 < Static339.anInt6549; local58++) {
					local67 = this.anIntArray383[local52++];
					local36[local58] = (local67 & 0xFF) << 4;
					local32[local58] = local67 >> 4 & 0xFF0;
					local28[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static339.anInt6549; local58++) {
					local67 = this.anInt4919 * local58 / Static339.anInt6549;
					@Pc(74) int local74 = this.anIntArray383[local52 + local67];
					local36[local58] = (local74 & 0xFF) << 4;
					local32[local58] = local74 >> 4 & 0xFF0;
					local28[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
	@Override
	public final void method5707() {
		super.method5707();
		this.anIntArray383 = null;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)I")
	@Override
	public final int method5706() {
		return this.anInt4921;
	}
}
