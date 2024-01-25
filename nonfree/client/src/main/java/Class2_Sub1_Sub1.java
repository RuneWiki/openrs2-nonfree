import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aaa", name = "E", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		this.aByteArray1 = arg0;
	}
}
