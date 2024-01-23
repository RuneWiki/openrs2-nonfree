import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
	private int anInt1760 = 4;

	@OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
	private int anInt1758 = 4;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1760 = arg0.method2199();
		} else if (arg1 == 1) {
			this.anInt1758 = arg0.method2199();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(28) int local28 = Static62.anInt1350 / this.anInt1760;
			@Pc(33) int local33 = Static265.anInt5306 / this.anInt1758;
			@Pc(44) int[] local44;
			@Pc(50) int local50;
			if (local33 <= 0) {
				local44 = this.method4716(0, 0);
			} else {
				local50 = arg0 % local33;
				local44 = this.method4716(0, Static265.anInt5306 * local50 / local33);
			}
			for (local50 = 0; local50 < Static62.anInt1350; local50++) {
				if (local28 <= 0) {
					local19[local50] = local44[0];
				} else {
					@Pc(86) int local86 = local50 % local28;
					local19[local50] = local44[local86 * Static62.anInt1350 / local28];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(29) int local29 = Static265.anInt5306 / this.anInt1758;
			@Pc(34) int local34 = Static62.anInt1350 / this.anInt1760;
			@Pc(53) int[][] local53;
			if (local29 > 0) {
				@Pc(43) int local43 = arg0 % local29;
				local53 = this.method4715(local43 * Static265.anInt5306 / local29, 0);
			} else {
				local53 = this.method4715(0, 0);
			}
			@Pc(65) int[] local65 = local53[0];
			@Pc(69) int[] local69 = local53[1];
			@Pc(73) int[] local73 = local53[2];
			@Pc(77) int[] local77 = local20[2];
			@Pc(81) int[] local81 = local20[1];
			@Pc(85) int[] local85 = local20[0];
			for (@Pc(87) int local87 = 0; local87 < Static62.anInt1350; local87++) {
				@Pc(103) int local103;
				if (local34 > 0) {
					@Pc(97) int local97 = local87 % local34;
					local103 = local97 * Static62.anInt1350 / local34;
				} else {
					local103 = 0;
				}
				local85[local87] = local65[local103];
				local81[local87] = local69[local103];
				local77[local87] = local73[local103];
			}
		}
		return local20;
	}
}
