import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public final class Class386 {

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_41;

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
	public final int anInt10225;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!hk;II)V")
	public Class386(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass16_Sub2_41 = arg0;
		this.anInt10225 = arg2;
	}

	@OriginalMember(owner = "client!wea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub2_41.method3612(this.anInt10225);
		super.finalize();
	}
}
