import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class15 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public int anInt143;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
	public int anInt144;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class15() {
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!ai;)V")
	public Class15(@OriginalArg(0) Class15 arg0) {
		this.anInt146 = arg0.anInt146;
		this.anInt144 = arg0.anInt144;
		this.anInt145 = arg0.anInt145;
		this.anInt143 = arg0.anInt143;
	}
}
