import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class23_Sub18 extends Class23 {

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "Z")
	public boolean aBoolean517 = false;

	@OriginalMember(owner = "client!kq", name = "B", descriptor = "Z")
	private boolean aBoolean518 = true;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub18(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		if (!super.aClass3_Sub48_31.method7827().method8483()) {
			super.anInt10359 = 0;
		}
		if (super.anInt10359 < 0 || super.anInt10359 > 5) {
			super.anInt10359 = this.method8501();
		}
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		this.aBoolean517 = false;
		super.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(B)Z")
	public boolean method5148() {
		return super.aClass3_Sub48_31.method7827().method8483();
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub48_31.method7827().method8483()) {
			return arg0 == 3 && !Static622.method7857("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "(B)I")
	public int method5152() {
		return super.anInt10359;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		this.aBoolean517 = true;
		return super.aClass3_Sub48_31.method7827().method8483() ? 2 : 0;
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "(B)Z")
	public boolean method5154() {
		return this.aBoolean518;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(IZ)V")
	public void method5156(@OriginalArg(1) boolean arg0) {
		this.aBoolean518 = arg0;
	}
}
