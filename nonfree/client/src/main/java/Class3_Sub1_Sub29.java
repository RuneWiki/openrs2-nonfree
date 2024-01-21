import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class3_Sub1_Sub29 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
	private int anInt3447;

	@OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
	private int anInt3449;

	@OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
	private int anInt3452;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
	@Override
	public void method3131() {
		this.anInt3449 = this.anInt3452 - this.anInt3447;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(26) int[] local26 = this.method3120(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static129.anInt3285; local28++) {
				local16[local28] = (this.anInt3449 * local26[local28] >> 12) + this.anInt3447;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3447 = arg1.method1510();
		} else if (arg0 == 1) {
			this.anInt3452 = arg1.method1510();
		} else if (arg0 == 2) {
			super.aBoolean191 = arg1.method1545() == 1;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(29) int[][] local29 = this.method3124(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local29[1];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[2];
			@Pc(53) int[] local53 = local19[1];
			for (@Pc(55) int local55 = 0; local55 < Static129.anInt3285; local55++) {
				local45[local55] = this.anInt3447 + (local33[local55] * this.anInt3449 >> 12);
				local53[local55] = (this.anInt3449 * local41[local55] >> 12) + this.anInt3447;
				local49[local55] = (this.anInt3449 * local37[local55] >> 12) + this.anInt3447;
			}
		}
		return local19;
	}
}
