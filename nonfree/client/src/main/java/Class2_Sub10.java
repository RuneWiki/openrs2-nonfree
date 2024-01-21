import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!i", name = "H", descriptor = "[I")
	public static int[] anIntArray132 = new int[99];

	@OriginalMember(owner = "client!i", name = "A", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!i", name = "D", descriptor = "I")
	public int anInt1205;

	@OriginalMember(owner = "client!i", name = "J", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!i", name = "L", descriptor = "I")
	public int anInt1210;

	@OriginalMember(owner = "client!i", name = "M", descriptor = "[Lclient!g;")
	public Class26[] aClass26Array1;

	@OriginalMember(owner = "client!i", name = "P", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "[I")
	public int[] anIntArray134;

	@OriginalMember(owner = "client!i", name = "S", descriptor = "[Lclient!g;")
	public Class26[] aClass26Array2;

	static {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 99; local13++) {
			@Pc(18) int local18 = local13 + 1;
			@Pc(31) int local31 = (int) ((double) local18 + Math.pow(2.0D, (double) local18 / 7.0D) * 300.0D);
			local11 += local31;
			anIntArray132[local13] = local11 / 4;
		}
	}
}
