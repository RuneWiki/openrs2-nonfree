import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class2_Sub7_Sub14 extends Class2_Sub7 {

	static {
		new Class202("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			super.aBoolean649 = arg1.method5170() == 1;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static352.anInt6485; local37++) {
				this.method3041(local37, arg0);
				@Pc(50) int[][] local50 = this.method7589(0, Static356.anInt2877);
				local27[local37] = local50[0][Static490.anInt7936];
				local31[local37] = local50[1][Static490.anInt7936];
				local35[local37] = local50[2][Static490.anInt7936];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			for (@Pc(25) int local25 = 0; local25 < Static352.anInt6485; local25++) {
				this.method3041(local25, arg0);
				@Pc(38) int[] local38 = this.method7581(Static356.anInt2877, 0);
				local19[local25] = local38[Static490.anInt7936];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(III)V")
	private void method3041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static427.anIntArray602[arg0];
		@Pc(13) int local13 = Static313.anIntArray521[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static356.anInt2877 = arg1;
			Static490.anInt7936 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static490.anInt7936 = arg1;
			Static356.anInt2877 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static490.anInt7936 = Static352.anInt6485 - arg1;
			Static356.anInt2877 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static490.anInt7936 = arg0;
			Static356.anInt2877 = Static79.anInt1658 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static490.anInt7936 = Static352.anInt6485 - arg0;
			Static356.anInt2877 = Static79.anInt1658 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static490.anInt7936 = Static352.anInt6485 - arg1;
			Static356.anInt2877 = Static79.anInt1658 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static356.anInt2877 = Static79.anInt1658 - arg0;
			Static490.anInt7936 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static490.anInt7936 = Static352.anInt6485 - arg0;
			Static356.anInt2877 = arg1;
		}
		Static490.anInt7936 &= Static38.anInt733;
		Static356.anInt2877 &= Static126.anInt7690;
	}
}
