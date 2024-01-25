import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class103 implements Interface2 {

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "Ljava/lang/String;")
	private final String aString25;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "Lclient!sea;")
	private final Class308 aClass308_58;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!sea;Ljava/lang/String;)V")
	public Class103(@OriginalArg(0) Class308 arg0, @OriginalArg(1) String arg1) {
		this.aString25 = arg1;
		this.aClass308_58 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)I")
	@Override
	public int method7052() {
		return this.aClass308_58.method6540(this.aString25) ? 100 : this.aClass308_58.method6553(this.aString25);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)Lclient!mv;")
	@Override
	public Class229 method7053() {
		return Static334.aClass229_4;
	}
}
