import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public final class Class237_Sub1 extends Class237 implements Interface24 {

	@OriginalMember(owner = "client!mr", name = "B", descriptor = "Lclient!dr;")
	private final Class79 aClass79_17;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!fc;Lclient!dr;Z)V")
	public Class237_Sub1(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass79_17 = arg1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I")
	@Override
	public int method9028() {
		return super.method9028();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)V")
	@Override
	public void method9031(@OriginalArg(1) int arg0) {
		super.method9031(this.aClass79_17.anInt2048 * arg0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6460() {
		return super.method9032(super.aClass101_Sub1_Sub1_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
	@Override
	public void method9037() {
		super.method9037();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6459() {
		return super.method9033(super.aClass101_Sub1_Sub1_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Lclient!dr;")
	@Override
	public Class79 method6461() {
		return this.aClass79_17;
	}
}
