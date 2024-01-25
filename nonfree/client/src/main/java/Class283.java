import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class283 implements Interface8 {

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
	public final int anInt8609;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(I)V")
	public Class283(@OriginalArg(0) int arg0) {
		this.anInt8609 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)Lclient!fl;")
	@Override
	public Class103 method7774() {
		return Static501.aClass103_9;
	}
}
