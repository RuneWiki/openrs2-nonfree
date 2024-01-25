import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	static {
		new Class96(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
		new Class96("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(III)V")
	private void method2627(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static400.anIntArray525[arg0];
		@Pc(13) int local13 = Static285.anIntArray17[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static428.anInt7497 = arg0;
			Static255.anInt4376 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static428.anInt7497 = arg1;
			Static255.anInt4376 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static428.anInt7497 = Static410.anInt7198 - arg1;
			Static255.anInt4376 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static428.anInt7497 = arg0;
			Static255.anInt4376 = Static214.anInt6457 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static428.anInt7497 = Static410.anInt7198 - arg0;
			Static255.anInt4376 = Static214.anInt6457 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static255.anInt4376 = Static214.anInt6457 - arg0;
			Static428.anInt7497 = Static410.anInt7198 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static255.anInt4376 = Static214.anInt6457 - arg0;
			Static428.anInt7497 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static255.anInt4376 = arg1;
			Static428.anInt7497 = Static410.anInt7198 - arg0;
		}
		Static428.anInt7497 &= Static301.anInt5026;
		Static255.anInt4376 &= Static421.anInt7373;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static410.anInt7198; local34++) {
				this.method2627(local34, arg0);
				@Pc(47) int[][] local47 = this.method5867(0, Static255.anInt4376);
				local24[local34] = local47[0][Static428.anInt7497];
				local28[local34] = local47[1][Static428.anInt7497];
				local32[local34] = local47[2][Static428.anInt7497];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean645 = arg0.method4548() == 1;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			for (@Pc(22) int local22 = 0; local22 < Static410.anInt7198; local22++) {
				this.method2627(local22, arg0);
				@Pc(37) int[] local37 = this.method5872(0, Static255.anInt4376);
				local16[local22] = local37[Static428.anInt7497];
			}
		}
		return local16;
	}
}
