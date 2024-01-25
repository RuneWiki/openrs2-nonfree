import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class205_Sub2_Sub1 extends Class205_Sub2 {

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Lclient!au;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
	private final int anInt6296;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
	private final int anInt6295;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
	private final int anInt6297;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
	private final int anInt6291;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
	private final int anInt6294;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!ch;")
	private final Class5_Sub1 aClass5_Sub1_17;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
	private final int anInt6301;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!ch;IIIIII)V")
	public Class205_Sub2_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6296 = arg5;
		this.anInt6295 = arg2;
		this.anInt6297 = arg4;
		this.anInt6291 = arg6;
		this.anInt6294 = arg3;
		this.aClass5_Sub1_17 = arg0;
		this.anInt6301 = arg1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Lclient!au;")
	@Override
	public Interface3 method5463() {
		if (this.anInterface3_1 == null) {
			Static438.anIntArray480[1] = this.anInt6295;
			@Pc(24) Interface7 local24 = this.aClass5_Sub1_17.anInterface7_15;
			Static438.anIntArray480[2] = this.anInt6294;
			Static438.anIntArray480[5] = this.anInt6291;
			Static438.anIntArray480[4] = this.anInt6296;
			Static438.anIntArray480[0] = this.anInt6301;
			Static438.anIntArray480[3] = this.anInt6297;
			@Pc(51) byte local51 = 0;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local24.method8115(Static438.anIntArray480[local55])) {
					return null;
				}
				@Pc(73) Class195 local73 = local24.method8118(Static438.anIntArray480[local55]);
				@Pc(80) int local80 = local73.aBoolean364 ? 64 : 128;
				if (local53 < local80) {
					local53 = local80;
				}
				if (local73.aByte78 > 0) {
					local51 = 1;
				}
			}
			for (@Pc(96) int local96 = 0; local96 < 6; local96++) {
				Static17.anIntArrayArray1[local96] = local24.method8116(false, local53, Static438.anIntArray480[local96], local53, 1.0F);
			}
			this.anInterface3_1 = this.aClass5_Sub1_17.method5581(local53, Static17.anIntArrayArray1, local51 != 0);
		}
		return this.anInterface3_1;
	}
}
