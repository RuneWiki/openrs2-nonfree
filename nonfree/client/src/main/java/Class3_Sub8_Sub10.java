import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public class Class3_Sub8_Sub10 extends Class3_Sub8 {

	@OriginalMember(owner = "client!ifa", name = "H", descriptor = "[I")
	protected int[] anIntArray275;

	@OriginalMember(owner = "client!ifa", name = "I", descriptor = "I")
	protected int anInt4762;

	@OriginalMember(owner = "client!ifa", name = "J", descriptor = "I")
	protected int anInt4763;

	@OriginalMember(owner = "client!ifa", name = "E", descriptor = "I")
	private int anInt4759 = -1;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub10() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public final void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt4759 = arg1.method7951();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(B)Z")
	protected final boolean method4091() {
		if (this.anIntArray275 != null) {
			return true;
		} else if (this.anInt4759 >= 0) {
			@Pc(32) Class370 local32 = Static56.anInt1176 < 0 ? Static688.method8604(Static169.aClass362_36, this.anInt4759) : Static688.method8590(Static169.aClass362_36, Static56.anInt1176, this.anInt4759);
			local32.method8596();
			this.anIntArray275 = local32.method8600();
			this.anInt4763 = local32.anInt10490;
			this.anInt4762 = local32.anInt10491;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628 && this.method4091()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(37) int[] local37 = local17[2];
			@Pc(53) int local53 = this.anInt4762 * (this.anInt4763 == Static589.anInt9553 ? arg0 : arg0 * this.anInt4763 / Static589.anInt9553);
			@Pc(59) int local59;
			@Pc(68) int local68;
			if (this.anInt4762 == Static91.anInt1849) {
				for (local59 = 0; local59 < Static91.anInt1849; local59++) {
					local68 = this.anIntArray275[local53++];
					local37[local59] = (local68 & 0xFF) << 4;
					local33[local59] = local68 >> 4 & 0xFF0;
					local29[local59] = local68 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static91.anInt1849; local59++) {
					local68 = this.anInt4762 * local59 / Static91.anInt1849;
					@Pc(75) int local75 = this.anIntArray275[local68 + local53];
					local37[local59] = (local75 & 0xFF) << 4;
					local33[local59] = local75 >> 4 & 0xFF0;
					local29[local59] = local75 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)I")
	@Override
	public final int method8782() {
		return this.anInt4759;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V")
	@Override
	public final void method8777() {
		super.method8777();
		this.anIntArray275 = null;
	}
}
