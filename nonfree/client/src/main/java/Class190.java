import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class190 {

	@OriginalMember(owner = "client!og", name = "e", descriptor = "B")
	public final byte aByte77;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Lclient!lc;")
	public Interface9 anInterface9_3;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "S")
	public final short aShort69;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "B")
	public byte aByte76;

	static {
		new Class43("", 76);
		new Class15("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!lc;III)V")
	public Class190(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte77 = (byte) arg2;
		this.anInterface9_3 = arg0;
		this.aShort69 = (short) arg1;
		this.aByte76 = (byte) arg3;
	}
}
