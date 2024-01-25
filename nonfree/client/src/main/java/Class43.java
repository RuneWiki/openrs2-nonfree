import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public abstract class Class43 {

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "Lclient!lha;")
	protected final Class14_Sub26 aClass14_Sub26_32;

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
	protected int anInt10397;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lclient!lha;)V")
	public Class43(@OriginalArg(0) Class14_Sub26 arg0) {
		this.aClass14_Sub26_32 = arg0;
		this.anInt10397 = this.method8889();
	}

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(ILclient!lha;)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub26 arg1) {
		this.aClass14_Sub26_32 = arg1;
		this.anInt10397 = arg0;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)I")
	protected abstract int method8889();

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(II)V")
	public final void method8890(@OriginalArg(1) int arg0) {
		if (this.method8894(arg0) != 3) {
			this.method8893(arg0);
		}
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)V")
	public abstract void method8892();

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)V")
	protected abstract void method8893(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "(II)I")
	public abstract int method8894(@OriginalArg(0) int arg0);
}
