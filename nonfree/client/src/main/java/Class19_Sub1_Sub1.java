import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class19_Sub1_Sub1 extends Class19_Sub1 {

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "Lclient!ca;")
	private Class28_Sub1 aClass28_Sub1_1;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
	private final int anInt889;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
	private final int anInt887;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
	private final int anInt890;

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
	private final int anInt888;

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_6;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
	private final int anInt892;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
	private final int anInt891;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!ge;IIIIII)V")
	public Class19_Sub1_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt889 = arg4;
		this.anInt887 = arg3;
		this.anInt890 = arg2;
		this.anInt888 = arg6;
		this.aClass81_Sub1_6 = arg0;
		this.anInt892 = arg1;
		this.anInt891 = arg5;
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(B)Lclient!ca;")
	@Override
	public Class28_Sub1 method4311() {
		if (this.aClass28_Sub1_1 == null) {
			Static45.anIntArray101[0] = this.anInt892;
			Static45.anIntArray101[5] = this.anInt888;
			Static45.anIntArray101[1] = this.anInt890;
			Static45.anIntArray101[3] = this.anInt889;
			Static45.anIntArray101[2] = this.anInt887;
			Static45.anIntArray101[4] = this.anInt891;
			@Pc(44) Interface2 local44 = this.aClass81_Sub1_6.anInterface2_2;
			@Pc(46) boolean local46 = false;
			@Pc(48) int local48 = 0;
			@Pc(50) int local50;
			for (local50 = 0; local50 < 6; local50++) {
				if (!local44.method349(Static45.anIntArray101[local50])) {
					return null;
				}
				@Pc(69) Class82 local69 = local44.method346(Static45.anIntArray101[local50]);
				@Pc(76) int local76 = local69.aBoolean165 ? 64 : 128;
				if (local69.aByte25 > 0) {
					local46 = true;
				}
				if (local48 < local76) {
					local48 = local76;
				}
			}
			for (local50 = 0; local50 < 6; local50++) {
				Static45.anIntArrayArray40[local50] = local44.method347(local48, Static45.anIntArray101[local50], local48, 1.0F, false);
			}
			this.aClass28_Sub1_1 = new Class28_Sub1(this.aClass81_Sub1_6, 6407, local48, local46, Static45.anIntArrayArray40);
		}
		return this.aClass28_Sub1_1;
	}
}
