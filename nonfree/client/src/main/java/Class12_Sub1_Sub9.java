import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class12_Sub1_Sub9 extends Class12_Sub1 {

	@OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
	private int anInt3048 = 0;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
	private int anInt3047 = 4096;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(25) int[] local25 = this.method7795(0, arg0);
			for (@Pc(27) int local27 = 0; local27 < Static357.anInt6670; local27++) {
				@Pc(33) int local33 = local25[local27];
				if (local33 < this.anInt3048) {
					local15[local27] = this.anInt3048;
				} else if (this.anInt3047 >= local33) {
					local15[local27] = local33;
				} else {
					local15[local27] = this.anInt3047;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3048 = arg0.method5199();
		} else if (arg1 == 1) {
			this.anInt3047 = arg0.method5199();
		} else if (arg1 == 2) {
			super.aBoolean663 = arg0.method5216() == 1;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(21) int[][] local21 = this.method7790(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static357.anInt6670; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (local53 < this.anInt3048) {
					local37[local47] = this.anInt3048;
				} else if (local53 <= this.anInt3047) {
					local37[local47] = local53;
				} else {
					local37[local47] = this.anInt3047;
				}
				if (local57 < this.anInt3048) {
					local41[local47] = this.anInt3048;
				} else if (this.anInt3047 < local57) {
					local41[local47] = this.anInt3047;
				} else {
					local41[local47] = local57;
				}
				if (local61 < this.anInt3048) {
					local45[local47] = this.anInt3048;
				} else if (this.anInt3047 < local61) {
					local45[local47] = this.anInt3047;
				} else {
					local45[local47] = local61;
				}
			}
		}
		return local11;
	}
}
