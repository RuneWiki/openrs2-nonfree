import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class14_Sub7_Sub4 extends Class14_Sub7 {

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
	private int anInt1175;

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
	private int anInt1178;

	@OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
	private int anInt1179;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub4() {
		this(0);
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V")
	private Class14_Sub7_Sub4(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1197(arg0);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			for (@Pc(38) int local38 = 0; local38 < Static613.anInt10114; local38++) {
				local28[local38] = this.anInt1179;
				local32[local38] = this.anInt1175;
				local36[local38] = this.anInt1178;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)V")
	private void method1197(@OriginalArg(1) int arg0) {
		this.anInt1179 = arg0 >> 12 & 0xFF0;
		this.anInt1178 = (arg0 & 0xFF) << 4;
		this.anInt1175 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.method1197(arg1.method7719());
		}
	}
}
