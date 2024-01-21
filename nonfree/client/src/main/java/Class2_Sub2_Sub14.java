import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!sc", name = "O", descriptor = "F")
	private float aFloat2;

	@OriginalMember(owner = "client!sc", name = "ab", descriptor = "Z")
	public boolean aBoolean133 = false;

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "Lclient!wg;")
	private final Class90 aClass90_1;

	@OriginalMember(owner = "client!sc", name = "W", descriptor = "Z")
	public boolean aBoolean132;

	@OriginalMember(owner = "client!sc", name = "L", descriptor = "Z")
	public final boolean aBoolean130;

	@OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
	public final int anInt3172;

	@OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
	public int anInt3177;

	@OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
	private int anInt3167;

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
	private int anInt3173;

	@OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
	private int anInt3171;

	@OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
	private int anInt3174;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!ja;)V")
	public Class2_Sub2_Sub14(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aClass90_1 = new Class90(arg0);
		@Pc(14) int local14 = arg0.method2962();
		this.aBoolean132 = (local14 & 0x2) != 0;
		this.aBoolean130 = (local14 & 0x1) != 0;
		this.anInt3172 = arg0.method2962();
		this.anInt3177 = arg0.method2933();
		this.anInt3167 = arg0.method2962();
		if (this.anInt3167 == 255) {
			this.anInt3167 = 256;
		}
		@Pc(66) int local66 = arg0.method2962();
		@Pc(70) int local70 = arg0.method2962();
		this.anInt3173 = local70 >> 6 & 0x3;
		this.anInt3171 = (local70 & 0x3F) - 6;
		this.anInt3174 = local66 >> 6 & 0x3;
		arg0.method2962();
		arg0.method2962();
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub14() {
		this.aClass90_1 = new Class90();
		this.anInt3172 = 1;
		this.aBoolean130 = true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!bg;ILclient!aa;)Z")
	public boolean method2450(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Interface1 arg1) {
		return this.aClass90_1.method3035(arg1, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(FILclient!aa;Lclient!bg;I)[I")
	public int[] method2453(@OriginalArg(0) float arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray285 == null || this.aFloat2 != arg0) {
			if (!this.aClass90_1.method3035(arg1, arg2)) {
				return null;
			}
			@Pc(43) int local43 = this.anInt3172 <= arg3 ? this.anInt3172 : arg3;
			this.anIntArray285 = this.aClass90_1.method3040((double) arg0, local43, local43, true, arg2, arg1);
			this.aFloat2 = arg0;
		}
		return this.anIntArray285;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBLclient!aa;Lclient!bg;)[I")
	public int[] method2456(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) Class11 arg2) {
		if (this.aClass90_1.method3035(arg1, arg2)) {
			@Pc(29) int local29 = this.anInt3172 <= arg0 ? this.anInt3172 : arg0;
			return this.aClass90_1.method3040(1.0D, local29, local29, false, arg2, arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
	public void method2457(@OriginalArg(1) int arg0) {
		if (this.anIntArray285 == null) {
			return;
		}
		@Pc(44) short local44;
		@Pc(37) int local37;
		@Pc(55) int local55;
		@Pc(66) int local66;
		@Pc(68) int local68;
		@Pc(76) int local76;
		@Pc(94) int[] local94;
		if (this.anInt3173 != 0) {
			if (Static116.anIntArray225 == null || Static116.anIntArray225.length < this.anIntArray285.length) {
				Static116.anIntArray225 = new int[this.anIntArray285.length];
			}
			local37 = this.anIntArray285.length;
			if (this.anIntArray285.length == 4096) {
				local44 = 64;
			} else {
				local44 = 128;
			}
			local55 = arg0 * local44 * this.anInt3171;
			if (this.anInt3173 == 2) {
				local55 = -local55;
			}
			local66 = local37 - 1;
			for (local68 = 0; local68 < local37; local68++) {
				local76 = local66 & local68 + local55;
				Static116.anIntArray225[local68] = this.anIntArray285[local76];
			}
			local94 = this.anIntArray285;
			this.anIntArray285 = Static116.anIntArray225;
			Static116.anIntArray225 = local94;
		}
		if (this.anInt3174 == 0) {
			return;
		}
		if (Static116.anIntArray225 == null || Static116.anIntArray225.length < this.anIntArray285.length) {
			Static116.anIntArray225 = new int[this.anIntArray285.length];
		}
		if (this.anIntArray285.length == 4096) {
			local44 = 64;
		} else {
			local44 = 128;
		}
		local37 = this.anIntArray285.length;
		local66 = local44 - 1;
		local55 = arg0 * this.anInt3171;
		if (this.anInt3174 == 1) {
			local55 = -local55;
		}
		for (local68 = 0; local68 < local37; local68 += local44) {
			for (local76 = 0; local76 < local44; local76++) {
				@Pc(160) int local160 = local76 + local68;
				@Pc(168) int local168 = (local66 & local55 + local76) + local68;
				Static116.anIntArray225[local160] = this.anIntArray285[local168];
			}
		}
		local94 = this.anIntArray285;
		this.anIntArray285 = Static116.anIntArray225;
		Static116.anIntArray225 = local94;
	}
}
