import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public abstract class Class25_Sub5 extends Class25 {

	@OriginalMember(owner = "client!ns", name = "t", descriptor = "I")
	public int anInt5513;

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "S")
	public short aShort95;

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "I")
	public int anInt5514;

	@OriginalMember(owner = "client!ns", name = "u", descriptor = "Z")
	public final boolean aBoolean625;

	@OriginalMember(owner = "client!ns", name = "w", descriptor = "B")
	public byte aByte94;

	@OriginalMember(owner = "client!ns", name = "B", descriptor = "I")
	public int anInt5517;

	@OriginalMember(owner = "client!ns", name = "y", descriptor = "S")
	public short aShort96;

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "S")
	public short aShort94;

	@OriginalMember(owner = "client!ns", name = "C", descriptor = "B")
	public final byte aByte95;

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!ns", name = "F", descriptor = "I")
	public int anInt5518;

	static {
		new Class119("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class25_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort95 = (short) arg7;
		this.anInt5514 = arg3;
		this.aBoolean625 = arg8;
		this.aByte94 = (byte) arg0;
		this.anInt5517 = arg2;
		this.aShort96 = (short) arg5;
		this.aShort94 = (short) arg6;
		this.aByte95 = arg9;
		this.aShort97 = (short) arg4;
		this.anInt5518 = arg1;
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)I")
	public abstract int method4341();

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "(B)V")
	public void method4343() {
	}
}
