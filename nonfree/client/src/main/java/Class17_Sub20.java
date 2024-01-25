import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public final class Class17_Sub20 extends Class17 {

	@OriginalMember(owner = "client!or", name = "o", descriptor = "Z")
	private boolean aBoolean582 = true;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "Z")
	public boolean aBoolean583 = false;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(ILclient!eka;)V")
	public Class17_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!eka;)V")
	public Class17_Sub20(@OriginalArg(0) Class3_Sub15 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)I")
	@Override
	public int method8734(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub15_31.method2426().method5833()) {
			return arg0 == 3 && !Static393.method5693("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)Z")
	public boolean method6398() {
		return super.aClass3_Sub15_31.method2426().method5833();
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(B)Z")
	public boolean method6399() {
		return this.aBoolean582;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
	public void method6400(@OriginalArg(0) boolean arg0) {
		this.aBoolean582 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(II)V")
	@Override
	protected void method8737(@OriginalArg(0) int arg0) {
		super.anInt10323 = arg0;
		this.aBoolean583 = false;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)I")
	@Override
	protected int method8732() {
		this.aBoolean583 = true;
		return super.aClass3_Sub15_31.method2426().method5833() ? 2 : 0;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
	@Override
	public void method8733() {
		if (!super.aClass3_Sub15_31.method2426().method5833()) {
			super.anInt10323 = 0;
		}
		if (super.anInt10323 < 0 || super.anInt10323 > 5) {
			super.anInt10323 = this.method8732();
		}
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(B)I")
	public int method6402() {
		return super.anInt10323;
	}
}
