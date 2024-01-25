import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public final class Class318 implements Interface24 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	public final int anInt8616;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
	public Class318(@OriginalArg(0) int arg0) {
		this.anInt8616 = arg0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Lclient!ag;")
	@Override
	public Class8 method8040() {
		return Static515.aClass8_9;
	}
}
