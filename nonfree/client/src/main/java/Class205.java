import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class205 {

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
	public final int anInt5982;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	public final int anInt5980;

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
	public final int anInt5977;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
	public final int anInt5981;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "S")
	public final short aShort80;

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
	public final int anInt5978;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "S")
	public final short aShort79;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "S")
	public final short aShort81;

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "Z")
	public final boolean aBoolean453;

	static {
		new Class88("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt5982 = arg11;
		this.anInt5980 = arg0;
		this.aByte75 = (byte) arg8;
		this.anInt5977 = arg2;
		this.anInt5981 = arg1;
		this.aShort80 = (short) arg5;
		this.aByte74 = (byte) arg7;
		this.anInt5978 = arg3;
		this.aShort79 = (short) arg4;
		this.aShort81 = (short) arg6;
		this.aBoolean453 = arg10;
	}
}
