import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public final class Class152 {

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "I")
	public int anInt5181;

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
	public int anInt5182;

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
	public int anInt5183;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "()V")
	public Class152() {
	}

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Lclient!iga;)V")
	public Class152(@OriginalArg(0) Class152 arg0) {
		this.anInt5183 = arg0.anInt5183;
		this.anInt5182 = arg0.anInt5182;
		this.anInt5181 = arg0.anInt5181;
	}
}
