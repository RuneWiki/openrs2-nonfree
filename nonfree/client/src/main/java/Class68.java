import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class68 implements Interface17 {

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "Z")
	private boolean aBoolean236;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "Ljava/lang/String;")
	private final String aString20;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class68(@OriginalArg(0) String arg0) {
		this.aString20 = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)I")
	@Override
	public int method6326() {
		@Pc(8) int local8 = Static72.method2068(this.aString20);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean236 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z")
	public boolean method2449() {
		return this.aBoolean236;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Lclient!mk;")
	@Override
	public Class206 method6325() {
		return Static354.aClass206_5;
	}
}
