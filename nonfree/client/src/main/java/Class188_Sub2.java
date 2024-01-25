import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class188_Sub2 extends Class188 implements Interface27 {

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
	private int anInt5492;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!aq;I[BI)V")
	public Class188_Sub2(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5492 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)J")
	@Override
	public long method9068() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)I")
	@Override
	public int method9067() {
		return this.anInt5492;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)I")
	@Override
	public int method9069() {
		return 0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[BB)V")
	@Override
	public void method9070(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method4874(arg1, arg0);
		this.anInt5492 = 5123;
	}
}
