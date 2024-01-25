import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class53_Sub2 extends Class53 implements Interface22 {

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Lclient!so;")
	private final Class330 aClass330_19;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!oia;Lclient!so;Z)V")
	public Class53_Sub2(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass330_19 = arg1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7739() {
		return super.method7729(super.aClass16_Sub1_Sub2_10.aMapBuffer1);
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)Lclient!so;")
	@Override
	public Class330 method7740() {
		return this.aClass330_19;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7738() {
		return super.method7736(super.aClass16_Sub1_Sub2_10.aMapBuffer1);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	@Override
	public void method7731() {
		super.method7731();
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)I")
	@Override
	public int method7727() {
		return super.method7727();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
	@Override
	public void method7734(@OriginalArg(0) int arg0) {
		super.method7734(this.aClass330_19.anInt8941 * arg0);
	}
}
