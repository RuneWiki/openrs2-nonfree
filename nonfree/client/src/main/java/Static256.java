import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jda", name = "z", descriptor = "I")
	public static int anInt5669;

	@OriginalMember(owner = "client!jda", name = "C", descriptor = "I")
	public static int anInt5671;

	@OriginalMember(owner = "client!jda", name = "G", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IILclient!kha;I)Lclient!tba;")
	public static Class315 method4821(@OriginalArg(1) int arg0, @OriginalArg(2) Class181 arg1) {
		@Pc(18) byte[] local18 = arg1.method5023(arg0, 0);
		return local18 == null ? null : new Class315(local18);
	}
}
