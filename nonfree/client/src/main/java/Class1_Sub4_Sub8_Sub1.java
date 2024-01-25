import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class1_Sub4_Sub8_Sub1 extends Class1_Sub4_Sub8 {

	@OriginalMember(owner = "client!ck", name = "db", descriptor = "[I")
	public static final int[] anIntArray49 = new int[16384];

	@OriginalMember(owner = "client!ck", name = "eb", descriptor = "[I")
	public static final int[] anIntArray50 = new int[16384];

	static {
		@Pc(18) double local18 = 3.834951969714103E-4D;
		for (@Pc(20) int local20 = 0; local20 < 16384; local20++) {
			anIntArray50[local20] = (int) (Math.sin(local18 * (double) local20) * 32768.0D);
			anIntArray49[local20] = (int) (Math.cos((double) local20 * local18) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131 && this.method912()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = arg0 % super.anInt949 * super.anInt949;
			for (@Pc(46) int local46 = 0; local46 < Static395.anInt6592; local46++) {
				@Pc(58) int local58 = super.anIntArray46[local44 + local46 % super.anInt954];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
