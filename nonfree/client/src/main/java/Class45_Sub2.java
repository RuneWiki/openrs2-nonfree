import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class45_Sub2 extends Class45 implements Interface11 {

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "Lclient!bt;")
	private final Class42 aClass42_14;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!lm;Lclient!bt;Z)V")
	public Class45_Sub2(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass42_14 = arg1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I")
	@Override
	public int method5771() {
		return super.method5771();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4114() {
		return super.method2939(super.aClass100_Sub1_Sub2_8.aMapBuffer1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Lclient!bt;")
	@Override
	public Class42 method4115() {
		return this.aClass42_14;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4118() {
		return super.method2944(super.aClass100_Sub1_Sub2_8.aMapBuffer1);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	@Override
	public void method5772() {
		super.method5772();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
	@Override
	public void method4117(@OriginalArg(1) int arg0) {
		super.method4117(arg0 * this.aClass42_14.anInt1131);
	}
}
