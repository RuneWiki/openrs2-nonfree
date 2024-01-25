import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public abstract class Class33 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "Lclient!wo;")
	protected final Class2_Sub49 aClass2_Sub49_31;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
	protected int anInt10227;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class33(@OriginalArg(0) Class2_Sub49 arg0) {
		this.aClass2_Sub49_31 = arg0;
		this.anInt10227 = this.method8709();
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(ILclient!wo;)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		this.anInt10227 = arg0;
		this.aClass2_Sub49_31 = arg1;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
	public final void method8707(@OriginalArg(1) int arg0) {
		if (this.method8708(arg0) != 3) {
			this.method8711(arg0);
		}
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)I")
	public abstract int method8708(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)I")
	protected abstract int method8709();

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	public abstract void method8710();

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(II)V")
	protected abstract void method8711(@OriginalArg(1) int arg0);
}
