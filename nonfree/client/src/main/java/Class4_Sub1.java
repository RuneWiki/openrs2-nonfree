import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!aca", name = "o", descriptor = "[Lclient!sda;")
	public Class4_Sub7[] aClass4_Sub7Array1;

	@OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
	public int anInt163;

	@OriginalMember(owner = "client!aca", name = "s", descriptor = "I")
	public int anInt164;

	@OriginalMember(owner = "client!aca", name = "u", descriptor = "Lclient!va;")
	public Class6 aClass6_1;

	@OriginalMember(owner = "client!aca", name = "w", descriptor = "I")
	public int anInt165;

	static {
		new Class67("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!oa;III)Z")
	public boolean method222(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass4_Sub7Array1 != null) {
			for (@Pc(19) int local19 = 0; local19 < this.aClass4_Sub7Array1.length; local19++) {
				if (this.aClass4_Sub7Array1[local19].method6656(arg2, arg1) && this.aClass6_1.method7744(arg2, arg0, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
