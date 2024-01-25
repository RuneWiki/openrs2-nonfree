import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class59_Sub1_Sub2 extends Class59_Sub1 {

	@OriginalMember(owner = "client!op", name = "r", descriptor = "Lclient!lr;")
	private Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_33;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "I")
	private final int anInt5264;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "I")
	private final int anInt5267;

	@OriginalMember(owner = "client!op", name = "F", descriptor = "I")
	private final int anInt5275;

	@OriginalMember(owner = "client!op", name = "t", descriptor = "I")
	private final int anInt5266;

	@OriginalMember(owner = "client!op", name = "z", descriptor = "I")
	private final int anInt5271;

	@OriginalMember(owner = "client!op", name = "C", descriptor = "I")
	private final int anInt5274;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!bv;IIIIII)V")
	public Class59_Sub1_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass30_Sub1_33 = arg0;
		this.anInt5264 = arg1;
		this.anInt5267 = arg5;
		this.anInt5275 = arg2;
		this.anInt5266 = arg3;
		this.anInt5271 = arg6;
		this.anInt5274 = arg4;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(B)Lclient!lr;")
	@Override
	public Class1_Sub2 method4050() {
		if (this.aClass1_Sub2_2 == null) {
			Static400.anIntArray604[5] = this.anInt5271;
			@Pc(17) Interface10 local17 = this.aClass30_Sub1_33.anInterface10_7;
			Static400.anIntArray604[1] = this.anInt5275;
			Static400.anIntArray604[0] = this.anInt5264;
			Static400.anIntArray604[4] = this.anInt5267;
			Static400.anIntArray604[2] = this.anInt5266;
			Static400.anIntArray604[3] = this.anInt5274;
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local17.method4242(Static400.anIntArray604[local48])) {
					return null;
				}
				@Pc(66) Class118 local66 = local17.method4241(Static400.anIntArray604[local48]);
				@Pc(73) int local73 = local66.aBoolean231 ? 64 : 128;
				if (local66.aByte57 > 0) {
					local44 = 1;
				}
				if (local46 < local73) {
					local46 = local73;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static226.anIntArrayArray11[local98] = local17.method4238(1.0F, Static400.anIntArray604[local98], local46, false, local46);
			}
			this.aClass1_Sub2_2 = new Class1_Sub2(this.aClass30_Sub1_33, 6407, local46, local44 != 0, Static226.anIntArrayArray11);
		}
		return this.aClass1_Sub2_2;
	}
}
