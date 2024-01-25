import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public final class Class156 {

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
	public final int anInt4188;

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_10;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!rs;II)V")
	public Class156(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4188 = arg2;
		this.aClass133_Sub3_10 = arg0;
	}

	@OriginalMember(owner = "client!ica", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass133_Sub3_10.method7382(this.anInt4188);
		super.finalize();
	}
}
