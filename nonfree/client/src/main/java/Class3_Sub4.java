import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
	public final int anInt399;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4(@OriginalArg(0) int arg0) {
		this.anInt399 = arg0;
	}
}
