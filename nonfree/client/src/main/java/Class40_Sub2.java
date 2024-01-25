import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class40_Sub2 extends Class40 implements Interface8 {

	@OriginalMember(owner = "client!cn", name = "B", descriptor = "Lclient!al;")
	private final Class19 aClass19_11;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!md;Lclient!al;Z)V")
	public Class40_Sub2(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass19_11 = arg1;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5085() {
		return super.method1391(super.aClass144_Sub1_Sub2_5.aMapBuffer1);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5081() {
		return super.method1390(super.aClass144_Sub1_Sub2_5.aMapBuffer1);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
	@Override
	public void method5084(@OriginalArg(1) int arg0) {
		super.method5084(arg0 * this.aClass19_11.anInt242);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	@Override
	public void method5842() {
		super.method5842();
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)I")
	@Override
	public int method5839() {
		return super.method5839();
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)Lclient!al;")
	@Override
	public Class19 method5082() {
		return this.aClass19_11;
	}
}
