import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class2_Sub15_Sub22 extends Class2_Sub15 {

	@OriginalMember(owner = "client!od", name = "J", descriptor = "I")
	private int anInt7761 = 4;

	@OriginalMember(owner = "client!od", name = "I", descriptor = "I")
	private int anInt7760 = 4;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(26) int local26 = Static329.anInt6017 / this.anInt7760;
			@Pc(31) int local31 = Static667.anInt10615 / this.anInt7761;
			@Pc(47) int[][] local47;
			if (local31 > 0) {
				@Pc(37) int local37 = arg0 % local31;
				local47 = this.method9727(0, Static667.anInt10615 * local37 / local31);
			} else {
				local47 = this.method9727(0, 0);
			}
			@Pc(59) int[] local59 = local47[0];
			@Pc(63) int[] local63 = local47[1];
			@Pc(67) int[] local67 = local47[2];
			@Pc(71) int[] local71 = local11[0];
			@Pc(75) int[] local75 = local11[1];
			@Pc(79) int[] local79 = local11[2];
			for (@Pc(81) int local81 = 0; local81 < Static329.anInt6017; local81++) {
				@Pc(98) int local98;
				if (local26 > 0) {
					@Pc(92) int local92 = local81 % local26;
					local98 = Static329.anInt6017 * local92 / local26;
				} else {
					local98 = 0;
				}
				local71[local81] = local59[local98];
				local75[local81] = local63[local98];
				local79[local81] = local67[local98];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt7760 = arg1.method5203();
		} else if (arg0 == 1) {
			this.anInt7761 = arg1.method5203();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(26) int local26 = Static329.anInt6017 / this.anInt7760;
			@Pc(31) int local31 = Static667.anInt10615 / this.anInt7761;
			@Pc(50) int[] local50;
			@Pc(40) int local40;
			if (local31 > 0) {
				local40 = arg0 % local31;
				local50 = this.method9725(0, local40 * Static667.anInt10615 / local31);
			} else {
				local50 = this.method9725(0, 0);
			}
			for (local40 = 0; local40 < Static329.anInt6017; local40++) {
				if (local26 > 0) {
					@Pc(71) int local71 = local40 % local26;
					local17[local40] = local50[local71 * Static329.anInt6017 / local26];
				} else {
					local17[local40] = local50[0];
				}
			}
		}
		return local17;
	}
}
