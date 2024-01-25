import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class57_Sub1_Sub1 extends Class57_Sub1 {

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "Lclient!faa;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
	private final int anInt5290;

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
	private final int anInt5285;

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
	private final int anInt5284;

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
	private final int anInt5282;

	@OriginalMember(owner = "client!kl", name = "C", descriptor = "Lclient!ee;")
	private final Class95_Sub1 aClass95_Sub1_17;

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
	private final int anInt5281;

	@OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
	private final int anInt5292;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!ee;IIIIII)V")
	public Class57_Sub1_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5290 = arg4;
		this.anInt5285 = arg1;
		this.anInt5284 = arg2;
		this.anInt5282 = arg3;
		this.aClass95_Sub1_17 = arg0;
		this.anInt5281 = arg5;
		this.anInt5292 = arg6;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)Lclient!faa;")
	@Override
	public Interface7 method4537() {
		if (this.anInterface7_1 == null) {
			Static442.anIntArray393[5] = this.anInt5292;
			Static442.anIntArray393[2] = this.anInt5282;
			Static442.anIntArray393[0] = this.anInt5285;
			Static442.anIntArray393[1] = this.anInt5284;
			Static442.anIntArray393[3] = this.anInt5290;
			@Pc(43) Interface2 local43 = this.aClass95_Sub1_17.anInterface2_12;
			Static442.anIntArray393[4] = this.anInt5281;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local43.method8328(Static442.anIntArray393[local54])) {
					return null;
				}
				@Pc(72) Class250 local72 = local43.method8330(Static442.anIntArray393[local54]);
				@Pc(79) int local79 = local72.aBoolean462 ? 64 : 128;
				if (local72.aByte98 > 0) {
					local50 = true;
				}
				if (local79 > local52) {
					local52 = local79;
				}
			}
			for (@Pc(97) int local97 = 0; local97 < 6; local97++) {
				Static296.anIntArrayArray33[local97] = local43.method8329(local52, local52, false, Static442.anIntArray393[local97], 1.0F);
			}
			this.anInterface7_1 = this.aClass95_Sub1_17.method8194(local52, Static296.anIntArrayArray33, local50);
		}
		return this.anInterface7_1;
	}
}
