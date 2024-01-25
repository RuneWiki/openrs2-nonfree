import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public final class Class21_Sub26 extends Class21 {

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class21_Sub26(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
		Static380.method5128(super.anInt10876);
	}

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(ILclient!eha;)V")
	public Class21_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
		Static380.method5128(super.anInt10876);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	@Override
	public void method9235() {
		if (super.aClass3_Sub22_34.method2416().method3942() < 96) {
			super.anInt10876 = 0;
		}
		if (super.anInt10876 < 0 || super.anInt10876 > 2) {
			super.anInt10876 = this.method9239();
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(II)I")
	@Override
	public int method9238(@OriginalArg(1) int arg0) {
		return super.aClass3_Sub22_34.method2416().method3942() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)Z")
	public boolean method8224() {
		return super.aClass3_Sub22_34.method2416().method3942() >= 96;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)I")
	@Override
	protected int method9239() {
		return super.aClass3_Sub22_34.method2416().method3942() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(II)V")
	@Override
	protected void method9240(@OriginalArg(1) int arg0) {
		super.anInt10876 = arg0;
		Static380.method5128(super.anInt10876);
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)I")
	public int method8225() {
		return super.anInt10876;
	}
}
