import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class4_Sub1_Sub15 extends Class4_Sub1 {

	@OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
	private int anInt3022 = 4;

	@OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
	private int anInt3026 = 4;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3022 = arg0.method4666();
		} else if (arg1 == 1) {
			this.anInt3026 = arg0.method4666();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(29) int local29 = Static73.anInt1626 / this.anInt3022;
			@Pc(34) int local34 = Static25.anInt379 / this.anInt3026;
			@Pc(53) int[] local53;
			@Pc(43) int local43;
			if (local34 > 0) {
				local43 = arg0 % local34;
				local53 = this.method4736(Static25.anInt379 * local43 / local34, 0);
			} else {
				local53 = this.method4736(0, 0);
			}
			for (local43 = 0; local43 < Static73.anInt1626; local43++) {
				if (local29 > 0) {
					@Pc(73) int local73 = local43 % local29;
					local19[local43] = local53[local73 * Static73.anInt1626 / local29];
				} else {
					local19[local43] = local53[0];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(29) int local29 = Static73.anInt1626 / this.anInt3022;
			@Pc(34) int local34 = Static25.anInt379 / this.anInt3026;
			@Pc(53) int[][] local53;
			if (local34 > 0) {
				@Pc(43) int local43 = arg0 % local34;
				local53 = this.method4723(0, local43 * Static25.anInt379 / local34);
			} else {
				local53 = this.method4723(0, 0);
			}
			@Pc(65) int[] local65 = local53[0];
			@Pc(69) int[] local69 = local53[1];
			@Pc(73) int[] local73 = local53[2];
			@Pc(77) int[] local77 = local20[0];
			@Pc(81) int[] local81 = local20[1];
			@Pc(85) int[] local85 = local20[2];
			for (@Pc(87) int local87 = 0; local87 < Static73.anInt1626; local87++) {
				@Pc(101) int local101;
				if (local29 <= 0) {
					local101 = 0;
				} else {
					@Pc(107) int local107 = local87 % local29;
					local101 = Static73.anInt1626 * local107 / local29;
				}
				local77[local87] = local65[local101];
				local81[local87] = local69[local101];
				local85[local87] = local73[local101];
			}
		}
		return local20;
	}
}
