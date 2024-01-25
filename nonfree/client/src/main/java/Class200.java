import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public final class Class200 implements Interface23 {

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "Lclient!pl;")
	private final Class259 aClass259_89;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!pl;)V")
	public Class200(@OriginalArg(0) Class259 arg0) {
		this.aClass259_89 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)Lclient!tj;")
	@Override
	public Class320 method6598() {
		return Static512.aClass320_2;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)I")
	@Override
	public int method6597() {
		return this.aClass259_89.method5976() ? 100 : this.aClass259_89.method5977();
	}
}
