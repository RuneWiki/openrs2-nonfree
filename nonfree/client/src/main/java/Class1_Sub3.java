import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
	public final int anInt228;

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
	public final int anInt226;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "Z")
	public final boolean aBoolean15;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
	public final int anInt224;

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!ak", name = "y", descriptor = "J")
	public final long aLong15;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "Z")
	public final boolean aBoolean16;

	@OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
	public int anInt227;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString3;

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
	public final int anInt230;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub3(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt228 = arg2;
		this.anInt226 = arg7;
		this.aBoolean15 = arg8;
		this.anInt224 = arg4;
		this.aString4 = arg1;
		this.aLong15 = arg5;
		this.aBoolean16 = arg9;
		this.anInt227 = arg3;
		this.aString3 = arg0;
		this.anInt230 = arg6;
	}
}
