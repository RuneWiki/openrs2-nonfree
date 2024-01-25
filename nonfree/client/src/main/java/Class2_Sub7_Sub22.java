import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class2_Sub7_Sub22 extends Class2_Sub7 {

	@OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
	private int anInt5200;

	@OriginalMember(owner = "client!lo", name = "K", descriptor = "I")
	private int anInt5201;

	@OriginalMember(owner = "client!lo", name = "S", descriptor = "I")
	private int anInt5207;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub22() {
		this(0);
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(I)V")
	private Class2_Sub7_Sub22(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4470(arg0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static352.anInt6485; local34++) {
				local24[local34] = this.anInt5207;
				local28[local34] = this.anInt5200;
				local32[local34] = this.anInt5201;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.method4470(arg1.method5210());
		}
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(BI)V")
	private void method4470(@OriginalArg(1) int arg0) {
		this.anInt5207 = arg0 >> 12 & 0xFF0;
		this.anInt5200 = arg0 >> 4 & 0xFF0;
		this.anInt5201 = (arg0 & 0xFF) << 4;
	}
}
