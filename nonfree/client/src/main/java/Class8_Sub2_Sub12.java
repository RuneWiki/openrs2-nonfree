import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class8_Sub2_Sub12 extends Class8_Sub2 {

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
	private int anInt3926 = 1024;

	@OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
	private int anInt3930 = 2048;

	@OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
	private int anInt3934 = 3072;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
	@Override
	public void method8508() {
		this.anInt3930 = this.anInt3934 - this.anInt3926;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(29) int[][] local29 = this.method8510(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static538.anInt9297; local55++) {
				local45[local55] = this.anInt3926 + (this.anInt3930 * local33[local55] >> 12);
				local49[local55] = (local37[local55] * this.anInt3930 >> 12) + this.anInt3926;
				local53[local55] = (this.anInt3930 * local41[local55] >> 12) + this.anInt3926;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3926 = arg1.method8578();
		} else if (arg0 == 1) {
			this.anInt3934 = arg1.method8578();
		} else if (arg0 == 2) {
			super.aBoolean753 = arg1.method8525() == 1;
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(21) int[] local21 = this.method8505(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static538.anInt9297; local23++) {
				local11[local23] = this.anInt3926 + (local21[local23] * this.anInt3930 >> 12);
			}
		}
		return local11;
	}
}
