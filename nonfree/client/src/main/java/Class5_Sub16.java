import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class Class5_Sub16 extends Class5 {

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "Lclient!iha;")
	public Class5_Sub24 aClass5_Sub24_6;

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "Lclient!fq;")
	public Class5_Sub16 aClass5_Sub16_9;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
	public int anInt10155;

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "Z")
	public volatile boolean aBoolean758 = true;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "()I")
	public int method8734() {
		return 255;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "()Lclient!fq;")
	public abstract Class5_Sub16 method8735();

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "([III)V")
	protected final void method8736(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean758) {
			this.method8738(arg0, arg1, arg2);
		} else {
			this.method8740(arg2);
		}
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "()Lclient!fq;")
	public abstract Class5_Sub16 method8737();

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "([III)V")
	public abstract void method8738(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "()I")
	public abstract int method8739();

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public abstract void method8740(@OriginalArg(0) int arg0);
}
