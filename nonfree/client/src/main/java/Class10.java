import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class Class10 {

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
	protected Class10() {
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public abstract void method5073(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Lclient!ne;")
	public abstract Class178 method5076();

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)[B")
	public abstract byte[] method5077(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)I")
	public abstract int method5080(@OriginalArg(1) int arg0);
}
