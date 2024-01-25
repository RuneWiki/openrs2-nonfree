import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!pq", name = "H", descriptor = "I")
	public static int anInt1349;

	@OriginalMember(owner = "client!pq", name = "L", descriptor = "I")
	public static int anInt1352;

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_24 = new Class256("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!pq", name = "B", descriptor = "Z")
	public static boolean aBoolean109 = false;

	@OriginalMember(owner = "client!pq", name = "E", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_23 = new Class81(42, 12);

	@OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
	public static int anInt1350 = 1;

	@OriginalMember(owner = "client!pq", name = "K", descriptor = "I")
	public static int anInt1351 = 0;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!sq;II)V")
	public static void method982(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2_Sub2_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt6469 == arg2 && arg2 != -1) {
			@Pc(88) Class46 local88 = Static9.aClass194_1.method4371(arg2);
			@Pc(91) int local91 = local88.anInt1764;
			if (local91 == 1) {
				arg1.anInt6501 = 1;
				arg1.anInt6517 = arg0;
				arg1.anInt6483 = 0;
				arg1.anInt6513 = 0;
				arg1.anInt6460 = 0;
				Static4.method137(local88, arg1.anInt6483, arg1.anInt7111, arg1.aByte92, arg1.anInt7117, false);
			}
			if (local91 == 2) {
				arg1.anInt6513 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt6469 == -1 || Static9.aClass194_1.method4371(arg2).anInt1767 >= Static9.aClass194_1.method4371(arg1.anInt6469).anInt1767) {
			arg1.anInt6525 = arg1.anInt6524;
			arg1.anInt6513 = 0;
			arg1.anInt6460 = 0;
			arg1.anInt6517 = arg0;
			arg1.anInt6501 = 1;
			arg1.anInt6483 = 0;
			arg1.anInt6469 = arg2;
			if (arg1.anInt6469 != -1) {
				Static4.method137(Static9.aClass194_1.method4371(arg1.anInt6469), arg1.anInt6483, arg1.anInt7111, arg1.aByte92, arg1.anInt7117, false);
			}
		}
	}
}
