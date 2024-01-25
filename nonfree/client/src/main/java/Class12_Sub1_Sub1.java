import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class12_Sub1_Sub1 extends Class12_Sub1 {

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "Lclient!ica;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "Lclient!mj;")
	private final Class45_Sub2 aClass45_Sub2_14;

	@OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
	private final int anInt5370;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
	private final int anInt5366;

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
	private final int anInt5364;

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
	private final int anInt5367;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
	private final int anInt5361;

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
	private final int anInt5362;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!mj;IIIIII)V")
	public Class12_Sub1_Sub1(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass45_Sub2_14 = arg0;
		this.anInt5370 = arg5;
		this.anInt5366 = arg3;
		this.anInt5364 = arg2;
		this.anInt5367 = arg1;
		this.anInt5361 = arg4;
		this.anInt5362 = arg6;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)Lclient!ica;")
	@Override
	public Interface6 method4618() {
		if (this.anInterface6_1 == null) {
			Static50.anIntArray40[3] = this.anInt5361;
			Static50.anIntArray40[0] = this.anInt5367;
			Static50.anIntArray40[5] = this.anInt5362;
			Static50.anIntArray40[4] = this.anInt5370;
			@Pc(37) Interface3 local37 = this.aClass45_Sub2_14.anInterface3_12;
			Static50.anIntArray40[2] = this.anInt5366;
			Static50.anIntArray40[1] = this.anInt5364;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local37.method4774(Static50.anIntArray40[local53])) {
					return null;
				}
				@Pc(71) Class55 local71 = local37.method4776(Static50.anIntArray40[local53]);
				@Pc(78) int local78 = local71.aBoolean141 ? 64 : 128;
				if (local71.aByte19 > 0) {
					local49 = true;
				}
				if (local51 < local78) {
					local51 = local78;
				}
			}
			for (@Pc(101) int local101 = 0; local101 < 6; local101++) {
				Static275.anIntArrayArray110[local101] = local37.method4779(local51, false, 1.0F, local51, Static50.anIntArray40[local101]);
			}
			this.anInterface6_1 = this.aClass45_Sub2_14.method4991(local51, local49, Static275.anIntArrayArray110);
		}
		return this.anInterface6_1;
	}
}
