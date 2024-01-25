import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class4_Sub2_Sub25 extends Class4_Sub2 {

	@OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
	private int anInt8051;

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
	private int anInt8055;

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
	private int anInt8057;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V")
	private Class4_Sub2_Sub25(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method7014(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub25() {
		this(0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.method7014(arg1.method8827());
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static269.anInt4330; local37++) {
				local27[local37] = this.anInt8051;
				local31[local37] = this.anInt8057;
				local35[local37] = this.anInt8055;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(BI)V")
	private void method7014(@OriginalArg(1) int arg0) {
		this.anInt8051 = arg0 >> 12 & 0xFF0;
		this.anInt8057 = arg0 >> 4 & 0xFF0;
		this.anInt8055 = (arg0 & 0xFF) << 4;
	}
}
