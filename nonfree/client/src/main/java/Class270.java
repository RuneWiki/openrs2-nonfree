import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public final class Class270 {

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "I")
	public int anInt8052;

	@OriginalMember(owner = "client!oia", name = "d", descriptor = "I")
	public int anInt8053;

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
	public int anInt8054;

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "I")
	public int anInt8055;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "()V")
	public Class270() {
	}

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lclient!oia;)V")
	public Class270(@OriginalArg(0) Class270 arg0) {
		this.anInt8052 = arg0.anInt8052;
		this.anInt8053 = arg0.anInt8053;
		this.anInt8054 = arg0.anInt8054;
		this.anInt8055 = arg0.anInt8055;
	}
}
