import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class4_Sub2_Sub5 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "([B)V")
	public Class4_Sub2_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray20 = arg0;
	}
}
