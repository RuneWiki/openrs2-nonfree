import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class29_Sub1_Sub1 extends Class29_Sub1 {

	@OriginalMember(owner = "client!baa", name = "o", descriptor = "Lclient!rr;")
	private Interface24 anInterface24_1;

	@OriginalMember(owner = "client!baa", name = "p", descriptor = "I")
	private final int anInt557;

	@OriginalMember(owner = "client!baa", name = "x", descriptor = "Lclient!kd;")
	private final Class57_Sub3 aClass57_Sub3_3;

	@OriginalMember(owner = "client!baa", name = "v", descriptor = "I")
	private final int anInt556;

	@OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
	private final int anInt555;

	@OriginalMember(owner = "client!baa", name = "t", descriptor = "I")
	private final int anInt553;

	@OriginalMember(owner = "client!baa", name = "w", descriptor = "I")
	private final int anInt565;

	@OriginalMember(owner = "client!baa", name = "q", descriptor = "I")
	private final int anInt559;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!kd;IIIIII)V")
	public Class29_Sub1_Sub1(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt557 = arg6;
		this.aClass57_Sub3_3 = arg0;
		this.anInt556 = arg2;
		this.anInt555 = arg1;
		this.anInt553 = arg4;
		this.anInt565 = arg3;
		this.anInt559 = arg5;
	}

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "(I)Lclient!rr;")
	@Override
	public Interface24 method548() {
		if (this.anInterface24_1 == null) {
			Static524.anIntArray511[4] = this.anInt559;
			@Pc(17) Interface1 local17 = this.aClass57_Sub3_3.anInterface1_11;
			Static524.anIntArray511[3] = this.anInt553;
			Static524.anIntArray511[5] = this.anInt557;
			Static524.anIntArray511[0] = this.anInt555;
			Static524.anIntArray511[1] = this.anInt556;
			Static524.anIntArray511[2] = this.anInt565;
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local17.method2860(Static524.anIntArray511[local48])) {
					return null;
				}
				@Pc(69) Class233 local69 = local17.method2863(Static524.anIntArray511[local48]);
				@Pc(77) int local77 = local69.aBoolean485 ? 64 : 128;
				if (local69.aByte95 > 0) {
					local44 = 1;
				}
				if (local77 > local46) {
					local46 = local77;
				}
			}
			for (@Pc(96) int local96 = 0; local96 < 6; local96++) {
				Static481.anIntArrayArray47[local96] = local17.method2861(false, Static524.anIntArray511[local96], local46, local46, 1.0F);
			}
			this.anInterface24_1 = this.aClass57_Sub3_3.method7797(Static481.anIntArrayArray47, local44 != 0, local46);
		}
		return this.anInterface24_1;
	}
}
