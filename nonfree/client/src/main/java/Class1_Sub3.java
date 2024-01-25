import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
	public final int anInt116;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Z")
	public final boolean aBoolean6;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
	public final int anInt114;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
	public final int anInt120;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "J")
	public final long aLong10;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "Z")
	public final boolean aBoolean5;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
	public int anInt117;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
	public final int anInt118;

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString2;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub3(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt116 = arg6;
		this.aBoolean6 = arg9;
		this.anInt114 = arg7;
		this.anInt120 = arg4;
		this.aLong10 = arg5;
		this.aString1 = arg1;
		this.aBoolean5 = arg8;
		this.anInt117 = arg3;
		this.anInt118 = arg2;
		this.aString2 = arg0;
	}
}
