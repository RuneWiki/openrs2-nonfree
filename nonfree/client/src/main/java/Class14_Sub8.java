import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class14_Sub8 extends Class14 {

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Z")
	public boolean aBoolean240 = false;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "Z")
	private boolean aBoolean241 = true;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!kda;)V")
	public Class14_Sub8(@OriginalArg(0) Class6_Sub33 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(ILclient!kda;)V")
	public Class14_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub33 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZ)V")
	public void method2639(@OriginalArg(0) boolean arg0) {
		this.aBoolean241 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)I")
	public int method2640() {
		return super.anInt10543;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
	@Override
	protected void method8571(@OriginalArg(1) int arg0) {
		super.anInt10543 = arg0;
		this.aBoolean240 = false;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)I")
	@Override
	public int method8577(@OriginalArg(0) int arg0) {
		if (super.aClass6_Sub33_31.method5000().method4946()) {
			return arg0 == 3 && !Static46.method1558("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)I")
	@Override
	protected int method8573() {
		this.aBoolean240 = true;
		return super.aClass6_Sub33_31.method5000().method4946() ? 2 : 0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	@Override
	public void method8572() {
		if (!super.aClass6_Sub33_31.method5000().method4946()) {
			super.anInt10543 = 0;
		}
		if (super.anInt10543 < 0 || super.anInt10543 > 5) {
			super.anInt10543 = this.method8573();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)Z")
	public boolean method2643() {
		return this.aBoolean241;
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)Z")
	public boolean method2644() {
		return super.aClass6_Sub33_31.method5000().method4946();
	}
}
