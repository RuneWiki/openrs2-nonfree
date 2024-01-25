import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
	private int anInt2888;

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
	private int anInt2891;

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
	private int anInt2892;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
	private Class3_Sub1_Sub7(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2611(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub7() {
		this(0);
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static206.anInt4182; local35++) {
				local25[local35] = this.anInt2891;
				local29[local35] = this.anInt2892;
				local33[local35] = this.anInt2888;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
	private void method2611(@OriginalArg(1) int arg0) {
		this.anInt2888 = (arg0 & 0xFF) << 4;
		this.anInt2892 = arg0 >> 4 & 0xFF0;
		this.anInt2891 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method2611(arg0.method3126());
		}
	}
}
