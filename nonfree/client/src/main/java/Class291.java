import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class291 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	public int anInt8562;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
	public int anInt8563;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public int anInt8564;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
	public int anInt8565;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class291() {
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!uc;)V")
	public Class291(@OriginalArg(0) Class291 arg0) {
		this.anInt8563 = arg0.anInt8563;
		this.anInt8564 = arg0.anInt8564;
		this.anInt8562 = arg0.anInt8562;
		this.anInt8565 = arg0.anInt8565;
	}
}
