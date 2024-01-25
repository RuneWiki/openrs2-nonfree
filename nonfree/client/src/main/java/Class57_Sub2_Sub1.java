import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class57_Sub2_Sub1 extends Class57_Sub2 {

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "Lclient!pf;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
	private final int anInt6256;

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
	private final int anInt6255;

	@OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
	private final int anInt6260;

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "I")
	private final int anInt6259;

	@OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
	private final int anInt6257;

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
	private final int anInt6258;

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "Lclient!wu;")
	private final Class100_Sub1 aClass100_Sub1_14;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!wu;IIIIII)V")
	public Class57_Sub2_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6256 = arg2;
		this.anInt6255 = arg4;
		this.anInt6260 = arg1;
		this.anInt6259 = arg3;
		this.anInt6257 = arg5;
		this.anInt6258 = arg6;
		this.aClass100_Sub1_14 = arg0;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)Lclient!pf;")
	@Override
	public Interface19 method5436() {
		if (this.anInterface19_1 == null) {
			Static376.anIntArray421[0] = this.anInt6260;
			Static376.anIntArray421[5] = this.anInt6258;
			Static376.anIntArray421[3] = this.anInt6255;
			Static376.anIntArray421[1] = this.anInt6256;
			Static376.anIntArray421[4] = this.anInt6257;
			@Pc(45) Interface4 local45 = this.aClass100_Sub1_14.anInterface4_12;
			Static376.anIntArray421[2] = this.anInt6259;
			@Pc(52) byte local52 = 0;
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < 6; local56++) {
				if (!local45.method892(Static376.anIntArray421[local56])) {
					return null;
				}
				@Pc(74) Class325 local74 = local45.method895(Static376.anIntArray421[local56]);
				@Pc(81) int local81 = local74.aBoolean633 ? 64 : 128;
				if (local74.aByte114 > 0) {
					local52 = 1;
				}
				if (local54 < local81) {
					local54 = local81;
				}
			}
			for (@Pc(102) int local102 = 0; local102 < 6; local102++) {
				Static69.anIntArrayArray12[local102] = local45.method894(1.0F, false, Static376.anIntArray421[local102], local54, local54);
			}
			this.anInterface19_1 = this.aClass100_Sub1_14.method6163(Static69.anIntArrayArray12, local54, local52 != 0);
		}
		return this.anInterface19_1;
	}
}
