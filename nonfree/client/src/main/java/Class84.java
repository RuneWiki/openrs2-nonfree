import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public final class Class84 implements Interface13 {

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "I")
	public final int anInt2250;

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(I)V")
	public Class84(@OriginalArg(0) int arg0) {
		this.anInt2250 = arg0;
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)Lclient!of;")
	@Override
	public Class251 method8737() {
		return Static499.aClass251_5;
	}
}
