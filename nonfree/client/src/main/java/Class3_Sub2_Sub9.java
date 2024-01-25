import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class3_Sub2_Sub9 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(III)V")
	private void method2188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static508.anIntArray472[arg0];
		@Pc(13) int local13 = Static123.anIntArray113[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static602.anInt9812 = arg1;
			Static579.anInt3478 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static579.anInt3478 = arg1;
			Static602.anInt9812 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static579.anInt3478 = Static636.anInt10302 - arg1;
			Static602.anInt9812 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static579.anInt3478 = arg0;
			Static602.anInt9812 = Static443.anInt7682 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static579.anInt3478 = Static636.anInt10302 - arg0;
			Static602.anInt9812 = Static443.anInt7682 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static602.anInt9812 = Static443.anInt7682 - arg0;
			Static579.anInt3478 = Static636.anInt10302 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static602.anInt9812 = Static443.anInt7682 - arg0;
			Static579.anInt3478 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static602.anInt9812 = arg1;
			Static579.anInt3478 = Static636.anInt10302 - arg0;
		}
		Static602.anInt9812 &= Static599.anInt9773;
		Static579.anInt3478 &= Static144.anInt2744;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(26) int[] local26 = local11[0];
			@Pc(30) int[] local30 = local11[1];
			@Pc(34) int[] local34 = local11[2];
			for (@Pc(36) int local36 = 0; local36 < Static636.anInt10302; local36++) {
				this.method2188(local36, arg0);
				@Pc(51) int[][] local51 = this.method9212(0, Static602.anInt9812);
				local26[local36] = local51[0][Static579.anInt3478];
				local30[local36] = local51[1][Static579.anInt3478];
				local34[local36] = local51[2][Static579.anInt3478];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			super.aBoolean794 = arg1.method5322(-88) == 1;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			for (@Pc(24) int local24 = 0; local24 < Static636.anInt10302; local24++) {
				this.method2188(local24, arg0);
				@Pc(37) int[] local37 = this.method9204(Static602.anInt9812, 0);
				local18[local24] = local37[Static579.anInt3478];
			}
		}
		return local18;
	}
}
