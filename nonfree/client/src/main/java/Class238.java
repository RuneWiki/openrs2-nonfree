import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class238 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
	public int anInt6841;

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
	public int anInt6842;

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
	public int anInt6843;

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
	public int anInt6844;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	public Class238() {
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!pp;)V")
	public Class238(@OriginalArg(0) Class238 arg0) {
		this.anInt6843 = arg0.anInt6843;
		this.anInt6844 = arg0.anInt6844;
		this.anInt6842 = arg0.anInt6842;
		this.anInt6841 = arg0.anInt6841;
	}
}
