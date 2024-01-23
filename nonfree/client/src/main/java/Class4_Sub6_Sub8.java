import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class4_Sub6_Sub8 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
	private int anInt1218 = 4;

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
	private int anInt1220 = 4;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(28) int local28 = Static2.anInt19 / this.anInt1218;
			@Pc(33) int local33 = Static16.anInt308 / this.anInt1220;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local33 <= 0) {
				local41 = this.method4372(0, 0);
			} else {
				local47 = arg0 % local33;
				local41 = this.method4372(0, local47 * Static16.anInt308 / local33);
			}
			for (local47 = 0; local47 < Static2.anInt19; local47++) {
				if (local28 <= 0) {
					local19[local47] = local41[0];
				} else {
					@Pc(83) int local83 = local47 % local28;
					local19[local47] = local41[local83 * Static2.anInt19 / local28];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1218 = arg0.method1874();
		} else if (arg1 == 1) {
			this.anInt1220 = arg0.method1874();
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(21) int local21 = Static2.anInt19 / this.anInt1218;
			@Pc(26) int local26 = Static16.anInt308 / this.anInt1220;
			@Pc(37) int[][] local37;
			if (local26 <= 0) {
				local37 = this.method4377(0, 0);
			} else {
				@Pc(43) int local43 = arg0 % local26;
				local37 = this.method4377(Static16.anInt308 * local43 / local26, 0);
			}
			@Pc(57) int[] local57 = local37[0];
			@Pc(61) int[] local61 = local37[1];
			@Pc(65) int[] local65 = local11[0];
			@Pc(69) int[] local69 = local37[2];
			@Pc(73) int[] local73 = local11[1];
			@Pc(77) int[] local77 = local11[2];
			for (@Pc(79) int local79 = 0; local79 < Static2.anInt19; local79++) {
				@Pc(90) int local90;
				if (local21 <= 0) {
					local90 = 0;
				} else {
					@Pc(96) int local96 = local79 % local21;
					local90 = local96 * Static2.anInt19 / local21;
				}
				local65[local79] = local57[local90];
				local73[local79] = local61[local90];
				local77[local79] = local69[local90];
			}
		}
		return local11;
	}
}
