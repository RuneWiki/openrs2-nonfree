import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public abstract class Class21 {

	@OriginalMember(owner = "client!pca", name = "g", descriptor = "Lclient!eha;")
	protected final Class3_Sub22 aClass3_Sub22_34;

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
	protected int anInt10876;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class21(@OriginalArg(0) Class3_Sub22 arg0) {
		this.aClass3_Sub22_34 = arg0;
		this.anInt10876 = this.method9239();
	}

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(ILclient!eha;)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		this.anInt10876 = arg0;
		this.aClass3_Sub22_34 = arg1;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)V")
	public final void method9231(@OriginalArg(0) int arg0) {
		if (this.method9238(arg0) != 3) {
			this.method9240(arg0);
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
	public abstract void method9235();

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "(II)I")
	public abstract int method9238(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)I")
	protected abstract int method9239();

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "(II)V")
	protected abstract void method9240(@OriginalArg(1) int arg0);
}
