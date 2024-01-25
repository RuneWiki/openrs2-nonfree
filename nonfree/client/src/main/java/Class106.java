import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public final class Class106 {

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "Lclient!ns;")
	private final Class247 aClass247_6;

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
	public final int anInt2393;

	@OriginalMember(owner = "client!fea", name = "h", descriptor = "I")
	private final int anInt2398;

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
	public final int anInt2396;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(IILclient!ns;)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class247 arg2) {
		this.aClass247_6 = arg2;
		this.anInt2393 = arg0;
		this.anInt2398 = arg1;
		this.anInt2396 = this.anInt2398 * this.aClass247_6.anInt6763;
		if (this.anInt2393 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
