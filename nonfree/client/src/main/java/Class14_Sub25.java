import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public final class Class14_Sub25 extends Class14 {

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lclient!kda;)V")
	public Class14_Sub25(@OriginalArg(0) Class6_Sub33 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(ILclient!kda;)V")
	public Class14_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub33 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(II)I")
	@Override
	public int method8577(@OriginalArg(0) int arg0) {
		if (super.aClass6_Sub33_31.method5002()) {
			return 3;
		} else if (super.aClass6_Sub33_31.method4997() == Static406.aClass290_34) {
			if (arg0 == 0) {
				if (super.aClass6_Sub33_31.aClass14_Sub14_1.method4939() == 1) {
					return 2;
				}
				if (super.aClass6_Sub33_31.aClass14_Sub20_1.method7110() == 1) {
					return 2;
				}
				if (super.aClass6_Sub33_31.aClass14_Sub28_1.method8390() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V")
	@Override
	public void method8572() {
		if (super.aClass6_Sub33_31.method4997() != Static406.aClass290_34) {
			super.anInt10543 = 1;
		} else if (super.aClass6_Sub33_31.method5002()) {
			super.anInt10543 = 0;
		}
		if (super.anInt10543 != 0 && super.anInt10543 != 1) {
			super.anInt10543 = this.method8573();
		}
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)I")
	public int method8150() {
		return super.anInt10543;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)V")
	@Override
	protected void method8571(@OriginalArg(1) int arg0) {
		super.anInt10543 = arg0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)I")
	@Override
	protected int method8573() {
		return 1;
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)Z")
	public boolean method8152() {
		if (super.aClass6_Sub33_31.method5002()) {
			return false;
		} else {
			return super.aClass6_Sub33_31.method4997() == Static406.aClass290_34;
		}
	}
}
