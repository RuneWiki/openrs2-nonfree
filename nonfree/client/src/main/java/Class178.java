import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public final class Class178 {

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
	public final int anInt5092;

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "I")
	public final int anInt5097;

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "I")
	public final int anInt5096;

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "I")
	public final int anInt5094;

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "B")
	public final byte aByte65;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "S")
	public final short aShort84;

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
	public final int anInt5093;

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "S")
	public final short aShort86;

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "S")
	public final short aShort85;

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "Z")
	public final boolean aBoolean361;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt5092 = arg2;
		this.anInt5097 = arg0;
		this.anInt5096 = arg11;
		this.anInt5094 = arg1;
		this.aByte65 = (byte) arg8;
		this.aShort84 = (short) arg5;
		this.anInt5093 = arg3;
		this.aShort86 = (short) arg4;
		this.aShort85 = (short) arg6;
		this.aBoolean361 = arg10;
	}
}
