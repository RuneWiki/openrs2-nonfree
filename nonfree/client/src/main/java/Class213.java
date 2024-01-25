import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class213 {

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
	public final int anInt6028;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!ph;")
	private final Class122_Sub2_Sub2 aClass122_Sub2_Sub2_7;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!ph;II)V")
	public Class213(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6028 = arg2;
		this.aClass122_Sub2_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass122_Sub2_Sub2_7.method5689(this.anInt6028);
		super.finalize();
	}
}
