import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!nca", name = "g", descriptor = "F")
	public static float aFloat128;

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "Lclient!ela;")
	public static final Class96 aClass96_4 = new Class96();

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "Z")
	public static boolean aBoolean572 = false;

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "Z")
	public static final boolean aBoolean573 = false;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V")
	public static void method6153() {
		if (Static332.anInt5825 < 102) {
			Static332.anInt5825 += 6;
		}
		@Pc(32) int local32;
		if (Static60.anInt938 != -1 && Static77.aLong58 < Static626.method8479()) {
			for (local32 = Static60.anInt938; local32 < Static74.aStringArray4.length; local32++) {
				if (Static74.aStringArray4[local32].startsWith("pause")) {
					@Pc(46) int local46 = 5;
					try {
						local46 = Integer.parseInt(Static74.aStringArray4[local32].substring(6));
					} catch (@Pc(55) Exception local55) {
					}
					Static269.method4123("Pausing for " + local46 + " seconds...");
					Static60.anInt938 = local32 + 1;
					Static77.aLong58 = (long) (local46 * 1000) + Static626.method8479();
					return;
				}
				Static140.aString44 = Static74.aStringArray4[local32];
				Static416.method6188(false);
			}
			Static60.anInt938 = -1;
		}
		if (Static217.anInt4222 != 0) {
			Static112.anInt2245 -= Static217.anInt4222 * 5;
			if (Static159.anInt2951 <= Static112.anInt2245) {
				Static112.anInt2245 = Static159.anInt2951 - 1;
			}
			Static217.anInt4222 = 0;
			if (Static112.anInt2245 < 0) {
				Static112.anInt2245 = 0;
			}
		}
		for (local32 = 0; local32 < Static225.anInt4285; local32++) {
			@Pc(143) Interface3 local143 = Static165.anInterface3Array2[local32];
			@Pc(147) int local147 = local143.method666();
			@Pc(151) char local151 = local143.method668();
			@Pc(155) int local155 = local143.method665();
			if (local147 == 84) {
				Static416.method6188(false);
			}
			if (local147 == 80) {
				Static416.method6188(true);
			} else if (local147 == 66 && (local155 & 0x4) != 0) {
				if (Static118.aClipboard1 != null) {
					@Pc(470) String local470 = "";
					for (@Pc(475) int local475 = Static527.aStringArray34.length - 1; local475 >= 0; local475--) {
						if (Static527.aStringArray34[local475] != null && Static527.aStringArray34[local475].length() > 0) {
							local470 = local470 + Static527.aStringArray34[local475] + '\n';
						}
					}
					Static118.aClipboard1.setContents(new StringSelection(local470), (ClipboardOwner) null);
				}
			} else if (local147 == 67 && (local155 & 0x4) != 0) {
				if (Static118.aClipboard1 != null) {
					try {
						@Pc(213) Transferable local213 = Static118.aClipboard1.getContents((Object) null);
						if (local213 != null) {
							@Pc(220) String local220 = (String) local213.getTransferData(DataFlavor.stringFlavor);
							if (local220 != null) {
								@Pc(227) String[] local227 = Static349.method5051('\n', local220);
								Static53.method9363(local227);
							}
						}
					} catch (@Pc(232) Exception local232) {
					}
				}
			} else if (local147 == 85 && Static663.anInt10567 > 0) {
				Static140.aString44 = Static140.aString44.substring(0, Static663.anInt10567 - 1) + Static140.aString44.substring(Static663.anInt10567);
				Static663.anInt10567--;
			} else if (local147 == 101 && Static663.anInt10567 < Static140.aString44.length()) {
				Static140.aString44 = Static140.aString44.substring(0, Static663.anInt10567) + Static140.aString44.substring(Static663.anInt10567 + 1);
			} else if (local147 == 96 && Static663.anInt10567 > 0) {
				Static663.anInt10567--;
			} else if (local147 == 97 && Static663.anInt10567 < Static140.aString44.length()) {
				Static663.anInt10567++;
			} else if (local147 == 102) {
				Static663.anInt10567 = 0;
			} else if (local147 == 103) {
				Static663.anInt10567 = Static140.aString44.length();
			} else if (local147 == 104 && Static527.aStringArray34.length > Static131.anInt2468) {
				Static131.anInt2468++;
				Static39.method586();
				Static663.anInt10567 = Static140.aString44.length();
			} else if (local147 == 105 && Static131.anInt2468 > 0) {
				Static131.anInt2468--;
				Static39.method586();
				Static663.anInt10567 = Static140.aString44.length();
			} else if (Static536.method7529(local151) || "\\/.:, _-+[]~@".indexOf(local151) != -1) {
				Static140.aString44 = Static140.aString44.substring(0, Static663.anInt10567) + Static165.anInterface3Array2[local32].method668() + Static140.aString44.substring(Static663.anInt10567);
				Static663.anInt10567++;
			}
		}
		Static225.anInt4285 = 0;
		Static401.anInt7165 = 0;
		Static693.method9085();
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!lk;II)Z")
	public static boolean method6154(@OriginalArg(0) Class3_Sub28_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method5344(2);
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(109) int local109;
		@Pc(113) int local113;
		@Pc(119) int local119;
		@Pc(123) int local123;
		if (local8 == 0) {
			if (arg0.method5344(1) != 0) {
				method6154(arg0, arg1);
			}
			local29 = arg0.method5344(6);
			local34 = arg0.method5344(6);
			@Pc(45) boolean local45 = arg0.method5344(1) == 1;
			if (local45) {
				Static603.anIntArray545[Static3.anInt30++] = arg1;
			}
			if (Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(73) Class342 local73 = Static286.aClass342Array5[arg1];
			@Pc(81) Class19_Sub1_Sub3_Sub2_Sub2 local81 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[arg1] = new Class19_Sub1_Sub3_Sub2_Sub2();
			local81.anInt7796 = arg1;
			if (Static677.aClass3_Sub28Array1[arg1] != null) {
				local81.method6615((byte) -126, Static677.aClass3_Sub28Array1[arg1]);
			}
			local81.method6597(local73.anInt9611, true);
			local81.anInt7780 = local73.anInt9615;
			local109 = local73.anInt9614;
			local113 = local109 >> 28;
			local119 = local109 >> 14 & 0xFF;
			local123 = local109 & 0xFF;
			@Pc(133) int local133 = (local119 << 6) + local29 - Static714.anInt11156;
			@Pc(141) int local141 = local34 + (local123 << 6) - Static339.anInt5859;
			local81.aBoolean600 = local73.aBoolean691;
			local81.aBoolean599 = local73.aBoolean692;
			local81.aByteArray69[0] = Static443.aByteArray65[arg1];
			local81.aByte146 = local81.aByte145 = (byte) local113;
			if (Static135.method2226(local133, local141)) {
				local81.aByte145++;
			}
			local81.method6616(local133, local141);
			local81.aBoolean601 = false;
			Static286.aClass342Array5[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local29 = arg0.method5344(2);
			local34 = Static286.aClass342Array5[arg1].anInt9614;
			Static286.aClass342Array5[arg1].anInt9614 = (local34 & 0xFFFFFFF) + (((local34 >> 28) + local29 & 0x3) << 28);
			return false;
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (local8 != 2) {
				local29 = arg0.method5344(18);
				local34 = local29 >> 16;
				local239 = local29 >> 8 & 0xFF;
				local252 = local29 & 0xFF;
				local109 = Static286.aClass342Array5[arg1].anInt9614;
				local113 = local34 + (local109 >> 28) & 0x3;
				local119 = (local109 >> 14) + local239 & 0xFF;
				local123 = local109 + local252 & 0xFF;
				Static286.aClass342Array5[arg1].anInt9614 = local123 + (local119 << 14) + (local113 << 28);
				return false;
			}
			local29 = arg0.method5344(5);
			local34 = local29 >> 3;
			local239 = local29 & 0x7;
			@Pc(244) int local244 = Static286.aClass342Array5[arg1].anInt9614;
			local252 = (local244 >> 28) + local34 & 0x3;
			local109 = local244 >> 14 & 0xFF;
			local113 = local244 & 0xFF;
			if (local239 == 0) {
				local113--;
				local109--;
			}
			if (local239 == 1) {
				local113--;
			}
			if (local239 == 2) {
				local109++;
				local113--;
			}
			if (local239 == 3) {
				local109--;
			}
			if (local239 == 4) {
				local109++;
			}
			if (local239 == 5) {
				local109--;
				local113++;
			}
			if (local239 == 6) {
				local113++;
			}
			if (local239 == 7) {
				local113++;
				local109++;
			}
			Static286.aClass342Array5[arg1].anInt9614 = local113 + (local252 << 28) + (local109 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(III)Z")
	public static boolean method6155(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
