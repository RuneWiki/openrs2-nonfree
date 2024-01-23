import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!o", name = "v", descriptor = "[I")
	public static int[] anIntArray682 = new int[99];

	@OriginalMember(owner = "client!o", name = "w", descriptor = "Lclient!tb;")
	protected Class153 aClass153_41;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "Lclient!wd;")
	protected Class176 aClass176_41;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "I")
	public int anInt5768;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "Z")
	public boolean aBoolean434;

	@OriginalMember(owner = "client!o", name = "M", descriptor = "[Lclient!o;")
	public Class1_Sub1[] aClass1_Sub1Array42;

	static {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 99; local9++) {
			@Pc(18) int local18 = local9 + 1;
			@Pc(31) int local31 = (int) (Math.pow(2.0D, (double) local18 / 7.0D) * 300.0D + (double) local18);
			local7 += local31;
			anIntArray682[local9] = local7 / 4;
		}
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean434 = arg1;
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[[I")
	public int[][] method4444(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLclient!jj;I)V")
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)I")
	public int method4448() {
		return -1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IBI)[I")
	protected final int[] method4450(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub1Array42[arg0].aBoolean434 ? this.aClass1_Sub1Array42[arg0].method4459(arg1) : this.aClass1_Sub1Array42[arg0].method4444(arg1)[0];
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)V")
	public final void method4452(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt5768 == 255 ? arg1 : this.anInt5768;
		if (this.aBoolean434) {
			this.aClass176_41 = new Class176(local20, arg1, arg0);
		} else {
			this.aClass153_41 = new Class153(local20, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)I")
	public int method4453() {
		return -1;
	}

	@OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
	public void method4454() {
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(BII)[[I")
	protected final int[][] method4457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub1Array42[arg0].aBoolean434) {
			@Pc(25) int[] local25 = this.aClass1_Sub1Array42[arg0].method4459(arg1);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass1_Sub1Array42[arg0].method4444(arg1);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)[I")
	public int[] method4459(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!o", name = "i", descriptor = "(I)V")
	public void method4460() {
		if (this.aBoolean434) {
			this.aClass176_41.method4473();
			this.aClass176_41 = null;
		} else {
			this.aClass153_41.method3954();
			this.aClass153_41 = null;
		}
	}
}
