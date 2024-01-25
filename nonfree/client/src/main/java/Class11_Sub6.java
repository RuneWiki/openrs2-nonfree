import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public final class Class11_Sub6 extends Class11 {

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11_Sub6(@OriginalArg(0) Class2_Sub30 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		super(arg1);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IB)I")
	@Override
	public int method9614(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)I")
	@Override
	protected int method9617() {
		return 1;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V")
	@Override
	public void method9616() {
		if (super.anInt11012 != 1 && super.anInt11012 != 0) {
			super.anInt11012 = this.method9617();
		}
	}

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "(I)I")
	public int method2007() {
		return super.anInt11012;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)V")
	@Override
	protected void method9613(@OriginalArg(1) int arg0) {
		super.anInt11012 = arg0;
	}
}
