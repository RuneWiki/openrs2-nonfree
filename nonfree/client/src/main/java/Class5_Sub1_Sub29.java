import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class5_Sub1_Sub29 extends Class5_Sub1 {

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
	private int anInt4488;

	@OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
	private int anInt4490;

	@OriginalMember(owner = "client!nr", name = "K", descriptor = "I")
	private int anInt4495;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub29() {
		this(0);
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(I)V")
	private Class5_Sub1_Sub29(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method3578(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.method3578(arg1.method5541());
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(BI)V")
	private void method3578(@OriginalArg(1) int arg0) {
		this.anInt4490 = arg0 >> 12 & 0xFF0;
		this.anInt4488 = arg0 >> 4 & 0xFF0;
		this.anInt4495 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static148.anInt2666; local35++) {
				local25[local35] = this.anInt4490;
				local29[local35] = this.anInt4488;
				local33[local35] = this.anInt4495;
			}
		}
		return local17;
	}
}
