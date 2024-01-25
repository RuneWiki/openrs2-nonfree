import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
	private int anInt7706 = 4096;

	@OriginalMember(owner = "client!qo", name = "F", descriptor = "I")
	private int anInt7708 = 0;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt7708 = arg1.method7945();
		} else if (arg0 == 1) {
			this.anInt7706 = arg1.method7945();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(21) int[] local21 = this.method7836(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static501.anInt8748; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt7708 <= local29 && local29 <= this.anInt7706 ? 4096 : 0;
			}
		}
		return local11;
	}
}
