import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	public static int anInt4302;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_11 = new Class143(0, 4);

	@OriginalMember(owner = "client!md", name = "c", descriptor = "I")
	public static int anInt4298 = 0;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_142 = new Class221(15, 8);

	@OriginalMember(owner = "client!md", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[200];

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_22 = new Class107(64);

	@OriginalMember(owner = "client!md", name = "k", descriptor = "I")
	public static int anInt4303 = -1;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!jk;")
	public static final Class2_Sub12_Sub2 aClass2_Sub12_Sub2_2 = new Class2_Sub12_Sub2(5000);

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Z")
	public static boolean aBoolean358 = false;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BC)Z")
	public static boolean method3640(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static287.aCharArray6;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(42) char local42 = local34[local36];
				if (arg0 == local42) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V")
	public static void method3641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		aClass2_Sub12_Sub2_2.anInt3606 = 0;
		aClass2_Sub12_Sub2_2.method3147(Static217.aClass69_6.anInt1946);
		aClass2_Sub12_Sub2_2.method3147(arg1);
		aClass2_Sub12_Sub2_2.method3147(arg2);
		aClass2_Sub12_Sub2_2.method3158(arg0);
		aClass2_Sub12_Sub2_2.method3158(arg3);
		Static353.anInt5914 = 0;
		Static328.anInt6688 = 1;
		Static91.anInt1783 = -3;
		Static168.anInt3817 = 0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method3642() {
		if (Static96.aBoolean178) {
			return;
		}
		if (Static311.aBoolean549) {
			Static99.aFloat33 = (int) Static99.aFloat33 - 17 & 0xFFFFFFF0;
		} else {
			Static90.aFloat32 += (-Static90.aFloat32 - 12.0F) / 2.0F;
		}
		Static96.aBoolean178 = true;
		Static273.aBoolean493 = true;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIB)V")
	public static void method3643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static17.anInt277 == 0 || arg3 == 0 || Static191.anInt4213 >= 50 || arg1 == -1) {
			return;
		}
		Static300.anIntArray461[Static191.anInt4213] = arg1;
		Static236.anIntArray88[Static191.anInt4213] = arg3;
		Static186.anIntArray310[Static191.anInt4213] = arg2;
		Static226.aClass135Array1[Static191.anInt4213] = null;
		Static312.anIntArray478[Static191.anInt4213] = 0;
		Static241.anIntArray398[Static191.anInt4213] = arg0;
		Static191.anInt4213++;
	}
}
