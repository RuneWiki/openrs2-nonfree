import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class1_Sub2_Sub29 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
	private int anInt5217 = 3072;

	@OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
	private int anInt5219 = 2048;

	@OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
	private int anInt5220 = 1024;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5220 = arg0.method4498();
		} else if (arg1 == 1) {
			this.anInt5217 = arg0.method4498();
		} else if (arg1 == 2) {
			super.aBoolean645 = arg0.method4548() == 1;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(27) int[] local27 = this.method5872(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static410.anInt7198; local29++) {
				local11[local29] = (this.anInt5219 * local27[local29] >> 12) + this.anInt5220;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(29) int[][] local29 = this.method5867(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static410.anInt7198; local55++) {
				local45[local55] = (local33[local55] * this.anInt5219 >> 12) + this.anInt5220;
				local49[local55] = (local37[local55] * this.anInt5219 >> 12) + this.anInt5220;
				local53[local55] = (local41[local55] * this.anInt5219 >> 12) + this.anInt5220;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
	@Override
	public void method5864() {
		this.anInt5219 = this.anInt5217 - this.anInt5220;
	}
}
