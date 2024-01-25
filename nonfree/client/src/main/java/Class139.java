import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class139 {

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "S")
	public final short aShort50;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "S")
	public final short aShort49;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "B")
	public final byte aByte46;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "S")
	public final short aShort51;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	public final int anInt4062;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "Z")
	public final boolean aBoolean328;

	static {
		new Class256("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort50 = (short) arg4;
		this.aByte47 = (byte) arg7;
		this.aShort49 = (short) arg5;
		this.aByte46 = (byte) arg8;
		this.aShort51 = (short) arg6;
		this.anInt4062 = arg0;
		this.aBoolean328 = arg9;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIII)Lclient!kn;")
	public Class139 method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class139(arg2, arg0, arg3, arg1, this.aShort50, this.aShort49, this.aShort51, this.aByte47, this.aByte46, this.aBoolean328);
	}
}
