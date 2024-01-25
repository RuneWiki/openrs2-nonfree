import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class19_Sub3 extends Class19 {

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "B")
	public final byte aByte53;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "B")
	public final byte aByte52;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	public int anInt3128;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "B")
	public final byte aByte55;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "B")
	public final byte aByte54;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "[S")
	public final short[] aShortArray46;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "[B")
	public final byte[] aByteArray17;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class19_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte53 = (byte) arg0;
		this.aByte52 = (byte) arg1;
		this.anInt3128 = arg2;
		this.aByte55 = (byte) arg3;
		this.aByte54 = (byte) arg4;
		this.aShortArray46 = arg5;
		this.aByteArray17 = arg6;
	}
}
