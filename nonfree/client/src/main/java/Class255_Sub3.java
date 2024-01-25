import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class255_Sub3 extends Class255 {

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "Lclient!xa;")
	private Class66 aClass66_39;

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
	private int anInt9653;

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "Lclient!jo;")
	private final Class168 aClass168_125;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!jo;Lclient!fca;)V")
	public Class255_Sub3(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class101_Sub1 arg1) {
		super(arg1);
		this.aClass168_125 = arg0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BZII)V")
	@Override
	protected void method8055(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		this.anInt9653 = Static258.anInt5219;
		@Pc(25) int local25 = Static258.anInt5219 * super.aClass101_4.anInt9016 / 100;
		@Pc(28) int[] local28 = new int[4];
		Static323.aClass9_8.A(local28);
		Static323.aClass9_8.ca(arg0, arg1 + 2, arg0 + local25, arg1 + super.aClass101_4.anInt9009);
		this.aClass66_39.method8060(arg0, arg1 + 2, super.aClass101_4.anInt9016, super.aClass101_4.anInt9009);
		Static323.aClass9_8.ca(local28[0], local28[1], local28[2], local28[3]);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZZI)V")
	@Override
	protected void method8050(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static323.aClass9_8.method5436(arg1 - 2, arg0, super.aClass101_4.anInt9016 + 4, super.aClass101_4.anInt9009 + 2, ((Class101_Sub1) super.aClass101_4).anInt2937, 0);
		Static323.aClass9_8.method5436(arg1 - 1, arg0 + 1, super.aClass101_4.anInt9016 + 2, super.aClass101_4.anInt9009, 0, 0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	@Override
	public void method8048() {
		this.aClass66_39 = Static223.method4015(this.aClass168_125.method4438(((Class101_Sub1) super.aClass101_4).anInt2939));
		this.method8047();
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return this.aClass168_125.method4427(((Class101_Sub1) super.aClass101_4).anInt2939);
	}
}
