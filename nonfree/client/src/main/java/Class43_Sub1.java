import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!bka", name = "l", descriptor = "Z")
	private boolean aBoolean63 = true;

	@OriginalMember(owner = "client!bka", name = "j", descriptor = "Z")
	public boolean aBoolean64 = false;

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(ILclient!lha;)V")
	public Class43_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub26 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lclient!lha;)V")
	public Class43_Sub1(@OriginalArg(0) Class14_Sub26 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "(I)Z")
	public boolean method797() {
		return this.aBoolean63;
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		if (!super.aClass14_Sub26_32.method5272().method8396()) {
			super.anInt10397 = 0;
		}
		if (super.anInt10397 < 0 || super.anInt10397 > 5) {
			super.anInt10397 = this.method8889();
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Z)I")
	public int method801() {
		return super.anInt10397;
	}

	@OriginalMember(owner = "client!bka", name = "c", descriptor = "(I)Z")
	public boolean method802() {
		return super.aClass14_Sub26_32.method5272().method8396();
	}

	@OriginalMember(owner = "client!bka", name = "c", descriptor = "(II)I")
	@Override
	public int method8894(@OriginalArg(0) int arg0) {
		if (super.aClass14_Sub26_32.method5272().method8396()) {
			return arg0 == 3 && !Static685.method4080("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(II)V")
	@Override
	protected void method8893(@OriginalArg(1) int arg0) {
		super.anInt10397 = arg0;
		this.aBoolean64 = false;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IZ)V")
	public void method804(@OriginalArg(1) boolean arg0) {
		this.aBoolean63 = arg0;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)I")
	@Override
	protected int method8889() {
		this.aBoolean64 = true;
		return super.aClass14_Sub26_32.method5272().method8396() ? 2 : 0;
	}
}
