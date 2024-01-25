import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class1_Sub4_Sub3 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bo", name = "K", descriptor = "[B")
	public final byte[] aByteArray14;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "([B)V")
	public Class1_Sub4_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray14 = arg0;
	}
}
