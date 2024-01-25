import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class180 implements Interface24 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	public final int anInt5898;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(I)V")
	public Class180(@OriginalArg(0) int arg0) {
		this.anInt5898 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class138 method8348() {
		return Static490.aClass138_5;
	}
}
