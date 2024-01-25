import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public final class Class3_Sub4_Sub13 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ip", name = "H", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!ip", name = "D", descriptor = "J")
	public final long aLong136;

	@OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
	public final int anInt4574;

	@OriginalMember(owner = "client!ip", name = "G", descriptor = "I")
	public final int anInt4579;

	@OriginalMember(owner = "client!ip", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString55;

	@OriginalMember(owner = "client!ip", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString54;

	@OriginalMember(owner = "client!ip", name = "E", descriptor = "Z")
	public final boolean aBoolean308;

	@OriginalMember(owner = "client!ip", name = "A", descriptor = "Z")
	public final boolean aBoolean307;

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
	public final int anInt4575;

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
	public final int anInt4576;

	@OriginalMember(owner = "client!ip", name = "r", descriptor = "Z")
	public final boolean aBoolean306;

	@OriginalMember(owner = "client!ip", name = "z", descriptor = "J")
	public final long aLong135;

	@OriginalMember(owner = "client!ip", name = "y", descriptor = "I")
	public int anInt4577;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class3_Sub4_Sub13(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aLong136 = arg5;
		this.anInt4574 = arg6;
		this.anInt4579 = arg7;
		this.aString55 = arg1;
		this.aString54 = arg0;
		this.aBoolean308 = arg11;
		this.aBoolean307 = arg9;
		this.anInt4575 = arg4;
		this.anInt4576 = arg2;
		this.aBoolean306 = arg8;
		this.aLong135 = arg10;
		this.anInt4577 = arg3;
	}
}
