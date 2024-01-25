import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class3_Sub3_Sub8 extends Class3_Sub3 {

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "[B")
	public final byte[] aByteArray20;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "([B)V")
	public Class3_Sub3_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray20 = arg0;
	}
}
