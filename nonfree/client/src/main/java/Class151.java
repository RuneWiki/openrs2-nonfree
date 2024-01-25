import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class151 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
	public int anInt4314;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
	public int anInt4315;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
	public int anInt4316;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	public int anInt4317;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	public Class151() {
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class151(@OriginalArg(0) Class151 arg0) {
		this.anInt4314 = arg0.anInt4314;
		this.anInt4316 = arg0.anInt4316;
		this.anInt4317 = arg0.anInt4317;
		this.anInt4315 = arg0.anInt4315;
	}
}
