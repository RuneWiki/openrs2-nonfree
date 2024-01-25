import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class4_Sub2_Sub14 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
	private int anInt3136;

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
	private int anInt3138;

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
	private int anInt3139;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub14() {
		this(0);
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
	private Class4_Sub2_Sub14(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2459(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static350.anInt6330; local34++) {
				local24[local34] = this.anInt3136;
				local28[local34] = this.anInt3138;
				local32[local34] = this.anInt3139;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
	private void method2459(@OriginalArg(0) int arg0) {
		this.anInt3136 = arg0 >> 12 & 0xFF0;
		this.anInt3138 = arg0 >> 4 & 0xFF0;
		this.anInt3139 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.method2459(arg1.method4887());
		}
	}
}
