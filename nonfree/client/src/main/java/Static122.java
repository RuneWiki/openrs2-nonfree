import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
	public static int anInt2160;

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
	public static final int anInt2158 = 50;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "[I")
	public static final int[] anIntArray195 = new int[anInt2158];

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[anInt2158];

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "[I")
	public static final int[] anIntArray196 = new int[2048];

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "[I")
	public static final int[] anIntArray197 = new int[anInt2158];

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_38 = new Class237(16, 2);

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "[I")
	public static final int[] anIntArray198 = new int[anInt2158];

	@OriginalMember(owner = "client!fv", name = "p", descriptor = "[I")
	public static final int[] anIntArray199 = new int[anInt2158];

	@OriginalMember(owner = "client!fv", name = "r", descriptor = "[I")
	public static final int[] anIntArray200 = new int[1];

	@OriginalMember(owner = "client!fv", name = "s", descriptor = "[I")
	public static final int[] anIntArray201 = new int[anInt2158];

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "[I")
	public static final int[] anIntArray202 = new int[anInt2158];

	@OriginalMember(owner = "client!fv", name = "u", descriptor = "I")
	public static int anInt2164 = 0;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZLclient!kj;)[Lclient!nq;")
	public static Class171[] method1810(@OriginalArg(1) Class138 arg0) {
		if (!arg0.method3209()) {
			return new Class171[0];
		}
		@Pc(16) Class100 local16 = arg0.method3215();
		while (local16.anInt2365 == 0) {
			Static67.method1189(10L);
		}
		if (local16.anInt2365 == 2) {
			return new Class171[0];
		}
		@Pc(45) int[] local45 = (int[]) local16.anObject4;
		@Pc(51) Class171[] local51 = new Class171[local45.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(59) Class171 local59 = new Class171();
			local51[local53] = local59;
			local59.anInt4868 = local45[local53 << 2];
			local59.anInt4869 = local45[(local53 << 2) + 1];
			local59.anInt4872 = local45[(local53 << 2) + 2];
			local59.anInt4875 = local45[(local53 << 2) + 3];
		}
		return local51;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(III[B)[B")
	public static byte[] method1812(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(12) byte[] local12 = new byte[32768];
		Static460.method4220(arg1, arg0, local12, 0, 32768);
		return local12;
	}
}
