import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class294 implements Interface26 {

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
	public final int anInt7794;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V")
	public Class294(@OriginalArg(0) int arg0) {
		this.anInt7794 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Lclient!eo;")
	@Override
	public Class108 method7808() {
		return Static119.aClass108_5;
	}
}
