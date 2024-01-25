import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class299 implements Interface4 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
	public final int anInt8419;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(I)V")
	public Class299(@OriginalArg(0) int arg0) {
		this.anInt8419 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Lclient!jw;")
	@Override
	public Class184 method7078() {
		return Static28.aClass184_6;
	}
}
