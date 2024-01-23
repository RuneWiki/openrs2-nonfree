import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class48 {

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	public int anInt2173;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
	public int anInt2176;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
	public int anInt2177;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
	public int anInt2178;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class48() {
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class48(@OriginalArg(0) Class48 arg0) {
		this.anInt2177 = arg0.anInt2177;
		this.anInt2178 = arg0.anInt2178;
		this.anInt2176 = arg0.anInt2176;
		this.anInt2173 = arg0.anInt2173;
	}
}
