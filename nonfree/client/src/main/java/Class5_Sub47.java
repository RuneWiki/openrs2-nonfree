import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class5_Sub47 extends Class5 {

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
	public final int anInt8476;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
	public final int anInt8479;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "Z")
	public final boolean aBoolean611;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
	public int anInt8474;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "Ljava/lang/String;")
	public String aString77;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
	public final int anInt8477;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
	public final int anInt8478;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "J")
	public final long aLong237;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "Z")
	public final boolean aBoolean610;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class5_Sub47(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt8476 = arg2;
		this.anInt8479 = arg6;
		this.aBoolean611 = arg8;
		this.anInt8474 = arg3;
		this.aString77 = arg1;
		this.anInt8477 = arg7;
		this.anInt8478 = arg4;
		this.aLong237 = arg5;
		this.aBoolean610 = arg9;
		this.aString76 = arg0;
	}
}
