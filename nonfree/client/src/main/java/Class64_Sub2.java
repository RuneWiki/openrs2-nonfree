import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class64_Sub2 extends Class64 implements Interface24 {

	@OriginalMember(owner = "client!ll", name = "v", descriptor = "B")
	private byte aByte67;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!jq;Z)V")
	public Class64_Sub2(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method4802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte67 = (byte) arg0;
		super.method6942(arg1);
		return true;
	}

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "(B)I")
	public int method4804() {
		return this.aByte67;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4803() {
		return super.method4797(super.aClass43_Sub1_Sub2_5.aMapBuffer2);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
	@Override
	public void method6939() {
		super.method6939();
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)I")
	@Override
	public int method6937() {
		return super.method6937();
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4801() {
		return super.method4789(super.aClass43_Sub1_Sub2_5.aMapBuffer2);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method4800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Source arg2) {
		this.aByte67 = (byte) arg0;
		super.method4795(arg2, arg1);
		return true;
	}
}
