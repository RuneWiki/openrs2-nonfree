import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class116_Sub1 extends Class116 {

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
	private final int anInt3337;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
	private final int anInt3339;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
	private final int anInt3338;

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
	private final int anInt3344;

	static {
		new Class202("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIII)V")
	public Class116_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3337 = arg1;
		this.anInt3339 = arg3;
		this.anInt3338 = arg0;
		this.anInt3344 = arg2;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 * this.anInt3338 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt3344 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt3337 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt3339 >> 12;
		Static491.method6548(local29, super.anInt7706, local15, local36, local22);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(IBI)V")
	@Override
	public void method6467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
