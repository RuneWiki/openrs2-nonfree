import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class10_Sub2_Sub28 extends Class10_Sub2 {

	@OriginalMember(owner = "client!r", name = "R", descriptor = "[Lclient!tn;")
	public static final Class240[] aClass240Array1 = new Class240[5];

	@OriginalMember(owner = "client!r", name = "J", descriptor = "I")
	private int anInt5799 = 4096;

	@OriginalMember(owner = "client!r", name = "N", descriptor = "I")
	private int anInt5800 = 409;

	@OriginalMember(owner = "client!r", name = "M", descriptor = "[I")
	private final int[] anIntArray563 = new int[3];

	@OriginalMember(owner = "client!r", name = "P", descriptor = "I")
	private int anInt5802 = 4096;

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
	private int anInt5803 = 4096;

	static {
		for (@Pc(10) int local10 = 0; local10 < aClass240Array1.length; local10++) {
			aClass240Array1[local10] = new Class240();
		}
		new Class182("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5800 = arg1.method2485();
		} else if (arg0 == 1) {
			this.anInt5803 = arg1.method2485();
		} else if (arg0 == 2) {
			this.anInt5799 = arg1.method2485();
		} else if (arg0 == 3) {
			this.anInt5802 = arg1.method2485();
		} else if (arg0 == 4) {
			@Pc(58) int local58 = arg1.method2507();
			this.anIntArray563[2] = local58 >> 12 & 0x0;
			this.anIntArray563[0] = (local58 & 0xFF0000) << 4;
			this.anIntArray563[1] = local58 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(28) int[][] local28 = this.method6045(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local13[0];
			@Pc(48) int[] local48 = local13[1];
			@Pc(52) int[] local52 = local13[2];
			for (@Pc(54) int local54 = 0; local54 < Static121.anInt2458; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(68) int local68 = local60 - this.anIntArray563[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (local68 > this.anInt5800) {
					local44[local54] = local60;
					local48[local54] = local36[local54];
					local52[local54] = local40[local54];
				} else {
					@Pc(102) int local102 = local36[local54];
					local68 = local102 - this.anIntArray563[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (this.anInt5800 < local68) {
						local44[local54] = local60;
						local48[local54] = local102;
						local52[local54] = local40[local54];
					} else {
						@Pc(146) int local146 = local40[local54];
						local68 = local146 - this.anIntArray563[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (local68 > this.anInt5800) {
							local44[local54] = local60;
							local48[local54] = local102;
							local52[local54] = local146;
						} else {
							local44[local54] = local60 * this.anInt5802 >> 12;
							local48[local54] = local102 * this.anInt5799 >> 12;
							local52[local54] = local146 * this.anInt5803 >> 12;
						}
					}
				}
			}
		}
		return local13;
	}
}
