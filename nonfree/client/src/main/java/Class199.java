import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public final class Class199 {

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "S")
	public final short aShort62;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
	public final int anInt4939;

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
	public final int anInt4937;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "Z")
	public final boolean aBoolean404;

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "S")
	public final short aShort61;

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "S")
	public final short aShort60;

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort62 = (short) arg6;
		this.aByte76 = (byte) arg8;
		this.anInt4939 = arg0;
		this.anInt4937 = arg10;
		this.aBoolean404 = arg9;
		this.aShort61 = (short) arg5;
		this.aShort60 = (short) arg4;
		this.aByte75 = (byte) arg7;
	}
}
