import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class81 {

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_13;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	private final int anInt2297;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!ql;I)V")
	public Class81(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass92_Sub2_13 = arg0;
		this.anInt2297 = this.aClass92_Sub2_13.anOpengl2.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(C)V")
	public void method1875(@OriginalArg(0) char arg0) {
		this.aClass92_Sub2_13.anOpengl2.glCallList(this.anInt2297 + arg0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
	public void method1876() {
		this.aClass92_Sub2_13.anOpengl2.glEndList();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public void method1877(@OriginalArg(0) int arg0) {
		this.aClass92_Sub2_13.anOpengl2.glNewList(this.anInt2297 + arg0, 4864);
	}
}
