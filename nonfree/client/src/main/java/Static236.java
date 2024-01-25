import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!cu;")
	public static Class45 aClass45_3;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_49 = new Class179(13, 8);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I[Lclient!uq;Z)V")
	public static void method3579(@OriginalArg(0) int arg0, @OriginalArg(1) Class251[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class251 local9 = arg1[local3];
			if (local9 != null && local9.anInt6722 == arg0 && !Static57.method1250(local9)) {
				if (local9.anInt6654 == 0) {
					method3579(local9.anInt6689, arg1);
					if (local9.aClass251Array2 != null) {
						method3579(local9.anInt6689, local9.aClass251Array2);
					}
					@Pc(47) Class1_Sub23 local47 = (Class1_Sub23) Static101.aClass96_16.method2335((long) local9.anInt6689);
					if (local47 != null) {
						Static164.method2646(local47.anInt3059);
					}
				}
				if (local9.anInt6654 == 6 && local9.anInt6699 != -1) {
					@Pc(67) Class223 local67 = Static293.aClass127_1.method2975(local9.anInt6699);
					if (local67 != null) {
						local9.anInt6717 += Static4.anInt115;
						while (local67.anIntArray559[local9.anInt6721] < local9.anInt6717) {
							local9.anInt6717 -= local67.anIntArray559[local9.anInt6721];
							local9.anInt6721++;
							if (local9.anInt6721 >= local67.anIntArray557.length) {
								local9.anInt6721 -= local67.anInt6055;
								if (local9.anInt6721 < 0 || local9.anInt6721 >= local67.anIntArray557.length) {
									local9.anInt6721 = 0;
								}
							}
							local9.anInt6716 = local9.anInt6721 + 1;
							if (local9.anInt6716 >= local67.anIntArray557.length) {
								local9.anInt6716 -= local67.anInt6055;
								if (local9.anInt6716 < 0 || local67.anIntArray557.length <= local9.anInt6716) {
									local9.anInt6716 = -1;
								}
							}
							Static408.method5469(local9);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BZZ)V")
	public static void method3583(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static234.anInt4226--;
			if (Static234.anInt4226 == 0) {
				Static337.anIntArray223 = null;
			}
		}
		if (!arg1) {
			return;
		}
		Static34.anInt716--;
		if (Static34.anInt716 == 0) {
			Static165.anIntArray277 = null;
			return;
		}
	}
}
