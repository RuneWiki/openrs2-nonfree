import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!ht;")
	public static Class112 aClass112_3;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Z")
	public static volatile boolean aBoolean126 = false;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_18 = new Class242(30, 3);

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_15 = new Class142("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	public static final int anInt1014 = -1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!za;IZIILclient!la;I)V")
	public static void method882(@OriginalArg(0) Class117 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5) {
		if (arg1) {
			Static42.aClass85_5.method5406((Static192.anInt3532 - Static42.aClass85_5.RA()) / 2, (Static40.anInt597 - Static42.aClass85_5.Q()) / 2);
			Static40.aClass85_1.method5406((Static192.anInt3532 - Static40.aClass85_1.RA()) / 2, 18);
		}
		@Pc(30) String local30 = "";
		if (Static94.aClass148_3 == Static59.aClass148_1) {
			local30 = Static404.aClass142_102.method3118(Static63.anInt981);
		} else if (Static93.aClass148_2 == Static94.aClass148_3) {
			local30 = Static374.aClass142_95.method3118(Static63.anInt981);
		}
		arg4.method4586(local30, arg3, -1, Static40.anInt597 / 2 - 26, Static192.anInt3532 / 2);
		@Pc(68) int local68 = Static40.anInt597 / 2 - 18;
		arg0.method5690(Static192.anInt3532 / 2 - 152, local68, 304, 34, arg5, 0);
		arg0.method5690(Static192.anInt3532 / 2 - 151, local68 + 1, 302, 32, 0, 0);
		arg0.P(Static192.anInt3532 / 2 - 150, local68 - -2, Static2.anInt33 * 3, 30, arg2, 0);
		arg0.P(Static2.anInt33 * 3 + Static192.anInt3532 / 2 - 150, local68 + 2, 300 - Static2.anInt33 * 3, 30, 0, 0);
		arg4.method4586(Static148.aString20, arg3, -1, Static40.anInt597 / 2 + 4, Static192.anInt3532 / 2);
	}
}
