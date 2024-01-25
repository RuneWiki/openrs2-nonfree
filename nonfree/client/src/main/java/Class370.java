import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public final class Class370 {

	@OriginalMember(owner = "client!via", name = "c", descriptor = "I")
	public final int anInt10313;

	@OriginalMember(owner = "client!via", name = "f", descriptor = "Lclient!jc;")
	private final Class65_Sub2_Sub2 aClass65_Sub2_Sub2_12;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lclient!jc;II)V")
	public Class370(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt10313 = arg2;
		this.aClass65_Sub2_Sub2_12 = arg0;
	}

	@OriginalMember(owner = "client!via", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass65_Sub2_Sub2_12.method4488(this.anInt10313);
		super.finalize();
	}
}
