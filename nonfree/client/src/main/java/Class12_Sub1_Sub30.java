import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class12_Sub1_Sub30 extends Class12_Sub1 {

	@OriginalMember(owner = "client!sk", name = "P", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	static {
		for (@Pc(10) int local10 = 0; local10 < 26; local10++) {
			aCharArray6[local10] = (char) (local10 + 65);
		}
		for (@Pc(26) int local26 = 26; local26 < 52; local26++) {
			aCharArray6[local26] = (char) (local26 + 97 - 26);
		}
		for (@Pc(44) int local44 = 52; local44 < 62; local44++) {
			aCharArray6[local44] = (char) (local44 + 48 - 52);
		}
		aCharArray6[62] = '+';
		aCharArray6[63] = '/';
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean663 = arg0.method5216() == 1;
		}
	}

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "(III)V")
	private void method6832(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static347.anIntArray455[arg1];
		@Pc(13) int local13 = Static353.anIntArray458[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static51.anInt8941 = arg1;
			Static147.anInt3220 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static51.anInt8941 = arg0;
			Static147.anInt3220 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static147.anInt3220 = arg1;
			Static51.anInt8941 = Static357.anInt6670 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static51.anInt8941 = arg1;
			Static147.anInt3220 = Static138.anInt3102 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static51.anInt8941 = Static357.anInt6670 - arg1;
			Static147.anInt3220 = Static138.anInt3102 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static51.anInt8941 = Static357.anInt6670 - arg0;
			Static147.anInt3220 = Static138.anInt3102 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static147.anInt3220 = Static138.anInt3102 - arg1;
			Static51.anInt8941 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static147.anInt3220 = arg0;
			Static51.anInt8941 = Static357.anInt6670 - arg1;
		}
		Static147.anInt3220 &= Static162.anInt3758;
		Static51.anInt8941 &= Static149.anInt3278;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static357.anInt6670; local34++) {
				this.method6832(arg0, local34);
				@Pc(47) int[][] local47 = this.method7790(0, Static147.anInt3220);
				local24[local34] = local47[0][Static51.anInt8941];
				local28[local34] = local47[1][Static51.anInt8941];
				local32[local34] = local47[2][Static51.anInt8941];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			for (@Pc(21) int local21 = 0; local21 < Static357.anInt6670; local21++) {
				this.method6832(arg0, local21);
				@Pc(36) int[] local36 = this.method7795(0, Static147.anInt3220);
				local11[local21] = local36[Static51.anInt8941];
			}
		}
		return local11;
	}
}
