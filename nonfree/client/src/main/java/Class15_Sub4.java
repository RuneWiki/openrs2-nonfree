import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public final class Class15_Sub4 extends Class15 {

	@OriginalMember(owner = "client!eha", name = "m", descriptor = "I")
	public final int anInt3375;

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(I)V")
	public Class15_Sub4(@OriginalArg(0) int arg0) {
		this.anInt3375 = arg0;
	}
}
