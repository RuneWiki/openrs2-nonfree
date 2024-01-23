import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class185 {

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
	public int anInt5849;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	private int anInt5850;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(II)V")
	public Class185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5849 = arg0;
		this.anInt5850 = Static189.anInt3719;
	}

	@OriginalMember(owner = "client!vg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static189.method3147(this.anInt5849, this.anInt5850);
		super.finalize();
	}
}
