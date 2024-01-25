import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class12_Sub20 extends Class12 {

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString40;

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "I")
	public final int anInt4328;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "Z")
	public final boolean aBoolean345;

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "J")
	public final long aLong116;

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
	public final int anInt4325;

	@OriginalMember(owner = "client!hv", name = "y", descriptor = "I")
	public final int anInt4330;

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
	public final int anInt4327;

	@OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
	public int anInt4329;

	@OriginalMember(owner = "client!hv", name = "v", descriptor = "Z")
	public final boolean aBoolean346;

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class12_Sub20(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aString40 = arg0;
		this.anInt4328 = arg4;
		this.aBoolean345 = arg8;
		this.aLong116 = arg5;
		this.anInt4325 = arg7;
		this.anInt4330 = arg2;
		this.anInt4327 = arg6;
		this.anInt4329 = arg3;
		this.aBoolean346 = arg9;
		this.aString41 = arg1;
	}
}
