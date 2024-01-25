import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class35 {

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "S")
	public final short aShort15;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
	public final int anInt813;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "S")
	public final short aShort13;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	public final int anInt812;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "S")
	public final short aShort14;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "B")
	public final byte aByte7;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "Z")
	public final boolean aBoolean91;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	public final int anInt810;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
	public final int anInt809;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	public final int anInt811;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "B")
	public final byte aByte6;

	static {
		new Class119("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort15 = (short) arg6;
		this.anInt813 = arg0;
		this.aShort13 = (short) arg5;
		this.anInt812 = arg1;
		this.aShort14 = (short) arg4;
		this.aByte7 = (byte) arg8;
		this.aBoolean91 = arg10;
		this.anInt810 = arg11;
		this.anInt809 = arg3;
		this.anInt811 = arg2;
		this.aByte6 = (byte) arg7;
	}
}
