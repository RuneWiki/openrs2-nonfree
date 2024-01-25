import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class3_Sub2_Sub17 extends Class3_Sub2 {

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static201.anInt3738; local37++) {
				this.method4330(local37, arg0);
				@Pc(50) int[][] local50 = this.method8672(0, Static469.anInt8026);
				local27[local37] = local50[0][Static401.anInt7143];
				local31[local37] = local50[1][Static401.anInt7143];
				local35[local37] = local50[2][Static401.anInt7143];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V")
	private void method4330(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static57.anIntArray536[arg0];
		@Pc(13) int local13 = Static376.anIntArray665[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static401.anInt7143 = arg0;
			Static469.anInt8026 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static401.anInt7143 = arg1;
			Static469.anInt8026 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static401.anInt7143 = Static201.anInt3738 - arg1;
			Static469.anInt8026 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static401.anInt7143 = arg0;
			Static469.anInt8026 = Static414.anInt7271 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static401.anInt7143 = Static201.anInt3738 - arg0;
			Static469.anInt8026 = Static414.anInt7271 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static469.anInt8026 = Static414.anInt7271 - arg0;
			Static401.anInt7143 = Static201.anInt3738 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static469.anInt8026 = Static414.anInt7271 - arg0;
			Static401.anInt7143 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static401.anInt7143 = Static201.anInt3738 - arg0;
			Static469.anInt8026 = arg1;
		}
		Static469.anInt8026 &= Static575.anInt9412;
		Static401.anInt7143 &= Static201.anInt3740;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			for (@Pc(22) int local22 = 0; local22 < Static201.anInt3738; local22++) {
				this.method4330(local22, arg0);
				@Pc(35) int[] local35 = this.method8669(Static469.anInt8026, 0);
				local16[local22] = local35[Static401.anInt7143];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean778 = arg0.method5633() == 1;
		}
	}
}
