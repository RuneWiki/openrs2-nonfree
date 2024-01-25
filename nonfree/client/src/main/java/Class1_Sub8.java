import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!em", name = "s", descriptor = "I")
	public final int anInt1757;

	@OriginalMember(owner = "client!em", name = "t", descriptor = "I")
	public int anInt1758;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString11;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "I")
	public final int anInt1756;

	@OriginalMember(owner = "client!em", name = "o", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!em", name = "x", descriptor = "I")
	public final int anInt1760;

	@OriginalMember(owner = "client!em", name = "u", descriptor = "I")
	public final int anInt1759;

	@OriginalMember(owner = "client!em", name = "r", descriptor = "Z")
	public final boolean aBoolean96;

	@OriginalMember(owner = "client!em", name = "q", descriptor = "Z")
	public final boolean aBoolean95;

	@OriginalMember(owner = "client!em", name = "w", descriptor = "J")
	public final long aLong50;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub8(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt1757 = arg4;
		this.anInt1758 = arg3;
		this.aString11 = arg0;
		this.anInt1756 = arg2;
		this.aString12 = arg1;
		this.anInt1760 = arg6;
		this.anInt1759 = arg7;
		this.aBoolean96 = arg8;
		this.aBoolean95 = arg9;
		this.aLong50 = arg5;
	}
}
