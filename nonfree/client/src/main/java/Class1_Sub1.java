import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "[B")
	public final byte[] aByteArray2;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1(@OriginalArg(0) byte[] arg0) {
		this.aByteArray2 = arg0;
	}
}
