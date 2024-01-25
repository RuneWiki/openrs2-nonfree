import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "[S")
	public final short[] aShortArray80;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "[B")
	public final byte[] aByteArray62;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub42(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray80 = arg0;
		this.aByteArray62 = arg1;
	}
}
