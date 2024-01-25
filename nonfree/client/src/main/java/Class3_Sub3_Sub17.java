import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class3_Sub3_Sub17 extends Class3_Sub3 {

	@OriginalMember(owner = "client!jp", name = "N", descriptor = "I")
	private int anInt3021 = 0;

	@OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
	private int anInt3018 = 4096;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub17() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3021 = arg0.method3649();
		} else if (arg1 == 1) {
			this.anInt3018 = arg0.method3649();
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(21) int[] local21 = this.method5733(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static131.anInt2755; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt3021 <= local29 && this.anInt3018 >= local29 ? 4096 : 0;
			}
		}
		return local11;
	}
}
