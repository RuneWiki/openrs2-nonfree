import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class2_Sub4_Sub29 extends Class2_Sub4 {

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
	private int anInt5166 = 0;

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
	private int anInt5168 = 4096;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5166 = arg0.method5312();
		} else if (arg1 == 1) {
			this.anInt5168 = arg0.method5312();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(21) int[] local21 = this.method5600(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static76.anInt1458; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt5166 <= local29 && local29 <= this.anInt5168 ? 4096 : 0;
			}
		}
		return local11;
	}
}
