import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class14_Sub2_Sub5 extends Class14_Sub2 {

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	private int anInt5273;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
	private int anInt5274;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLclient!mda;)V")
	@Override
	public void method9307(@OriginalArg(1) Class229 arg0) {
		arg0.method5436(this.anInt5274, this.anInt5273);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!so;)V")
	@Override
	public void method9310(@OriginalArg(1) Class14_Sub29 arg0) {
		this.anInt5274 = arg0.method5878();
		this.anInt5273 = arg0.method5878();
	}
}
