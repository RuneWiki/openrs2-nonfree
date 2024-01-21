import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class1_Sub3_Sub4_Sub5 extends Class1_Sub3_Sub4 {

	@OriginalMember(owner = "client!hc", name = "Ib", descriptor = "I")
	private final int anInt1191;

	@OriginalMember(owner = "client!hc", name = "Rb", descriptor = "I")
	private final int anInt1198;

	@OriginalMember(owner = "client!hc", name = "vb", descriptor = "I")
	private final int anInt1183;

	@OriginalMember(owner = "client!hc", name = "Fb", descriptor = "I")
	private final int anInt1189;

	@OriginalMember(owner = "client!hc", name = "Hb", descriptor = "I")
	private final int anInt1190;

	@OriginalMember(owner = "client!hc", name = "Eb", descriptor = "I")
	private final int anInt1188;

	@OriginalMember(owner = "client!hc", name = "Pb", descriptor = "I")
	private final int anInt1196;

	@OriginalMember(owner = "client!hc", name = "Cb", descriptor = "Lclient!nc;")
	private Class1_Sub3_Sub11 aClass1_Sub3_Sub11_1;

	@OriginalMember(owner = "client!hc", name = "Ab", descriptor = "I")
	private int anInt1186;

	@OriginalMember(owner = "client!hc", name = "Db", descriptor = "I")
	private int anInt1187;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIIIIZLclient!od;)V")
	public Class1_Sub3_Sub4_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class1_Sub3_Sub4 arg9) {
		this.anInt1191 = arg1;
		this.anInt1198 = arg0;
		this.anInt1183 = arg3;
		this.anInt1189 = arg6;
		this.anInt1190 = arg5;
		this.anInt1188 = arg4;
		this.anInt1196 = arg2;
		if (arg7 != -1) {
			this.aClass1_Sub3_Sub11_1 = Static77.method1316(arg7);
			this.anInt1186 = Static131.anInt3270 - 1;
			this.anInt1187 = 0;
			if (this.aClass1_Sub3_Sub11_1.anInt2043 == 0 && arg9 != null && arg9 instanceof Class1_Sub3_Sub4_Sub5) {
				@Pc(50) Class1_Sub3_Sub4_Sub5 local50 = (Class1_Sub3_Sub4_Sub5) arg9;
				if (this.aClass1_Sub3_Sub11_1 == local50.aClass1_Sub3_Sub11_1) {
					this.anInt1186 = local50.anInt1186;
					this.anInt1187 = local50.anInt1187;
					return;
				}
			}
			if (arg8 && this.aClass1_Sub3_Sub11_1.anInt2051 != -1) {
				this.anInt1187 = (int) ((double) this.aClass1_Sub3_Sub11_1.anIntArray315.length * Math.random());
				this.anInt1186 -= (int) ((double) this.aClass1_Sub3_Sub11_1.anIntArray318[this.anInt1187] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub4_Sub4 method2148() {
		if (this.aClass1_Sub3_Sub11_1 != null) {
			@Pc(19) int local19 = Static131.anInt3270 - this.anInt1186;
			if (local19 > 100 && this.aClass1_Sub3_Sub11_1.anInt2051 > 0) {
				local19 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass1_Sub3_Sub11_1.anIntArray318[this.anInt1187] >= local19) {
							break label37;
						}
						local19 -= this.aClass1_Sub3_Sub11_1.anIntArray318[this.anInt1187];
						this.anInt1187++;
					} while (this.aClass1_Sub3_Sub11_1.anIntArray315.length > this.anInt1187);
					this.anInt1187 -= this.aClass1_Sub3_Sub11_1.anInt2051;
				} while (this.anInt1187 >= 0 && this.aClass1_Sub3_Sub11_1.anIntArray315.length > this.anInt1187);
				this.aClass1_Sub3_Sub11_1 = null;
			}
			this.anInt1186 = Static131.anInt3270 - local19;
		}
		@Pc(103) Class1_Sub3_Sub10 local103 = Static131.method2263(this.anInt1198);
		if (local103.anIntArray283 != null) {
			local103 = local103.method1260();
		}
		return local103 == null ? null : local103.method1257(this.anInt1187, this.anInt1191, this.anInt1188, this.anInt1183, this.anInt1196, this.aClass1_Sub3_Sub11_1, this.anInt1189, this.anInt1190);
	}
}
