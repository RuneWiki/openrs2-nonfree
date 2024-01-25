import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public final class Class14_Sub6 extends Class14 {

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!kda;)V")
	public Class14_Sub6(@OriginalArg(0) Class6_Sub33 arg0) {
		super(arg0);
		Static5.method441(super.anInt10543);
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(ILclient!kda;)V")
	public Class14_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub33 arg1) {
		super(arg0, arg1);
		Static5.method441(super.anInt10543);
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)I")
	public int method2321() {
		return super.anInt10543;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)I")
	@Override
	protected int method8573() {
		return super.aClass6_Sub33_31.method5000().method4947() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V")
	@Override
	public void method8572() {
		if (super.aClass6_Sub33_31.method5000().method4947() < 96) {
			super.anInt10543 = 0;
		}
		if (super.anInt10543 < 0 || super.anInt10543 > 2) {
			super.anInt10543 = this.method8573();
		}
	}

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)Z")
	public boolean method2324() {
		return super.aClass6_Sub33_31.method5000().method4947() >= 96;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)V")
	@Override
	protected void method8571(@OriginalArg(1) int arg0) {
		super.anInt10543 = arg0;
		Static5.method441(super.anInt10543);
	}

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "(II)I")
	@Override
	public int method8577(@OriginalArg(0) int arg0) {
		return super.aClass6_Sub33_31.method5000().method4947() < 96 ? 3 : 1;
	}
}
