import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public final class Class380 implements Interface22 {

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Lclient!lb;")
	private final Class221 aClass221_158;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString129;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!lb;Ljava/lang/String;)V")
	public Class380(@OriginalArg(0) Class221 arg0, @OriginalArg(1) String arg1) {
		this.aClass221_158 = arg0;
		this.aString129 = arg1;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)I")
	@Override
	public int method8879() {
		return this.aClass221_158.method5092(this.aString129) ? 100 : 0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Lclient!pia;")
	@Override
	public Class287 method8878() {
		return Static489.aClass287_2;
	}
}
