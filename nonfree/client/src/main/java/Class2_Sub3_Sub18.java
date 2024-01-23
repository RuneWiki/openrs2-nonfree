import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class2_Sub3_Sub18 extends Class2_Sub3 {

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray38 = arg0;
	}
}
