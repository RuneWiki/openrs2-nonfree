import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public final class Class21_Sub5 extends Class21 {

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "B")
	public final byte aByte40;

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "B")
	public final byte aByte38;

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
	public int anInt3663;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "B")
	public final byte aByte39;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "B")
	public final byte aByte37;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "[S")
	public final short[] aShortArray32;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "[B")
	public final byte[] aByteArray46;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class21_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte40 = (byte) arg0;
		this.aByte38 = (byte) arg1;
		this.anInt3663 = arg2;
		this.aByte39 = (byte) arg3;
		this.aByte37 = (byte) arg4;
		this.aShortArray32 = arg5;
		this.aByteArray46 = arg6;
	}
}
