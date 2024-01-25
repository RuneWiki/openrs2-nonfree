import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class107_Sub1 extends Class107 implements Interface11 {

	@OriginalMember(owner = "client!fr", name = "I", descriptor = "Lclient!ok;")
	private final Class242 aClass242_5;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!no;Lclient!ok;Z)V")
	public Class107_Sub1(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass242_5 = arg1;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)Lclient!ok;")
	@Override
	public Class242 method3079() {
		return this.aClass242_5;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method3078() {
		return super.method8436(super.aClass100_Sub1_Sub2_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V")
	@Override
	public void method8431() {
		super.method8431();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I")
	@Override
	public int method8428() {
		return super.method8428();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3077() {
		return super.method8429(super.aClass100_Sub1_Sub2_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)V")
	@Override
	public void method8437(@OriginalArg(1) int arg0) {
		super.method8437(arg0 * this.aClass242_5.anInt7529);
	}
}
