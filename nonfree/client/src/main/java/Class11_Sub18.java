import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class11_Sub18 extends Class11 {

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11_Sub18(@OriginalArg(0) Class2_Sub30 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)V")
	@Override
	protected void method9613(@OriginalArg(1) int arg0) {
		super.anInt11012 = arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)I")
	public int method4563() {
		return super.anInt11012;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)Z")
	public boolean method4564() {
		return Static162.method2415(super.aClass2_Sub30_32.aClass11_Sub20_2.method4863());
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)I")
	@Override
	protected int method9617() {
		return 0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IB)I")
	@Override
	public int method9614(@OriginalArg(0) int arg0) {
		return Static162.method2415(super.aClass2_Sub30_32.aClass11_Sub20_2.method4863()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
	@Override
	public void method9616() {
		if (super.aClass2_Sub30_32.aClass11_Sub20_2.method4858() && !Static162.method2415(super.aClass2_Sub30_32.aClass11_Sub20_2.method4863())) {
			super.anInt11012 = 0;
		}
		if (super.anInt11012 < 0 || super.anInt11012 > 2) {
			super.anInt11012 = this.method9617();
		}
	}
}
