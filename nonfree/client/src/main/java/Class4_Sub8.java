import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!qea", name = "m", descriptor = "B")
	public final byte aByte112;

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "B")
	public final byte aByte109;

	@OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
	public int anInt7706;

	@OriginalMember(owner = "client!qea", name = "k", descriptor = "B")
	public final byte aByte110;

	@OriginalMember(owner = "client!qea", name = "l", descriptor = "B")
	public final byte aByte111;

	@OriginalMember(owner = "client!qea", name = "j", descriptor = "[S")
	public final short[] aShortArray107;

	@OriginalMember(owner = "client!qea", name = "n", descriptor = "[B")
	public final byte[] aByteArray74;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class4_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte112 = (byte) arg0;
		this.aByte109 = (byte) arg1;
		this.anInt7706 = arg2;
		this.aByte110 = (byte) arg3;
		this.aByte111 = (byte) arg4;
		this.aShortArray107 = arg5;
		this.aByteArray74 = arg6;
	}
}
