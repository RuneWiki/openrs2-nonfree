import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public abstract class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!nu", name = "x", descriptor = "[I")
	public static final int[] anIntArray283;

	@OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
	public int anInt4317;

	@OriginalMember(owner = "client!nu", name = "k", descriptor = "S")
	public short aShort70;

	@OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
	public int anInt4318;

	@OriginalMember(owner = "client!nu", name = "j", descriptor = "Z")
	public final boolean aBoolean374;

	@OriginalMember(owner = "client!nu", name = "p", descriptor = "S")
	public short aShort71;

	@OriginalMember(owner = "client!nu", name = "l", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!nu", name = "w", descriptor = "S")
	public short aShort73;

	@OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
	public int anInt4321;

	@OriginalMember(owner = "client!nu", name = "q", descriptor = "B")
	public byte aByte77;

	@OriginalMember(owner = "client!nu", name = "t", descriptor = "S")
	public short aShort72;

	@OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
	public int anInt4320;

	static {
		new Class189("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
		anIntArray283 = new int[32];
		@Pc(10) int local10 = 2;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			anIntArray283[local12] = local10 - 1;
			local10 += local10;
		}
	}

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort70 = (short) arg7;
		this.anInt4318 = arg1;
		this.aBoolean374 = arg8;
		this.aShort71 = (short) arg4;
		this.aByte76 = arg9;
		this.aShort73 = (short) arg6;
		this.anInt4321 = arg3;
		this.aByte77 = (byte) arg0;
		this.aShort72 = (short) arg5;
		this.anInt4320 = arg2;
	}

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "(B)V")
	public void method3493() {
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)I")
	public abstract int method3494();
}
