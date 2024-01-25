import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Z")
	public final boolean aBoolean43;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "Z")
	public final boolean aBoolean44;

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "J")
	public final long aLong17;

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
	public final int anInt802;

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
	public final int anInt809;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
	public final int anInt801;

	@OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
	public int anInt808;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
	public final int anInt805;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString11;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class3_Sub4(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean43 = arg8;
		this.aBoolean44 = arg9;
		this.aLong17 = arg5;
		this.aString12 = arg1;
		this.anInt802 = arg6;
		this.anInt809 = arg4;
		this.anInt801 = arg7;
		this.anInt808 = arg3;
		this.anInt805 = arg2;
		this.aString11 = arg0;
	}
}
