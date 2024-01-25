import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "Lclient!nl;")
	public static Class171 aClass171_34;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray60;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "Lclient!cf;")
	public static final Class30 aClass30_15 = new Class30();

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "Z")
	public static boolean aBoolean180 = false;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "[I")
	public static final int[] anIntArray450 = new int[13];

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
	public static int anInt2329 = 16777215;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
	public static final int anInt2330 = 2;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "()V")
	public static void method2276() {
		Static386.anInt6583 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static168.anInt3222; local3++) {
			@Pc(8) Class227 local8 = Static209.aClass227Array1[local3];
			@Pc(12) int local12;
			if (Static243.anIntArray842 != null) {
				for (local12 = 0; local12 < Static243.anIntArray842.length; local12++) {
					if (Static243.anIntArray842[local12] != -1000000 && (local8.anInt5789 <= Static243.anIntArray842[local12] || local8.anInt5778 <= Static243.anIntArray842[local12]) && (local8.anInt5776 <= Static162.anIntArray621[local12] || local8.anInt5791 <= Static162.anIntArray621[local12]) && (local8.anInt5776 >= Static125.anIntArray532[local12] || local8.anInt5791 >= Static125.anIntArray532[local12]) && (local8.anInt5780 <= Static171.anIntArray645[local12] || local8.anInt5775 <= Static171.anIntArray645[local12]) && (local8.anInt5780 >= Static345.anIntArray1356[local12] || local8.anInt5775 >= Static345.anIntArray1356[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt5779 == 1) {
				local12 = local8.anInt5783 + Static309.anInt5190 - Static322.anInt5531;
				if (local12 >= 0 && local12 <= Static309.anInt5190 + Static309.anInt5190) {
					local110 = local8.anInt5773 + Static309.anInt5190 - Static314.anInt5359;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5794 + Static309.anInt5190 - Static314.anInt5359;
					if (local121 > Static309.anInt5190 + Static309.anInt5190) {
						local121 = Static309.anInt5190 + Static309.anInt5190;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static199.aBooleanArrayArray4[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static203.anInt3750 - local8.anInt5776;
						if (local153 > Static180.anInt6487) {
							local8.anInt5777 = 1;
						} else {
							if (local153 >= -Static180.anInt6487) {
								continue;
							}
							local8.anInt5777 = 2;
							local153 = -local153;
						}
						local8.anInt5774 = (local8.anInt5780 - Static64.anInt1275 << 8) / local153;
						local8.anInt5781 = (local8.anInt5775 - Static64.anInt1275 << 8) / local153;
						local8.anInt5785 = (local8.anInt5789 - Static149.anInt6259 << 8) / local153;
						local8.anInt5771 = (local8.anInt5778 - Static149.anInt6259 << 8) / local153;
						Static343.aClass227Array2[Static386.anInt6583++] = local8;
					}
				}
			} else if (local8.anInt5779 == 2) {
				local12 = local8.anInt5773 + Static309.anInt5190 - Static314.anInt5359;
				if (local12 >= 0 && local12 <= Static309.anInt5190 + Static309.anInt5190) {
					local110 = local8.anInt5783 + Static309.anInt5190 - Static322.anInt5531;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5788 + Static309.anInt5190 - Static322.anInt5531;
					if (local121 > Static309.anInt5190 + Static309.anInt5190) {
						local121 = Static309.anInt5190 + Static309.anInt5190;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static199.aBooleanArrayArray4[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static64.anInt1275 - local8.anInt5780;
						if (local153 > Static180.anInt6487) {
							local8.anInt5777 = 3;
						} else {
							if (local153 >= -Static180.anInt6487) {
								continue;
							}
							local8.anInt5777 = 4;
							local153 = -local153;
						}
						local8.anInt5786 = (local8.anInt5776 - Static203.anInt3750 << 8) / local153;
						local8.anInt5790 = (local8.anInt5791 - Static203.anInt3750 << 8) / local153;
						local8.anInt5785 = (local8.anInt5789 - Static149.anInt6259 << 8) / local153;
						local8.anInt5771 = (local8.anInt5778 - Static149.anInt6259 << 8) / local153;
						Static343.aClass227Array2[Static386.anInt6583++] = local8;
					}
				}
			} else if (local8.anInt5779 == 4) {
				local12 = local8.anInt5789 - Static149.anInt6259;
				if (local12 > Static180.anInt6486) {
					local110 = local8.anInt5773 + Static309.anInt5190 - Static314.anInt5359;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5794 + Static309.anInt5190 - Static314.anInt5359;
					if (local121 > Static309.anInt5190 + Static309.anInt5190) {
						local121 = Static309.anInt5190 + Static309.anInt5190;
					}
					if (local110 <= local121) {
						@Pc(405) int local405 = local8.anInt5783 + Static309.anInt5190 - Static322.anInt5531;
						if (local405 < 0) {
							local405 = 0;
						}
						local153 = local8.anInt5788 + Static309.anInt5190 - Static322.anInt5531;
						if (local153 > Static309.anInt5190 + Static309.anInt5190) {
							local153 = Static309.anInt5190 + Static309.anInt5190;
						}
						@Pc(427) boolean local427 = false;
						label159: for (@Pc(429) int local429 = local405; local429 <= local153; local429++) {
							for (@Pc(432) int local432 = local110; local432 <= local121; local432++) {
								if (Static199.aBooleanArrayArray4[local429][local432]) {
									local427 = true;
									break label159;
								}
							}
						}
						if (local427) {
							local8.anInt5777 = 5;
							local8.anInt5786 = (local8.anInt5776 - Static203.anInt3750 << 8) / local12;
							local8.anInt5790 = (local8.anInt5791 - Static203.anInt3750 << 8) / local12;
							local8.anInt5774 = (local8.anInt5780 - Static64.anInt1275 << 8) / local12;
							local8.anInt5781 = (local8.anInt5775 - Static64.anInt1275 << 8) / local12;
							Static343.aClass227Array2[Static386.anInt6583++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!is;Ljava/awt/Canvas;IILclient!tq;I)Lclient!vc;")
	public static Class63 method2279(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface9 arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(17) Class local17 = Class.forName("Class63_Sub2");
			@Pc(63) Constructor local63 = local17.getConstructor(Canvas.class, tq.class, Integer.TYPE, Integer.TYPE, is.class);
			return (Class63) local63.newInstance(arg1, arg3, Integer.valueOf(arg4), new Integer(arg2), arg0);
		} catch (@Pc(96) Exception local96) {
			throw new RuntimeException();
		}
	}
}
