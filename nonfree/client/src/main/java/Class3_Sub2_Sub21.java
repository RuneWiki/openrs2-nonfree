import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class3_Sub2_Sub21 extends Class3_Sub2 {

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
	private int anInt5544 = 4096;

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
	private int anInt5543 = 0;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(21) int[] local21 = this.method8669(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static201.anInt3738; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt5543 <= local29 && local29 <= this.anInt5544 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5543 = arg0.method5610();
		} else if (arg1 == 1) {
			this.anInt5544 = arg0.method5610();
		}
	}
}
