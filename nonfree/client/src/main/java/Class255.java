import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public abstract class Class255 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "[C")
	private static final char[] aCharArray12 = new char[64];

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray12[local4] = (char) (local4 + 65);
		}
		for (@Pc(18) int local18 = 26; local18 < 52; local18++) {
			aCharArray12[local18] = (char) (local18 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray12[local36] = (char) (local36 + 48 - 52);
		}
		aCharArray12[63] = '/';
		aCharArray12[62] = '+';
	}

	@OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
	public abstract void XA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!q", name = "P", descriptor = "(I)V")
	public abstract void P(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
	public abstract void method8168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!q", name = "O", descriptor = "([I)V")
	public abstract void O(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!q", name = "la", descriptor = "(Lclient!q;)V")
	public abstract void la(@OriginalArg(0) Class255 arg0);

	@OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
	public abstract void Y();

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()Lclient!q;")
	public abstract Class255 method8170();

	@OriginalMember(owner = "client!q", name = "R", descriptor = "(III[I)V")
	public abstract void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!q", name = "G", descriptor = "(III)V")
	public abstract void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!q", name = "pa", descriptor = "(IIIIII)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!q", name = "GA", descriptor = "(III)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!q", name = "S", descriptor = "(I)V")
	public abstract void S(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!q", name = "ra", descriptor = "(I)V")
	public abstract void ra(@OriginalArg(0) int arg0);
}
