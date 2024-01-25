import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class2_Sub4_Sub17 extends Class2_Sub4 {

	@OriginalMember(owner = "client!mda", name = "H", descriptor = "I")
	private int anInt5434 = 1365;

	@OriginalMember(owner = "client!mda", name = "F", descriptor = "I")
	private int anInt5432 = 20;

	@OriginalMember(owner = "client!mda", name = "K", descriptor = "I")
	private int anInt5437 = 0;

	@OriginalMember(owner = "client!mda", name = "J", descriptor = "I")
	private int anInt5436 = 0;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			for (@Pc(24) int local24 = 0; local24 < Static143.anInt7434; local24++) {
				@Pc(38) int local38 = (Static519.anIntArray155[local24] << 12) / this.anInt5434 + this.anInt5436;
				@Pc(51) int local51 = (Static13.anIntArray418[arg0] << 12) / this.anInt5434 + this.anInt5437;
				@Pc(57) int local57 = local38;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local38 * local38 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73 = 0;
				while (local71 + local65 < 16384 && this.anInt5432 > local73) {
					local59 = local51 + (local59 * local57 >> 12) * 2;
					local57 = local65 + local38 - local71;
					local65 = local57 * local57 >> 12;
					local73++;
					local71 = local59 * local59 >> 12;
				}
				local18[local24] = this.anInt5432 - 1 <= local73 ? 0 : (local73 << 12) / this.anInt5432;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5434 = arg1.method4518();
		} else if (arg0 == 1) {
			this.anInt5432 = arg1.method4518();
		} else if (arg0 == 2) {
			this.anInt5436 = arg1.method4518();
		} else if (arg0 == 3) {
			this.anInt5437 = arg1.method4518();
		}
	}
}
