import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class4_Sub2_Sub22 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
	private int anInt4123;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(I)V")
	public Class4_Sub2_Sub22(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4123 = 4096;
		this.anInt4123 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub22() {
		this(4096);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt4123 = (arg1.method4864() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			Static457.method1217(local9, 0, Static350.anInt6330, this.anInt4123);
		}
		return local9;
	}
}
