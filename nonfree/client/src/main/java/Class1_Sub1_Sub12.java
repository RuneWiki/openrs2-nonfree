import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean612 = arg1.method4463() == 1;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
	private void method1714(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static280.anIntArray238[arg0];
		@Pc(18) int local18 = Static221.anIntArray194[arg1];
		@Pc(29) float local29 = (float) Math.atan2((double) (local9 - 2048), (double) (local18 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static74.anInt1416 = arg0;
			Static113.anInt2001 = arg1;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static113.anInt2001 = arg0;
			Static74.anInt1416 = arg1;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static74.anInt1416 = Static434.anInt4326 - arg1;
			Static113.anInt2001 = arg0;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static113.anInt2001 = Static452.anInt7412 - arg1;
			Static74.anInt1416 = arg0;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static113.anInt2001 = Static452.anInt7412 - arg1;
			Static74.anInt1416 = Static434.anInt4326 - arg0;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static113.anInt2001 = Static452.anInt7412 - arg0;
			Static74.anInt1416 = Static434.anInt4326 - arg1;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static113.anInt2001 = Static452.anInt7412 - arg0;
			Static74.anInt1416 = arg1;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static113.anInt2001 = arg1;
			Static74.anInt1416 = Static434.anInt4326 - arg0;
		}
		Static113.anInt2001 &= Static249.anInt4068;
		Static74.anInt1416 &= Static429.anInt7144;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			for (@Pc(17) int local17 = 0; local17 < Static434.anInt4326; local17++) {
				this.method1714(local17, arg0);
				@Pc(30) int[] local30 = this.method5620(Static113.anInt2001, 0);
				local11[local17] = local30[Static74.anInt1416];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static434.anInt4326; local37++) {
				this.method1714(local37, arg0);
				@Pc(50) int[][] local50 = this.method5624(0, Static113.anInt2001);
				local27[local37] = local50[0][Static74.anInt1416];
				local31[local37] = local50[1][Static74.anInt1416];
				local35[local37] = local50[2][Static74.anInt1416];
			}
		}
		return local19;
	}
}
