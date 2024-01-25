import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
	public static int anInt2013;

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "Lclient!jf;")
	public static Class127 aClass127_2;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_27 = new Class186(109, -2);

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_28 = new Class186(32, -1);

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "[I")
	public static final int[] anIntArray214 = new int[1000];

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)[B")
	public static byte[] method1858(@OriginalArg(0) int arg0) {
		@Pc(19) Class6_Sub1_Sub10 local19 = (Class6_Sub1_Sub10) Static114.aClass149_2.method3402((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static235.method3704(local52, local30);
				@Pc(61) byte local61 = local24[local57];
				local24[local57] = local24[local52];
				local24[local52] = local24[511 - local45] = local61;
			}
			local19 = new Class6_Sub1_Sub10(local24);
			Static114.aClass149_2.method3404((long) arg0, local19);
		}
		return local19.aByteArray37;
	}
}
