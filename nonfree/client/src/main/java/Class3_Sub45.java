import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class3_Sub45 extends Class3 {

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "[S")
	public final short[] aShortArray113;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "[B")
	public final byte[] aByteArray193;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub45(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray113 = arg0;
		this.aByteArray193 = arg1;
	}
}
