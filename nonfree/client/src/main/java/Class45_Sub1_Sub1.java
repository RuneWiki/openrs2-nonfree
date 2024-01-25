import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class45_Sub1_Sub1 extends Class45_Sub1 {

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Lclient!mca;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
	private final int anInt1133;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Lclient!re;")
	private final Class122_Sub2 aClass122_Sub2_4;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
	private final int anInt1128;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
	private final int anInt1127;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
	private final int anInt1130;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
	private final int anInt1132;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
	private final int anInt1131;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!re;IIIIII)V")
	public Class45_Sub1_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1133 = arg5;
		this.aClass122_Sub2_4 = arg0;
		this.anInt1128 = arg3;
		this.anInt1127 = arg1;
		this.anInt1130 = arg6;
		this.anInt1132 = arg4;
		this.anInt1131 = arg2;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Lclient!mca;")
	@Override
	public Interface7 method1107() {
		if (this.anInterface7_1 == null) {
			Static200.anIntArray334[1] = this.anInt1131;
			Static200.anIntArray334[0] = this.anInt1127;
			Static200.anIntArray334[5] = this.anInt1130;
			Static200.anIntArray334[2] = this.anInt1128;
			@Pc(37) Interface8 local37 = this.aClass122_Sub2_4.anInterface8_14;
			Static200.anIntArray334[4] = this.anInt1133;
			Static200.anIntArray334[3] = this.anInt1132;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local37.method879(Static200.anIntArray334[local53])) {
					return null;
				}
				@Pc(73) Class220 local73 = local37.method878(Static200.anIntArray334[local53]);
				@Pc(80) int local80 = local73.aBoolean451 ? 64 : 128;
				if (local73.aByte83 > 0) {
					local49 = true;
				}
				if (local51 < local80) {
					local51 = local80;
				}
			}
			for (@Pc(99) int local99 = 0; local99 < 6; local99++) {
				Static276.anIntArrayArray115[local99] = local37.method876(Static200.anIntArray334[local99], false, local51, 1.0F, local51);
			}
			this.anInterface7_1 = this.aClass122_Sub2_4.method5631(local51, Static276.anIntArrayArray115, local49);
		}
		return this.anInterface7_1;
	}
}
