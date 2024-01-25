import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
	protected int anInt4788;

	@OriginalMember(owner = "client!fp", name = "N", descriptor = "I")
	protected int anInt4791;

	@OriginalMember(owner = "client!fp", name = "O", descriptor = "[I")
	protected int[] anIntArray528;

	@OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
	private int anInt4785 = -1;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub12() {
		super(0, false);
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)Z")
	protected final boolean method4302() {
		if (this.anIntArray528 != null) {
			return true;
		} else if (this.anInt4785 >= 0) {
			@Pc(35) Class127 local35 = Static108.anInt2138 < 0 ? Static402.method2804(Static245.aClass20_55, this.anInt4785) : Static402.method2800(Static245.aClass20_55, Static108.anInt2138, this.anInt4785);
			local35.method2797();
			this.anIntArray528 = local35.method2796();
			this.anInt4791 = local35.anInt3167;
			this.anInt4788 = local35.anInt3171;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409 && this.method4302()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(56) int local56 = (this.anInt4788 == Static220.anInt3914 ? arg0 : arg0 * this.anInt4788 / Static220.anInt3914) * this.anInt4791;
			@Pc(66) int local66;
			@Pc(75) int local75;
			if (Static238.anInt4221 == this.anInt4791) {
				for (local66 = 0; local66 < Static238.anInt4221; local66++) {
					local75 = this.anIntArray528[local56++];
					local36[local66] = (local75 & 0xFF) << 4;
					local32[local66] = local75 >> 4 & 0xFF0;
					local28[local66] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local66 = 0; local66 < Static238.anInt4221; local66++) {
					local75 = local66 * this.anInt4791 / Static238.anInt4221;
					@Pc(82) int local82 = this.anIntArray528[local75 + local56];
					local36[local66] = (local82 & 0xFF) << 4;
					local32[local66] = local82 >> 4 & 0xFF0;
					local28[local66] = local82 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "(B)I")
	@Override
	public final int method5553() {
		return this.anInt4785;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	@Override
	public final void method5543() {
		super.method5543();
		this.anIntArray528 = null;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public final void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4785 = arg0.method2767();
		}
	}
}
