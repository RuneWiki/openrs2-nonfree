import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray40 = arg0;
	}
}
