import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class53 {

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
	public int anInt1523;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "[Lclient!vg;")
	private Class185[] aClass185Array1;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
	private int anInt1522;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(I[Lclient!vg;)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) Class185[] arg1) {
		this.anInt1523 = arg0;
		this.aClass185Array1 = arg1;
		this.anInt1522 = Static189.anInt3719;
	}

	@OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static189.method3149(this.anInt1523, this.aClass185Array1, this.anInt1522);
		super.finalize();
	}
}
