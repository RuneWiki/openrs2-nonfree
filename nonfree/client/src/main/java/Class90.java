import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public final class Class90 {

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "B")
	public final byte aByte45;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "S")
	public final short aShort39;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
	public final int anInt2182;

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "Z")
	public final boolean aBoolean149;

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
	public final int anInt2185;

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "S")
	public final short aShort40;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "S")
	public final short aShort38;

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
	public final int anInt2186;

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
	public final int anInt2187;

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "B")
	public final byte aByte46;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
	public final int anInt2184;

	static {
		new Class15("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte45 = (byte) arg7;
		this.aShort39 = (short) arg4;
		this.anInt2182 = arg0;
		this.aBoolean149 = arg10;
		this.anInt2185 = arg11;
		this.aShort40 = (short) arg5;
		this.aShort38 = (short) arg6;
		this.anInt2186 = arg2;
		this.anInt2187 = arg3;
		this.aByte46 = (byte) arg8;
		this.anInt2184 = arg1;
	}
}
