import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class69 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
	public int anInt2875;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
	public int anInt2879;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
	public int anInt2880;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
	public int anInt2882;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	public Class69() {
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!ni;)V")
	public Class69(@OriginalArg(0) Class69 arg0) {
		this.anInt2880 = arg0.anInt2880;
		this.anInt2879 = arg0.anInt2879;
		this.anInt2882 = arg0.anInt2882;
		this.anInt2875 = arg0.anInt2875;
	}
}
