import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class3_Sub1_Sub36 extends Class3_Sub1 {

	@OriginalMember(owner = "client!vs", name = "D", descriptor = "[B")
	public static final byte[] aByteArray108 = new byte[32896];

	static {
		@Pc(55) int local55 = 0;
		for (@Pc(57) int local57 = 0; local57 < 256; local57++) {
			for (@Pc(60) int local60 = 0; local60 <= local57; local60++) {
				aByteArray108[local55++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local60 * local60 + local57 * local57 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			super.aBoolean773 = arg1.method2048(255) == 1;
		}
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(23) int[][] local23 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(31) int[] local31 = local23[0];
			@Pc(35) int[] local35 = local23[1];
			@Pc(39) int[] local39 = local23[2];
			for (@Pc(41) int local41 = 0; local41 < Static379.anInt5859; local41++) {
				this.method9206(arg0, local41);
				@Pc(54) int[][] local54 = this.method9576(Static515.anInt8128, 0);
				local31[local41] = local54[0][Static270.anInt4161];
				local35[local41] = local54[1][Static270.anInt4161];
				local39[local41] = local54[2][Static270.anInt4161];
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(III)V")
	private void method9206(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = Static497.anIntArray579[arg1];
		@Pc(20) int local20 = Static121.anIntArray145[arg0];
		@Pc(31) float local31 = (float) Math.atan2((double) (local16 - 2048), (double) (local20 - 2048));
		if ((double) local31 >= -3.141592653589793D && (double) local31 <= -2.356194490192345D) {
			Static515.anInt8128 = arg0;
			Static270.anInt4161 = arg1;
		} else if ((double) local31 <= -1.5707963267948966D && (double) local31 >= -2.356194490192345D) {
			Static515.anInt8128 = arg1;
			Static270.anInt4161 = arg0;
		} else if ((double) local31 <= -0.7853981633974483D && (double) local31 >= -1.5707963267948966D) {
			Static270.anInt4161 = Static379.anInt5859 - arg0;
			Static515.anInt8128 = arg1;
		} else if (local31 <= 0.0F && (double) local31 >= -0.7853981633974483D) {
			Static515.anInt8128 = Static24.anInt740 - arg0;
			Static270.anInt4161 = arg1;
		} else if (local31 >= 0.0F && (double) local31 <= 0.7853981633974483D) {
			Static270.anInt4161 = Static379.anInt5859 - arg1;
			Static515.anInt8128 = Static24.anInt740 - arg0;
		} else if ((double) local31 >= 0.7853981633974483D && (double) local31 <= 1.5707963267948966D) {
			Static270.anInt4161 = Static379.anInt5859 - arg0;
			Static515.anInt8128 = Static24.anInt740 - arg1;
		} else if ((double) local31 >= 1.5707963267948966D && (double) local31 <= 2.356194490192345D) {
			Static270.anInt4161 = arg0;
			Static515.anInt8128 = Static24.anInt740 - arg1;
		} else if ((double) local31 >= 2.356194490192345D && (double) local31 <= 3.141592653589793D) {
			Static270.anInt4161 = Static379.anInt5859 - arg1;
			Static515.anInt8128 = arg0;
		}
		Static270.anInt4161 &= Static711.anInt10997;
		Static515.anInt8128 &= Static652.anInt2344;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			for (@Pc(24) int local24 = 0; local24 < Static379.anInt5859; local24++) {
				this.method9206(arg0, local24);
				@Pc(37) int[] local37 = this.method9577(0, Static515.anInt8128);
				local18[local24] = local37[Static270.anInt4161];
			}
		}
		return local18;
	}
}
