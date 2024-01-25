import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public final class Class126_Sub1 extends Class126 implements Interface12 {

	@OriginalMember(owner = "client!kw", name = "A", descriptor = "I")
	private int anInt5204;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!lj;I[BIZ)V")
	public Class126_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt5204 = arg1;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(III[B)V")
	@Override
	public void method4195(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method7119(arg1, arg0);
		this.anInt5204 = 5123;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)I")
	@Override
	public int method4197() {
		return this.anInt5204;
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)V")
	@Override
	protected void method7118() {
		super.aClass78_Sub3_38.method4526(this);
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)J")
	@Override
	public long method4198() {
		return 0L;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)I")
	@Override
	public int method4196() {
		return super.anInt8815;
	}
}
