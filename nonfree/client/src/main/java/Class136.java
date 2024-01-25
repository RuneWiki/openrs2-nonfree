import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class136 implements Interface4 {

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString35;

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "Lclient!nd;")
	private final Class238 aClass238_96;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!nd;Ljava/lang/String;)V")
	public Class136(@OriginalArg(0) Class238 arg0, @OriginalArg(1) String arg1) {
		this.aString35 = arg1;
		this.aClass238_96 = arg0;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Lclient!qia;")
	@Override
	public Class288 method6365() {
		return Static470.aClass288_3;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I")
	@Override
	public int method6364() {
		return this.aClass238_96.method5574(this.aString35) ? 100 : 0;
	}
}
