import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class14_Sub17 extends Class14 {

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!kda;)V")
	public Class14_Sub17(@OriginalArg(0) Class6_Sub33 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(ILclient!kda;)V")
	public Class14_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub33 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)I")
	public int method5999() {
		return super.anInt10543;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I")
	@Override
	protected int method8573() {
		return 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
	@Override
	public void method8572() {
		@Pc(10) int local10 = super.aClass6_Sub33_31.method5000().method4947();
		if (local10 < 96) {
			super.anInt10543 = 0;
		}
		if (super.anInt10543 > 1 && local10 < 128) {
			super.anInt10543 = 1;
		}
		if (super.anInt10543 > 2 && local10 < 192) {
			super.anInt10543 = 2;
		}
		if (super.anInt10543 < 0 || super.anInt10543 > 3) {
			super.anInt10543 = this.method8573();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V")
	@Override
	protected void method8571(@OriginalArg(1) int arg0) {
		super.anInt10543 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(II)I")
	@Override
	public int method8577(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = super.aClass6_Sub33_31.method5000().method4947();
		if (local10 < 96) {
			return 3;
		} else if (arg0 > 1 && local10 < 128) {
			return 3;
		} else if (arg0 > 3 && local10 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)Z")
	public boolean method6003() {
		@Pc(15) int local15 = super.aClass6_Sub33_31.method5000().method4947();
		return local15 >= 96;
	}
}
