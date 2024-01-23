import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub22(@OriginalArg(0) byte[] arg0) {
		this.aByteArray80 = arg0;
	}
}
