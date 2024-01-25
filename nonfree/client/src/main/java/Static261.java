import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "Lclient!fi;")
	public static Class66 aClass66_87 = new Class66(64);

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Lclient!wf;")
	public static final Class215 aClass215_9 = new Class215(64);

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString296 = "Face here";

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString297 = "Connected to update server";

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_88 = new Class66(64);

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
	public static int anInt5033 = 0;

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
	public static int anInt5034 = 0;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)I")
	public static int method4487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static267.anIntArrayArray40 == null ? 0 : Static267.anIntArrayArray40[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)I")
	public static int method4488(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0xF3333333) + (local13 & 0x33333333);
		@Pc(31) int local31 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!bk;I)V")
	public static void method4490(@OriginalArg(0) Class5_Sub1 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static243.aClass35_3 != null) {
			@Pc(20) int local20;
			try {
				Static243.aClass35_3.method892(0L);
				Static243.aClass35_3.method900(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method1850(local8, 24);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
	public static void method4491() {
		if (Static307.anInt5907 < 102) {
			Static307.anInt5907 += 6;
		}
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static260.anInt6423; local19++) {
			local25 = Static57.anIntArray65[local19];
			@Pc(30) char local30 = (char) Static88.anIntArray74[local19];
			if (local25 == 84) {
				Static4.method26();
			} else if (Static233.aBooleanArray19[82] && local25 == 66) {
				if (Static105.aClipboard1 != null) {
					@Pc(209) String local209 = "";
					for (@Pc(214) int local214 = Static206.aStringArray28.length - 1; local214 >= 0; local214--) {
						if (Static206.aStringArray28[local214] != null && Static206.aStringArray28[local214].length() > 0) {
							local209 = local209 + Static206.aStringArray28[local214] + '\n';
						}
					}
					Static105.aClipboard1.setContents(new StringSelection(local209), null);
				}
			} else if (Static233.aBooleanArray19[82] && local25 == 67) {
				if (Static105.aClipboard1 != null) {
					@Pc(151) Transferable local151 = Static105.aClipboard1.getContents(null);
					if (local151 != null) {
						try {
							@Pc(158) String local158 = (String) local151.getTransferData(DataFlavor.stringFlavor);
							if (local158 != null) {
								@Pc(167) String[] local167 = Static219.method3847('\n', local158);
								if (local167.length > 1) {
									for (@Pc(173) int local173 = 0; local173 < local167.length; local173++) {
										Static236.aString265 = local167[local173];
										Static4.method26();
									}
								} else {
									Static236.aString265 = Static236.aString265 + local158;
								}
							}
						} catch (@Pc(203) Exception local203) {
						}
					}
				}
			} else if (local25 == 85 && Static236.aString265.length() > 0) {
				Static236.aString265 = Static236.aString265.substring(0, Static236.aString265.length() - 1);
			} else if (local25 == 104 && Static290.anInt5566 < Static206.aStringArray28.length) {
				Static290.anInt5566++;
				Static216.method3823();
			} else if (local25 == 105 && Static290.anInt5566 > 0) {
				Static290.anInt5566--;
				Static216.method3823();
			} else if (Static278.method4728(local30) || local30 == ',' || local30 == ' ' || local30 == '_' || local30 == '-' || local30 == '+') {
				Static236.aString265 = Static236.aString265 + (char) Static88.anIntArray74[local19];
			}
		}
		Static260.anInt6423 = 0;
		for (local25 = 0; local25 < 100; local25++) {
			@Pc(277) int local277;
			if (Static55.aBooleanArray4[local25]) {
				local277 = Static196.anIntArray279[local25]++;
				if (Static196.anIntArray279[local25] > 102) {
					Static55.aBooleanArray4[local25] = false;
				}
			} else {
				local277 = Static196.anIntArray279[local25]--;
				if (Static196.anIntArray279[local25] < 0) {
					Static9.anIntArray7[local25] = (int) (Math.random() * (double) Static17.anInt5991);
					Static274.anIntArray404[local25] = (int) (Math.random() * 350.0D);
					Static196.anIntArray279[local25] = 0;
					Static55.aBooleanArray4[local25] = true;
				}
			}
		}
		Static241.method4110();
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(IB)Lclient!bb;")
	public static Class17 method4492(@OriginalArg(0) int arg0) {
		@Pc(5) Class66 local5 = Static173.aClass66_80;
		@Pc(14) Class17 local14;
		synchronized (Static173.aClass66_80) {
			local14 = (Class17) Static173.aClass66_80.method1939((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static318.aClass170_104.method4584(Static38.method876(arg0), Static229.method3948(arg0));
		local14 = new Class17();
		local14.anInt509 = arg0;
		if (local34 != null) {
			local14.method529(new Class5_Sub1(local34));
		}
		local14.method526();
		@Pc(60) Class66 local60 = Static173.aClass66_80;
		synchronized (Static173.aClass66_80) {
			Static173.aClass66_80.method1936((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
	public static void method4493() {
		Static26.aClass59_2.method4791(Static88.aFloat24 * ((float) Static190.anInt3772 * 0.1F + 0.7F));
		Static26.aClass59_2.method4793(Static216.anInt4322, Static95.aFloat101, Static3.aFloat102, (float) Static252.anInt4902, (float) Static13.anInt468, (float) Static34.anInt909);
		Static26.aClass59_2.method4788(Static4.aClass18_1);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)V")
	public static void method4494(@OriginalArg(1) int arg0) {
		Static222.anInt4411 = arg0;
	}
}
