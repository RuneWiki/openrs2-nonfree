import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public final class Class98 implements Interface26 {

	@OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
	public final int anInt2552;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(I)V")
	public Class98(@OriginalArg(0) int arg0) {
		this.anInt2552 = arg0;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)Lclient!eo;")
	@Override
	public Class108 method7808() {
		return Static616.aClass108_12;
	}
}
