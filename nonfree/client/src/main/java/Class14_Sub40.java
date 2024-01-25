import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public final class Class14_Sub40 extends Class14 {

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "[S")
	public final short[] aShortArray110;

	@OriginalMember(owner = "client!qu", name = "l", descriptor = "[B")
	public final byte[] aByteArray98;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "([S[B)V")
	public Class14_Sub40(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray110 = arg0;
		this.aByteArray98 = arg1;
	}
}
