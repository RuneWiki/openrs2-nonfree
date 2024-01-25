import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public final class Class14_Sub9 extends Class14 {

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(ILclient!kda;)V")
	public Class14_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub33 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!kda;)V")
	public Class14_Sub9(@OriginalArg(0) Class6_Sub33 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
	@Override
	protected void method8571(@OriginalArg(1) int arg0) {
		super.anInt10543 = arg0;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)I")
	@Override
	protected int method8573() {
		return super.aClass6_Sub33_31.method5002() ? 1 : 0;
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)I")
	public int method2803() {
		return super.anInt10543;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
	@Override
	public void method8572() {
		super.anInt10543 = this.method8573();
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(II)I")
	@Override
	public int method8577(@OriginalArg(0) int arg0) {
		return 3;
	}
}
