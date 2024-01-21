import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "[B")
	public final byte[] aByteArray39;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([B)V")
	public Class1_Sub22(@OriginalArg(0) byte[] arg0) {
		this.aByteArray39 = arg0;
	}
}
