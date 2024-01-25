import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class32_Sub5 extends Class32 {

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "B")
	public final byte aByte36;

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "B")
	public final byte aByte35;

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "B")
	public final byte aByte33;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "B")
	public final byte aByte34;

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "[S")
	public final short[] aShortArray72;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "[B")
	public final byte[] aByteArray65;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class32_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte36 = (byte) arg0;
		this.aByte35 = (byte) arg1;
		this.anInt4698 = arg2;
		this.aByte33 = (byte) arg3;
		this.aByte34 = (byte) arg4;
		this.aShortArray72 = arg5;
		this.aByteArray65 = arg6;
	}
}
