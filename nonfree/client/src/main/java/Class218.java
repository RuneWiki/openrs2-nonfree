import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class218 implements Interface24 {

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
	public final int anInt6359;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(I)V")
	public Class218(@OriginalArg(0) int arg0) {
		this.anInt6359 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)Lclient!gp;")
	@Override
	public Class139 method8810() {
		return Static432.aClass139_6;
	}
}
