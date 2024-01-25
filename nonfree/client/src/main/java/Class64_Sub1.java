import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public final class Class64_Sub1 extends Class64 implements Interface17 {

	@OriginalMember(owner = "client!dfa", name = "N", descriptor = "Lclient!ro;")
	private final Class292 aClass292_5;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lclient!jq;Lclient!ro;Z)V")
	public Class64_Sub1(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass292_5 = arg1;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V")
	@Override
	public void method6939() {
		super.method6939();
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6941() {
		return super.method4789(super.aClass43_Sub1_Sub2_5.aMapBuffer1);
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(B)Lclient!ro;")
	@Override
	public Class292 method6940() {
		return this.aClass292_5;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IB)V")
	@Override
	public void method6942(@OriginalArg(0) int arg0) {
		super.method6942(arg0 * this.aClass292_5.anInt7532);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6938() {
		return super.method4797(super.aClass43_Sub1_Sub2_5.aMapBuffer1);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)I")
	@Override
	public int method6937() {
		return super.method6937();
	}
}
