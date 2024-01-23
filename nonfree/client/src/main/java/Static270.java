import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "Lclient!ug;")
	public static Class1_Sub2_Sub14 aClass1_Sub2_Sub14_10;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "Z")
	public static boolean aBoolean308;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
	public static int anInt5838 = -1;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "Z")
	public static boolean aBoolean307 = false;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
	public static int anInt5840 = 0;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
	public static int anInt5841 = 5063219;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
	public static int anInt5842 = 0;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!gn;IZII)Ljava/awt/Frame;")
	public static Frame method4536(@OriginalArg(1) Class66 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method1610()) {
			return null;
		}
		@Pc(19) Class33[] local19 = Static290.method4732(arg0);
		if (local19 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local19.length; local28++) {
			if (local19[local28].anInt1166 == arg1 && arg3 == local19[local28].anInt1158 && (!local26 || local19[local28].anInt1165 > arg2)) {
				local26 = true;
				arg2 = local19[local28].anInt1165;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(108) Class43 local108 = arg0.method1622(arg3, arg2, arg1);
		while (local108.anInt1456 == 0) {
			Static230.method4022(10L);
		}
		@Pc(121) Frame local121 = (Frame) local108.anObject3;
		if (local121 == null) {
			return null;
		} else if (local108.anInt1456 == 2) {
			Static13.method289(local121, arg0);
			return null;
		} else {
			return local121;
		}
	}
}
