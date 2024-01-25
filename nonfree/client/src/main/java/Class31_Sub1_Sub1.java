import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bja")
public final class Class31_Sub1_Sub1 extends Class31_Sub1 {

	@OriginalMember(owner = "client!bja", name = "o", descriptor = "Lclient!hw;")
	private Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!bja", name = "k", descriptor = "I")
	private final int anInt1648;

	@OriginalMember(owner = "client!bja", name = "w", descriptor = "I")
	private final int anInt1655;

	@OriginalMember(owner = "client!bja", name = "s", descriptor = "I")
	private final int anInt1652;

	@OriginalMember(owner = "client!bja", name = "u", descriptor = "I")
	private final int anInt1654;

	@OriginalMember(owner = "client!bja", name = "t", descriptor = "I")
	private final int anInt1653;

	@OriginalMember(owner = "client!bja", name = "j", descriptor = "I")
	private final int anInt1647;

	@OriginalMember(owner = "client!bja", name = "v", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_6;

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lclient!ac;IIIIII)V")
	public Class31_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1648 = arg4;
		this.anInt1655 = arg2;
		this.anInt1652 = arg6;
		this.anInt1654 = arg1;
		this.anInt1653 = arg5;
		this.anInt1647 = arg3;
		this.aClass5_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(B)Lclient!hw;")
	@Override
	public Class2_Sub2 method2212() {
		if (this.aClass2_Sub2_1 == null) {
			Static123.anIntArray118[2] = this.anInt1647;
			Static123.anIntArray118[0] = this.anInt1654;
			Static123.anIntArray118[3] = this.anInt1648;
			Static123.anIntArray118[1] = this.anInt1655;
			@Pc(32) Interface7 local32 = this.aClass5_Sub1_6.anInterface7_10;
			Static123.anIntArray118[5] = this.anInt1652;
			Static123.anIntArray118[4] = this.anInt1653;
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local32.method6928(Static123.anIntArray118[local48])) {
					return null;
				}
				@Pc(66) Class254 local66 = local32.method6931(Static123.anIntArray118[local48]);
				@Pc(73) int local73 = local66.aBoolean616 ? 64 : 128;
				if (local66.aByte99 > 0) {
					local44 = 1;
				}
				if (local73 > local46) {
					local46 = local73;
				}
			}
			for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
				Static437.anIntArrayArray40[local93] = local32.method6929(Static123.anIntArray118[local93], local46, 1.0F, false, local46);
			}
			this.aClass2_Sub2_1 = new Class2_Sub2(this.aClass5_Sub1_6, 6407, local46, local44 != 0, Static437.anIntArrayArray40);
		}
		return this.aClass2_Sub2_1;
	}
}
