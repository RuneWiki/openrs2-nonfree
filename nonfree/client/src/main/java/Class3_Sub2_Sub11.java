import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class3_Sub2_Sub11 extends Class3_Sub2 {

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean761 = arg0.method4888() == 1;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static30.anInt908; local37++) {
				this.method4082(local37, arg0);
				@Pc(50) int[][] local50 = this.method8718(0, Static83.anInt1911);
				local27[local37] = local50[0][Static613.anInt9553];
				local31[local37] = local50[1][Static613.anInt9553];
				local35[local37] = local50[2][Static613.anInt9553];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZII)V")
	private void method4082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static26.anIntArray20[arg0];
		@Pc(21) int local21 = Static201.anIntArray251[arg1];
		@Pc(32) float local32 = (float) Math.atan2((double) (local9 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static613.anInt9553 = arg0;
			Static83.anInt1911 = arg1;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static83.anInt1911 = arg0;
			Static613.anInt9553 = arg1;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static613.anInt9553 = Static30.anInt908 - arg1;
			Static83.anInt1911 = arg0;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static83.anInt1911 = Static157.anInt2964 - arg1;
			Static613.anInt9553 = arg0;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static83.anInt1911 = Static157.anInt2964 - arg1;
			Static613.anInt9553 = Static30.anInt908 - arg0;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static613.anInt9553 = Static30.anInt908 - arg1;
			Static83.anInt1911 = Static157.anInt2964 - arg0;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static83.anInt1911 = Static157.anInt2964 - arg0;
			Static613.anInt9553 = arg1;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static83.anInt1911 = arg1;
			Static613.anInt9553 = Static30.anInt908 - arg0;
		}
		Static613.anInt9553 &= Static241.anInt4556;
		Static83.anInt1911 &= Static622.anInt9680;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			for (@Pc(24) int local24 = 0; local24 < Static30.anInt908; local24++) {
				this.method4082(local24, arg0);
				@Pc(37) int[] local37 = this.method8716(0, Static83.anInt1911);
				local18[local24] = local37[Static613.anInt9553];
			}
		}
		return local18;
	}
}
