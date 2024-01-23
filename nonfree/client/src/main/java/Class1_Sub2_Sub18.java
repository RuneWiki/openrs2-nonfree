import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray49 = arg0;
	}
}
