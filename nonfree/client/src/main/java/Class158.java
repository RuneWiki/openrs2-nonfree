import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public final class Class158 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	public int anInt4871;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "[Lclient!sm;")
	private Class160[] aClass160Array1;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	private int anInt4872;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I[Lclient!sm;)V")
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) Class160[] arg1) {
		this.anInt4871 = arg0;
		this.aClass160Array1 = arg1;
		this.anInt4872 = Static256.anInt5185;
	}

	@OriginalMember(owner = "client!si", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static256.method4124(this.anInt4871, this.aClass160Array1, this.anInt4872);
		super.finalize();
	}
}
