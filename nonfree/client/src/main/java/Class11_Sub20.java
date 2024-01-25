import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class11_Sub20 extends Class11 {

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Z")
	private boolean aBoolean457 = true;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Z")
	public boolean aBoolean458 = false;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11_Sub20(@OriginalArg(0) Class2_Sub30 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)I")
	@Override
	public int method9614(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub30_32.method2981().method7164()) {
			return arg0 == 3 && !Static302.method4225("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	@Override
	protected void method9613(@OriginalArg(1) int arg0) {
		this.aBoolean458 = false;
		super.anInt11012 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)I")
	@Override
	protected int method9617() {
		this.aBoolean458 = true;
		return super.aClass2_Sub30_32.method2981().method7164() ? 2 : 0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)Z")
	public boolean method4857() {
		return super.aClass2_Sub30_32.method2981().method7164();
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)Z")
	public boolean method4858() {
		return this.aBoolean457;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(ZI)V")
	public void method4859(@OriginalArg(0) boolean arg0) {
		this.aBoolean457 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	@Override
	public void method9616() {
		if (!super.aClass2_Sub30_32.method2981().method7164()) {
			super.anInt11012 = 0;
		}
		if (super.anInt11012 < 0 || super.anInt11012 > 5) {
			super.anInt11012 = this.method9617();
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)I")
	public int method4863() {
		return super.anInt11012;
	}
}
