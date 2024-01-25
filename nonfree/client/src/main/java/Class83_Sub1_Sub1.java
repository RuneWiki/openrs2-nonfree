import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class83_Sub1_Sub1 extends Class83_Sub1 {

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Lclient!gp;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
	private final int anInt2128;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
	private final int anInt2131;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!hea;")
	private final Class134_Sub1 aClass134_Sub1_10;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
	private final int anInt2129;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
	private final int anInt2127;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	private final int anInt2125;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
	private final int anInt2130;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!hea;IIIIII)V")
	public Class83_Sub1_Sub1(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2128 = arg5;
		this.anInt2131 = arg1;
		this.aClass134_Sub1_10 = arg0;
		this.anInt2129 = arg6;
		this.anInt2127 = arg2;
		this.anInt2125 = arg4;
		this.anInt2130 = arg3;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)Lclient!gp;")
	@Override
	public Interface8 method1737() {
		if (this.anInterface8_1 == null) {
			Static317.anIntArray425[1] = this.anInt2127;
			Static317.anIntArray425[5] = this.anInt2129;
			@Pc(28) Interface7 local28 = this.aClass134_Sub1_10.anInterface7_10;
			Static317.anIntArray425[3] = this.anInt2125;
			Static317.anIntArray425[0] = this.anInt2131;
			Static317.anIntArray425[4] = this.anInt2128;
			Static317.anIntArray425[2] = this.anInt2130;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local28.method3871(Static317.anIntArray425[local54])) {
					return null;
				}
				@Pc(72) Class3 local72 = local28.method3874(Static317.anIntArray425[local54]);
				@Pc(79) int local79 = local72.aBoolean13 ? 64 : 128;
				if (local72.aByte4 > 0) {
					local50 = true;
				}
				if (local79 > local52) {
					local52 = local79;
				}
			}
			for (@Pc(95) int local95 = 0; local95 < 6; local95++) {
				Static483.anIntArrayArray178[local95] = local28.method3869(local52, Static317.anIntArray425[local95], 1.0F, local52, false);
			}
			this.anInterface8_1 = this.aClass134_Sub1_10.method6771(Static483.anIntArrayArray178, local50, local52);
		}
		return this.anInterface8_1;
	}
}
