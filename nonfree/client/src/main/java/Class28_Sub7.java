import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class28_Sub7 extends Class28 {

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "B")
	public final byte aByte78;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "B")
	public final byte aByte79;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
	public int anInt5986;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "B")
	public final byte aByte77;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "B")
	public final byte aByte80;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "[S")
	public final short[] aShortArray86;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "[B")
	public final byte[] aByteArray64;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class28_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte78 = (byte) arg0;
		this.aByte79 = (byte) arg1;
		this.anInt5986 = arg2;
		this.aByte77 = (byte) arg3;
		this.aByte80 = (byte) arg4;
		this.aShortArray86 = arg5;
		this.aByteArray64 = arg6;
	}
}
