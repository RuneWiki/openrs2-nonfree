import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class68 {

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "Z")
	public final boolean aBoolean108;

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "B")
	public final byte aByte24;

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "B")
	public final byte aByte23;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "S")
	public final short aShort23;

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "S")
	public final short aShort24;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
	public final int anInt1447;

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
	public final int anInt1450;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aBoolean108 = arg9;
		this.aByte24 = (byte) arg7;
		this.aByte23 = (byte) arg8;
		this.aShort23 = (short) arg5;
		this.aShort24 = (short) arg6;
		this.aShort22 = (short) arg4;
		this.anInt1447 = arg0;
		this.anInt1450 = arg10;
	}
}
