import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class87 implements Interface15 {

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "Z")
	private boolean aBoolean208;

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString23;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class87(@OriginalArg(0) String arg0) {
		this.aString23 = arg0;
	}

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)Z")
	public boolean method2563() {
		return this.aBoolean208;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)Lclient!dda;")
	@Override
	public Class64 method6481() {
		return Static84.aClass64_4;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)I")
	@Override
	public int method6482() {
		@Pc(8) int local8 = Static307.method4852(this.aString23);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean208 = true;
			return 100;
		}
	}
}
