import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class21 {

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!gn;")
	protected final Class14_Sub22 aClass14_Sub22_31;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
	protected int anInt11183;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21(@OriginalArg(0) Class14_Sub22 arg0) {
		this.aClass14_Sub22_31 = arg0;
		this.anInt11183 = this.method9292();
	}

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		this.aClass14_Sub22_31 = arg1;
		this.anInt11183 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)V")
	public final void method9288(@OriginalArg(1) int arg0) {
		if (this.method9289(arg0) != 3) {
			this.method9291(arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
	public abstract int method9289(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public abstract void method9290();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)V")
	protected abstract void method9291(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)I")
	protected abstract int method9292();
}
