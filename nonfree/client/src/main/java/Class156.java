import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public abstract class Class156 {

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "()V")
	protected Class156() {
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Z")
	protected abstract boolean method5683();

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)Z")
	public final boolean method5684() {
		return this.method5685() || this.method5683() || this.method5688();
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)Z")
	public abstract boolean method5685();

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)V")
	public abstract void method5687();

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)Z")
	protected abstract boolean method5688();

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)I")
	public abstract int method5689();

	@OriginalMember(owner = "client!pca", name = "e", descriptor = "(I)I")
	public abstract int method5690();

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "(B)Lclient!nm;")
	public abstract Class3_Sub24 method5691();

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "(I)V")
	public abstract void method5692();
}
