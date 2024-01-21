import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class3_Sub3_Sub5 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "[B")
	public final byte[] aByteArray4;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([B)V")
	public Class3_Sub3_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray4 = arg0;
	}
}
