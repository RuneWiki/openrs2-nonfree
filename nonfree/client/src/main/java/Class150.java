import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public final class Class150 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
	public int anInt4207;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public int anInt4208;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
	public int anInt4209;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class150() {
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!hj;)V")
	public Class150(@OriginalArg(0) Class150 arg0) {
		this.anInt4209 = arg0.anInt4209;
		this.anInt4207 = arg0.anInt4207;
		this.anInt4208 = arg0.anInt4208;
	}
}
