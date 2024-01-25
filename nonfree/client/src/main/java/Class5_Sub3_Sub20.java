import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public final class Class5_Sub3_Sub20 extends Class5_Sub3 {

	@OriginalMember(owner = "client!vba", name = "D", descriptor = "Ljava/lang/String;")
	public String aString102;

	@OriginalMember(owner = "client!vba", name = "s", descriptor = "I")
	public final int anInt10173;

	@OriginalMember(owner = "client!vba", name = "G", descriptor = "I")
	public final int anInt10179;

	@OriginalMember(owner = "client!vba", name = "x", descriptor = "J")
	public final long aLong289;

	@OriginalMember(owner = "client!vba", name = "B", descriptor = "Ljava/lang/String;")
	public final String aString101;

	@OriginalMember(owner = "client!vba", name = "A", descriptor = "Z")
	public final boolean aBoolean871;

	@OriginalMember(owner = "client!vba", name = "w", descriptor = "Z")
	public final boolean aBoolean870;

	@OriginalMember(owner = "client!vba", name = "t", descriptor = "I")
	public final int anInt10174;

	@OriginalMember(owner = "client!vba", name = "F", descriptor = "I")
	public int anInt10178;

	@OriginalMember(owner = "client!vba", name = "v", descriptor = "I")
	public final int anInt10176;

	@OriginalMember(owner = "client!vba", name = "r", descriptor = "Z")
	public final boolean aBoolean869;

	@OriginalMember(owner = "client!vba", name = "C", descriptor = "J")
	public final long aLong290;

	@OriginalMember(owner = "client!vba", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString100;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class5_Sub3_Sub20(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.anInt10173 = arg2;
		this.anInt10179 = arg6;
		this.aLong289 = arg5;
		this.aString101 = arg1;
		this.aBoolean871 = arg11;
		this.aBoolean870 = arg8;
		this.anInt10174 = arg4;
		this.anInt10178 = arg3;
		this.anInt10176 = arg7;
		this.aBoolean869 = arg9;
		this.aLong290 = arg10;
		this.aString100 = arg0;
	}
}
