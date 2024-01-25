import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class166 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
	public int anInt5182;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public int anInt5183;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
	public int anInt5184;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class166() {
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!qm;)V")
	public Class166(@OriginalArg(0) Class166 arg0) {
		this.anInt5183 = arg0.anInt5183;
		this.anInt5182 = arg0.anInt5182;
		this.anInt5184 = arg0.anInt5184;
	}
}
