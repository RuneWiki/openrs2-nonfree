import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public final class Class173 {

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
	public final int anInt5118;

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "Lclient!hj;")
	private final Class82_Sub3_Sub1 aClass82_Sub3_Sub1_6;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!hj;II)V")
	public Class173(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5118 = arg2;
		this.aClass82_Sub3_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!jfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass82_Sub3_Sub1_6.method3756(this.anInt5118);
		super.finalize();
	}
}
