import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class29_Sub16 extends Class29 {

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "Z")
	public boolean aBoolean438 = false;

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "Z")
	private boolean aBoolean439 = true;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(ILclient!fs;)V")
	public Class29_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!fs;)V")
	public Class29_Sub16(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)Z")
	public boolean method5740() {
		return this.aBoolean439;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)I")
	public int method5742() {
		return super.anInt10604;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V")
	public void method5743(@OriginalArg(0) boolean arg0) {
		this.aBoolean439 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	@Override
	public void method8995() {
		if (!super.aClass6_Sub22_31.method2368().method4182()) {
			super.anInt10604 = 0;
		}
		if (super.anInt10604 < 0 || super.anInt10604 > 5) {
			super.anInt10604 = this.method8997();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I")
	@Override
	protected int method8997() {
		this.aBoolean438 = true;
		return super.aClass6_Sub22_31.method2368().method4182() ? 2 : 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I")
	@Override
	public int method8994(@OriginalArg(0) int arg0) {
		if (super.aClass6_Sub22_31.method2368().method4182()) {
			return arg0 == 3 && !Static359.method5205("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(II)V")
	@Override
	protected void method9000(@OriginalArg(0) int arg0) {
		this.aBoolean438 = false;
		super.anInt10604 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)Z")
	public boolean method5744() {
		return super.aClass6_Sub22_31.method2368().method4182();
	}
}
