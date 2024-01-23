import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
	private int anInt3817;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub26(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3817 = 4096;
		this.anInt3817 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		this(4096);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			Static300.method487(local9, 0, Static131.anInt2513, this.anInt3817);
		}
		return local9;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3817 = (arg0.method3122() << 12) / 255;
		}
	}
}
