import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class6_Sub26 extends Class6 {

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
	public final int anInt5468;

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "Z")
	public final boolean aBoolean380;

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString44;

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "Z")
	public final boolean aBoolean381;

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "J")
	public final long aLong126;

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "I")
	public int anInt5472;

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
	public final int anInt5473;

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
	public final int anInt5471;

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
	public final int anInt5470;

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class6_Sub26(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt5468 = arg6;
		this.aBoolean380 = arg9;
		this.aString44 = arg0;
		this.aBoolean381 = arg8;
		this.aLong126 = arg5;
		this.anInt5472 = arg3;
		this.anInt5473 = arg7;
		this.anInt5471 = arg2;
		this.anInt5470 = arg4;
		this.aString43 = arg1;
	}
}
