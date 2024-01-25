import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jha")
public final class Class106_Sub2_Sub2 extends Class106_Sub2 {

	@OriginalMember(owner = "client!jha", name = "o", descriptor = "Lclient!bja;")
	private Class39_Sub1 aClass39_Sub1_2;

	@OriginalMember(owner = "client!jha", name = "j", descriptor = "I")
	private final int anInt5237;

	@OriginalMember(owner = "client!jha", name = "l", descriptor = "I")
	private final int anInt5239;

	@OriginalMember(owner = "client!jha", name = "q", descriptor = "I")
	private final int anInt5242;

	@OriginalMember(owner = "client!jha", name = "n", descriptor = "I")
	private final int anInt5241;

	@OriginalMember(owner = "client!jha", name = "s", descriptor = "I")
	private final int anInt5244;

	@OriginalMember(owner = "client!jha", name = "v", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_26;

	@OriginalMember(owner = "client!jha", name = "t", descriptor = "I")
	private final int anInt5245;

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lclient!hk;IIIIII)V")
	public Class106_Sub2_Sub2(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5237 = arg5;
		this.anInt5239 = arg6;
		this.anInt5242 = arg4;
		this.anInt5241 = arg2;
		this.anInt5244 = arg3;
		this.aClass16_Sub2_26 = arg0;
		this.anInt5245 = arg1;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)Lclient!bja;")
	@Override
	public Class39_Sub1 method4441() {
		if (this.aClass39_Sub1_2 == null) {
			Static637.anIntArray639[2] = this.anInt5244;
			@Pc(25) Interface5 local25 = this.aClass16_Sub2_26.anInterface5_12;
			Static637.anIntArray639[4] = this.anInt5237;
			Static637.anIntArray639[1] = this.anInt5241;
			Static637.anIntArray639[0] = this.anInt5245;
			Static637.anIntArray639[3] = this.anInt5242;
			Static637.anIntArray639[5] = this.anInt5239;
			@Pc(52) boolean local52 = false;
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < 6; local56++) {
				if (!local25.method5197(Static637.anIntArray639[local56])) {
					return null;
				}
				@Pc(74) Class342 local74 = local25.method5193(Static637.anIntArray639[local56]);
				@Pc(81) int local81 = local74.aBoolean695 ? 64 : 128;
				if (local74.aByte125 > 0) {
					local52 = true;
				}
				if (local81 > local54) {
					local54 = local81;
				}
			}
			for (@Pc(101) int local101 = 0; local101 < 6; local101++) {
				Static331.anIntArrayArray104[local101] = local25.method5192(1.0F, local54, false, Static637.anIntArray639[local101], local54);
			}
			this.aClass39_Sub1_2 = new Class39_Sub1(this.aClass16_Sub2_26, 6407, local54, local52, Static331.anIntArrayArray104);
		}
		return this.aClass39_Sub1_2;
	}
}
