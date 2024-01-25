import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class6_Sub48 extends Class6 {

	@OriginalMember(owner = "client!u", name = "k", descriptor = "I")
	public final int anInt8332;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString103;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "I")
	public final int anInt8335;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "I")
	public final int anInt8336;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Ljava/lang/String;")
	public String aString104;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "I")
	public int anInt8333;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "J")
	public final long aLong215;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "Z")
	public final boolean aBoolean572;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Z")
	public final boolean aBoolean573;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "I")
	public final int anInt8334;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class6_Sub48(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt8332 = arg2;
		this.aString103 = arg0;
		this.anInt8335 = arg6;
		this.anInt8336 = arg7;
		this.aString104 = arg1;
		this.anInt8333 = arg3;
		this.aLong215 = arg5;
		this.aBoolean572 = arg9;
		this.aBoolean573 = arg8;
		this.anInt8334 = arg4;
	}
}
