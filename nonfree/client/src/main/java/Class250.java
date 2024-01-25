import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class250 {

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	public final int anInt6822;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_30;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!ag;II)V")
	public Class250(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6822 = arg2;
		this.aClass12_Sub1_30 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass12_Sub1_30.method434(this.anInt6822);
		super.finalize();
	}
}
