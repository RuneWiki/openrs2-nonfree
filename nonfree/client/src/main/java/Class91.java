import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class91 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	public int anInt2095;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public int anInt2096;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	public int anInt2097;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
	public int anInt2098;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class91() {
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class91(@OriginalArg(0) Class91 arg0) {
		this.anInt2096 = arg0.anInt2096;
		this.anInt2097 = arg0.anInt2097;
		this.anInt2095 = arg0.anInt2095;
		this.anInt2098 = arg0.anInt2098;
	}
}
