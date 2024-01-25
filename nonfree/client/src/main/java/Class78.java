import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public final class Class78 implements Interface20 {

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "Lclient!nca;")
	private final Class254 aClass254_45;

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "Ljava/lang/String;")
	private final String aString13;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!nca;Ljava/lang/String;)V")
	public Class78(@OriginalArg(0) Class254 arg0, @OriginalArg(1) String arg1) {
		this.aClass254_45 = arg0;
		this.aString13 = arg1;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)I")
	@Override
	public int method8706() {
		return this.aClass254_45.method6090(this.aString13) ? 100 : 0;
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)Lclient!lm;")
	@Override
	public Class227 method8705() {
		return Static371.aClass227_3;
	}
}
