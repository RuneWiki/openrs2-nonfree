import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!cia", name = "o", descriptor = "B")
	public final byte aByte22;

	@OriginalMember(owner = "client!cia", name = "r", descriptor = "B")
	public final byte aByte25;

	@OriginalMember(owner = "client!cia", name = "s", descriptor = "I")
	public int anInt1396;

	@OriginalMember(owner = "client!cia", name = "q", descriptor = "B")
	public final byte aByte24;

	@OriginalMember(owner = "client!cia", name = "p", descriptor = "B")
	public final byte aByte23;

	@OriginalMember(owner = "client!cia", name = "u", descriptor = "[S")
	public final short[] aShortArray23;

	@OriginalMember(owner = "client!cia", name = "t", descriptor = "[B")
	public final byte[] aByteArray11;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class28_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte22 = (byte) arg0;
		this.aByte25 = (byte) arg1;
		this.anInt1396 = arg2;
		this.aByte24 = (byte) arg3;
		this.aByte23 = (byte) arg4;
		this.aShortArray23 = arg5;
		this.aByteArray11 = arg6;
	}
}
