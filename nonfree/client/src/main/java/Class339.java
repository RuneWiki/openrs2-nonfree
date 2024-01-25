import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class339 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
	public int anInt9034;

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
	public int anInt9035;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
	public int anInt9036;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class339() {
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!ut;)V")
	public Class339(@OriginalArg(0) Class339 arg0) {
		this.anInt9034 = arg0.anInt9034;
		this.anInt9036 = arg0.anInt9036;
		this.anInt9035 = arg0.anInt9035;
	}
}
