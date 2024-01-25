import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class91_Sub1_Sub2 extends Class91_Sub1 {

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "Lclient!jc;")
	private Class24_Sub3 aClass24_Sub3_2;

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
	private final int anInt10443;

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
	private final int anInt10444;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
	private final int anInt10439;

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
	private final int anInt10440;

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_42;

	@OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
	private final int anInt10447;

	@OriginalMember(owner = "client!wt", name = "B", descriptor = "I")
	private final int anInt10446;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!rda;IIIIII)V")
	public Class91_Sub1_Sub2(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt10443 = arg4;
		this.anInt10444 = arg5;
		this.anInt10439 = arg6;
		this.anInt10440 = arg1;
		this.aClass126_Sub3_42 = arg0;
		this.anInt10447 = arg3;
		this.anInt10446 = arg2;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)Lclient!jc;")
	@Override
	public Class24_Sub3 method8859() {
		if (this.aClass24_Sub3_2 == null) {
			Static56.anIntArray68[5] = this.anInt10439;
			Static56.anIntArray68[1] = this.anInt10446;
			Static56.anIntArray68[2] = this.anInt10447;
			Static56.anIntArray68[4] = this.anInt10444;
			@Pc(32) Interface8 local32 = this.aClass126_Sub3_42.anInterface8_10;
			Static56.anIntArray68[3] = this.anInt10443;
			Static56.anIntArray68[0] = this.anInt10440;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local32.method7811(Static56.anIntArray68[local48])) {
					return null;
				}
				@Pc(66) Class321 local66 = local32.method7813(Static56.anIntArray68[local48]);
				@Pc(73) int local73 = local66.aBoolean729 ? 64 : 128;
				if (local66.aByte114 > 0) {
					local44 = true;
				}
				if (local73 > local46) {
					local46 = local73;
				}
			}
			for (@Pc(94) int local94 = 0; local94 < 6; local94++) {
				Static291.anIntArrayArray22[local94] = local32.method7812(local46, 1.0F, false, Static56.anIntArray68[local94], local46);
			}
			this.aClass24_Sub3_2 = new Class24_Sub3(this.aClass126_Sub3_42, 6407, local46, local44, Static291.anIntArrayArray22);
		}
		return this.aClass24_Sub3_2;
	}
}
