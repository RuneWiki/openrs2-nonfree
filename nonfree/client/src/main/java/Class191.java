import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class191 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_18;

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
	public final int anInt5064;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!ffa;II)V")
	public Class191(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass57_Sub2_18 = arg0;
		this.anInt5064 = arg2;
	}

	@OriginalMember(owner = "client!jt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass57_Sub2_18.method2354(this.anInt5064);
		super.finalize();
	}
}
