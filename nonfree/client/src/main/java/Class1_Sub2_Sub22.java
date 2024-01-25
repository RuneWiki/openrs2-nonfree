import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
	private int anInt5242;

	@OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
	private int anInt5245;

	@OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
	private int anInt5246;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub22() {
		this(0);
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I)V")
	private Class1_Sub2_Sub22(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4195(arg0);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V")
	private void method4195(@OriginalArg(1) int arg0) {
		this.anInt5242 = arg0 >> 12 & 0xFF0;
		this.anInt5245 = arg0 >> 4 & 0xFF0;
		this.anInt5246 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static218.anInt3990; local29++) {
				local19[local29] = this.anInt5242;
				local23[local29] = this.anInt5245;
				local27[local29] = this.anInt5246;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method4195(arg0.method2881());
		}
	}
}
