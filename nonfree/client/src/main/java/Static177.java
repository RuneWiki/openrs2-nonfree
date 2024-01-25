import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!haa", name = "ib", descriptor = "[[[Lclient!af;")
	public static Class9[][][] aClass9ArrayArrayArray2;

	@OriginalMember(owner = "client!haa", name = "db", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_43 = new Class160(22, 2);

	@OriginalMember(owner = "client!haa", name = "jb", descriptor = "I")
	public static int anInt3167 = -1;

	@OriginalMember(owner = "client!haa", name = "mb", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(II[BB)[B")
	public static byte[] method2708(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[32768];
		Static585.method3080(arg1, arg0, local14, 0, 32768);
		return local14;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BII)Z")
	public static boolean method2709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)I")
	public static int method2710(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(31) int local31 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}
}
