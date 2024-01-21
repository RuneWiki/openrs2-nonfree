import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ma", name = "S", descriptor = "[B")
	public final byte[] aByteArray15;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray15 = arg0;
	}
}
