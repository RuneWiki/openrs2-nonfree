import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class3_Sub6_Sub16 extends Class3_Sub6 {

	@OriginalMember(owner = "client!od", name = "C", descriptor = "Ljava/lang/String;")
	public String aString96;

	@OriginalMember(owner = "client!od", name = "P", descriptor = "I")
	public final int anInt7072;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "J")
	public final long aLong203;

	@OriginalMember(owner = "client!od", name = "E", descriptor = "I")
	public int anInt7069;

	@OriginalMember(owner = "client!od", name = "M", descriptor = "I")
	public final int anInt7071;

	@OriginalMember(owner = "client!od", name = "D", descriptor = "Z")
	public final boolean aBoolean535;

	@OriginalMember(owner = "client!od", name = "J", descriptor = "Ljava/lang/String;")
	public final String aString97;

	@OriginalMember(owner = "client!od", name = "G", descriptor = "J")
	public final long aLong202;

	@OriginalMember(owner = "client!od", name = "F", descriptor = "Z")
	public final boolean aBoolean536;

	@OriginalMember(owner = "client!od", name = "O", descriptor = "Z")
	public final boolean aBoolean537;

	@OriginalMember(owner = "client!od", name = "K", descriptor = "I")
	public final int anInt7070;

	@OriginalMember(owner = "client!od", name = "y", descriptor = "I")
	public final int anInt7066;

	@OriginalMember(owner = "client!od", name = "B", descriptor = "Ljava/lang/String;")
	public final String aString95;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class3_Sub6_Sub16(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.anInt7072 = arg2;
		this.aLong203 = arg10;
		this.anInt7069 = arg3;
		this.anInt7071 = arg6;
		this.aBoolean535 = arg11;
		this.aString97 = arg1;
		this.aLong202 = arg5;
		this.aBoolean536 = arg9;
		this.aBoolean537 = arg8;
		this.anInt7070 = arg4;
		this.anInt7066 = arg7;
		this.aString95 = arg0;
	}
}
