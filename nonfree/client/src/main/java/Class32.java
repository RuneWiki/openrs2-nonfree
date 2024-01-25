import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public final class Class32 {

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
	public final int anInt1221;

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "Lclient!vaa;")
	private final Class22_Sub2_Sub2 aClass22_Sub2_Sub2_3;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!vaa;II)V")
	public Class32(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1221 = arg2;
		this.aClass22_Sub2_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!bea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass22_Sub2_Sub2_3.method8986(this.anInt1221);
		super.finalize();
	}
}
