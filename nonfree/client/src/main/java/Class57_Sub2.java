import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class57_Sub2 extends Class57 implements Interface16 {

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "Lclient!kn;")
	private final Class206 aClass206_19;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!og;Lclient!kn;Z)V")
	public Class57_Sub2(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass206_19 = arg1;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)I")
	@Override
	public int method7861() {
		return super.method7861();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7863(@OriginalArg(1) int arg0) {
		super.method7863(this.aClass206_19.anInt5575 * arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7862() {
		return super.method7642(super.aClass143_Sub1_Sub2_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7864() {
		return super.method7643(super.aClass143_Sub1_Sub2_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	@Override
	public void method7866() {
		super.method7866();
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)Lclient!kn;")
	@Override
	public Class206 method7865() {
		return this.aClass206_19;
	}
}
