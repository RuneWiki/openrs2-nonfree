import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public final class Class240 {

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
	public int anInt6534;

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
	public int anInt6535;

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
	public int anInt6536;

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "I")
	public int anInt6537;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "()V")
	public Class240() {
	}

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!nda;)V")
	public Class240(@OriginalArg(0) Class240 arg0) {
		this.anInt6537 = arg0.anInt6537;
		this.anInt6534 = arg0.anInt6534;
		this.anInt6535 = arg0.anInt6535;
		this.anInt6536 = arg0.anInt6536;
	}
}
