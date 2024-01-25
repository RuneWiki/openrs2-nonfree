import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class292 implements Interface12 {

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
	public final int anInt8740;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(I)V")
	public Class292(@OriginalArg(0) int arg0) {
		this.anInt8740 = arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)Lclient!qv;")
	@Override
	public Class271 method8097() {
		return Static224.aClass271_3;
	}
}
