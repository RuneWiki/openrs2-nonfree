import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!mda", name = "j", descriptor = "[B")
	public final byte[] aByteArray64;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "([B)V")
	public Class1_Sub29(@OriginalArg(0) byte[] arg0) {
		this.aByteArray64 = arg0;
	}
}
