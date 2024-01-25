import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public final class Class240 implements Interface12 {

	@OriginalMember(owner = "client!os", name = "c", descriptor = "I")
	public final int anInt6969;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(I)V")
	public Class240(@OriginalArg(0) int arg0) {
		this.anInt6969 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class136 method5811() {
		return Static20.aClass136_11;
	}
}
