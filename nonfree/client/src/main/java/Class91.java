import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class91 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
	public int anInt2130;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
	public int anInt2131;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
	public int anInt2132;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	public int anInt2133;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class91() {
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!hf;)V")
	public Class91(@OriginalArg(0) Class91 arg0) {
		this.anInt2132 = arg0.anInt2132;
		this.anInt2131 = arg0.anInt2131;
		this.anInt2130 = arg0.anInt2130;
		this.anInt2133 = arg0.anInt2133;
	}
}
