import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public final class Class88 {

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
	public int anInt2004;

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "I")
	public int anInt2005;

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "I")
	public int anInt2006;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "()V")
	public Class88() {
	}

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!eea;)V")
	public Class88(@OriginalArg(0) Class88 arg0) {
		this.anInt2004 = arg0.anInt2004;
		this.anInt2005 = arg0.anInt2005;
		this.anInt2006 = arg0.anInt2006;
	}
}
