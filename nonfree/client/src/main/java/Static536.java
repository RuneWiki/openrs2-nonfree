import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!un", name = "K", descriptor = "I")
	public static int anInt8597;

	@OriginalMember(owner = "client!un", name = "C", descriptor = "I")
	public static int anInt8590 = 1;

	@OriginalMember(owner = "client!un", name = "J", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_167 = new Class56(111, 20);

	@OriginalMember(owner = "client!un", name = "L", descriptor = "[I")
	public static final int[] anIntArray565 = new int[14];

	@OriginalMember(owner = "client!un", name = "N", descriptor = "[I")
	public static final int[] anIntArray566 = new int[13];

	@OriginalMember(owner = "client!un", name = "O", descriptor = "Lclient!jd;")
	public static final Class158 aClass158_6 = new Class158();

	@OriginalMember(owner = "client!un", name = "P", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_62 = new Class6(4);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)I")
	public static int method7151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static503.aByteArrayArrayArray11[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static503.aByteArrayArrayArray11[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IZ)Z")
	public static boolean method7152(@OriginalArg(0) int arg0) {
		Static106.anInt2143 = arg0 + 1 & 0xFFFF;
		Static410.aBoolean528 = true;
		return true;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Component;Z)Lclient!wi;")
	public static Class195 method7153(@OriginalArg(0) Component arg0) {
		return new Class195_Sub1(arg0);
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)Lclient!pj;")
	public static Class41_Sub5 method7154() {
		@Pc(8) Class41_Sub5 local8 = (Class41_Sub5) Static267.aClass178_10.method4161();
		if (local8 == null) {
			return new Class41_Sub5();
		} else {
			Static444.anInt7423--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(II)I")
	public static int method7155(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
