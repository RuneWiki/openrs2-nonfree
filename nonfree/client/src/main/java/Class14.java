import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public abstract class Class14 {

	@OriginalMember(owner = "client!su", name = "c", descriptor = "Lclient!dh;")
	protected final Class2_Sub13 aClass2_Sub13_31;

	@OriginalMember(owner = "client!su", name = "e", descriptor = "I")
	protected int anInt10835;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class14(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aClass2_Sub13_31 = arg0;
		this.anInt10835 = this.method9029();
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(ILclient!dh;)V")
	public Class14(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		this.aClass2_Sub13_31 = arg1;
		this.anInt10835 = arg0;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)I")
	protected abstract int method9029();

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
	protected abstract void method9031(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(II)I")
	public abstract int method9033(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V")
	public abstract void method9035();

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(II)V")
	public final void method9037(@OriginalArg(0) int arg0) {
		if (this.method9033(arg0) != 3) {
			this.method9031(arg0);
		}
	}
}
