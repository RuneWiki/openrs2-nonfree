import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class15_Sub22 extends Class15 {

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Z")
	private boolean aBoolean523 = true;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "Z")
	public boolean aBoolean524 = false;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15_Sub22(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)V")
	public void method6675(@OriginalArg(1) boolean arg0) {
		this.aBoolean523 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Z")
	public boolean method6677() {
		return super.aClass6_Sub22_31.method3527().method8498();
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)Z")
	public boolean method6680() {
		return this.aBoolean523;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)I")
	public int method6681() {
		return super.anInt10701;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)I")
	@Override
	protected int method8986() {
		this.aBoolean524 = true;
		return super.aClass6_Sub22_31.method3527().method8498() ? 2 : 0;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)V")
	@Override
	protected void method8985(@OriginalArg(1) int arg0) {
		this.aBoolean524 = false;
		super.anInt10701 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)I")
	@Override
	public int method8990(@OriginalArg(1) int arg0) {
		if (super.aClass6_Sub22_31.method3527().method8498()) {
			return arg0 == 3 && !Static634.method8945("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (!super.aClass6_Sub22_31.method3527().method8498()) {
			super.anInt10701 = 0;
		}
		if (super.anInt10701 < 0 || super.anInt10701 > 5) {
			super.anInt10701 = this.method8986();
		}
	}
}
