import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class5_Sub38 extends Class5 {

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "[S")
	public final short[] aShortArray94;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "[B")
	public final byte[] aByteArray70;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "([S[B)V")
	public Class5_Sub38(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray94 = arg0;
		this.aByteArray70 = arg1;
	}
}
