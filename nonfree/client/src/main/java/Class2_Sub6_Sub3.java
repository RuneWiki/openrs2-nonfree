import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class2_Sub6_Sub3 extends Class2_Sub6 {

	@OriginalMember(owner = "client!db", name = "y", descriptor = "Ljava/lang/String;")
	public String aString20;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "I")
	public final int anInt2630;

	@OriginalMember(owner = "client!db", name = "N", descriptor = "I")
	public int anInt2631;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "I")
	public final int anInt2626;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "J")
	public final long aLong61;

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "Z")
	public final boolean aBoolean219;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "Z")
	public final boolean aBoolean218;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString21;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "Z")
	public final boolean aBoolean220;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString19;

	@OriginalMember(owner = "client!db", name = "P", descriptor = "I")
	public final int anInt2632;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "J")
	public final long aLong60;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "I")
	public final int anInt2627;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class2_Sub6_Sub3(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.anInt2630 = arg7;
		this.anInt2631 = arg3;
		this.anInt2626 = arg4;
		this.aLong61 = arg5;
		this.aBoolean219 = arg8;
		this.aBoolean218 = arg9;
		this.aString21 = arg1;
		this.aBoolean220 = arg11;
		this.aString19 = arg0;
		this.anInt2632 = arg2;
		this.aLong60 = arg10;
		this.anInt2627 = arg6;
	}
}
