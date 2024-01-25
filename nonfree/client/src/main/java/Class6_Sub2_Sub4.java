import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class6_Sub2_Sub4 extends Class6_Sub2 {

	@OriginalMember(owner = "client!cs", name = "E", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!cs", name = "F", descriptor = "Z")
	public final boolean aBoolean122;

	@OriginalMember(owner = "client!cs", name = "N", descriptor = "I")
	public int anInt1738;

	@OriginalMember(owner = "client!cs", name = "B", descriptor = "I")
	public final int anInt1732;

	@OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
	public final int anInt1735;

	@OriginalMember(owner = "client!cs", name = "J", descriptor = "I")
	public final int anInt1736;

	@OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
	public final int anInt1733;

	@OriginalMember(owner = "client!cs", name = "K", descriptor = "Ljava/lang/String;")
	public final String aString20;

	@OriginalMember(owner = "client!cs", name = "z", descriptor = "J")
	public final long aLong41;

	@OriginalMember(owner = "client!cs", name = "M", descriptor = "J")
	public final long aLong42;

	@OriginalMember(owner = "client!cs", name = "G", descriptor = "Ljava/lang/String;")
	public final String aString19;

	@OriginalMember(owner = "client!cs", name = "y", descriptor = "Z")
	public final boolean aBoolean120;

	@OriginalMember(owner = "client!cs", name = "A", descriptor = "Z")
	public final boolean aBoolean121;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class6_Sub2_Sub4(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aBoolean122 = arg9;
		this.anInt1738 = arg3;
		this.anInt1732 = arg4;
		this.anInt1735 = arg7;
		this.anInt1736 = arg2;
		this.anInt1733 = arg6;
		this.aString20 = arg1;
		this.aLong41 = arg10;
		this.aLong42 = arg5;
		this.aString19 = arg0;
		this.aBoolean120 = arg11;
		this.aBoolean121 = arg8;
	}
}
