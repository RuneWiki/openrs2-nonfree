import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
	public static int anInt8253;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
	public static int anInt8252 = 999999;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
	public static int anInt8264 = 0;

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "[I")
	public static final int[] anIntArray413 = new int[2];

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)Z")
	public static boolean method7372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!ow;ILclient!ha;)V")
	public static void method7374(@OriginalArg(2) Class271 arg0, @OriginalArg(4) Class101 arg1) {
		Class15_Sub3_Sub3_Sub2.lb.method7181();
		if (Static549.aBoolean709) {
			return;
		}
		for (@Pc(23) Class2_Sub33 local23 = (Class2_Sub33) arg0.method7177(); local23 != null; local23 = (Class2_Sub33) arg0.method7175()) {
			@Pc(31) Class218 local31 = Static331.aClass5_4.method94(local23.anInt5215);
			if (Static385.method6487(local31)) {
				@Pc(43) boolean local43 = Static632.method9342(arg1, local31, local23);
				if (local43) {
					Static531.method8226(local23, arg1, local31);
				}
			}
		}
	}
}
