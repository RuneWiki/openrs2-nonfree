import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Lclient!we;")
	public static Class62 aClass62_9;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "Lclient!na;")
	public static Class53 aClass53_672 = null;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Lclient!na;")
	public static Class53 aClass53_673 = Static109.method1737("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!k", name = "j", descriptor = "Lclient!na;")
	public static Class53 aClass53_674 = Static109.method1737("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)I")
	public static int method1046(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x73333333) + (local9 & 0x33333333);
		@Pc(32) int local32 = local19 + (local19 >>> 4) & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(44) int local44 = local38 + (local38 >>> 16);
		return local44 & 0xFF;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(JB)V")
	public static void method1047(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < Static23.anInt737; local16++) {
			if (arg0 == Static39.aLongArray4[local16]) {
				Static23.anInt737--;
				Static36.aBoolean40 = true;
				for (@Pc(40) int local40 = local16; local40 < Static23.anInt737; local40++) {
					Static39.aLongArray4[local40] = Static39.aLongArray4[local40 + 1];
				}
				Static115.aClass3_Sub7_Sub1_3.method662(142);
				Static115.aClass3_Sub7_Sub1_3.method633(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III[B)I")
	public static int method1048(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg0; local9++) {
			local7 = local7 >>> 8 ^ Class3_Sub9.anIntArray125[(arg2[local9] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([BI)[B")
	public static byte[] method1049(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub7 local8 = new Class3_Sub7(arg0);
		@Pc(20) int local20 = local8.method647();
		@Pc(26) int local26 = local8.method638();
		if (local26 < 0 || Static103.anInt2417 != 0 && Static103.anInt2417 < local26) {
			throw new RuntimeException();
		} else if (local20 == 0) {
			@Pc(48) byte[] local48 = new byte[local26];
			local8.method620(local26, local48);
			return local48;
		} else {
			@Pc(60) int local60 = local8.method638();
			if (local60 < 0 || Static103.anInt2417 != 0 && Static103.anInt2417 < local60) {
				throw new RuntimeException();
			}
			@Pc(84) byte[] local84 = new byte[local60];
			if (local20 == 1) {
				Static14.method216(local84, local60, arg0, local26);
			} else {
				try {
					@Pc(111) DataInputStream local111 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local26)));
					local111.readFully(local84);
					local111.close();
				} catch (@Pc(118) IOException local118) {
				}
			}
			return local84;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method1050() {
		aClass53_674 = null;
		aClass62_9 = null;
		aClass53_673 = null;
		aClass53_672 = null;
	}
}
