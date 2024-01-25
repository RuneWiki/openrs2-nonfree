import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class14_Sub26 extends Class14 {

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(ILclient!kda;)V")
	public Class14_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub33 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!kda;)V")
	public Class14_Sub26(@OriginalArg(0) Class6_Sub33 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I")
	@Override
	protected int method8573() {
		return 1;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	@Override
	protected void method8571(@OriginalArg(1) int arg0) {
		super.anInt10543 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)Z")
	public boolean method8191() {
		return !super.aClass6_Sub33_31.method5002();
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)I")
	@Override
	public int method8577(@OriginalArg(0) int arg0) {
		return super.aClass6_Sub33_31.method5002() ? 3 : 1;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)I")
	public int method8192() {
		return super.anInt10543;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	@Override
	public void method8572() {
		if (super.aClass6_Sub33_31.method5002()) {
			super.anInt10543 = 0;
		}
		if (super.anInt10543 != 1 && super.anInt10543 != 0) {
			super.anInt10543 = this.method8573();
		}
	}
}
