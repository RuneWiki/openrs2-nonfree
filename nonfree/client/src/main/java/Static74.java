import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2 aClass3_Sub1_Sub4_Sub2_26;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "[Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2[] aClass3_Sub1_Sub4_Sub2Array10;

	@OriginalMember(owner = "client!oc", name = "Q", descriptor = "Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_24;

	@OriginalMember(owner = "client!oc", name = "T", descriptor = "[I")
	public static int[] anIntArray236;

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "Lclient!aa;")
	public static Class2 aClass2_3;

	@OriginalMember(owner = "client!oc", name = "cb", descriptor = "Lclient!tb;")
	public static Class64_Sub1 aClass64_Sub1_16;

	@OriginalMember(owner = "client!oc", name = "db", descriptor = "Lclient!tb;")
	public static Class64_Sub1 aClass64_Sub1_17;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!ad;")
	private static Class4 aClass4_939 = Static75.method1216("");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!ad;")
	public static Class4 aClass4_931 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!ad;")
	public static Class4 aClass4_932 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!ad;")
	public static Class4 aClass4_933 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!ad;")
	public static Class4 aClass4_934 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!ad;")
	public static Class4 aClass4_935 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Lclient!ad;")
	public static Class4 aClass4_936 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!ad;")
	public static Class4 aClass4_937 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!ad;")
	public static Class4 aClass4_938 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!ad;")
	public static Class4 aClass4_940 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	public static int anInt1767 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
	public static int anInt1768 = 0;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Lclient!ad;")
	public static Class4 aClass4_941 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "Lclient!ad;")
	public static Class4 aClass4_942 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Lclient!ad;")
	public static Class4 aClass4_943 = Static75.method1216("Konfig geladen)3");

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "Lclient!ad;")
	public static Class4 aClass4_944 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "Lclient!ad;")
	public static Class4 aClass4_945 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "Lclient!ad;")
	public static Class4 aClass4_946 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "Lclient!ad;")
	public static Class4 aClass4_947 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "Lclient!ad;")
	public static Class4 aClass4_948 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "Lclient!ad;")
	public static Class4 aClass4_949 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "Lclient!ad;")
	public static Class4 aClass4_950 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "C", descriptor = "Lclient!ad;")
	public static Class4 aClass4_951 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "D", descriptor = "Lclient!ad;")
	public static Class4 aClass4_952 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "Lclient!ad;")
	public static Class4 aClass4_953 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "Lclient!ad;")
	public static Class4 aClass4_954 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "Lclient!bb;")
	public static Class8 aClass8_23 = new Class8(64);

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "Lclient!ad;")
	public static Class4 aClass4_955 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "Lclient!ad;")
	public static Class4 aClass4_956 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "Lclient!ad;")
	public static Class4 aClass4_957 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "Lclient!ad;")
	public static Class4 aClass4_958 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "Lclient!ad;")
	public static Class4 aClass4_959 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "Lclient!ad;")
	public static Class4 aClass4_960 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "Lclient!ad;")
	public static Class4 aClass4_961 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "Lclient!ad;")
	public static Class4 aClass4_962 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "Lclient!ad;")
	public static Class4 aClass4_963 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "Lclient!ad;")
	public static Class4 aClass4_964 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "Lclient!ad;")
	public static Class4 aClass4_965 = aClass4_939;

	@OriginalMember(owner = "client!oc", name = "Y", descriptor = "Lclient!ad;")
	private static Class4 aClass4_966 = Static75.method1216("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!oc", name = "Z", descriptor = "Lclient!ad;")
	public static Class4 aClass4_967 = Static75.method1216("Passwort: ");

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "Lclient!ad;")
	public static Class4 aClass4_968 = aClass4_966;

	@OriginalMember(owner = "client!oc", name = "bb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_969 = Static75.method1216("cross");

	@OriginalMember(owner = "client!oc", name = "eb", descriptor = "[Lclient!gb;")
	public static Class3_Sub4[] aClass3_Sub4Array1 = new Class3_Sub4[2048];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZILclient!e;)V")
	public static void method1188(@OriginalArg(2) Class3_Sub4_Sub1 arg0) {
		while (true) {
			@Pc(17) Class3_Sub5 local17 = (Class3_Sub5) Static52.aClass20_5.method308();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			for (@Pc(24) int local24 = 0; local24 < local17.anInt1064; local24++) {
				if (local17.aClass42Array2[local24] != null) {
					if (local17.aClass42Array2[local24].anInt1395 == 2) {
						local17.anIntArray111[local24] = -5;
					}
					if (local17.aClass42Array2[local24].anInt1395 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass42Array1[local24] != null) {
					if (local17.aClass42Array1[local24].anInt1395 == 2) {
						local17.anIntArray111[local24] = -6;
					}
					if (local17.aClass42Array1[local24].anInt1395 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method464(174);
			arg0.method423(0);
			@Pc(109) int local109 = arg0.anInt627;
			arg0.method424(local17.anInt1077);
			for (@Pc(116) int local116 = 0; local116 < local17.anInt1064; local116++) {
				if (local17.anIntArray111[local116] == 0) {
					try {
						@Pc(137) int local137 = local17.anIntArray110[local116];
						@Pc(146) Field local146;
						@Pc(150) int local150;
						if (local137 == 0) {
							local146 = (Field) local17.aClass42Array2[local116].anObject2;
							local150 = local146.getInt(null);
							arg0.method423(0);
							arg0.method424(local150);
						} else if (local137 == 1) {
							local146 = (Field) local17.aClass42Array2[local116].anObject2;
							local146.setInt(null, local17.anIntArray113[local116]);
							arg0.method423(0);
						} else if (local137 == 2) {
							local146 = (Field) local17.aClass42Array2[local116].anObject2;
							local150 = local146.getModifiers();
							arg0.method423(0);
							arg0.method424(local150);
						}
						@Pc(216) Method local216;
						if (local137 == 3) {
							local216 = (Method) local17.aClass42Array1[local116].anObject2;
							@Pc(221) byte[][] local221 = local17.aByteArrayArrayArray16[local116];
							@Pc(225) Object[] local225 = new Object[local221.length];
							for (@Pc(227) int local227 = 0; local227 < local221.length; local227++) {
								@Pc(239) ObjectInputStream local239 = new ObjectInputStream(new ByteArrayInputStream(local221[local227]));
								local225[local227] = local239.readObject();
							}
							@Pc(258) Object local258 = local216.invoke(null, local225);
							if (local258 == null) {
								arg0.method423(0);
							} else if (local258 instanceof Number) {
								arg0.method423(1);
								arg0.method456(((Number) local258).longValue());
							} else if (local258 instanceof Class4) {
								arg0.method423(2);
								arg0.method453((Class4) local258);
							} else {
								arg0.method423(4);
							}
						} else if (local137 == 4) {
							local216 = (Method) local17.aClass42Array1[local116].anObject2;
							local150 = local216.getModifiers();
							arg0.method423(0);
							arg0.method424(local150);
						}
					} catch (@Pc(326) ClassNotFoundException local326) {
						arg0.method423(-10);
					} catch (@Pc(332) InvalidClassException local332) {
						arg0.method423(-11);
					} catch (@Pc(338) StreamCorruptedException local338) {
						arg0.method423(-12);
					} catch (@Pc(344) OptionalDataException local344) {
						arg0.method423(-13);
					} catch (@Pc(350) IllegalAccessException local350) {
						arg0.method423(-14);
					} catch (@Pc(356) IllegalArgumentException local356) {
						arg0.method423(-15);
					} catch (@Pc(362) InvocationTargetException local362) {
						arg0.method423(-16);
					} catch (@Pc(368) SecurityException local368) {
						arg0.method423(-17);
					} catch (@Pc(374) IOException local374) {
						arg0.method423(-18);
					} catch (@Pc(380) NullPointerException local380) {
						arg0.method423(-19);
					} catch (@Pc(386) Exception local386) {
						arg0.method423(-20);
					} catch (@Pc(392) Throwable local392) {
						arg0.method423(-21);
					}
				} else {
					arg0.method423(local17.anIntArray111[local116]);
				}
			}
			arg0.method447(local109);
			arg0.method437(arg0.anInt627 - local109);
			local17.method1930();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method1189() {
		aClass4_946 = null;
		aClass4_940 = null;
		aClass3_Sub1_Sub4_Sub3_24 = null;
		aClass4_953 = null;
		aClass4_955 = null;
		aClass4_936 = null;
		aClass4_969 = null;
		aClass4_958 = null;
		aClass4_949 = null;
		aClass4_931 = null;
		aClass4_964 = null;
		aClass4_935 = null;
		aClass3_Sub1_Sub4_Sub2_26 = null;
		aClass4_960 = null;
		aClass4_954 = null;
		aClass4_948 = null;
		aClass4_957 = null;
		aClass64_Sub1_16 = null;
		aClass4_943 = null;
		aClass4_950 = null;
		aClass4_965 = null;
		aClass4_966 = null;
		aClass4_956 = null;
		aClass4_961 = null;
		aClass4_942 = null;
		anIntArray236 = null;
		aClass2_3 = null;
		aClass4_968 = null;
		aClass4_941 = null;
		aClass4_933 = null;
		aClass4_939 = null;
		aClass3_Sub1_Sub4_Sub2Array10 = null;
		aClass64_Sub1_17 = null;
		aClass4_963 = null;
		aClass4_932 = null;
		aClass4_951 = null;
		aClass8_23 = null;
		aClass4_934 = null;
		aClass4_952 = null;
		aClass4_967 = null;
		aClass4_937 = null;
		aClass4_945 = null;
		aClass4_959 = null;
		aClass4_944 = null;
		aClass3_Sub4Array1 = null;
		aClass4_947 = null;
		aClass4_962 = null;
		aClass4_938 = null;
	}
}
