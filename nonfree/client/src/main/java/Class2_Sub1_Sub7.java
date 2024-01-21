import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ee", name = "qb", descriptor = "[B")
	public final byte[] aByteArray6;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray6 = arg0;
	}
}
