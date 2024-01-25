import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class1_Sub45 extends Class1 {

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "[B")
	public final byte[] aByteArray91;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub45(@OriginalArg(0) byte[] arg0) {
		this.aByteArray91 = arg0;
	}
}
