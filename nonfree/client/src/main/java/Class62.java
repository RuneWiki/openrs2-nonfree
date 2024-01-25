import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public abstract class Class62 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "[C")
	private static final char[] aCharArray12 = new char[64];

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	public final int anInt8330;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	protected final int anInt8329;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "I")
	public final int anInt8333;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray12[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray12[local20] = (char) (local20 + 71);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray12[local36] = (char) (local36 + 48 - 52);
		}
		aCharArray12[62] = '*';
		aCharArray12[63] = '-';
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(III)V")
	protected Class62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8330 = arg1;
		this.anInt8329 = arg2;
		this.anInt8333 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	public abstract void method6729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(III)V")
	public abstract void method6731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IBI)V")
	public abstract void method6732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
