import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public final class Class123 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
	public int anInt4205;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
	public int anInt4206;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
	public int anInt4207;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
	public int anInt4208;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
	public Class123() {
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!hm;)V")
	public Class123(@OriginalArg(0) Class123 arg0) {
		this.anInt4208 = arg0.anInt4208;
		this.anInt4205 = arg0.anInt4205;
		this.anInt4207 = arg0.anInt4207;
		this.anInt4206 = arg0.anInt4206;
	}
}
