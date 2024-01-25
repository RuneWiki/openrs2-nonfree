import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class45 implements Interface9 {

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
	public final int anInt1425;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(I)V")
	public Class45(@OriginalArg(0) int arg0) {
		this.anInt1425 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Lclient!aca;")
	@Override
	public Class6 method8749() {
		return Static402.aClass6_24;
	}
}
