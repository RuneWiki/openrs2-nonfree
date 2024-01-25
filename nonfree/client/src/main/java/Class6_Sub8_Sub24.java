import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class6_Sub8_Sub24 extends Class6_Sub8 {

	@OriginalMember(owner = "client!maa", name = "J", descriptor = "[I")
	public static final int[] anIntArray362 = new int[128];

	static {
		for (@Pc(69) int local69 = 0; local69 < anIntArray362.length; local69++) {
			anIntArray362[local69] = -1;
		}
		for (@Pc(85) int local85 = 65; local85 <= 90; local85++) {
			anIntArray362[local85] = local85 - 65;
		}
		for (@Pc(100) int local100 = 97; local100 <= 122; local100++) {
			anIntArray362[local100] = local100 - 71;
		}
		for (@Pc(115) int local115 = 48; local115 <= 57; local115++) {
			anIntArray362[local115] = local115 + 52 - 48;
		}
		anIntArray362[42] = anIntArray362[43] = 62;
		anIntArray362[45] = anIntArray362[47] = 63;
	}

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			for (@Pc(25) int local25 = 0; local25 < Static83.anInt1268; local25++) {
				this.method5533(local25, arg0);
				@Pc(38) int[] local38 = this.method8930(Static452.anInt7801, 0);
				local19[local25] = local38[Static289.anInt5183];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "(III)V")
	private void method5533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = Static2.anIntArray1[arg0];
		@Pc(21) int local21 = Static424.anIntArray466[arg1];
		@Pc(32) float local32 = (float) Math.atan2((double) (local17 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static289.anInt5183 = arg0;
			Static452.anInt7801 = arg1;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static452.anInt7801 = arg0;
			Static289.anInt5183 = arg1;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static452.anInt7801 = arg0;
			Static289.anInt5183 = Static83.anInt1268 - arg1;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static452.anInt7801 = Static226.anInt4404 - arg1;
			Static289.anInt5183 = arg0;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static452.anInt7801 = Static226.anInt4404 - arg1;
			Static289.anInt5183 = Static83.anInt1268 - arg0;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static289.anInt5183 = Static83.anInt1268 - arg1;
			Static452.anInt7801 = Static226.anInt4404 - arg0;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static452.anInt7801 = Static226.anInt4404 - arg0;
			Static289.anInt5183 = arg1;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static289.anInt5183 = Static83.anInt1268 - arg0;
			Static452.anInt7801 = arg1;
		}
		Static289.anInt5183 &= Static333.anInt5727;
		Static452.anInt7801 &= Static165.anInt3453;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			super.aBoolean766 = arg1.method3030() == 1;
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			for (@Pc(38) int local38 = 0; local38 < Static83.anInt1268; local38++) {
				this.method5533(local38, arg0);
				@Pc(51) int[][] local51 = this.method8928(0, Static452.anInt7801);
				local28[local38] = local51[0][Static289.anInt5183];
				local32[local38] = local51[1][Static289.anInt5183];
				local36[local38] = local51[2][Static289.anInt5183];
			}
		}
		return local11;
	}
}
