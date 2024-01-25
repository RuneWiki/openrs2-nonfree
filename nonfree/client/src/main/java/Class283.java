import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class283 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "Lclient!bga;")
	private final Class20_Sub2_Sub2 aClass20_Sub2_Sub2_11;

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
	public final int anInt8826;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!bga;II)V")
	public Class283(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass20_Sub2_Sub2_11 = arg0;
		this.anInt8826 = arg2;
	}

	@OriginalMember(owner = "client!qr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass20_Sub2_Sub2_11.method1591(this.anInt8826);
		super.finalize();
	}
}
