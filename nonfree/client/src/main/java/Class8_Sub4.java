import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public final class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
	public final int anInt3716;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(I)V")
	public Class8_Sub4(@OriginalArg(0) int arg0) {
		this.anInt3716 = arg0;
	}
}
