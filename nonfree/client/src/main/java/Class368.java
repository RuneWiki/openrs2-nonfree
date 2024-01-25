import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class Class368 {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Lclient!md;")
	private final Class144_Sub1_Sub2 aClass144_Sub1_Sub2_11;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	public final int anInt10238;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!md;II)V")
	public Class368(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass144_Sub1_Sub2_11 = arg0;
		this.anInt10238 = arg2;
	}

	@OriginalMember(owner = "client!un", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass144_Sub1_Sub2_11.method5782(this.anInt10238);
		super.finalize();
	}
}
