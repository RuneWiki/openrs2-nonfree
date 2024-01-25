import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "Lclient!o;")
	public static final Class169 aClass169_341 = new Class169(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "[Lclient!vm;")
	public static final Class69[] aClass69Array1 = new Class69[128];

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!ui;IZ)Lclient!fo;")
	public static Class1_Sub6_Sub4 method5526(@OriginalArg(0) int arg0, @OriginalArg(1) Class230 arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class1_Sub33 local14 = new Class1_Sub33(arg1.method4985(arg0, arg2));
		@Pc(45) Class1_Sub6_Sub4 local45 = new Class1_Sub6_Sub4(arg0, local14.method5128(), local14.method5128(), local14.method5150(), local14.method5150(), local14.method5174() == 1, local14.method5174(), local14.method5174());
		@Pc(49) int local49 = local14.method5174();
		for (@Pc(56) int local56 = 0; local56 < local49; local56++) {
			local45.aClass17_15.method199(new Class1_Sub19(local14.method5174(), local14.method5177(), local14.method5177(), local14.method5177(), local14.method5177(), local14.method5177(), local14.method5177(), local14.method5177(), local14.method5177()));
		}
		local45.method1494();
		return local45;
	}
}
