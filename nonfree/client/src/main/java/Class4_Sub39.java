import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public final class Class4_Sub39 extends Class4 {

	@OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
	public final int anInt8543;

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "J")
	public final long aLong219;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "Z")
	public final boolean aBoolean605;

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "Z")
	public final boolean aBoolean606;

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString81;

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
	public final int anInt8546;

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
	public int anInt8541;

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
	public final int anInt8542;

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
	public final int anInt8545;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "Ljava/lang/String;")
	public String aString80;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class4_Sub39(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt8543 = arg7;
		this.aLong219 = arg5;
		this.aBoolean605 = arg8;
		this.aBoolean606 = arg9;
		this.aString81 = arg0;
		this.anInt8546 = arg2;
		this.anInt8541 = arg3;
		this.anInt8542 = arg6;
		this.anInt8545 = arg4;
		this.aString80 = arg1;
	}
}
