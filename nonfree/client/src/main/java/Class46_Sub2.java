import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class46_Sub2 extends Class46 implements Interface6 {

	@OriginalMember(owner = "client!vl", name = "z", descriptor = "Lclient!qda;")
	private final Class273 aClass273_20;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!ad;Lclient!qda;Z)V")
	public Class46_Sub2(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass273_20 = arg1;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)I")
	@Override
	public int method7923() {
		return super.method7923();
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7936() {
		return super.method7933(super.aClass7_Sub1_Sub1_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
	@Override
	public void method7932(@OriginalArg(1) int arg0) {
		super.method7932(arg0 * this.aClass273_20.anInt8146);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7935() {
		return super.method7931(super.aClass7_Sub1_Sub1_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	@Override
	public void method7925() {
		super.method7925();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Lclient!qda;")
	@Override
	public Class273 method7934() {
		return this.aClass273_20;
	}
}
