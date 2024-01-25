import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class388 {

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_41;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "J")
	public final long aLong310;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!ffa;JI)V")
	public Class388(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass57_Sub2_41 = arg0;
		this.aLong310 = arg1;
	}

	@OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass57_Sub2_41.method2371(this.aLong310);
		super.finalize();
	}
}
