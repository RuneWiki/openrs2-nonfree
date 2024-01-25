import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class15_Sub19 extends Class15 {

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15_Sub19(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
		Static385.method6200(super.anInt10701);
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
		Static385.method6200(super.anInt10701);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)I")
	@Override
	protected int method8986() {
		return super.aClass6_Sub22_31.method3527().method8502() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)Z")
	public boolean method5697() {
		return super.aClass6_Sub22_31.method3527().method8502() >= 96;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V")
	@Override
	protected void method8985(@OriginalArg(1) int arg0) {
		super.anInt10701 = arg0;
		Static385.method6200(super.anInt10701);
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(II)I")
	@Override
	public int method8990(@OriginalArg(1) int arg0) {
		return super.aClass6_Sub22_31.method3527().method8502() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "(I)I")
	public int method5699() {
		return super.anInt10701;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (super.aClass6_Sub22_31.method3527().method8502() < 96) {
			super.anInt10701 = 0;
		}
		if (super.anInt10701 < 0 || super.anInt10701 > 2) {
			super.anInt10701 = this.method8986();
		}
	}
}
