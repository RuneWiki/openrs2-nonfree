import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class Class12_Sub7 extends Class12 {

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "B")
	public final byte aByte93;

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "B")
	public final byte aByte92;

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
	public int anInt7168;

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "B")
	public final byte aByte91;

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "B")
	public final byte aByte94;

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "[S")
	public final short[] aShortArray108;

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "[B")
	public final byte[] aByteArray69;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class12_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte93 = (byte) arg0;
		this.aByte92 = (byte) arg1;
		this.anInt7168 = arg2;
		this.aByte91 = (byte) arg3;
		this.aByte94 = (byte) arg4;
		this.aShortArray108 = arg5;
		this.aByteArray69 = arg6;
	}
}
