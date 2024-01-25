import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "[Lclient!kia;")
	public static Class169[] aClass169Array3;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_78 = new Class185(10, 16);

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "[I")
	public static final int[] anIntArray346 = new int[64];

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_132 = new Class73(102, -1);

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "[I")
	public static final int[] anIntArray348 = new int[4096];

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZLclient!gv;)V")
	public static void method6041(@OriginalArg(1) Class9_Sub4_Sub2_Sub1_Sub2 arg0) {
		@Pc(16) Class6_Sub45 local16 = (Class6_Sub45) Static209.aClass380_14.method8747((long) arg0.anInt4299);
		if (local16 == null) {
			return;
		}
		if (local16.aClass6_Sub4_Sub5_3 != null) {
			Static152.aClass6_Sub4_Sub3_2.method5197(local16.aClass6_Sub4_Sub5_3);
			local16.aClass6_Sub4_Sub5_3 = null;
		}
		local16.method8792();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BIILclient!gm;)Lclient!ch;")
	public static Class6_Sub5_Sub5 method6042(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2) {
		@Pc(10) int local10 = arg2.anInt4143 | arg1 << 10;
		@Pc(19) Class6_Sub5_Sub5 local19 = (Class6_Sub5_Sub5) Static76.aClass117_1.method3389((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static105.aClass223_38.method5942(Static105.aClass223_38.method5972(local10));
		if (local31 == null) {
			local10 = arg2.anInt4143 | arg0 + 65536 << 10;
			local19 = (Class6_Sub5_Sub5) Static76.aClass117_1.method3389((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static105.aClass223_38.method5942(Static105.aClass223_38.method5972(local10));
			if (local31 == null) {
				local10 = arg2.anInt4143 | 0x3FFFC00;
				local19 = (Class6_Sub5_Sub5) Static76.aClass117_1.method3389((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static105.aClass223_38.method5942(Static105.aClass223_38.method5972(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static47.method1559(local31);
					} catch (@Pc(193) Exception local193) {
						throw new RuntimeException(local193.getMessage() + " S: " + local10);
					}
					local19.aClass122_4 = arg2;
					Static76.aClass117_1.method3390(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static47.method1559(local31);
				} catch (@Pc(125) Exception local125) {
					throw new RuntimeException(local125.getMessage() + " S: " + local10);
				}
				local19.aClass122_4 = arg2;
				Static76.aClass117_1.method3390(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static47.method1559(local31);
			} catch (@Pc(45) Exception local45) {
				throw new RuntimeException(local45.getMessage() + " S: " + local10);
			}
			local19.aClass122_4 = arg2;
			Static76.aClass117_1.method3390(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
	public static void method6044() {
		@Pc(12) Class6_Sub17 local12 = Static330.method7824(Static290.aClass185_62, Static569.aClass134_2);
		local12.aClass6_Sub8_Sub1_2.method8241(Static140.anInt3330);
		Static452.method6867(local12);
	}
}
