import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public final class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "[B")
	public final byte[] aByteArray81;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([B)V")
	public Class2_Sub31(@OriginalArg(0) byte[] arg0) {
		this.aByteArray81 = arg0;
	}
}
