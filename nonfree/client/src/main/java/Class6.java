import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public abstract class Class6 {

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "Lclient!ah;")
	protected final Class2_Sub5 aClass2_Sub5_50;

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
	protected int anInt10283;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!ah;)V")
	public Class6(@OriginalArg(0) Class2_Sub5 arg0) {
		this.aClass2_Sub5_50 = arg0;
		this.anInt10283 = this.method8572();
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(ILclient!ah;)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		this.aClass2_Sub5_50 = arg1;
		this.anInt10283 = arg0;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)I")
	protected abstract int method8572();

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)I")
	public abstract int method8573(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V")
	public final void method8575(@OriginalArg(0) int arg0) {
		if (this.method8573(arg0) != 3) {
			this.method8577(arg0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V")
	public abstract void method8576();

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)V")
	protected abstract void method8577(@OriginalArg(0) int arg0);
}
