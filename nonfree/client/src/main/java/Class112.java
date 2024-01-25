import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class112 implements Interface19 {

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "Z")
	private boolean aBoolean275;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "Ljava/lang/String;")
	private final String aString40;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class112(@OriginalArg(0) String arg0) {
		this.aString40 = arg0;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)Z")
	public boolean method3363() {
		return this.aBoolean275;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)I")
	@Override
	public int method9334() {
		@Pc(15) int local15 = Static533.method8249(this.aString40);
		if (local15 >= 0 && local15 <= 100) {
			return local15;
		} else {
			this.aBoolean275 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Lclient!pw;")
	@Override
	public Class290 method9335() {
		return Static472.aClass290_5;
	}
}
