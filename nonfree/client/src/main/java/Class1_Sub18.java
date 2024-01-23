import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "([B)V")
	public Class1_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray42 = arg0;
	}
}
