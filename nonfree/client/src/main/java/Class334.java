import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class334 implements Interface24 {

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public final int anInt9685;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
	public Class334(@OriginalArg(0) int arg0) {
		this.anInt9685 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class138 method8348() {
		return Static336.aClass138_3;
	}
}
