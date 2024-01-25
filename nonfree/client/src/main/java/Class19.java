import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class19 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "B")
	public byte aByte6;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "B")
	public final byte aByte7;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!ip;")
	public Interface6 anInterface6_1;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "S")
	public final short aShort9;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!ql;Lclient!ip;III)V")
	public Class19(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aByte6 = (byte) arg4;
		this.aByte7 = (byte) arg3;
		this.anInterface6_1 = arg1;
		this.aShort9 = (short) arg2;
	}
}
