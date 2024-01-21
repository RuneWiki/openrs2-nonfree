import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class3_Sub2_Sub15 extends Class3_Sub2 {

	@OriginalMember(owner = "client!og", name = "X", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!og", name = "eb", descriptor = "[I")
	private int[] anIntArray515;

	@OriginalMember(owner = "client!og", name = "qb", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!og", name = "H", descriptor = "Lclient!ae;")
	private final Class5 aClass5_1;

	@OriginalMember(owner = "client!og", name = "U", descriptor = "Z")
	public boolean aBoolean142;

	@OriginalMember(owner = "client!og", name = "db", descriptor = "Z")
	public final boolean aBoolean143;

	@OriginalMember(owner = "client!og", name = "J", descriptor = "I")
	public final int anInt2936;

	@OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
	public int anInt2943;

	@OriginalMember(owner = "client!og", name = "lb", descriptor = "I")
	private int anInt2946;

	@OriginalMember(owner = "client!og", name = "T", descriptor = "I")
	private int anInt2939;

	@OriginalMember(owner = "client!og", name = "R", descriptor = "I")
	private int anInt2937;

	@OriginalMember(owner = "client!og", name = "kb", descriptor = "I")
	private int anInt2945;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class3_Sub2_Sub15(@OriginalArg(0) Class3_Sub8 arg0) {
		this.aClass5_1 = new Class5(arg0);
		@Pc(14) int local14 = arg0.method1545();
		this.aBoolean142 = (local14 & 0x2) != 0;
		this.aBoolean143 = (local14 & 0x1) != 0;
		this.anInt2936 = arg0.method1545();
		this.anInt2943 = arg0.method1510();
		this.anInt2946 = arg0.method1545();
		if (this.anInt2946 == 255) {
			this.anInt2946 = 256;
		}
		@Pc(63) int local63 = arg0.method1545();
		@Pc(67) int local67 = arg0.method1545();
		this.anInt2939 = local63 >> 6 & 0x3;
		this.anInt2937 = (local67 & 0x3F) - 6;
		this.anInt2945 = local67 >> 6 & 0x3;
		arg0.method1545();
		arg0.method1545();
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub15() {
		this.aClass5_1 = new Class5();
		this.anInt2936 = 1;
		this.aBoolean143 = true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!sf;ILclient!ah;B)[I")
	public int[] method2296(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		if (this.aClass5_1.method104(arg2, arg0)) {
			@Pc(31) int local31 = this.anInt2936 > arg1 ? arg1 : this.anInt2936;
			return this.aClass5_1.method102(arg2, arg0, 1.0D, false, local31, local31);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ah;ILclient!sf;)Z")
	public boolean method2298(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Interface2 arg1) {
		return this.aClass5_1.method104(arg0, arg1);
	}

	@OriginalMember(owner = "client!og", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FLclient!sf;IILclient!ah;)[I")
	public int[] method2300(@OriginalArg(0) float arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class7 arg3) {
		if (this.anIntArray515 == null || this.aFloat3 != arg0) {
			if (!this.aClass5_1.method104(arg3, arg1)) {
				return null;
			}
			@Pc(42) int local42 = this.anInt2936 <= arg2 ? this.anInt2936 : arg2;
			this.anIntArray515 = this.aClass5_1.method102(arg3, arg1, (double) arg0, true, local42, local42);
			this.aFloat3 = arg0;
		}
		return this.anIntArray515;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
	public void method2301(@OriginalArg(1) int arg0) {
		if (this.anIntArray515 == null) {
			return;
		}
		@Pc(35) short local35;
		@Pc(42) int local42;
		@Pc(49) int local49;
		@Pc(60) int local60;
		@Pc(62) int local62;
		@Pc(69) int local69;
		@Pc(87) int[] local87;
		if (this.anInt2945 != 0) {
			if (Static34.anIntArray189 == null || Static34.anIntArray189.length < this.anIntArray515.length) {
				Static34.anIntArray189 = new int[this.anIntArray515.length];
			}
			if (this.anIntArray515.length == 4096) {
				local35 = 64;
			} else {
				local35 = 128;
			}
			local42 = this.anIntArray515.length;
			local49 = this.anInt2937 * arg0 * local35;
			if (this.anInt2945 == 2) {
				local49 = -local49;
			}
			local60 = local42 - 1;
			for (local62 = 0; local62 < local42; local62++) {
				local69 = local60 & local49 + local62;
				Static34.anIntArray189[local62] = this.anIntArray515[local69];
			}
			local87 = this.anIntArray515;
			this.anIntArray515 = Static34.anIntArray189;
			Static34.anIntArray189 = local87;
		}
		if (this.anInt2939 == 0) {
			return;
		}
		if (Static34.anIntArray189 == null || this.anIntArray515.length > Static34.anIntArray189.length) {
			Static34.anIntArray189 = new int[this.anIntArray515.length];
		}
		local42 = this.anIntArray515.length;
		local49 = arg0 * this.anInt2937;
		if (this.anIntArray515.length == 4096) {
			local35 = 64;
		} else {
			local35 = 128;
		}
		if (this.anInt2939 == 1) {
			local49 = -local49;
		}
		local60 = local35 - 1;
		for (local62 = 0; local62 < local42; local62 += local35) {
			for (local69 = 0; local69 < local35; local69++) {
				@Pc(164) int local164 = local69 + local62;
				@Pc(172) int local172 = (local60 & local49 + local69) + local62;
				Static34.anIntArray189[local164] = this.anIntArray515[local172];
			}
		}
		local87 = this.anIntArray515;
		this.anIntArray515 = Static34.anIntArray189;
		Static34.anIntArray189 = local87;
	}
}
