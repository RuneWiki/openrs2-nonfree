import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class6_Sub5_Sub8 extends Class6_Sub5 {

	@OriginalMember(owner = "client!du", name = "L", descriptor = "I")
	private int anInt1988 = 3072;

	@OriginalMember(owner = "client!du", name = "Q", descriptor = "I")
	private int anInt1992 = 2048;

	@OriginalMember(owner = "client!du", name = "N", descriptor = "I")
	private int anInt1990 = 1024;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(29) int[] local29 = this.method6543(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static240.anInt4386; local31++) {
				local11[local31] = this.anInt1990 + (local29[local31] * this.anInt1992 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	@Override
	public void method6533() {
		this.anInt1992 = this.anInt1988 - this.anInt1990;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt1990 = arg1.method6485();
		} else if (arg0 == 1) {
			this.anInt1988 = arg1.method6485();
		} else if (arg0 == 2) {
			super.aBoolean495 = arg1.method6433() == 1;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(29) int[][] local29 = this.method6544(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static240.anInt4386; local55++) {
				local45[local55] = this.anInt1990 + (this.anInt1992 * local33[local55] >> 12);
				local49[local55] = this.anInt1990 + (local37[local55] * this.anInt1992 >> 12);
				local53[local55] = (local41[local55] * this.anInt1992 >> 12) + this.anInt1990;
			}
		}
		return local19;
	}
}
