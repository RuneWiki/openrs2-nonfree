import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class Class16_Sub9 extends Class16 {

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "B")
	public final byte aByte120;

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "B")
	public final byte aByte122;

	@OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
	public int anInt8569;

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "B")
	public final byte aByte121;

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "B")
	public final byte aByte123;

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "[S")
	public final short[] aShortArray130;

	@OriginalMember(owner = "client!ss", name = "n", descriptor = "[B")
	public final byte[] aByteArray90;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class16_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte120 = (byte) arg0;
		this.aByte122 = (byte) arg1;
		this.anInt8569 = arg2;
		this.aByte121 = (byte) arg3;
		this.aByte123 = (byte) arg4;
		this.aShortArray130 = arg5;
		this.aByteArray90 = arg6;
	}
}
