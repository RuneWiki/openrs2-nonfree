import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class160_Sub2 extends Class160 {

	@OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
	private final int anInt7675;

	@OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
	private final int anInt7673;

	@OriginalMember(owner = "client!pca", name = "j", descriptor = "I")
	private final int anInt7671;

	@OriginalMember(owner = "client!pca", name = "i", descriptor = "I")
	private final int anInt7670;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(IIIIIII)V")
	public Class160_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7675 = arg2;
		this.anInt7673 = arg1;
		this.anInt7671 = arg0;
		this.anInt7670 = arg3;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)V")
	@Override
	public void method8042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt7671 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt7675 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt7673 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt7670 * arg0 >> 12;
		Static479.method8321(super.anInt9564, local39, super.anInt9562, local10, local24, local17, super.anInt9565);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IZI)V")
	@Override
	public void method8041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7671 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt7675 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt7673 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt7670 >> 12;
		Static572.method7865(local35, local10, super.anInt9565, local17, local24);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7671 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt7675 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt7673 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt7670 >> 12;
		Static3.method51(super.anInt9564, local17, local24, local35, local10, super.anInt9562);
	}
}
