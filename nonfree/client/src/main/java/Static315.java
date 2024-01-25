import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!kka", name = "A", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_119 = new Class180(114, 4);

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(II[Lclient!or;)V")
	public static void method4810(@OriginalArg(1) int arg0, @OriginalArg(2) Class260[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) Class260 local14 = arg1[local8];
			if (local14 != null) {
				if (local14.anInt7003 == 0) {
					if (local14.aClass260Array2 != null) {
						method4810(arg0, local14.aClass260Array2);
					}
					@Pc(35) Class3_Sub46 local35 = (Class3_Sub46) Static455.aClass83_31.method2368((long) local14.anInt6930);
					if (local35 != null) {
						Static610.method8667(arg0, local35.anInt7855);
					}
				}
				@Pc(54) Class3_Sub17 local54;
				if (arg0 == 0 && local14.anObjectArray33 != null) {
					local54 = new Class3_Sub17();
					local54.aClass260_6 = local14;
					local54.anObjectArray2 = local14.anObjectArray33;
					Static565.method8015(local54);
				}
				if (arg0 == 1 && local14.anObjectArray4 != null) {
					if (local14.anInt6985 >= 0) {
						@Pc(79) Class260 local79 = Static383.method5492(local14.anInt6930);
						if (local79 == null || local79.aClass260Array2 == null || local14.anInt6985 >= local79.aClass260Array2.length || local79.aClass260Array2[local14.anInt6985] != local14) {
							continue;
						}
					}
					local54 = new Class3_Sub17();
					local54.anObjectArray2 = local14.anObjectArray4;
					local54.aClass260_6 = local14;
					Static565.method8015(local54);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(BLclient!aj;)V")
	public static void method4813(@OriginalArg(1) Class15 arg0) {
		Static219.anInt4171 = 0;
		Static206.anInt3947 = 0;
		Static544.aClass371_6 = new Class371();
		Static293.aClass28_Sub4_Sub2_Sub1Array1 = new Class28_Sub4_Sub2_Sub1[1024];
		Static208.aClass28_Sub7Array1 = new Class28_Sub7[Static292.anIntArray444[Static351.anInt5714] + 1];
		Static449.anInt7433 = 0;
		Static198.anInt10720 = 0;
		Static492.method7092(arg0);
		Static515.method7255(arg0);
	}
}
