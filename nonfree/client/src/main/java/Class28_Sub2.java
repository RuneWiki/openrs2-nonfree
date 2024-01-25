import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public final class Class28_Sub2 extends Class28 implements Interface24 {

	@OriginalMember(owner = "client!mw", name = "H", descriptor = "Lclient!baa;")
	private final Class26 aClass26_16;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!bga;Lclient!baa;Z)V")
	public Class28_Sub2(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass26_16 = arg1;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)V")
	@Override
	public void method6476(@OriginalArg(1) int arg0) {
		super.method6476(arg0 * this.aClass26_16.anInt622);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6477() {
		return super.method6070(super.aClass20_Sub2_Sub2_8.aMapBuffer1);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)I")
	@Override
	public int method6473() {
		return super.method6473();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6474() {
		return super.method6074(super.aClass20_Sub2_Sub2_8.aMapBuffer1);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)Lclient!baa;")
	@Override
	public Class26 method6478() {
		return this.aClass26_16;
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
	@Override
	public void method6475() {
		super.method6475();
	}
}
