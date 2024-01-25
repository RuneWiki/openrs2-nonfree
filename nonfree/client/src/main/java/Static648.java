import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static648 {

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "Z")
	public static boolean aBoolean842;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_78 = new Class293(4);

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_100 = new Class181(18, -1);

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
	public static int anInt10488 = 0;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method8898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static627.aClass5_Sub46_31.aClass11_Sub17_2.method5908() != 0 && arg0 != 0 && Static44.anInt730 < 50 && arg1 != -1) {
			Static113.aClass59Array1[Static44.anInt730++] = new Class59((byte) 2, arg1, arg0, arg5, arg3, arg2, arg4, (Class14_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
	public static void method8902() {
		for (@Pc(8) int local8 = 0; local8 < Static480.aByteArrayArrayArray19.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static480.aByteArrayArrayArray19[0].length; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static480.aByteArrayArrayArray19[0][0].length; local16++) {
					Static480.aByteArrayArrayArray19[local8][local12][local16] = 0;
				}
			}
		}
	}
}
