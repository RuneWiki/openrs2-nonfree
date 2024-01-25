import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class24 {

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
	public final int anInt595;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "B")
	public final byte aByte5;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "S")
	public final short aShort11;

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "S")
	public final short aShort12;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
	public final int anInt596;

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
	public final int anInt593;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "B")
	public final byte aByte6;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "S")
	public final short aShort10;

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
	public final int anInt600;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "Z")
	public final boolean aBoolean33;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
	public final int anInt599;

	static {
		new Class174("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt595 = arg3;
		this.aByte5 = (byte) arg7;
		this.aShort11 = (short) arg4;
		this.aShort12 = (short) arg6;
		this.anInt596 = arg2;
		this.anInt593 = arg11;
		this.aByte6 = (byte) arg8;
		this.aShort10 = (short) arg5;
		this.anInt600 = arg0;
		this.aBoolean33 = arg10;
		this.anInt599 = arg1;
	}
}
