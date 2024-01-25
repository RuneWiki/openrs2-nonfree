import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!et", name = "x", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!et", name = "E", descriptor = "I")
	public final int anInt3482;

	@OriginalMember(owner = "client!et", name = "F", descriptor = "I")
	public final int anInt3483;

	@OriginalMember(owner = "client!et", name = "G", descriptor = "J")
	public final long aLong73;

	@OriginalMember(owner = "client!et", name = "t", descriptor = "I")
	public final int anInt3478;

	@OriginalMember(owner = "client!et", name = "u", descriptor = "Z")
	public final boolean aBoolean286;

	@OriginalMember(owner = "client!et", name = "J", descriptor = "I")
	public int anInt3485;

	@OriginalMember(owner = "client!et", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString27;

	@OriginalMember(owner = "client!et", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString28;

	@OriginalMember(owner = "client!et", name = "L", descriptor = "I")
	public final int anInt3487;

	@OriginalMember(owner = "client!et", name = "B", descriptor = "Z")
	public final boolean aBoolean287;

	@OriginalMember(owner = "client!et", name = "M", descriptor = "J")
	public final long aLong74;

	@OriginalMember(owner = "client!et", name = "C", descriptor = "Z")
	public final boolean aBoolean288;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class3_Sub1_Sub4(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.anInt3482 = arg4;
		this.anInt3483 = arg7;
		this.aLong73 = arg10;
		this.anInt3478 = arg2;
		this.aBoolean286 = arg8;
		this.anInt3485 = arg3;
		this.aString27 = arg1;
		this.aString28 = arg0;
		this.anInt3487 = arg6;
		this.aBoolean287 = arg9;
		this.aLong74 = arg5;
		this.aBoolean288 = arg11;
	}
}
