import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!b", name = "rb", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray1 = arg0;
	}
}
