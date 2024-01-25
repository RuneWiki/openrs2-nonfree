import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
	public static int anInt2790;

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "[Lclient!ak;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_53 = new Class83("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)Lclient!rb;")
	public static Class16_Sub5 method2344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static202.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass16_Sub5_2;
	}
}
