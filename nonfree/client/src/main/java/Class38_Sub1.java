import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "B")
	public final byte aByte5;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "B")
	public final byte aByte6;

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
	public int anInt1556;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "B")
	public final byte aByte7;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "B")
	public final byte aByte8;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "[S")
	public final short[] aShortArray16;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "[B")
	public final byte[] aByteArray38;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class38_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte5 = (byte) arg0;
		this.aByte6 = (byte) arg1;
		this.anInt1556 = arg2;
		this.aByte7 = (byte) arg3;
		this.aByte8 = (byte) arg4;
		this.aShortArray16 = arg5;
		this.aByteArray38 = arg6;
	}
}
