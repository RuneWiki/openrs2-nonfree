import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class1_Sub3_Sub24 extends Class1_Sub3 {

	@OriginalMember(owner = "client!lt", name = "I", descriptor = "I")
	private int anInt5400;

	@OriginalMember(owner = "client!lt", name = "L", descriptor = "I")
	private int anInt5402;

	@OriginalMember(owner = "client!lt", name = "M", descriptor = "I")
	private int anInt5403;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub24() {
		this(0);
	}

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub24(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4637(arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method4637(arg0.method3920());
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static452.anInt7734; local37++) {
				local27[local37] = this.anInt5403;
				local31[local37] = this.anInt5400;
				local35[local37] = this.anInt5402;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)V")
	private void method4637(@OriginalArg(0) int arg0) {
		this.anInt5402 = (arg0 & 0xFF) << 4;
		this.anInt5400 = arg0 >> 4 & 0xFF0;
		this.anInt5403 = arg0 >> 12 & 0xFF0;
	}
}
