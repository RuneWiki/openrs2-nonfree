import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_29 = new Class202("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!no;II)Z")
	public static boolean method835(@OriginalArg(0) Class2_Sub29_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method5248(2);
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(108) int local108;
		@Pc(112) int local112;
		@Pc(118) int local118;
		if (local8 == 0) {
			if (arg0.method5248(1) != 0) {
				method835(arg0, arg1);
			}
			local32 = arg0.method5248(6);
			local37 = arg0.method5248(6);
			@Pc(49) boolean local49 = arg0.method5248(1) == 1;
			if (local49) {
				Static327.anIntArray495[Static394.anInt7461++] = arg1;
			}
			if (Static278.aClass1_Sub1_Sub2_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(72) Class317 local72 = Static370.aClass317Array1[arg1];
			@Pc(80) Class1_Sub1_Sub2_Sub1 local80 = Static278.aClass1_Sub1_Sub2_Sub1Array1[arg1] = new Class1_Sub1_Sub2_Sub1();
			local80.anInt5076 = arg1;
			if (Static12.aClass2_Sub29Array1[arg1] != null) {
				local80.method2942(Static12.aClass2_Sub29Array1[arg1]);
			}
			local80.method4383(local72.anInt9354, true);
			local80.anInt5062 = local72.anInt9352;
			local108 = local72.anInt9356;
			local112 = local108 >> 28;
			local118 = local108 >> 14 & 0xFF;
			@Pc(122) int local122 = local108 & 0xFF;
			local80.aBoolean259 = local72.aBoolean676;
			local80.aByteArray87[0] = Static452.aByteArray107[arg1];
			local80.aByte90 = (byte) local112;
			local80.method2949((local118 << 6) + local32 - Static238.anInt4280, local37 + ((local122 << 6) - Static371.anInt6936));
			local80.aBoolean260 = false;
			Static370.aClass317Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local32 = arg0.method5248(2);
			local37 = Static370.aClass317Array1[arg1].anInt9356;
			Static370.aClass317Array1[arg1].anInt9356 = (local37 & 0xFFFFFFF) + ((local32 + (local37 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(214) int local214;
			@Pc(219) int local219;
			@Pc(227) int local227;
			if (local8 != 2) {
				local32 = arg0.method5248(18);
				local37 = local32 >> 16;
				local214 = local32 >> 8 & 0xFF;
				local219 = local32 & 0xFF;
				local227 = Static370.aClass317Array1[arg1].anInt9356;
				local108 = local37 + (local227 >> 28) & 0x3;
				local112 = local214 + (local227 >> 14) & 0xFF;
				local118 = local227 + local219 & 0xFF;
				Static370.aClass317Array1[arg1].anInt9356 = local118 + (local108 << 28) + (local112 << 14);
				return false;
			}
			local32 = arg0.method5248(5);
			local37 = local32 >> 3;
			local214 = local32 & 0x7;
			local219 = Static370.aClass317Array1[arg1].anInt9356;
			local227 = local37 + (local219 >> 28) & 0x3;
			local108 = local219 >> 14 & 0xFF;
			local112 = local219 & 0xFF;
			if (local214 == 0) {
				local108--;
				local112--;
			}
			if (local214 == 1) {
				local112--;
			}
			if (local214 == 2) {
				local112--;
				local108++;
			}
			if (local214 == 3) {
				local108--;
			}
			if (local214 == 4) {
				local108++;
			}
			if (local214 == 5) {
				local112++;
				local108--;
			}
			if (local214 == 6) {
				local112++;
			}
			if (local214 == 7) {
				local112++;
				local108++;
			}
			Static370.aClass317Array1[arg1].anInt9356 = local112 + (local108 << 14) + (local227 << 28);
			return false;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!sa;)V")
	public static void method836(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		Static532.aClass75Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V")
	public static void method837() {
		if (Static378.anInt7010 == 0) {
			return;
		}
		try {
			if (++Static520.anInt1939 > 2000) {
				if (Static497.aClass173_2 != null) {
					Static497.aClass173_2.method7261();
					Static497.aClass173_2 = null;
				}
				if (Static527.anInt9119 >= 1) {
					Static55.anInt972 = -5;
					Static378.anInt7010 = 0;
					return;
				}
				Static378.anInt7010 = 1;
				Static520.anInt1939 = 0;
				Static425.aClass163_4.aBoolean339 = !Static425.aClass163_4.aBoolean339;
				Static527.anInt9119++;
			}
			if (Static378.anInt7010 == 1) {
				Static16.aClass20_3 = Static531.aClass283_6.method7169(Static425.aClass163_4.aString104, Static425.aClass163_4.method3978());
				Static378.anInt7010 = 2;
			}
			if (Static378.anInt7010 == 2) {
				if (Static16.aClass20_3.anInt593 == 2) {
					throw new IOException();
				}
				if (Static16.aClass20_3.anInt593 != 1) {
					return;
				}
				Static497.aClass173_2 = Static528.method7624((Socket) Static16.aClass20_3.anObject2);
				Static16.aClass20_3 = null;
				Static497.aClass173_2.method7257(Static381.aClass2_Sub29_Sub2_2.aByteArray96, Static381.aClass2_Sub29_Sub2_2.anInt6132);
				Static378.anInt7010 = 4;
			}
			@Pc(123) int local123;
			if (Static378.anInt7010 == 4) {
				if (!Static497.aClass173_2.method7260(1)) {
					return;
				}
				Static497.aClass173_2.method7262(0, Static70.aClass2_Sub29_Sub2_1.aByteArray96, 1);
				local123 = Static70.aClass2_Sub29_Sub2_1.aByteArray96[0] & 0xFF;
				if (local123 != 21) {
					Static55.anInt972 = local123;
					Static378.anInt7010 = 0;
					Static497.aClass173_2.method7261();
					Static497.aClass173_2 = null;
					return;
				}
				Static378.anInt7010 = 5;
			}
			if (Static378.anInt7010 == 5) {
				if (!Static497.aClass173_2.method7260(1)) {
					return;
				}
				Static497.aClass173_2.method7262(0, Static70.aClass2_Sub29_Sub2_1.aByteArray96, 1);
				Static123.aStringArray14 = new String[Static70.aClass2_Sub29_Sub2_1.aByteArray96[0] & 0xFF];
				Static378.anInt7010 = 6;
			}
			if (Static378.anInt7010 == 6 && Static497.aClass173_2.method7260(Static123.aStringArray14.length * 8)) {
				Static70.aClass2_Sub29_Sub2_1.anInt6132 = 0;
				Static497.aClass173_2.method7262(0, Static70.aClass2_Sub29_Sub2_1.aByteArray96, Static123.aStringArray14.length * 8);
				for (local123 = 0; local123 < Static123.aStringArray14.length; local123++) {
					Static123.aStringArray14[local123] = Static404.method6383(Static70.aClass2_Sub29_Sub2_1.method5218());
				}
				Static378.anInt7010 = 0;
				Static55.anInt972 = 21;
				Static497.aClass173_2.method7261();
				Static497.aClass173_2 = null;
			}
		} catch (@Pc(226) IOException local226) {
			if (Static497.aClass173_2 != null) {
				Static497.aClass173_2.method7261();
				Static497.aClass173_2 = null;
			}
			if (Static527.anInt9119 >= 1) {
				Static378.anInt7010 = 0;
				Static55.anInt972 = -4;
			} else {
				Static425.aClass163_4.aBoolean339 = !Static425.aClass163_4.aBoolean339;
				Static378.anInt7010 = 1;
				Static520.anInt1939 = 0;
				Static527.anInt9119++;
			}
		}
	}
}
