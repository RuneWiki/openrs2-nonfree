import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "F")
	public static float aFloat126;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray17 = new byte[1000][];

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([I[II)V")
	public static void method5090(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static353.aByteArrayArrayArray2 = null;
			Static174.anIntArray180 = null;
			Static176.anIntArray183 = null;
			return;
		}
		Static176.anIntArray183 = arg0;
		Static174.anIntArray180 = new int[arg0.length];
		Static353.aByteArrayArrayArray2 = new byte[arg0.length][][];
		for (@Pc(28) int local28 = 0; local28 < Static176.anIntArray183.length; local28++) {
			Static353.aByteArrayArrayArray2[local28] = new byte[arg1[local28]][];
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!em;)V")
	public static void method5094(@OriginalArg(1) Class6_Sub5_Sub9 arg0) {
		if (arg0 == null) {
			return;
		}
		Static68.aClass163_14.method4967(arg0);
		Static611.anInt10324++;
		@Pc(39) Class6_Sub5_Sub11 local39;
		if (arg0.aBoolean254 || "".equals(arg0.aString25)) {
			local39 = new Class6_Sub5_Sub11(arg0.aString25);
			Static223.anInt5025++;
		} else {
			@Pc(33) long local33 = arg0.aLong79;
			for (local39 = (Class6_Sub5_Sub11) Static565.aClass380_46.method8747(local33); local39 != null && !local39.aString28.equals(arg0.aString25); local39 = (Class6_Sub5_Sub11) Static565.aClass380_46.method8750()) {
			}
			if (local39 == null) {
				local39 = (Class6_Sub5_Sub11) Static263.aClass94_24.method2960(local33);
				if (local39 != null && !local39.aString28.equals(arg0.aString25)) {
					local39 = null;
				}
				if (local39 == null) {
					local39 = new Class6_Sub5_Sub11(arg0.aString25);
				}
				Static565.aClass380_46.method8753(local39, local33);
				Static223.anInt5025++;
			}
		}
		if (local39.method2839(arg0)) {
			Static20.method604(local39);
		}
	}
}
