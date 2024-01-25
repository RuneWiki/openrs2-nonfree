import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class35 {

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "S")
	public final short aShort11;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "S")
	public final short aShort12;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "B")
	public final byte aByte27;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "S")
	public final short aShort10;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
	public final int anInt922;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "B")
	public final byte aByte26;

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "Z")
	public final boolean aBoolean74;

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
	public final int anInt921;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort11 = (short) arg5;
		this.aShort12 = (short) arg6;
		this.aByte27 = (byte) arg8;
		this.aShort10 = (short) arg4;
		this.anInt922 = arg10;
		this.aByte26 = (byte) arg7;
		this.aBoolean74 = arg9;
		this.anInt921 = arg0;
	}
}
