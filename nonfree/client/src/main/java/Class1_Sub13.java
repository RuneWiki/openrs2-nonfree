import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "[B")
	public final byte[] aByteArray20;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub13(@OriginalArg(0) byte[] arg0) {
		this.aByteArray20 = arg0;
	}
}
