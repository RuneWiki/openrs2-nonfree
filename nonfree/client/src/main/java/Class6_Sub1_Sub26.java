import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class6_Sub1_Sub26 extends Class6_Sub1 {

	@OriginalMember(owner = "client!o", name = "J", descriptor = "I")
	private int anInt4045;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub26() {
		this(4096);
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I)V")
	public Class6_Sub1_Sub26(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4045 = 4096;
		this.anInt4045 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			Static358.method955(local14, 0, Static299.anInt5659, this.anInt4045);
		}
		return local14;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4045 = (arg0.method3972() << 12) / 255;
		}
	}
}
