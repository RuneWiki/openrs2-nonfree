import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class221 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "S")
	public final short aShort72;

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "B")
	public final byte aByte82;

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "S")
	public final short aShort74;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "S")
	public final short aShort73;

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
	public final int anInt6211;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
	public final int anInt6216;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "B")
	public final byte aByte81;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
	public final int anInt6215;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "Z")
	public final boolean aBoolean513;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
	public final int anInt6213;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
	public final int anInt6217;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort72 = (short) arg4;
		this.aByte82 = (byte) arg7;
		this.aShort74 = (short) arg5;
		this.aShort73 = (short) arg6;
		this.anInt6211 = arg3;
		this.anInt6216 = arg1;
		this.aByte81 = (byte) arg8;
		this.anInt6215 = arg0;
		this.aBoolean513 = arg10;
		this.anInt6213 = arg11;
		this.anInt6217 = arg2;
	}
}
