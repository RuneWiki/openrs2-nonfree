import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class94 {

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
	public final int anInt3281;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_18;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!gk;II)V")
	public Class94(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3281 = arg2;
		this.aClass75_Sub2_18 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub2_18.method2483(this.anInt3281);
		super.finalize();
	}
}
