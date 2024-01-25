import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class1_Sub4_Sub37 extends Class1_Sub4 {

	@OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
	private int anInt7178;

	@OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
	private int anInt7179;

	@OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
	private int anInt7183;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub37() {
		this(0);
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I)V")
	private Class1_Sub4_Sub37(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5630(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)V")
	private void method5630(@OriginalArg(0) int arg0) {
		this.anInt7179 = (arg0 & 0xFF) << 4;
		this.anInt7183 = arg0 >> 12 & 0xFF0;
		this.anInt7178 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method5630(arg0.method5345());
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static395.anInt6592; local34++) {
				local24[local34] = this.anInt7183;
				local28[local34] = this.anInt7178;
				local32[local34] = this.anInt7179;
			}
		}
		return local11;
	}
}
