import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class1_Sub4_Sub16 extends Class1_Sub4 {

	@OriginalMember(owner = "client!jk", name = "B", descriptor = "I")
	private int anInt3372 = 0;

	@OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
	private int anInt3376 = 4096;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub16() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt3372 = arg1.method5362();
		} else if (arg0 == 1) {
			this.anInt3376 = arg1.method5362();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(26) int[] local26 = this.method5958(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static66.anInt1511; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = this.anInt3372 <= local34 && local34 <= this.anInt3376 ? 4096 : 0;
			}
		}
		return local16;
	}
}
