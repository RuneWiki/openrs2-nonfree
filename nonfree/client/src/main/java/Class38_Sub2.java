import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class38_Sub2 extends Class38 implements Interface21 {

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
	private int anInt5443;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!ffa;I[BI)V")
	public Class38_Sub2(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5443 = arg1;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IB[BI)V")
	@Override
	public void method8198(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method4664(arg0, arg1);
		this.anInt5443 = 5123;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)I")
	@Override
	public int method8201() {
		return this.anInt5443;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)I")
	@Override
	public int method8200() {
		return 0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)J")
	@Override
	public long method8199() {
		return super.aBuffer3.getAddress();
	}
}
