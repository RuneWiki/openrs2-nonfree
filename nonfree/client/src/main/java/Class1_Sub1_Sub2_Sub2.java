import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!gb", name = "Gb", descriptor = "I")
	private final int anInt951;

	@OriginalMember(owner = "client!gb", name = "Mb", descriptor = "I")
	private final int anInt956;

	@OriginalMember(owner = "client!gb", name = "Hb", descriptor = "I")
	private final int anInt952;

	@OriginalMember(owner = "client!gb", name = "Nb", descriptor = "I")
	private final int anInt957;

	@OriginalMember(owner = "client!gb", name = "Ib", descriptor = "I")
	private final int anInt953;

	@OriginalMember(owner = "client!gb", name = "Eb", descriptor = "I")
	private final int anInt949;

	@OriginalMember(owner = "client!gb", name = "Db", descriptor = "I")
	private final int anInt948;

	@OriginalMember(owner = "client!gb", name = "Ab", descriptor = "Lclient!h;")
	private Class1_Sub1_Sub8 aClass1_Sub1_Sub8_1;

	@OriginalMember(owner = "client!gb", name = "Kb", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!gb", name = "Cb", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIIIZLclient!aa;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class1_Sub1_Sub2 arg9) {
		this.anInt951 = arg6;
		this.anInt956 = arg4;
		this.anInt952 = arg0;
		this.anInt957 = arg5;
		this.anInt953 = arg3;
		this.anInt949 = arg1;
		this.anInt948 = arg2;
		if (arg7 != -1) {
			this.aClass1_Sub1_Sub8_1 = Static18.method249(arg7);
			this.anInt954 = Static7.anInt176 - 1;
			this.anInt947 = 0;
			if (this.aClass1_Sub1_Sub8_1.anInt1086 == 0 && arg9 != null && arg9 instanceof Class1_Sub1_Sub2_Sub2) {
				@Pc(54) Class1_Sub1_Sub2_Sub2 local54 = (Class1_Sub1_Sub2_Sub2) arg9;
				if (local54.aClass1_Sub1_Sub8_1 == this.aClass1_Sub1_Sub8_1) {
					this.anInt947 = local54.anInt947;
					this.anInt954 = local54.anInt954;
					return;
				}
			}
			if (arg8 && this.aClass1_Sub1_Sub8_1.anInt1074 != -1) {
				this.anInt947 = (int) ((double) this.aClass1_Sub1_Sub8_1.anIntArray147.length * Math.random());
				this.anInt954 -= (int) ((double) this.aClass1_Sub1_Sub8_1.anIntArray143[this.anInt947] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)Lclient!qb;")
	@Override
	public Class1_Sub1_Sub2_Sub6 method1415() {
		if (this.aClass1_Sub1_Sub8_1 != null) {
			@Pc(9) int local9 = Static7.anInt176 - this.anInt954;
			if (local9 > 100 && this.aClass1_Sub1_Sub8_1.anInt1074 > 0) {
				local9 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass1_Sub1_Sub8_1.anIntArray143[this.anInt947] >= local9) {
							break label37;
						}
						local9 -= this.aClass1_Sub1_Sub8_1.anIntArray143[this.anInt947];
						this.anInt947++;
					} while (this.anInt947 < this.aClass1_Sub1_Sub8_1.anIntArray147.length);
					this.anInt947 -= this.aClass1_Sub1_Sub8_1.anInt1074;
				} while (this.anInt947 >= 0 && this.anInt947 < this.aClass1_Sub1_Sub8_1.anIntArray147.length);
				this.aClass1_Sub1_Sub8_1 = null;
			}
			this.anInt954 = Static7.anInt176 - local9;
		}
		@Pc(103) Class1_Sub1_Sub4 local103 = Static97.method1645(this.anInt952);
		if (local103.anIntArray54 != null) {
			local103 = local103.method176();
		}
		return local103 == null ? null : local103.method179(this.anInt949, this.anInt947, this.anInt948, this.anInt956, this.anInt953, this.aClass1_Sub1_Sub8_1, this.anInt957, this.anInt951);
	}
}
