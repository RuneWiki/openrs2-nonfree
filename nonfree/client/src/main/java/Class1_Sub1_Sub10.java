import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jc", name = "eb", descriptor = "[I")
	public static int[] anIntArray193 = new int[32];

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
	public int anInt2155;

	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "[Lclient!ea;")
	public Class18[] aClass18Array12;

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
	public int anInt2162;

	@OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
	public int anInt2163;

	@OriginalMember(owner = "client!jc", name = "Y", descriptor = "[I")
	public int[] anIntArray191;

	@OriginalMember(owner = "client!jc", name = "Z", descriptor = "[I")
	public int[] anIntArray192;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "Lclient!ea;")
	public Class18 aClass18_527 = Static96.aClass18_756;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
	public int anInt2159 = 0;

	static {
		@Pc(23) int local23 = 2;
		for (@Pc(25) int local25 = 0; local25 < 32; local25++) {
			anIntArray193[local25] = local23 - 1;
			local23 += local23;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!hc;)V")
	public void method1526(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method544();
			if (local9 == 0) {
				return;
			}
			this.method1527(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBLclient!hc;)V")
	private void method1527(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt2155 = arg1.method544();
		} else if (arg0 == 2) {
			this.anInt2163 = arg1.method544();
		} else if (arg0 == 3) {
			this.aClass18_527 = arg1.method510();
		} else if (arg0 == 4) {
			this.anInt2162 = arg1.method499();
		} else {
			@Pc(54) int local54;
			if (arg0 == 5) {
				this.anInt2159 = arg1.method546();
				this.anIntArray191 = new int[this.anInt2159];
				this.aClass18Array12 = new Class18[this.anInt2159];
				for (local54 = 0; local54 < this.anInt2159; local54++) {
					this.anIntArray191[local54] = arg1.method499();
					this.aClass18Array12[local54] = arg1.method510();
				}
			} else if (arg0 == 6) {
				this.anInt2159 = arg1.method546();
				this.anIntArray191 = new int[this.anInt2159];
				this.anIntArray192 = new int[this.anInt2159];
				for (local54 = 0; local54 < this.anInt2159; local54++) {
					this.anIntArray191[local54] = arg1.method499();
					this.anIntArray192[local54] = arg1.method499();
				}
			}
		}
	}
}
