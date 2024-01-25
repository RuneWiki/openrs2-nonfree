import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class299 implements Interface20 {

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "Lclient!nca;")
	private final Class254 aClass254_128;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!nca;)V")
	public Class299(@OriginalArg(0) Class254 arg0) {
		this.aClass254_128 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)Lclient!lm;")
	@Override
	public Class227 method8705() {
		return Static371.aClass227_2;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)I")
	@Override
	public int method8706() {
		return this.aClass254_128.method6089() ? 100 : this.aClass254_128.method6084((byte) 124);
	}
}
