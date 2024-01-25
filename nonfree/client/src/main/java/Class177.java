import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public final class Class177 implements Interface26 {

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "Lclient!oh;")
	private final Class237 aClass237_76;

	@OriginalMember(owner = "client!kha", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString68;

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Lclient!oh;Ljava/lang/String;)V")
	public Class177(@OriginalArg(0) Class237 arg0, @OriginalArg(1) String arg1) {
		this.aClass237_76 = arg0;
		this.aString68 = arg1;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(B)Lclient!vca;")
	@Override
	public Class353 method8362() {
		return Static592.aClass353_3;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)I")
	@Override
	public int method8361() {
		return this.aClass237_76.method6306(this.aString68) ? 100 : 0;
	}
}
