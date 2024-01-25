import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class Class23 {

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!ts;")
	protected final Class3_Sub48 aClass3_Sub48_31;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
	protected int anInt10359;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23(@OriginalArg(0) Class3_Sub48 arg0) {
		this.aClass3_Sub48_31 = arg0;
		this.anInt10359 = this.method8501();
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		this.aClass3_Sub48_31 = arg1;
		this.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public final void method8500(@OriginalArg(0) int arg0) {
		if (this.method8502(arg0) != 3) {
			this.method8503(arg0);
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)I")
	protected abstract int method8501();

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)I")
	public abstract int method8502(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)V")
	protected abstract void method8503(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public abstract void method8506();
}
