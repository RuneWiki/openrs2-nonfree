import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class21_Sub28 extends Class21 {

	@OriginalMember(owner = "client!um", name = "q", descriptor = "Z")
	private boolean aBoolean678 = true;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "Z")
	public boolean aBoolean677 = false;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class21_Sub28(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(ILclient!eha;)V")
	public Class21_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(II)V")
	@Override
	protected void method9240(@OriginalArg(1) int arg0) {
		super.anInt10876 = arg0;
		this.aBoolean677 = false;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	@Override
	public void method9235() {
		if (!super.aClass3_Sub22_34.method2416().method3941()) {
			super.anInt10876 = 0;
		}
		if (super.anInt10876 < 0 || super.anInt10876 > 5) {
			super.anInt10876 = this.method9239();
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)Z")
	public boolean method8618() {
		return this.aBoolean678;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)I")
	@Override
	protected int method9239() {
		this.aBoolean677 = true;
		return super.aClass3_Sub22_34.method2416().method3941() ? 2 : 0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)V")
	public void method8619(@OriginalArg(1) boolean arg0) {
		this.aBoolean678 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)I")
	public int method8620() {
		return super.anInt10876;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(II)I")
	@Override
	public int method9238(@OriginalArg(1) int arg0) {
		if (super.aClass3_Sub22_34.method2416().method3941()) {
			return arg0 == 3 && !Static511.method6935("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(B)Z")
	public boolean method8622() {
		return super.aClass3_Sub22_34.method2416().method3941();
	}
}
