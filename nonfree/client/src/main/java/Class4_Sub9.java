import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!v", name = "k", descriptor = "B")
	public final byte aByte139;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "B")
	public final byte aByte140;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "I")
	public int anInt10313;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "B")
	public final byte aByte137;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "B")
	public final byte aByte138;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "[S")
	public final short[] aShortArray143;

	@OriginalMember(owner = "client!v", name = "g", descriptor = "[B")
	public final byte[] aByteArray116;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class4_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte139 = (byte) arg0;
		this.aByte140 = (byte) arg1;
		this.anInt10313 = arg2;
		this.aByte137 = (byte) arg3;
		this.aByte138 = (byte) arg4;
		this.aShortArray143 = arg5;
		this.aByteArray116 = arg6;
	}
}
