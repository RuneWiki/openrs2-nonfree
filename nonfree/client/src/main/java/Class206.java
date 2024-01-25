import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public final class Class206 implements Interface12 {

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
	public final int anInt5753;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(I)V")
	public Class206(@OriginalArg(0) int arg0) {
		this.anInt5753 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)Lclient!qv;")
	@Override
	public Class271 method8097() {
		return Static125.aClass271_2;
	}
}
