import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public final class Class48 {

	@OriginalMember(owner = "client!cfa", name = "i", descriptor = "B")
	public final byte aByte33;

	@OriginalMember(owner = "client!cfa", name = "j", descriptor = "S")
	public final short aShort19;

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "I")
	public final int anInt1333;

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
	public final int anInt1331;

	@OriginalMember(owner = "client!cfa", name = "h", descriptor = "Z")
	public final boolean aBoolean85;

	@OriginalMember(owner = "client!cfa", name = "l", descriptor = "S")
	public final short aShort20;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
	public final int anInt1330;

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
	public final int anInt1334;

	@OriginalMember(owner = "client!cfa", name = "g", descriptor = "S")
	public final short aShort18;

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
	public final int anInt1335;

	static {
		new Class379("", 76);
	}

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte33 = (byte) arg8;
		this.aShort19 = (short) arg6;
		this.anInt1333 = arg1;
		this.anInt1331 = arg3;
		this.aBoolean85 = arg10;
		this.aShort20 = (short) arg4;
		this.anInt1330 = arg0;
		this.anInt1334 = arg2;
		this.aShort18 = (short) arg5;
		this.anInt1335 = arg11;
	}
}
