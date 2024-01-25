import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	public int anInt1;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	public int anInt2;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	public int anInt3;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public int anInt4;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1() {
	}

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!a;)V")
	public Class1(@OriginalArg(0) Class1 arg0) {
		this.anInt2 = arg0.anInt2;
		this.anInt1 = arg0.anInt1;
		this.anInt3 = arg0.anInt3;
		this.anInt4 = arg0.anInt4;
	}
}
