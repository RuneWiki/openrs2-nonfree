import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "[B")
	public final byte[] aByteArray45;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B)V")
	public Class3_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray45 = arg0;
	}
}
