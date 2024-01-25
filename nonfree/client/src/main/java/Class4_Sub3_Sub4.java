import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class4_Sub3_Sub4 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ct", name = "P", descriptor = "I")
	private int anInt1390;

	@OriginalMember(owner = "client!ct", name = "Q", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!ct", name = "T", descriptor = "I")
	private int anInt1392;

	@OriginalMember(owner = "client!ct", name = "H", descriptor = "I")
	private int anInt1383 = -1;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub4() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt1383 = arg1.method4560();
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(37) int local37 = this.anInt1390 * (Static191.anInt3822 == this.anInt1392 ? arg0 : arg0 * this.anInt1392 / Static191.anInt3822);
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[2];
			@Pc(55) int local55;
			@Pc(64) int local64;
			if (Static304.anInt5637 == this.anInt1390) {
				for (local55 = 0; local55 < Static304.anInt5637; local55++) {
					local64 = this.anIntArray89[local37++];
					local49[local55] = (local64 & 0xFF) << 4;
					local45[local55] = local64 >> 4 & 0xFF0;
					local41[local55] = local64 >> 12 & 0xFF0;
				}
			} else {
				for (local55 = 0; local55 < Static304.anInt5637; local55++) {
					local64 = this.anInt1390 * local55 / Static304.anInt5637;
					@Pc(71) int local71 = this.anIntArray89[local37 + local64];
					local49[local55] = (local71 & 0xFF) << 4;
					local45[local55] = local71 >> 4 & 0xFF0;
					local41[local55] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I")
	@Override
	public int method6333() {
		return this.anInt1383;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZI)V")
	@Override
	public void method6336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method6336(arg0, arg1);
		if (this.anInt1383 >= 0 && Static320.anInterface4_7 != null) {
			@Pc(27) int local27 = Static320.anInterface4_7.method5685(this.anInt1383).aBoolean322 ? 64 : 128;
			this.anIntArray89 = Static320.anInterface4_7.method5686(1.0F, false, local27, local27, this.anInt1383);
			this.anInt1390 = local27;
			this.anInt1392 = local27;
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
	@Override
	public void method6334() {
		super.method6334();
		this.anIntArray89 = null;
	}
}
