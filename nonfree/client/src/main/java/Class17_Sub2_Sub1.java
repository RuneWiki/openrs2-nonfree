import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class17_Sub2_Sub1 extends Class17_Sub2 {

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "Lclient!ap;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
	private final int anInt4186;

	@OriginalMember(owner = "client!jga", name = "q", descriptor = "I")
	private final int anInt4192;

	@OriginalMember(owner = "client!jga", name = "k", descriptor = "I")
	private final int anInt4187;

	@OriginalMember(owner = "client!jga", name = "g", descriptor = "Lclient!um;")
	private final Class162_Sub1 aClass162_Sub1_11;

	@OriginalMember(owner = "client!jga", name = "l", descriptor = "I")
	private final int anInt4188;

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
	private final int anInt4184;

	@OriginalMember(owner = "client!jga", name = "o", descriptor = "I")
	private final int anInt4191;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!um;IIIIII)V")
	public Class17_Sub2_Sub1(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4186 = arg5;
		this.anInt4192 = arg6;
		this.anInt4187 = arg1;
		this.aClass162_Sub1_11 = arg0;
		this.anInt4188 = arg2;
		this.anInt4184 = arg4;
		this.anInt4191 = arg3;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)Lclient!ap;")
	@Override
	public Interface3 method3586() {
		if (this.anInterface3_1 == null) {
			Static131.anIntArray180[0] = this.anInt4187;
			Static131.anIntArray180[2] = this.anInt4191;
			@Pc(28) Interface9 local28 = this.aClass162_Sub1_11.anInterface9_10;
			Static131.anIntArray180[5] = this.anInt4192;
			Static131.anIntArray180[4] = this.anInt4186;
			Static131.anIntArray180[3] = this.anInt4184;
			Static131.anIntArray180[1] = this.anInt4188;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local28.method1073(Static131.anIntArray180[local54])) {
					return null;
				}
				@Pc(72) Class291 local72 = local28.method1074(Static131.anIntArray180[local54]);
				@Pc(79) int local79 = local72.aBoolean602 ? 64 : 128;
				if (local52 < local79) {
					local52 = local79;
				}
				if (local72.aByte99 > 0) {
					local50 = true;
				}
			}
			for (@Pc(95) int local95 = 0; local95 < 6; local95++) {
				Static281.anIntArrayArray38[local95] = local28.method1076(1.0F, local52, false, local52, Static131.anIntArray180[local95]);
			}
			this.anInterface3_1 = this.aClass162_Sub1_11.method3890(local50, Static281.anIntArrayArray38, local52);
		}
		return this.anInterface3_1;
	}
}
