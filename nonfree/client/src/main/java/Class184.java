import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class184 implements Interface22 {

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString47;

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "Lclient!wm;")
	private final Class390 aClass390_73;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!wm;Ljava/lang/String;)V")
	public Class184(@OriginalArg(0) Class390 arg0, @OriginalArg(1) String arg1) {
		this.aString47 = arg1;
		this.aClass390_73 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)Lclient!dca;")
	@Override
	public Class77 method8098() {
		return Static99.aClass77_3;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)I")
	@Override
	public int method8097() {
		return this.aClass390_73.method8916(this.aString47) ? 100 : this.aClass390_73.method8926(this.aString47);
	}
}
