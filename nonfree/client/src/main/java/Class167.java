import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class167 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	public int anInt4207;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	public int anInt4208;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	public int anInt4209;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public int anInt4210;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class167() {
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!jb;)V")
	public Class167(@OriginalArg(0) Class167 arg0) {
		this.anInt4208 = arg0.anInt4208;
		this.anInt4209 = arg0.anInt4209;
		this.anInt4210 = arg0.anInt4210;
		this.anInt4207 = arg0.anInt4207;
	}
}
