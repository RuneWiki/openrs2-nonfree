import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class44 {

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	public int anInt2146;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	public int anInt2147;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "I")
	public int anInt2151;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "I")
	public int anInt2156;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class44() {
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!m;)V")
	public Class44(@OriginalArg(0) Class44 arg0) {
		this.anInt2146 = arg0.anInt2146;
		this.anInt2147 = arg0.anInt2147;
		this.anInt2151 = arg0.anInt2151;
		this.anInt2156 = arg0.anInt2156;
	}
}
