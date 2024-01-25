import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class5_Sub1_Sub34 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qu", name = "I", descriptor = "I")
	private int anInt5694 = 20;

	@OriginalMember(owner = "client!qu", name = "G", descriptor = "I")
	private int anInt5692 = 0;

	@OriginalMember(owner = "client!qu", name = "K", descriptor = "I")
	private int anInt5696 = 1365;

	@OriginalMember(owner = "client!qu", name = "H", descriptor = "I")
	private int anInt5693 = 0;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt5696 = arg1.method5598();
		} else if (arg0 == 1) {
			this.anInt5694 = arg1.method5598();
		} else if (arg0 == 2) {
			this.anInt5692 = arg1.method5598();
		} else if (arg0 == 3) {
			this.anInt5693 = arg1.method5598();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			for (@Pc(25) int local25 = 0; local25 < Static148.anInt2666; local25++) {
				@Pc(39) int local39 = this.anInt5692 + (Static224.anIntArray234[local25] << 12) / this.anInt5696;
				@Pc(51) int local51 = this.anInt5693 + (Static346.anIntArray401[arg0] << 12) / this.anInt5696;
				@Pc(57) int local57 = local39;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local39 * local39 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73 = 0;
				while (local65 + local71 < 16384 && local73 < this.anInt5694) {
					local59 = local51 + (local57 * local59 >> 12) * 2;
					local57 = local39 + local65 - local71;
					local65 = local57 * local57 >> 12;
					local73++;
					local71 = local59 * local59 >> 12;
				}
				local19[local25] = this.anInt5694 - 1 > local73 ? (local73 << 12) / this.anInt5694 : 0;
			}
		}
		return local19;
	}
}
