import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
	public static int[] anIntArray75;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!ie;")
	public static Class35 aClass35_5;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	public static int anInt730 = 0;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Lclient!id;")
	public static Class34 aClass34_357 = Static9.method266("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method436(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static27.method546(local18) : local18;
		} else if (arg1 instanceof Class65) {
			@Pc(32) Class65 local32 = (Class65) arg1;
			return local32.method1679();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[Lclient!fd;)V")
	public static void method437(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub9[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class1_Sub9 local9 = arg1[local3];
			if (local9 != null) {
				if (local9.anInt1013 == 0) {
					if (local9.aClass1_Sub9Array2 != null) {
						method437(arg0, local9.aClass1_Sub9Array2);
					}
					@Pc(33) Class1_Sub16 local33 = (Class1_Sub16) Static35.aClass48_5.method1340((long) local9.anInt1050);
					if (local33 != null) {
						Static14.method348(local33.anInt1893, arg0);
					}
				}
				@Pc(52) Class1_Sub5 local52;
				if (arg0 == 0 && local9.anObjectArray19 != null) {
					local52 = new Class1_Sub5();
					local52.aClass1_Sub9_3 = local9;
					local52.anObjectArray1 = local9.anObjectArray19;
					Static56.method1567(local52);
				}
				if (arg0 == 1 && local9.anObjectArray24 != null) {
					local52 = new Class1_Sub5();
					local52.anObjectArray1 = local9.anObjectArray24;
					local52.aClass1_Sub9_3 = local9;
					Static56.method1567(local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	public static void method439() {
		aClass35_5 = null;
		aClass34_357 = null;
		anIntArray75 = null;
	}
}
