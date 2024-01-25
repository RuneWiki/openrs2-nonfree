import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class289 implements Interface13 {

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
	public final int anInt7882;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(I)V")
	public Class289(@OriginalArg(0) int arg0) {
		this.anInt7882 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Lclient!mha;")
	@Override
	public Class228 method8022() {
		return Static289.aClass228_6;
	}
}
