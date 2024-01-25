import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class137 {

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!om;")
	private final Class133_Sub1_Sub2 aClass133_Sub1_Sub2_4;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public final int anInt3942;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!om;II)V")
	public Class137(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass133_Sub1_Sub2_4 = arg0;
		this.anInt3942 = arg2;
	}

	@OriginalMember(owner = "client!he", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass133_Sub1_Sub2_4.method6291(this.anInt3942);
		super.finalize();
	}
}
