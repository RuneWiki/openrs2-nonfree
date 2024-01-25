import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class21_Sub25 extends Class21 {

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub25(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)I")
	public int method8195() {
		return super.anInt11183;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return 2;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		if (super.aClass14_Sub22_31.aClass21_Sub6_1.method1932() && super.anInt11183 == 2) {
			super.anInt11183 = 1;
		}
		if (super.anInt11183 < 0 || super.anInt11183 > 2) {
			super.anInt11183 = this.method9292();
		}
	}
}
