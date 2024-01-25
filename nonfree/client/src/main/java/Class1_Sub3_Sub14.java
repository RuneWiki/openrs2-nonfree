import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!j", name = "P", descriptor = "I")
	private int anInt4266;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
	private int anInt4267;

	@OriginalMember(owner = "client!j", name = "S", descriptor = "I")
	private int anInt4269;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub14() {
		this(0);
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub14(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method3973(arg0);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static254.anInt4973; local35++) {
				local25[local35] = this.anInt4269;
				local29[local35] = this.anInt4266;
				local33[local35] = this.anInt4267;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.method3973(arg1.method4486());
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(II)V")
	private void method3973(@OriginalArg(0) int arg0) {
		this.anInt4269 = arg0 >> 12 & 0xFF0;
		this.anInt4266 = arg0 >> 4 & 0xFF0;
		this.anInt4267 = (arg0 & 0xFF) << 4;
	}
}
