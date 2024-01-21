import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class6_Sub5 extends Class6 {

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "[I")
	public static int[] anIntArray57 = new int[99];

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "[Lclient!gd;")
	public Class25[] aClass25Array1;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "[I")
	public int[] anIntArray55;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
	public int anInt927;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "[Lclient!gd;")
	public Class25[] aClass25Array2;

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
	public int anInt929;

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "[I")
	public int[] anIntArray56;

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "[I")
	public int[] anIntArray58;

	static {
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 99; local20++) {
			@Pc(25) int local25 = local20 + 1;
			@Pc(38) int local38 = (int) ((double) local25 + Math.pow(2.0D, (double) local25 / 7.0D) * 300.0D);
			local18 += local38;
			anIntArray57[local20] = local18 / 4;
		}
	}
}
