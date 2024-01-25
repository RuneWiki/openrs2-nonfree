import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class2_Sub4_Sub12 extends Class2_Sub4 {

	@OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
	private int anInt3422;

	@OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
	private int anInt3425;

	@OriginalMember(owner = "client!fn", name = "O", descriptor = "I")
	private int anInt3429;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub12() {
		this(0);
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(I)V")
	private Class2_Sub4_Sub12(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2916(arg0);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method2916(arg0.method2835());
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(II)V")
	private void method2916(@OriginalArg(1) int arg0) {
		this.anInt3425 = arg0 >> 4 & 0xFF0;
		this.anInt3429 = arg0 >> 12 & 0xFF0;
		this.anInt3422 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static395.anInt6816; local29++) {
				local19[local29] = this.anInt3429;
				local23[local29] = this.anInt3425;
				local27[local29] = this.anInt3422;
			}
		}
		return local11;
	}
}
