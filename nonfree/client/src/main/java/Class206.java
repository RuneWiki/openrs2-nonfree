import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public final class Class206 implements Interface15 {

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "Lclient!om;")
	private final Class246 aClass246_147;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!om;)V")
	public Class206(@OriginalArg(0) Class246 arg0) {
		this.aClass246_147 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)I")
	@Override
	public int method4825() {
		return this.aClass246_147.method5649() ? 100 : this.aClass246_147.method5656();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Lclient!wa;")
	@Override
	public Class356 method4824() {
		return Static574.aClass356_2;
	}
}
