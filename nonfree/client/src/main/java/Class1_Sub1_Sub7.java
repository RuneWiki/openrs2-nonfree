import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fi", name = "D", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray11 = arg0;
	}
}
