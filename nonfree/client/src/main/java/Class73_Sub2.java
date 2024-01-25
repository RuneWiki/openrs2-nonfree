import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class73_Sub2 extends Class73 implements Interface3 {

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
	private int anInt5259;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	private int anInt5260;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ql;I[BI)V")
	public Class73_Sub2(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5259 = arg1;
		this.anInt5260 = this.aClass92_Sub2_31.method4602(this.anInt5259);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()I")
	@Override
	public int method4362() {
		return 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	@Override
	public void method4364(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass92_Sub2_31.anOpengl2.glDrawElements(4, arg1, this.anInt5259, this.aByteBuffer7.position(arg0 * this.anInt5260));
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4363(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4361(arg0, arg1);
		this.anInt5259 = 5123;
		this.anInt5260 = this.aClass92_Sub2_31.method4602(this.anInt5259);
	}
}
