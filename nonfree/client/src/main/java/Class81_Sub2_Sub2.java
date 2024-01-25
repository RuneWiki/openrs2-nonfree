import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class81_Sub2_Sub2 extends Class81_Sub2 {

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "Lclient!gfa;")
	private Class44_Sub2 aClass44_Sub2_2;

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
	private final int anInt8439;

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
	private final int anInt8440;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_34;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
	private final int anInt8442;

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
	private final int anInt8437;

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
	private final int anInt8436;

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
	private final int anInt8438;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!ml;IIIIII)V")
	public Class81_Sub2_Sub2(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt8439 = arg2;
		this.anInt8440 = arg1;
		this.aClass75_Sub3_34 = arg0;
		this.anInt8442 = arg6;
		this.anInt8437 = arg3;
		this.anInt8436 = arg5;
		this.anInt8438 = arg4;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)Lclient!gfa;")
	@Override
	public Class44_Sub2 method7366() {
		if (this.aClass44_Sub2_2 == null) {
			@Pc(20) Interface11 local20 = this.aClass75_Sub3_34.anInterface11_10;
			Static667.anIntArray686[5] = this.anInt8442;
			Static667.anIntArray686[0] = this.anInt8440;
			Static667.anIntArray686[2] = this.anInt8437;
			Static667.anIntArray686[3] = this.anInt8438;
			Static667.anIntArray686[1] = this.anInt8439;
			Static667.anIntArray686[4] = this.anInt8436;
			@Pc(52) byte local52 = 0;
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < 6; local56++) {
				if (!local20.method6032(Static667.anIntArray686[local56])) {
					return null;
				}
				@Pc(77) Class297 local77 = local20.method6027(Static667.anIntArray686[local56]);
				@Pc(85) int local85 = local77.aBoolean630 ? 64 : 128;
				if (local85 > local54) {
					local54 = local85;
				}
				if (local77.aByte120 > 0) {
					local52 = 1;
				}
			}
			for (@Pc(106) int local106 = 0; local106 < 6; local106++) {
				Static275.anIntArrayArray24[local106] = local20.method6031(1.0F, local54, local54, Static667.anIntArray686[local106], false);
			}
			this.aClass44_Sub2_2 = new Class44_Sub2(this.aClass75_Sub3_34, 6407, local54, local52 != 0, Static275.anIntArrayArray24);
		}
		return this.aClass44_Sub2_2;
	}
}
