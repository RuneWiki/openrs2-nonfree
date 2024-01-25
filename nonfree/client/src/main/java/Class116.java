import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class116 {

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Lclient!oea;")
	private final Class250 aClass250_7;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	private final int anInt2907;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	public final int anInt2908;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	public final int anInt2905;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IILclient!oea;)V")
	public Class116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_7 = arg2;
		this.anInt2907 = arg1;
		this.anInt2908 = arg0;
		this.anInt2905 = this.anInt2907 * this.aClass250_7.anInt7253;
		if (this.anInt2908 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
