import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!wn", name = "z", descriptor = "Lclient!kha;")
	public static Class181 aClass181_133;

	@OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
	public static int anInt10496 = 0;

	@OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
	public static int anInt10498 = -1;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)Lclient!td;")
	public static Class2_Sub3_Sub2 method8624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static170.aClass106ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub3_Sub2_2;
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)V")
	public static void method8629() {
		Static268.aClass112_33.method3638();
	}
}
