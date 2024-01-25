import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class106 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	public int anInt3205;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
	public int anInt3206;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
	public int anInt3207;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public Class106() {
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class106(@OriginalArg(0) Class106 arg0) {
		this.anInt3207 = arg0.anInt3207;
		this.anInt3206 = arg0.anInt3206;
		this.anInt3205 = arg0.anInt3205;
	}
}
