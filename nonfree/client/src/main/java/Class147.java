import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class147 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_30;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
	private final int anInt4417;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!se;I)V")
	public Class147(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass122_Sub2_30 = arg0;
		this.anInt4417 = this.aClass122_Sub2_30.anOpengl2.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	public void method3752(@OriginalArg(0) int arg0) {
		this.aClass122_Sub2_30.anOpengl2.glNewList(this.anInt4417 + arg0, 4864);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "()V")
	public void method3753() {
		this.aClass122_Sub2_30.anOpengl2.glEndList();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(C)V")
	public void method3754(@OriginalArg(0) char arg0) {
		this.aClass122_Sub2_30.anOpengl2.glCallList(this.anInt4417 + arg0);
	}
}
