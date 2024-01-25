import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public final class Class393 implements Interface8 {

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "Lclient!ae;")
	private final Class8 aClass8_150;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString156;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!ae;Ljava/lang/String;)V")
	public Class393(@OriginalArg(0) Class8 arg0, @OriginalArg(1) String arg1) {
		this.aClass8_150 = arg0;
		this.aString156 = arg1;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I")
	@Override
	public int method9105() {
		return this.aClass8_150.method250(this.aString156) ? 100 : this.aClass8_150.method281(this.aString156);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)Lclient!jea;")
	@Override
	public Class173 method9104() {
		return Static268.aClass173_3;
	}
}
