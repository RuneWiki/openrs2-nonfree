import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public final class Class67_Sub2 extends Class67 implements Interface18 {

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
	private int anInt11058;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!qo;I[BI)V")
	public Class67_Sub2(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt11058 = arg1;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)I")
	@Override
	public int method9225() {
		return 0;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)J")
	@Override
	public long method9228() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)I")
	@Override
	public int method9226() {
		return this.anInt11058;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "([BIII)V")
	@Override
	public void method9227(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method9224(arg0, arg1);
		this.anInt11058 = 5123;
	}
}
