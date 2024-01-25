import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class4_Sub39 extends Class4 {

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
	public final int anInt5695;

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "J")
	public final long aLong192;

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "Z")
	public final boolean aBoolean512;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
	public final int anInt5697;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
	public final int anInt5698;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
	public final int anInt5696;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
	public int anInt5699;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "Z")
	public final boolean aBoolean511;

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString55;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class4_Sub39(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt5695 = arg4;
		this.aLong192 = arg5;
		this.aBoolean512 = arg8;
		this.anInt5697 = arg7;
		this.anInt5698 = arg2;
		this.anInt5696 = arg6;
		this.anInt5699 = arg3;
		this.aBoolean511 = arg9;
		this.aString55 = arg0;
		this.aString56 = arg1;
	}
}
