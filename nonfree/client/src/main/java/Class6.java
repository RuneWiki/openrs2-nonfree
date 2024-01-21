import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class6 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	public int anInt228;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	public int anInt229;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	public int anInt234;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "I")
	public int anInt235;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class6() {
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!af;)V")
	public Class6(@OriginalArg(0) Class6 arg0) {
		this.anInt229 = arg0.anInt229;
		this.anInt235 = arg0.anInt235;
		this.anInt228 = arg0.anInt228;
		this.anInt234 = arg0.anInt234;
	}
}
