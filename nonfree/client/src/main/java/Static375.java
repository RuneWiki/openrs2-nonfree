import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!mo", name = "Q", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
	public static int anInt6448;

	@OriginalMember(owner = "client!mo", name = "ub", descriptor = "Lclient!kia;")
	public static final Class201 aClass201_7 = new Class201("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!mo", name = "Y", descriptor = "Lclient!el;")
	public static final Class109 aClass109_131 = new Class109(69, -1);

	@OriginalMember(owner = "client!mo", name = "jb", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5507(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local32++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				@Pc(72) char local72 = Static194.aCharArray2[(int) (local58 - arg0 * 37L)];
				if (local72 == '_') {
					@Pc(80) int local80 = local52.length() - 1;
					local72 = ' ';
					local52.setCharAt(local80, Character.toUpperCase(local52.charAt(local80)));
				}
				local52.append(local72);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([II[I)V")
	public static void method5509(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static168.anIntArray151 = null;
			Static127.aByteArrayArrayArray1 = null;
			Static670.anIntArray619 = null;
			return;
		}
		Static670.anIntArray619 = arg1;
		Static168.anIntArray151 = new int[arg1.length];
		Static127.aByteArrayArrayArray1 = new byte[arg1.length][][];
		for (@Pc(39) int local39 = 0; local39 < Static670.anIntArray619.length; local39++) {
			Static127.aByteArrayArrayArray1[local39] = new byte[arg0[local39]][];
		}
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(B)I")
	public static int method5510() {
		return Static659.anInt10597 == 1 ? Static136.anInt2254 : 0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!ib;I)V")
	public static void method5511(@OriginalArg(0) Class5_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aByteArray102.length - arg0.anInt9869 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method8529();
		if (local20 < 0 || local20 > 1 || arg0.aByteArray102.length - arg0.anInt9869 < 2) {
			return;
		}
		@Pc(46) int local46 = arg0.method8519();
		if (local46 * 6 > arg0.aByteArray102.length - arg0.anInt9869) {
			return;
		}
		for (@Pc(60) int local60 = 0; local60 < local46; local60++) {
			@Pc(68) int local68 = arg0.method8519();
			@Pc(72) int local72 = arg0.method8527();
			if (Static21.anIntArray24.length > local68 && Static433.aBooleanArray17[local68] && (Static545.aClass344_1.method8615(local68).aChar1 != '1' || local72 >= -1 && local72 <= 1)) {
				Static21.anIntArray24[local68] = local72;
			}
		}
		if (arg1 <= 17) {
			method5511((Class5_Sub23) null, 79);
		}
	}
}
