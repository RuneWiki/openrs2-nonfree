import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class6_Sub4_Sub26 extends Class6_Sub4 {

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
	private int anInt6972 = 0;

	@OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
	private int anInt6973 = 20;

	@OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
	private int anInt6978 = 1365;

	@OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
	private int anInt6975 = 0;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt6978 = arg1.method6003();
		} else if (arg0 == 1) {
			this.anInt6973 = arg1.method6003();
		} else if (arg0 == 2) {
			this.anInt6972 = arg1.method6003();
		} else if (arg0 == 3) {
			this.anInt6975 = arg1.method6003();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			for (@Pc(25) int local25 = 0; local25 < Static408.anInt7209; local25++) {
				@Pc(39) int local39 = this.anInt6972 + (Static398.anIntArray514[local25] << 12) / this.anInt6978;
				@Pc(51) int local51 = this.anInt6975 + (Static501.anIntArray637[arg0] << 12) / this.anInt6978;
				@Pc(57) int local57 = local39;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local39 * local39 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73 = 0;
				while (local65 + local71 < 16384 && this.anInt6973 > local73) {
					local59 = local51 + (local57 * local59 >> 12) * 2;
					local57 = local39 + local65 - local71;
					local65 = local57 * local57 >> 12;
					local73++;
					local71 = local59 * local59 >> 12;
				}
				local19[local25] = this.anInt6973 - 1 <= local73 ? 0 : (local73 << 12) / this.anInt6973;
			}
		}
		return local19;
	}
}
