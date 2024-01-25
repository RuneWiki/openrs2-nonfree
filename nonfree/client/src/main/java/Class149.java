import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class149 implements Interface13 {

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
	public final int anInt3838;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(I)V")
	public Class149(@OriginalArg(0) int arg0) {
		this.anInt3838 = arg0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)Lclient!of;")
	@Override
	public Class251 method8737() {
		return Static662.aClass251_10;
	}
}
