import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public final class Class149_Sub2 extends Class149 implements Interface15 {

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
	private int anInt10155;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!kw;I[BIZ)V")
	public Class149_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt10155 = arg1;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)I")
	@Override
	public int method8706() {
		return this.anInt10155;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)J")
	@Override
	public long method8704() {
		return 0L;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)I")
	@Override
	public int method8707() {
		return super.anInt10144;
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)V")
	@Override
	protected void method8700() {
		super.aClass5_Sub2_43.method4958(this);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II[BB)V")
	@Override
	public void method8705(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method8703(arg1, arg0);
		this.anInt10155 = 5123;
	}
}
