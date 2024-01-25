import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class172_Sub2 extends Class172 implements Interface3 {

	@OriginalMember(owner = "client!lp", name = "A", descriptor = "Lclient!bv;")
	private final Class42 aClass42_14;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!dda;Lclient!bv;Z)V")
	public Class172_Sub2(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass42_14 = arg1;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5237() {
		return super.method5233(super.aClass44_Sub2_Sub1_8.aMapBuffer1);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)Lclient!bv;")
	@Override
	public Class42 method5236() {
		return this.aClass42_14;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5235() {
		return super.method5231(super.aClass44_Sub2_Sub1_8.aMapBuffer1);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)V")
	@Override
	public void method5228(@OriginalArg(0) int arg0) {
		super.method5228(arg0 * this.aClass42_14.anInt771);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
	@Override
	public void method5230() {
		super.method5230();
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)I")
	@Override
	public int method5223() {
		return super.method5223();
	}
}
