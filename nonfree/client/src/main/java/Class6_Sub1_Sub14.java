import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class6_Sub1_Sub14 extends Class6_Sub1 {

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
	private int anInt2183;

	@OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
	private int anInt2184;

	@OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
	private int anInt2185;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I)V")
	private Class6_Sub1_Sub14(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2347(arg0);
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub14() {
		this(0);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static299.anInt5659; local29++) {
				local19[local29] = this.anInt2185;
				local23[local29] = this.anInt2184;
				local27[local29] = this.anInt2183;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
	private void method2347(@OriginalArg(0) int arg0) {
		this.anInt2183 = (arg0 & 0xFF) << 4;
		this.anInt2184 = arg0 >> 4 & 0xFF0;
		this.anInt2185 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method2347(arg0.method3996());
		}
	}
}
