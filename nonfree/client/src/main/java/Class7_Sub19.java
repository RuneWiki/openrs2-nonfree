import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public final class Class7_Sub19 extends Class7 {

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "Z")
	private boolean aBoolean541 = true;

	@OriginalMember(owner = "client!oea", name = "l", descriptor = "Z")
	public boolean aBoolean542 = false;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(ILclient!pp;)V")
	public Class7_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub44 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lclient!pp;)V")
	public Class7_Sub19(@OriginalArg(0) Class6_Sub44 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)V")
	@Override
	protected void method8783(@OriginalArg(1) int arg0) {
		this.aBoolean542 = false;
		super.anInt10186 = arg0;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BI)I")
	@Override
	public int method8786(@OriginalArg(1) int arg0) {
		if (super.aClass6_Sub44_34.method7074().method3412()) {
			return arg0 == 3 && !Static668.method8853("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(I)Z")
	public boolean method6429() {
		return super.aClass6_Sub44_34.method7074().method3412();
	}

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "(I)Z")
	public boolean method6430() {
		return this.aBoolean541;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)I")
	public int method6431() {
		return super.anInt10186;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)I")
	@Override
	protected int method8782() {
		this.aBoolean542 = true;
		return super.aClass6_Sub44_34.method7074().method3412() ? 2 : 0;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V")
	@Override
	public void method8785() {
		if (!super.aClass6_Sub44_34.method7074().method3412()) {
			super.anInt10186 = 0;
		}
		if (super.anInt10186 < 0 || super.anInt10186 > 5) {
			super.anInt10186 = this.method8782();
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BZ)V")
	public void method6433(@OriginalArg(1) boolean arg0) {
		this.aBoolean541 = arg0;
	}
}
