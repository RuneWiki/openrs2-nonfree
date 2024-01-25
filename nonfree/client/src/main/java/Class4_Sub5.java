import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public final class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!fga", name = "k", descriptor = "B")
	public final byte aByte41;

	@OriginalMember(owner = "client!fga", name = "j", descriptor = "B")
	public final byte aByte40;

	@OriginalMember(owner = "client!fga", name = "n", descriptor = "I")
	public int anInt2487;

	@OriginalMember(owner = "client!fga", name = "l", descriptor = "B")
	public final byte aByte39;

	@OriginalMember(owner = "client!fga", name = "m", descriptor = "B")
	public final byte aByte42;

	@OriginalMember(owner = "client!fga", name = "o", descriptor = "[S")
	public final short[] aShortArray34;

	@OriginalMember(owner = "client!fga", name = "i", descriptor = "[B")
	public final byte[] aByteArray42;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class4_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte41 = (byte) arg0;
		this.aByte40 = (byte) arg1;
		this.anInt2487 = arg2;
		this.aByte39 = (byte) arg3;
		this.aByte42 = (byte) arg4;
		this.aShortArray34 = arg5;
		this.aByteArray42 = arg6;
	}
}
