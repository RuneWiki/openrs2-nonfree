import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class1_Sub4_Sub10 extends Class1_Sub4 {

	@OriginalMember(owner = "client!em", name = "O", descriptor = "[Lclient!ks;")
	public static final Class141[] aClass141Array1 = new Class141[5];

	@OriginalMember(owner = "client!em", name = "K", descriptor = "I")
	private int anInt2040 = 0;

	@OriginalMember(owner = "client!em", name = "D", descriptor = "I")
	private int anInt2035 = 0;

	@OriginalMember(owner = "client!em", name = "H", descriptor = "I")
	private int anInt2039 = 1;

	static {
		for (@Pc(13) int local13 = 0; local13 < aClass141Array1.length; local13++) {
			aClass141Array1[local13] = new Class141();
		}
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(29) int local29 = Static266.anIntArray628[arg0];
			@Pc(35) int local35 = local29 - 2048 >> 1;
			for (@Pc(37) int local37 = 0; local37 < Static66.anInt1511; local37++) {
				@Pc(43) int local43 = Static121.anIntArray197[local37];
				@Pc(49) int local49 = local43 - 2048 >> 1;
				@Pc(75) int local75;
				if (this.anInt2040 == 0) {
					local75 = (local43 - local29) * this.anInt2039;
				} else {
					@Pc(65) int local65 = local35 * local35 + local49 * local49 >> 12;
					local75 = (int) (Math.sqrt((double) ((float) local65 / 4096.0F)) * 4096.0D);
					local75 = (int) ((double) (this.anInt2039 * local75) * 3.141592653589793D);
				}
				local75 -= local75 & 0xFFFFF000;
				if (this.anInt2035 == 0) {
					local75 = Static390.anIntArray570[local75 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2035 == 2) {
					local75 -= 2048;
					if (local75 < 0) {
						local75 = -local75;
					}
					local75 = 2048 - local75 << 1;
				}
				local21[local37] = local75;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt2040 = arg1.method5366();
		} else if (arg0 == 1) {
			this.anInt2035 = arg1.method5366();
		} else if (arg0 == 3) {
			this.anInt2039 = arg1.method5366();
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
	@Override
	public void method5950() {
		Static170.method2715();
	}
}
