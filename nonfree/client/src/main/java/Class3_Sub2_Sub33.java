import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class3_Sub2_Sub33 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
	private int anInt8088 = 0;

	@OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
	private int anInt8089 = 4096;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(21) int[][] local21 = this.method8672(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static201.anInt3738; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (this.anInt8088 > local53) {
					local37[local47] = this.anInt8088;
				} else if (this.anInt8089 < local53) {
					local37[local47] = this.anInt8089;
				} else {
					local37[local47] = local53;
				}
				if (this.anInt8088 > local57) {
					local41[local47] = this.anInt8088;
				} else if (this.anInt8089 < local57) {
					local41[local47] = this.anInt8089;
				} else {
					local41[local47] = local57;
				}
				if (this.anInt8088 > local61) {
					local45[local47] = this.anInt8088;
				} else if (this.anInt8089 < local61) {
					local45[local47] = this.anInt8089;
				} else {
					local45[local47] = local61;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8088 = arg0.method5610();
		} else if (arg1 == 1) {
			this.anInt8089 = arg0.method5610();
		} else if (arg1 == 2) {
			super.aBoolean778 = arg0.method5633() == 1;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(26) int[] local26 = this.method8669(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static201.anInt3738; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt8088) {
					local16[local28] = this.anInt8088;
				} else if (this.anInt8089 >= local34) {
					local16[local28] = local34;
				} else {
					local16[local28] = this.anInt8089;
				}
			}
		}
		return local16;
	}
}
