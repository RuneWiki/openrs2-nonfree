import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
	private int anInt803;

	@OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
	private int anInt804;

	@OriginalMember(owner = "client!bk", name = "gb", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!bk", name = "cb", descriptor = "I")
	private int anInt813 = -1;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub3() {
		super(0, false);
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)I")
	@Override
	public int method4126() {
		return this.anInt813;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt813 = arg0.method1764();
		}
	}

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)Z")
	private boolean method481() {
		if (this.anIntArray59 != null) {
			return true;
		} else if (this.anInt813 >= 0) {
			@Pc(13) int local13 = Static110.anInt2934;
			@Pc(15) int local15 = Static166.anInt3882;
			@Pc(26) int local26 = Static262.anInterface4_1.method376(this.anInt813).aBoolean211 ? 64 : 128;
			this.anIntArray59 = Static262.anInterface4_1.method378(1.0F, this.anInt813, local26, local26);
			this.anInt803 = local26;
			this.anInt804 = local26;
			Static67.method1316(local15, local13);
			return this.anIntArray59 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48 && this.method481()) {
			@Pc(47) int local47 = this.anInt803 * (Static166.anInt3882 == this.anInt804 ? arg0 : arg0 * this.anInt804 / Static166.anInt3882);
			@Pc(51) int[] local51 = local19[2];
			@Pc(55) int[] local55 = local19[0];
			@Pc(59) int[] local59 = local19[1];
			@Pc(65) int local65;
			@Pc(74) int local74;
			if (this.anInt803 == Static110.anInt2934) {
				for (local65 = 0; local65 < Static110.anInt2934; local65++) {
					local74 = this.anIntArray59[local47++];
					local51[local65] = (local74 & 0xFF) << 4;
					local59[local65] = local74 >> 4 & 0xFF0;
					local55[local65] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static110.anInt2934; local65++) {
					local74 = this.anInt803 * local65 / Static110.anInt2934;
					@Pc(82) int local82 = this.anIntArray59[local47 + local74];
					local51[local65] = (local82 & 0xFF) << 4;
					local59[local65] = local82 >> 4 & 0xFF0;
					local55[local65] = local82 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)V")
	@Override
	public void method4128() {
		super.method4128();
		this.anIntArray59 = null;
	}
}
