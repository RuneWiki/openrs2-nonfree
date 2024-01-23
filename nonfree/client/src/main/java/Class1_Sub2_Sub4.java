import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray7 = arg0;
	}
}
