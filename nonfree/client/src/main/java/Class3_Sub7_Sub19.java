import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public final class Class3_Sub7_Sub19 extends Class3_Sub7 {

	@OriginalMember(owner = "client!sba", name = "E", descriptor = "Ljava/lang/String;")
	public String aString84;

	@OriginalMember(owner = "client!sba", name = "C", descriptor = "I")
	public final int anInt8567;

	@OriginalMember(owner = "client!sba", name = "x", descriptor = "I")
	public final int anInt8565;

	@OriginalMember(owner = "client!sba", name = "z", descriptor = "J")
	public final long aLong228;

	@OriginalMember(owner = "client!sba", name = "y", descriptor = "Z")
	public final boolean aBoolean626;

	@OriginalMember(owner = "client!sba", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString82;

	@OriginalMember(owner = "client!sba", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString83;

	@OriginalMember(owner = "client!sba", name = "s", descriptor = "Z")
	public final boolean aBoolean624;

	@OriginalMember(owner = "client!sba", name = "u", descriptor = "Z")
	public final boolean aBoolean625;

	@OriginalMember(owner = "client!sba", name = "D", descriptor = "J")
	public final long aLong229;

	@OriginalMember(owner = "client!sba", name = "v", descriptor = "I")
	public int anInt8564;

	@OriginalMember(owner = "client!sba", name = "t", descriptor = "I")
	public final int anInt8563;

	@OriginalMember(owner = "client!sba", name = "B", descriptor = "I")
	public final int anInt8566;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class3_Sub7_Sub19(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.anInt8567 = arg4;
		this.anInt8565 = arg6;
		this.aLong228 = arg10;
		this.aBoolean626 = arg9;
		this.aString82 = arg0;
		this.aString83 = arg1;
		this.aBoolean624 = arg11;
		this.aBoolean625 = arg8;
		this.aLong229 = arg5;
		this.anInt8564 = arg3;
		this.anInt8563 = arg7;
		this.anInt8566 = arg2;
	}
}
