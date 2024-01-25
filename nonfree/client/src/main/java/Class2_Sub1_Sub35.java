import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class2_Sub1_Sub35 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
	private int anInt6913 = 4096;

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
	private int anInt6912 = 0;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt6912 = arg1.method3711();
		} else if (arg0 == 1) {
			this.anInt6913 = arg1.method3711();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(21) int[] local21 = this.method6037(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static131.anInt2581; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt6912 <= local29 && this.anInt6913 >= local29 ? 4096 : 0;
			}
		}
		return local11;
	}
}
