import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ga", name = "Z", descriptor = "[B")
	public final byte[] aByteArray8;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray8 = arg0;
	}
}
