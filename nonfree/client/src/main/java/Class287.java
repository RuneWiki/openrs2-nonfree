import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class287 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	public int anInt8119;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public int anInt8120;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	public int anInt8121;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class287() {
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!ra;)V")
	public Class287(@OriginalArg(0) Class287 arg0) {
		this.anInt8120 = arg0.anInt8120;
		this.anInt8119 = arg0.anInt8119;
		this.anInt8121 = arg0.anInt8121;
	}
}
