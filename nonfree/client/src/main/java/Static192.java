import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Lclient!bja;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "[S")
	public static short[] aShortArray69 = new short[256];

	@OriginalMember(owner = "client!g", name = "o", descriptor = "[B")
	public static final byte[] aByteArray37 = new byte[2048];

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)Z")
	public static boolean method2749() {
		@Pc(7) boolean local7 = true;
		if (Static30.aClass355_1 == null) {
			if (Static117.aClass254_47.method6072(Static519.anInt8273)) {
				Static30.aClass355_1 = Static737.method8359(Static117.aClass254_47, Static519.anInt8273);
			} else {
				local7 = false;
			}
		}
		if (Static437.aClass355_4 == null) {
			if (Static117.aClass254_47.method6072(Static426.anInt6943)) {
				Static437.aClass355_4 = Static737.method8359(Static117.aClass254_47, Static426.anInt6943);
			} else {
				local7 = false;
			}
		}
		if (Static158.aClass355_5 == null) {
			if (Static117.aClass254_47.method6072(Static620.anInt10230)) {
				Static158.aClass355_5 = Static737.method8359(Static117.aClass254_47, Static620.anInt10230);
			} else {
				local7 = false;
			}
		}
		if (Static370.aClass289_6 == null) {
			if (Static335.aClass254_99.method6072(Static557.anInt8789)) {
				Static370.aClass289_6 = Static597.method8191(Static335.aClass254_99, Static557.anInt8789);
			} else {
				local7 = false;
			}
		}
		if (Static109.aClass355Array1 == null) {
			if (Static117.aClass254_47.method6072(Static557.anInt8789)) {
				Static109.aClass355Array1 = Static737.method8361(Static117.aClass254_47, Static557.anInt8789);
			} else {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)[Lclient!fh;")
	public static Class118[] method2750() {
		return new Class118[] { Static456.aClass118_22, Static365.aClass118_17, Static500.aClass118_25, Static676.aClass118_32, Static312.aClass118_13, Static350.aClass118_16, Static9.aClass118_1, Static208.aClass118_15, Static228.aClass118_21, Static275.aClass118_11, Static456.aClass118_23, Static260.aClass118_10, Static624.aClass118_31, Static51.aClass118_2, Static330.aClass118_14, Static177.aClass118_6, Static543.aClass118_28, Static712.aClass118_33, Static76.aClass118_3, Static718.aClass118_34, Static482.aClass118_24, Static373.aClass118_18, Static598.aClass118_30, Static136.aClass118_5, Static526.aClass118_26, Static127.aClass118_4, Static441.aClass118_20, Static538.aClass118_27, Static565.aClass118_29, Static293.aClass118_12, Static405.aClass118_19 };
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!tl;)V")
	public static void method2751(@OriginalArg(0) Class4_Sub2 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
			@Pc(8) Class4_Sub2 local8 = null;
			for (@Pc(12) Class4_Sub2 local12 = Static594.aClass4_Sub2Array5[local5]; local12 != null; local12 = local12.aClass4_Sub2_25) {
				if (local12 == arg0) {
					if (local8 == null) {
						Static594.aClass4_Sub2Array5[local5] = local12.aClass4_Sub2_25;
					} else {
						local8.aClass4_Sub2_25 = local12.aClass4_Sub2_25;
					}
					Static415.aBoolean615 = true;
					return;
				}
				local8 = local12;
			}
			local8 = null;
			for (@Pc(47) Class4_Sub2 local47 = Static161.aClass4_Sub2Array1[local5]; local47 != null; local47 = local47.aClass4_Sub2_25) {
				if (local47 == arg0) {
					if (local8 == null) {
						Static161.aClass4_Sub2Array1[local5] = local47.aClass4_Sub2_25;
					} else {
						local8.aClass4_Sub2_25 = local47.aClass4_Sub2_25;
					}
					Static415.aBoolean615 = true;
					return;
				}
				local8 = local47;
			}
			local8 = null;
			for (@Pc(82) Class4_Sub2 local82 = Static699.aClass4_Sub2Array6[local5]; local82 != null; local82 = local82.aClass4_Sub2_25) {
				if (local82 == arg0) {
					if (local8 == null) {
						Static699.aClass4_Sub2Array6[local5] = local82.aClass4_Sub2_25;
					} else {
						local8.aClass4_Sub2_25 = local82.aClass4_Sub2_25;
					}
					Static415.aBoolean615 = true;
					return;
				}
				local8 = local82;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZILjava/io/File;[B)V")
	public static void method2752(@OriginalArg(1) int arg0, @OriginalArg(2) File arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local14.readFully(arg2, 0, arg0);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}
}
