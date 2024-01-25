import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class154 implements Interface2 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!sea;")
	private final Class308 aClass308_85;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!sea;)V")
	public Class154(@OriginalArg(0) Class308 arg0) {
		this.aClass308_85 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Lclient!mv;")
	@Override
	public Class229 method7053() {
		return Static334.aClass229_2;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)I")
	@Override
	public int method7052() {
		return this.aClass308_85.method6535() ? 100 : this.aClass308_85.method6562();
	}
}
