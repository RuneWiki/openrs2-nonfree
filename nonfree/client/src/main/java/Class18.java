import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public abstract class Class18 {

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "[C")
	private static final char[] aCharArray9 = new char[64];

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
	public final int anInt3587;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
	protected final int anInt3582;

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "I")
	public final int anInt3585;

	static {
		for (@Pc(12) int local12 = 0; local12 < 26; local12++) {
			aCharArray9[local12] = (char) (local12 + 65);
		}
		for (@Pc(26) int local26 = 26; local26 < 52; local26++) {
			aCharArray9[local26] = (char) (local26 + 71);
		}
		for (@Pc(42) int local42 = 52; local42 < 62; local42++) {
			aCharArray9[local42] = (char) (local42 + 48 - 52);
		}
		aCharArray9[63] = '/';
		aCharArray9[62] = '+';
	}

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(III)V")
	protected Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3587 = arg0;
		this.anInt3582 = arg2;
		this.anInt3585 = arg1;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIB)V")
	public abstract void method3073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(III)V")
	public abstract void method3075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(III)V")
	public abstract void method3076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
