import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!ur;")
	public static Class252 aClass252_1;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_145 = new Class7("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_88 = new Class179(24, 8);

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method5429() {
		Static244.aClass1_Sub19_Sub4_2.method3664();
		Static390.anInt6278 = 1;
		Static157.aClass246_114 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Lclient!rp;")
	public static Class31_Sub5 method5430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class80 local7 = client.lb[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class31_Sub5 local14 = local7.aClass31_Sub5_1;
			local7.aClass31_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!hp;I)Lclient!cv;")
	public static Class46 method5432(@OriginalArg(0) Class1_Sub5 arg0) {
		@Pc(7) Class46 local7 = new Class46();
		local7.anInt1509 = arg0.method5362();
		local7.aClass1_Sub2_Sub17_1 = Static189.aClass156_1.method3582(local7.anInt1509);
		return local7;
	}
}
