import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "Lclient!o;")
	public static final Class169 aClass169_117 = new Class169("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!hc", name = "N", descriptor = "Z")
	public static final boolean aBoolean205 = false;

	@OriginalMember(owner = "client!hc", name = "O", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_78 = new Class48(60, 15);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ng;I)[Lclient!v;")
	public static Class234[] method1937(@OriginalArg(0) Class162 arg0) {
		if (!arg0.method3272()) {
			return new Class234[0];
		}
		@Pc(16) Class112 local16 = arg0.method3276();
		while (local16.anInt2969 == 0) {
			Static57.method5056(10L);
		}
		if (local16.anInt2969 == 2) {
			return new Class234[0];
		}
		@Pc(44) int[] local44 = (int[]) local16.anObject5;
		@Pc(50) Class234[] local50 = new Class234[local44.length >> 2];
		for (@Pc(52) int local52 = 0; local52 < local50.length; local52++) {
			@Pc(58) Class234 local58 = new Class234();
			local50[local52] = local58;
			local58.anInt5871 = local44[local52 << 2];
			local58.anInt5874 = local44[(local52 << 2) + 1];
			local58.anInt5875 = local44[(local52 << 2) + 2];
			local58.anInt5872 = local44[(local52 << 2) + 3];
		}
		return local50;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!cp;Ljava/awt/Canvas;ZI)Lclient!tq;")
	public static Class164 method1939(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2) {
		return new Class164_Sub2(arg1, arg0, arg2);
	}
}
