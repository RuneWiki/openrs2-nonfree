import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Class372 {

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_39;

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
	public final int anInt9862;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lclient!pc;II)V")
	public Class372(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass33_Sub3_39 = arg0;
		this.anInt9862 = arg2;
	}

	@OriginalMember(owner = "client!vea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub3_39.method6332(this.anInt9862);
		super.finalize();
	}
}
