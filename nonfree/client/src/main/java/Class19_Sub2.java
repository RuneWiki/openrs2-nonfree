import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class19_Sub2 extends Class19 implements Interface15 {

	@OriginalMember(owner = "client!js", name = "i", descriptor = "I")
	private int anInt5000;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!kw;I[BI)V")
	public Class19_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5000 = arg1;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)I")
	@Override
	public int method8706() {
		return this.anInt5000;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(B)I")
	@Override
	public int method8707() {
		return 0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II[BB)V")
	@Override
	public void method8705(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method4498(arg1, arg0);
		this.anInt5000 = 5123;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)J")
	@Override
	public long method8704() {
		return super.aBuffer3.getAddress();
	}
}
