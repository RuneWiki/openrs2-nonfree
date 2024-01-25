import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class72 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_2;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
	private final int anInt2031;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!ic;I)V")
	public Class72(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass48_Sub2_2 = arg0;
		this.anInt2031 = this.aClass48_Sub2_2.anOpengl2.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(C)V")
	public void method1604(@OriginalArg(0) char arg0) {
		this.aClass48_Sub2_2.anOpengl2.glCallList(this.anInt2031 + arg0);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public void method1605(@OriginalArg(0) int arg0) {
		this.aClass48_Sub2_2.anOpengl2.glNewList(this.anInt2031 + arg0, 4864);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "()V")
	public void method1606() {
		this.aClass48_Sub2_2.anOpengl2.glEndList();
	}
}
