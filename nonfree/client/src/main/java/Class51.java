import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class51 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	public int anInt1553;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "[Lclient!mo;")
	private Class113[] aClass113Array2;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	private int anInt1554;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I[Lclient!mo;)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) Class113[] arg1) {
		this.anInt1553 = arg0;
		this.aClass113Array2 = arg1;
		this.anInt1554 = Static162.anInt3245;
	}

	@OriginalMember(owner = "client!fe", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static162.method2796(this.anInt1553, this.aClass113Array2, this.anInt1554);
		super.finalize();
	}
}
