import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class15_Sub10 extends Class15 {

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "B")
	public final byte aByte148;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "B")
	public final byte aByte146;

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
	public int anInt11380;

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "B")
	public final byte aByte147;

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "B")
	public final byte aByte149;

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "[S")
	public final short[] aShortArray168;

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "[B")
	public final byte[] aByteArray103;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class15_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte148 = (byte) arg0;
		this.aByte146 = (byte) arg1;
		this.anInt11380 = arg2;
		this.aByte147 = (byte) arg3;
		this.aByte149 = (byte) arg4;
		this.aShortArray168 = arg5;
		this.aByteArray103 = arg6;
	}
}
