import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public final class Class15_Sub25 extends Class15 {

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15_Sub25(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)Z")
	public boolean method8354() {
		return Static175.method3215(super.aClass6_Sub22_31.aClass15_Sub22_2.method6681());
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)I")
	@Override
	protected int method8986() {
		return 0;
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)V")
	@Override
	protected void method8985(@OriginalArg(1) int arg0) {
		super.anInt10701 = arg0;
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)I")
	public int method8355() {
		return super.anInt10701;
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(II)I")
	@Override
	public int method8990(@OriginalArg(1) int arg0) {
		return Static175.method3215(super.aClass6_Sub22_31.aClass15_Sub22_2.method6681()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (super.aClass6_Sub22_31.aClass15_Sub22_2.method6680() && !Static175.method3215(super.aClass6_Sub22_31.aClass15_Sub22_2.method6681())) {
			super.anInt10701 = 0;
		}
		if (super.anInt10701 < 0 || super.anInt10701 > 1) {
			super.anInt10701 = this.method8986();
		}
	}
}
