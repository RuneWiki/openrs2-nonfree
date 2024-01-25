import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class25_Sub1 extends Class25 implements Interface13 {

	@OriginalMember(owner = "client!av", name = "I", descriptor = "Lclient!jm;")
	private final Class160 aClass160_1;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!ai;Lclient!jm;Z)V")
	public Class25_Sub1(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass160_1 = arg1;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4655() {
		return super.method6495(super.aClass16_Sub1_Sub1_10.aMapBuffer1);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)V")
	@Override
	public void method6496() {
		super.method6496();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4654() {
		return super.method6497(super.aClass16_Sub1_Sub1_10.aMapBuffer1);
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(Z)I")
	@Override
	public int method6492() {
		return super.method6492();
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(Z)Lclient!jm;")
	@Override
	public Class160 method4653() {
		return this.aClass160_1;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V")
	@Override
	public void method6500(@OriginalArg(1) int arg0) {
		super.method6500(arg0 * this.aClass160_1.anInt5547);
	}
}
