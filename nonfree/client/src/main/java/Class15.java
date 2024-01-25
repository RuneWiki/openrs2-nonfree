import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class Class15 {

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "Lclient!vba;")
	protected final Class3_Sub55 aClass3_Sub55_32;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
	protected int anInt11276;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15(@OriginalArg(0) Class3_Sub55 arg0) {
		this.aClass3_Sub55_32 = arg0;
		this.anInt11276 = this.method9419();
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		this.anInt11276 = arg0;
		this.aClass3_Sub55_32 = arg1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)V")
	protected abstract void method9418(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)I")
	protected abstract int method9419();

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I")
	public abstract int method9420(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V")
	public final void method9421(@OriginalArg(0) int arg0) {
		if (this.method9420(arg0) != 3) {
			this.method9418(arg0);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public abstract void method9422();
}
