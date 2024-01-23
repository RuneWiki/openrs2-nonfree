import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
	private int anInt5445 = 4096;

	@OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
	private int anInt5448 = 0;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(21) int[][] local21 = this.method4457(0, arg0);
			@Pc(25) int[] local25 = local21[1];
			@Pc(29) int[] local29 = local21[0];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			@Pc(45) int[] local45 = local11[0];
			for (@Pc(47) int local47 = 0; local47 < Static131.anInt2513; local47++) {
				@Pc(58) int local58 = local25[local47];
				@Pc(62) int local62 = local29[local47];
				@Pc(66) int local66 = local33[local47];
				if (local62 < this.anInt5448) {
					local45[local47] = this.anInt5448;
				} else if (local62 > this.anInt5445) {
					local45[local47] = this.anInt5445;
				} else {
					local45[local47] = local62;
				}
				if (this.anInt5448 > local58) {
					local37[local47] = this.anInt5448;
				} else if (local58 > this.anInt5445) {
					local37[local47] = this.anInt5445;
				} else {
					local37[local47] = local58;
				}
				if (local66 < this.anInt5448) {
					local41[local47] = this.anInt5448;
				} else if (local66 <= this.anInt5445) {
					local41[local47] = local66;
				} else {
					local41[local47] = this.anInt5445;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5448 = arg0.method3107();
		} else if (arg1 == 1) {
			this.anInt5445 = arg0.method3107();
		} else if (arg1 == 2) {
			this.aBoolean434 = arg0.method3122() == 1;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(24) int[] local24 = this.method4450(0, arg0);
			for (@Pc(26) int local26 = 0; local26 < Static131.anInt2513; local26++) {
				@Pc(33) int local33 = local24[local26];
				if (local33 < this.anInt5448) {
					local13[local26] = this.anInt5448;
				} else if (this.anInt5445 < local33) {
					local13[local26] = this.anInt5445;
				} else {
					local13[local26] = local33;
				}
			}
		}
		return local13;
	}
}
