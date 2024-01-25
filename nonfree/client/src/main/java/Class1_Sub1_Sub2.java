import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!an", name = "B", descriptor = "[B")
	public final byte[] aByteArray4;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) byte[] arg0) {
		this.aByteArray4 = arg0;
	}
}
