import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class2_Sub2_Sub36 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
	private int anInt6502;

	@OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
	private int anInt6503;

	@OriginalMember(owner = "client!ts", name = "J", descriptor = "I")
	private int anInt6507;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(I)V")
	private Class2_Sub2_Sub36(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5050(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub36() {
		this(0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(26) int[] local26 = local18[0];
			@Pc(30) int[] local30 = local18[1];
			@Pc(34) int[] local34 = local18[2];
			for (@Pc(36) int local36 = 0; local36 < Static217.anInt3574; local36++) {
				local26[local36] = this.anInt6507;
				local30[local36] = this.anInt6503;
				local34[local36] = this.anInt6502;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V")
	private void method5050(@OriginalArg(0) int arg0) {
		this.anInt6502 = (arg0 & 0xFF) << 4;
		this.anInt6503 = arg0 >> 4 & 0xFF0;
		this.anInt6507 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method5050(arg0.method3563());
		}
	}
}
