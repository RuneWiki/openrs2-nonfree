import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class58_Sub1_Sub2 extends Class58_Sub1 {

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "Lclient!bo;")
	private Class19_Sub1 aClass19_Sub1_2;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_37;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
	private final int anInt8346;

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
	private final int anInt8352;

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
	private final int anInt8350;

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
	private final int anInt8353;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
	private final int anInt8349;

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
	private final int anInt8354;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!os;IIIIII)V")
	public Class58_Sub1_Sub2(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass39_Sub3_37 = arg0;
		this.anInt8346 = arg5;
		this.anInt8352 = arg3;
		this.anInt8350 = arg1;
		this.anInt8353 = arg2;
		this.anInt8349 = arg6;
		this.anInt8354 = arg4;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)Lclient!bo;")
	@Override
	public Class19_Sub1 method6988() {
		if (this.aClass19_Sub1_2 == null) {
			Static494.anIntArray664[3] = this.anInt8354;
			Static494.anIntArray664[0] = this.anInt8350;
			Static494.anIntArray664[1] = this.anInt8353;
			Static494.anIntArray664[4] = this.anInt8346;
			Static494.anIntArray664[2] = this.anInt8352;
			Static494.anIntArray664[5] = this.anInt8349;
			@Pc(50) Interface12 local50 = this.aClass39_Sub3_37.anInterface12_15;
			@Pc(52) boolean local52 = false;
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < 6; local56++) {
				if (!local50.method2572(Static494.anIntArray664[local56])) {
					return null;
				}
				@Pc(74) Class204 local74 = local50.method2573(Static494.anIntArray664[local56]);
				@Pc(81) int local81 = local74.aBoolean454 ? 64 : 128;
				if (local54 < local81) {
					local54 = local81;
				}
				if (local74.aByte81 > 0) {
					local52 = true;
				}
			}
			for (@Pc(106) int local106 = 0; local106 < 6; local106++) {
				Static418.anIntArrayArray68[local106] = local50.method2571(local54, local54, 1.0F, Static494.anIntArray664[local106], false);
			}
			this.aClass19_Sub1_2 = new Class19_Sub1(this.aClass39_Sub3_37, 6407, local54, local52, Static418.anIntArrayArray68);
		}
		return this.aClass19_Sub1_2;
	}
}
