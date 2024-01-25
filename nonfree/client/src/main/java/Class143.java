import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public final class Class143 {

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "Lclient!mr;")
	private final Class45_Sub2_Sub2 aClass45_Sub2_Sub2_5;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
	public final int anInt3934;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!mr;II)V")
	public Class143(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass45_Sub2_Sub2_5 = arg0;
		this.anInt3934 = arg2;
	}

	@OriginalMember(owner = "client!iea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass45_Sub2_Sub2_5.method5035(this.anInt3934);
		super.finalize();
	}
}
