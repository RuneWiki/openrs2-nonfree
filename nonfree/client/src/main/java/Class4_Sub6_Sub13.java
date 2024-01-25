import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class4_Sub6_Sub13 extends Class4_Sub6 {

	@OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
	private int anInt3050 = 0;

	@OriginalMember(owner = "client!hm", name = "E", descriptor = "I")
	private int anInt3051 = 4096;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(29) int[] local29 = this.method5508(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static80.anInt1616; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (this.anInt3050 > local37) {
					local11[local31] = this.anInt3050;
				} else if (this.anInt3051 < local37) {
					local11[local31] = this.anInt3051;
				} else {
					local11[local31] = local37;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt3050 = arg1.method2536();
		} else if (arg0 == 1) {
			this.anInt3051 = arg1.method2536();
		} else if (arg0 == 2) {
			super.aBoolean665 = arg1.method2490() == 1;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(21) int[][] local21 = this.method5516(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static80.anInt1616; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (this.anInt3050 > local53) {
					local37[local47] = this.anInt3050;
				} else if (local53 > this.anInt3051) {
					local37[local47] = this.anInt3051;
				} else {
					local37[local47] = local53;
				}
				if (local57 < this.anInt3050) {
					local41[local47] = this.anInt3050;
				} else if (this.anInt3051 < local57) {
					local41[local47] = this.anInt3051;
				} else {
					local41[local47] = local57;
				}
				if (local61 < this.anInt3050) {
					local45[local47] = this.anInt3050;
				} else if (this.anInt3051 < local61) {
					local45[local47] = this.anInt3051;
				} else {
					local45[local47] = local61;
				}
			}
		}
		return local11;
	}
}
