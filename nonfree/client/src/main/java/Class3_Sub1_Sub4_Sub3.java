import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class3_Sub1_Sub4_Sub3 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!fc", name = "ob", descriptor = "I")
	private final int anInt1061;

	@OriginalMember(owner = "client!fc", name = "sb", descriptor = "I")
	private final int anInt1064;

	@OriginalMember(owner = "client!fc", name = "eb", descriptor = "I")
	private final int anInt1052;

	@OriginalMember(owner = "client!fc", name = "mb", descriptor = "I")
	private final int anInt1059;

	@OriginalMember(owner = "client!fc", name = "rb", descriptor = "I")
	private final int anInt1063;

	@OriginalMember(owner = "client!fc", name = "tb", descriptor = "I")
	private final int anInt1065;

	@OriginalMember(owner = "client!fc", name = "hb", descriptor = "I")
	private final int anInt1055;

	@OriginalMember(owner = "client!fc", name = "wb", descriptor = "Lclient!qc;")
	private Class3_Sub1_Sub11 aClass3_Sub1_Sub11_2;

	@OriginalMember(owner = "client!fc", name = "Ab", descriptor = "I")
	private int anInt1069;

	@OriginalMember(owner = "client!fc", name = "gb", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(IIIIIIIIZLclient!sd;)V")
	public Class3_Sub1_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class3_Sub1_Sub4 arg9) {
		this.anInt1061 = arg3;
		this.anInt1064 = arg2;
		this.anInt1052 = arg1;
		this.anInt1059 = arg5;
		this.anInt1063 = arg4;
		this.anInt1065 = arg0;
		this.anInt1055 = arg6;
		if (arg7 != -1) {
			this.aClass3_Sub1_Sub11_2 = Static97.method1629(arg7);
			this.anInt1069 = Static27.anInt843 - 1;
			this.anInt1054 = 0;
			if (this.aClass3_Sub1_Sub11_2.anInt2246 == 0 && arg9 != null && arg9 instanceof Class3_Sub1_Sub4_Sub3) {
				@Pc(51) Class3_Sub1_Sub4_Sub3 local51 = (Class3_Sub1_Sub4_Sub3) arg9;
				if (this.aClass3_Sub1_Sub11_2 == local51.aClass3_Sub1_Sub11_2) {
					this.anInt1069 = local51.anInt1069;
					this.anInt1054 = local51.anInt1054;
					return;
				}
			}
			if (arg8 && this.aClass3_Sub1_Sub11_2.anInt2251 != -1) {
				this.anInt1054 = (int) ((double) this.aClass3_Sub1_Sub11_2.anIntArray306.length * Math.random());
				this.anInt1069 -= (int) (Math.random() * (double) this.aClass3_Sub1_Sub11_2.anIntArray305[this.anInt1054]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)Lclient!ua;")
	@Override
	public Class3_Sub1_Sub4_Sub7 method1750() {
		if (this.aClass3_Sub1_Sub11_2 != null) {
			@Pc(14) int local14 = Static27.anInt843 - this.anInt1069;
			if (local14 > 100 && this.aClass3_Sub1_Sub11_2.anInt2251 > 0) {
				local14 = 100;
			}
			label37: {
				do {
					do {
						if (local14 <= this.aClass3_Sub1_Sub11_2.anIntArray305[this.anInt1054]) {
							break label37;
						}
						local14 -= this.aClass3_Sub1_Sub11_2.anIntArray305[this.anInt1054];
						this.anInt1054++;
					} while (this.aClass3_Sub1_Sub11_2.anIntArray306.length > this.anInt1054);
					this.anInt1054 -= this.aClass3_Sub1_Sub11_2.anInt2251;
				} while (this.anInt1054 >= 0 && this.aClass3_Sub1_Sub11_2.anIntArray306.length > this.anInt1054);
				this.aClass3_Sub1_Sub11_2 = null;
			}
			this.anInt1069 = Static27.anInt843 - local14;
		}
		@Pc(103) Class3_Sub1_Sub2 local103 = Static12.method200(this.anInt1065);
		if (local103.anIntArray24 != null) {
			local103 = local103.method162();
		}
		return local103 == null ? null : local103.method168(this.anInt1061, this.anInt1063, this.aClass3_Sub1_Sub11_2, this.anInt1055, this.anInt1064, this.anInt1054, this.anInt1059, this.anInt1052);
	}
}
