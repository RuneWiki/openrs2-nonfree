import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public final class Class34_Sub9 extends Class34 {

	@OriginalMember(owner = "client!vga", name = "k", descriptor = "B")
	public final byte aByte145;

	@OriginalMember(owner = "client!vga", name = "m", descriptor = "B")
	public final byte aByte147;

	@OriginalMember(owner = "client!vga", name = "g", descriptor = "I")
	public int anInt10503;

	@OriginalMember(owner = "client!vga", name = "h", descriptor = "B")
	public final byte aByte144;

	@OriginalMember(owner = "client!vga", name = "l", descriptor = "B")
	public final byte aByte146;

	@OriginalMember(owner = "client!vga", name = "i", descriptor = "[S")
	public final short[] aShortArray149;

	@OriginalMember(owner = "client!vga", name = "j", descriptor = "[B")
	public final byte[] aByteArray100;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class34_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte145 = (byte) arg0;
		this.aByte147 = (byte) arg1;
		this.anInt10503 = arg2;
		this.aByte144 = (byte) arg3;
		this.aByte146 = (byte) arg4;
		this.aShortArray149 = arg5;
		this.aByteArray100 = arg6;
	}
}
