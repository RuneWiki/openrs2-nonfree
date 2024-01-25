import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class58 {

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "B")
	public byte aByte11;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "Lclient!bm;")
	public Interface1 anInterface1_1;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "B")
	public final byte aByte10;

	static {
		new Class84("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!ht;Lclient!bm;III)V")
	public Class58(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShort22 = (short) arg2;
		this.aByte11 = (byte) arg4;
		this.anInterface1_1 = arg1;
		this.aByte10 = (byte) arg3;
	}
}
