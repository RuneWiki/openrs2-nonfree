import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "Lclient!aga;")
	public static Class13 aClass13_33;

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "Z")
	public static final boolean aBoolean736 = false;

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
	public static int anInt9999 = 0;

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(B)V")
	public static void method8369() {
		if (Static207.anInterface14Array1 == null) {
			return;
		}
		@Pc(15) Interface14[] local15 = Static207.anInterface14Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(22) Interface14 local22 = local15[local17];
			local22.method6248();
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZI)Lclient!es;")
	public static Class2_Sub22 method8371(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(16) long local16 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class2_Sub22) Static346.aClass222_22.method5468(local16);
	}
}
