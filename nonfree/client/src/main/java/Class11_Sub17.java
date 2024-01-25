import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class11_Sub17 extends Class11 {

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11_Sub17(@OriginalArg(0) Class2_Sub30 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IB)I")
	@Override
	public int method9614(@OriginalArg(0) int arg0) {
		return Static162.method2415(super.aClass2_Sub30_32.aClass11_Sub20_2.method4863()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	@Override
	public void method9616() {
		if (super.anInt11012 < 0 || super.anInt11012 > 1) {
			super.anInt11012 = this.method9617();
		}
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(I)I")
	public int method4360() {
		return super.anInt11012;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)I")
	@Override
	protected int method9617() {
		return 1;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
	@Override
	protected void method9613(@OriginalArg(1) int arg0) {
		super.anInt11012 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)Z")
	public boolean method4364() {
		return Static162.method2415(super.aClass2_Sub30_32.aClass11_Sub20_2.method4863());
	}
}
