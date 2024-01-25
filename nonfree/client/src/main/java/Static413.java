import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!up", name = "e", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_92 = new Class179(15, 8);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Lclient!os;")
	public static Class186 method5637(@OriginalArg(0) int arg0) {
		@Pc(15) Class186[] local15 = Static445.method5857();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(22) Class186 local22 = local15[local17];
			if (local22.anInt5130 == arg0) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)Lclient!go;")
	public static Class91_Sub1 method5642() {
		return Static260.aClass91_Sub1Array1.length > Static447.anInt7175 ? Static260.aClass91_Sub1Array1[Static447.anInt7175++] : null;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ul;Ljava/lang/String;ZI)Lclient!cu;")
	public static Class45 method5643(@OriginalArg(0) Class246 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) int local10 = arg0.method5478(arg1);
		if (local10 == -1) {
			return new Class45(0);
		}
		@Pc(25) int[] local25 = arg0.method5481(local10);
		@Pc(31) Class45 local31 = new Class45(local25.length);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		while (true) {
			while (local33 < local31.anInt1505) {
				@Pc(48) Class1_Sub5 local48 = new Class1_Sub5(arg0.method5477(local10, local25[local35++]));
				@Pc(52) int local52 = local48.method5407();
				@Pc(56) int local56 = local48.method5362();
				@Pc(60) int local60 = local48.method5366();
				if (!arg2 && local60 == 1) {
					local31.anInt1505--;
				} else {
					local31.anIntArray102[local33] = local52;
					local31.anIntArray103[local33] = local56;
					local33++;
				}
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!uq;III)V")
	public static void method5646(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static39.anInt790 = arg1;
		Static153.aClass251_3 = arg0;
		Static121.anInt2468 = arg2;
	}
}
