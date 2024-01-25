import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public final class Class221 {

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
	public int anInt5986;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
	public int anInt5987;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
	public int anInt5988;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "()V")
	public Class221() {
	}

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class221(@OriginalArg(0) Class221 arg0) {
		this.anInt5987 = arg0.anInt5987;
		this.anInt5988 = arg0.anInt5988;
		this.anInt5986 = arg0.anInt5986;
	}
}
