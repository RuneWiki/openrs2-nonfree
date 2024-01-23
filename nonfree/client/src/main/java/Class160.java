import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class Class160 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
	public int anInt4745;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "[Lclient!ae;")
	private Class5[] aClass5Array2;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
	private int anInt4746;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I[Lclient!ae;)V")
	public Class160(@OriginalArg(0) int arg0, @OriginalArg(1) Class5[] arg1) {
		this.anInt4745 = arg0;
		this.aClass5Array2 = arg1;
		this.anInt4746 = Static163.anInt3218;
	}

	@OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static163.method2526(this.anInt4745, this.aClass5Array2, this.anInt4746);
		super.finalize();
	}
}
