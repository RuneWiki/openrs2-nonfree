import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public final class Class72_Sub6 extends Class72 {

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "B")
	public final byte aByte78;

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "B")
	public final byte aByte79;

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
	public int anInt6008;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "B")
	public final byte aByte80;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "B")
	public final byte aByte77;

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "[S")
	public final short[] aShortArray112;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "[B")
	public final byte[] aByteArray94;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class72_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte78 = (byte) arg0;
		this.aByte79 = (byte) arg1;
		this.anInt6008 = arg2;
		this.aByte80 = (byte) arg3;
		this.aByte77 = (byte) arg4;
		this.aShortArray112 = arg5;
		this.aByteArray94 = arg6;
	}
}
