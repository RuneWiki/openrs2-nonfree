import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class6_Sub45 extends Class6 {

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
	public int anInt8730;

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
	public final int anInt8732;

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
	public final int anInt8735;

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "Z")
	public final boolean aBoolean633;

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "Ljava/lang/String;")
	public String aString97;

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString98;

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "Z")
	public final boolean aBoolean634;

	@OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
	public final int anInt8733;

	@OriginalMember(owner = "client!ts", name = "n", descriptor = "J")
	public final long aLong235;

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
	public final int anInt8734;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class6_Sub45(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt8730 = arg3;
		this.anInt8732 = arg2;
		this.anInt8735 = arg7;
		this.aBoolean633 = arg9;
		this.aString97 = arg1;
		this.aString98 = arg0;
		this.aBoolean634 = arg8;
		this.anInt8733 = arg6;
		this.aLong235 = arg5;
		this.anInt8734 = arg4;
	}
}
