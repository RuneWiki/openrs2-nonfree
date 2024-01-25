import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class2_Sub10_Sub18 extends Class2_Sub10 {

	@OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
	private int anInt5576;

	@OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
	private int anInt5577;

	@OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
	private int anInt5581;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub18() {
		this(0);
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(I)V")
	private Class2_Sub10_Sub18(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4658(arg0);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
	private void method4658(@OriginalArg(1) int arg0) {
		this.anInt5581 = arg0 >> 12 & 0xFF0;
		this.anInt5576 = (arg0 & 0xFF) << 4;
		this.anInt5577 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static93.anInt1862; local34++) {
				local24[local34] = this.anInt5581;
				local28[local34] = this.anInt5577;
				local32[local34] = this.anInt5576;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method4658(arg0.method6870());
		}
	}
}
