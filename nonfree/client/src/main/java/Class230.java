import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class230 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
	public int anInt5878;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	public int anInt5879;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	public int anInt5880;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
	public int anInt5881;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class230() {
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!uf;)V")
	public Class230(@OriginalArg(0) Class230 arg0) {
		this.anInt5881 = arg0.anInt5881;
		this.anInt5878 = arg0.anInt5878;
		this.anInt5880 = arg0.anInt5880;
		this.anInt5879 = arg0.anInt5879;
	}
}
