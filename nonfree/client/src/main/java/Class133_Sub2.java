import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class133_Sub2 extends Class133 implements Interface25 {

	@OriginalMember(owner = "client!gr", name = "K", descriptor = "Lclient!on;")
	private final Class274 aClass274_6;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!dga;Lclient!on;Z)V")
	public Class133_Sub2(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass274_6 = arg1;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8676() {
		return super.method3797(super.aClass75_Sub1_Sub1_8.aMapBuffer1);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)V")
	@Override
	public void method8675() {
		super.method8675();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8677() {
		return super.method3798(super.aClass75_Sub1_Sub1_8.aMapBuffer1);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V")
	@Override
	public void method8679(@OriginalArg(0) int arg0) {
		super.method8679(arg0 * this.aClass274_6.anInt7437);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)Lclient!on;")
	@Override
	public Class274 method8678() {
		return this.aClass274_6;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)I")
	@Override
	public int method8674() {
		return super.method8674();
	}
}
