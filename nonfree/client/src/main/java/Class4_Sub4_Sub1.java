import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class4_Sub4_Sub1 extends Class4_Sub4 {

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub1() {
		this(0);
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V")
	private Class4_Sub4_Sub1(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method717(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(ZI)V")
	private void method717(@OriginalArg(1) int arg0) {
		this.anInt817 = arg0 >> 12 & 0xFF0;
		this.anInt824 = arg0 >> 4 & 0xFF0;
		this.anInt819 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.method717(arg1.method2402());
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static124.anInt3576; local34++) {
				local24[local34] = this.anInt817;
				local28[local34] = this.anInt824;
				local32[local34] = this.anInt819;
			}
		}
		return local16;
	}
}
