import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class14_Sub5 extends Class14 {

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "B")
	public final byte aByte43;

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "B")
	public final byte aByte41;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
	public int anInt2294;

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "B")
	public final byte aByte44;

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "B")
	public final byte aByte42;

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "[S")
	public final short[] aShortArray40;

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "[B")
	public final byte[] aByteArray23;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class14_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte43 = (byte) arg0;
		this.aByte41 = (byte) arg1;
		this.anInt2294 = arg2;
		this.aByte44 = (byte) arg3;
		this.aByte42 = (byte) arg4;
		this.aShortArray40 = arg5;
		this.aByteArray23 = arg6;
	}
}
