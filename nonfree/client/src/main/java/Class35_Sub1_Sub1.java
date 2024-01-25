import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class35_Sub1_Sub1 extends Class35_Sub1 {

	@OriginalMember(owner = "client!bga", name = "n", descriptor = "Lclient!fn;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!bga", name = "q", descriptor = "I")
	private final int anInt932;

	@OriginalMember(owner = "client!bga", name = "l", descriptor = "I")
	private final int anInt929;

	@OriginalMember(owner = "client!bga", name = "u", descriptor = "I")
	private final int anInt936;

	@OriginalMember(owner = "client!bga", name = "w", descriptor = "I")
	private final int anInt938;

	@OriginalMember(owner = "client!bga", name = "m", descriptor = "Lclient!ai;")
	private final Class13_Sub1 aClass13_Sub1_3;

	@OriginalMember(owner = "client!bga", name = "s", descriptor = "I")
	private final int anInt934;

	@OriginalMember(owner = "client!bga", name = "v", descriptor = "I")
	private final int anInt937;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!ai;IIIIII)V")
	public Class35_Sub1_Sub1(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt932 = arg2;
		this.anInt929 = arg1;
		this.anInt936 = arg3;
		this.anInt938 = arg5;
		this.aClass13_Sub1_3 = arg0;
		this.anInt934 = arg6;
		this.anInt937 = arg4;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)Lclient!fn;")
	@Override
	public Interface10 method1042() {
		if (this.anInterface10_1 == null) {
			@Pc(18) Interface4 local18 = this.aClass13_Sub1_3.anInterface4_14;
			Static86.anIntArray142[0] = this.anInt929;
			Static86.anIntArray142[4] = this.anInt938;
			Static86.anIntArray142[5] = this.anInt934;
			Static86.anIntArray142[1] = this.anInt932;
			Static86.anIntArray142[2] = this.anInt936;
			Static86.anIntArray142[3] = this.anInt937;
			@Pc(50) byte local50 = 0;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local18.method4672(Static86.anIntArray142[local54])) {
					return null;
				}
				@Pc(72) Class119 local72 = local18.method4673(Static86.anIntArray142[local54]);
				@Pc(79) int local79 = local72.aBoolean292 ? 64 : 128;
				if (local52 < local79) {
					local52 = local79;
				}
				if (local72.aByte58 > 0) {
					local50 = 1;
				}
			}
			for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
				Static511.anIntArrayArray48[local100] = local18.method4676(local52, false, local52, 1.0F, Static86.anIntArray142[local100]);
			}
			this.anInterface10_1 = this.aClass13_Sub1_3.method7513(local50 != 0, local52, Static511.anIntArrayArray48);
		}
		return this.anInterface10_1;
	}
}
