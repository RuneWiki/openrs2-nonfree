import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class230 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public int anInt6212;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
	public int anInt6213;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
	public int anInt6214;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
	public Class230() {
	}

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!ul;)V")
	public Class230(@OriginalArg(0) Class230 arg0) {
		this.anInt6212 = arg0.anInt6212;
		this.anInt6214 = arg0.anInt6214;
		this.anInt6213 = arg0.anInt6213;
	}
}
