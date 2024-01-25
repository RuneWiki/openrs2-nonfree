import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class10_Sub2 extends Class10 implements Interface10 {

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
	private int anInt2081;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!vd;I[BI)V")
	public Class10_Sub2(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2081 = arg1;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)I")
	@Override
	public int method5744() {
		return this.anInt2081;
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)J")
	@Override
	public long method5745() {
		return super.aNativeBuffer3.a();
	}

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)I")
	@Override
	public int method5746() {
		return 0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(BII[B)V")
	@Override
	public void method5743(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method1767(arg1, arg0);
		this.anInt2081 = 5123;
	}
}
