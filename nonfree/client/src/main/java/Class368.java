import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public final class Class368 implements Interface20 {

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "Lclient!nca;")
	private final Class254 aClass254_159;

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString111;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lclient!nca;Ljava/lang/String;)V")
	public Class368(@OriginalArg(0) Class254 arg0, @OriginalArg(1) String arg1) {
		this.aClass254_159 = arg0;
		this.aString111 = arg1;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)I")
	@Override
	public int method8706() {
		return this.aClass254_159.method6069(this.aString111) ? 100 : this.aClass254_159.method6092(this.aString111);
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(I)Lclient!lm;")
	@Override
	public Class227 method8705() {
		return Static371.aClass227_4;
	}
}
