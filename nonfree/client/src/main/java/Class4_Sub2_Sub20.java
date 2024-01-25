import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class4_Sub2_Sub20 extends Class4_Sub2 {

	@OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
	private int anInt3940 = 4;

	@OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
	private int anInt3937 = 4;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(25) int local25 = Static350.anInt6330 / this.anInt3937;
			@Pc(30) int local30 = Static160.anInt3006 / this.anInt3940;
			@Pc(41) int[][] local41;
			if (local30 <= 0) {
				local41 = this.method5848(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local30;
				local41 = this.method5848(0, Static160.anInt3006 * local47 / local30);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static350.anInt6330; local83++) {
				@Pc(92) int local92;
				if (local25 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local83 % local25;
					local92 = local98 * Static350.anInt6330 / local25;
				}
				local73[local83] = local61[local92];
				local77[local83] = local65[local92];
				local81[local83] = local69[local92];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt3937 = arg1.method4864();
		} else if (arg0 == 1) {
			this.anInt3940 = arg1.method4864();
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(26) int local26 = Static350.anInt6330 / this.anInt3937;
			@Pc(31) int local31 = Static160.anInt3006 / this.anInt3940;
			@Pc(50) int[] local50;
			@Pc(40) int local40;
			if (local31 > 0) {
				local40 = arg0 % local31;
				local50 = this.method5847(0, local40 * Static160.anInt3006 / local31);
			} else {
				local50 = this.method5847(0, 0);
			}
			for (local40 = 0; local40 < Static350.anInt6330; local40++) {
				if (local26 > 0) {
					@Pc(73) int local73 = local40 % local26;
					local11[local40] = local50[local73 * Static350.anInt6330 / local26];
				} else {
					local11[local40] = local50[0];
				}
			}
		}
		return local11;
	}
}
