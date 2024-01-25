import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class332 implements Interface24 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public final int anInt8935;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I)V")
	public Class332(@OriginalArg(0) int arg0) {
		this.anInt8935 = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Lclient!rw;")
	@Override
	public Class297 method7306() {
		return Static488.aClass297_6;
	}
}
