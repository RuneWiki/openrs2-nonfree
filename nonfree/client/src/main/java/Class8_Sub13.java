import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class8_Sub13 extends Class8 {

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Z")
	public boolean aBoolean439 = false;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Z")
	private boolean aBoolean440 = true;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub13(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		this.aBoolean439 = true;
		return super.aClass4_Sub20_31.method3140().method1711() ? 2 : 0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		this.aBoolean439 = false;
		super.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)I")
	public int method5052() {
		return super.anInt9788;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)Z")
	public boolean method5054() {
		return this.aBoolean440;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		if (super.aClass4_Sub20_31.method3140().method1711()) {
			return arg0 == 3 && !Static596.method7822("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)V")
	public void method5056(@OriginalArg(1) boolean arg0) {
		this.aBoolean440 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
	@Override
	public void method8386() {
		if (!super.aClass4_Sub20_31.method3140().method1711()) {
			super.anInt9788 = 0;
		}
		if (super.anInt9788 < 0 || super.anInt9788 > 5) {
			super.anInt9788 = this.method8383();
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)Z")
	public boolean method5057() {
		return super.aClass4_Sub20_31.method3140().method1711();
	}
}
