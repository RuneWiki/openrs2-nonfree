import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class2_Sub3_Sub14 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qf", name = "E", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!qf", name = "db", descriptor = "[I")
	private int[] anIntArray289;

	@OriginalMember(owner = "client!qf", name = "U", descriptor = "Z")
	public boolean aBoolean132 = false;

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "Lclient!sf;")
	private final Class77 aClass77_1;

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "Z")
	public final boolean aBoolean130;

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "Z")
	public boolean aBoolean131;

	@OriginalMember(owner = "client!qf", name = "gb", descriptor = "I")
	public final int anInt3189;

	@OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
	public int anInt3184;

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
	private int anInt3181;

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
	private int anInt3176;

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
	private int anInt3179;

	@OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
	private int anInt3185;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!me;)V")
	public Class2_Sub3_Sub14(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aClass77_1 = new Class77(arg0);
		@Pc(14) int local14 = arg0.method1402();
		this.aBoolean130 = (local14 & 0x1) != 0;
		this.aBoolean131 = (local14 & 0x2) != 0;
		this.anInt3189 = arg0.method1402();
		this.anInt3184 = arg0.method1397();
		this.anInt3181 = arg0.method1402();
		if (this.anInt3181 == 255) {
			this.anInt3181 = 256;
		}
		@Pc(64) int local64 = arg0.method1402();
		@Pc(68) int local68 = arg0.method1402();
		this.anInt3176 = local68 >> 6 & 0x3;
		this.anInt3179 = (local68 & 0x3F) - 6;
		this.anInt3185 = local64 >> 6 & 0x3;
		arg0.method1402();
		arg0.method1402();
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub14() {
		this.aClass77_1 = new Class77();
		this.anInt3189 = 1;
		this.aBoolean130 = true;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!da;IBLclient!c;)[I")
	public int[] method2117(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class10 arg2) {
		if (this.aClass77_1.method2333(arg2, arg0)) {
			@Pc(30) int local30 = arg1 < this.anInt3189 ? arg1 : this.anInt3189;
			return this.aClass77_1.method2331(local30, arg0, local30, false, 1.0D, arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!da;Lclient!c;Z)Z")
	public boolean method2118(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class10 arg1) {
		return this.aClass77_1.method2333(arg1, arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
	public void method2119(@OriginalArg(1) int arg0) {
		if (this.anIntArray289 == null) {
			return;
		}
		@Pc(45) short local45;
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(82) int local82;
		@Pc(96) int[] local96;
		if (this.anInt3176 != 0) {
			if (Static133.anIntArray281 == null || Static133.anIntArray281.length < this.anIntArray289.length) {
				Static133.anIntArray281 = new int[this.anIntArray289.length];
			}
			if (this.anIntArray289.length == 4096) {
				local45 = 64;
			} else {
				local45 = 128;
			}
			local53 = this.anIntArray289.length;
			local60 = arg0 * local45 * this.anInt3179;
			local64 = local53 - 1;
			if (this.anInt3176 == 2) {
				local60 = -local60;
			}
			for (local73 = 0; local73 < local53; local73++) {
				local82 = local73 + local60 & local64;
				Static133.anIntArray281[local73] = this.anIntArray289[local82];
			}
			local96 = this.anIntArray289;
			this.anIntArray289 = Static133.anIntArray281;
			Static133.anIntArray281 = local96;
		}
		if (this.anInt3185 == 0) {
			return;
		}
		if (Static133.anIntArray281 == null || this.anIntArray289.length > Static133.anIntArray281.length) {
			Static133.anIntArray281 = new int[this.anIntArray289.length];
		}
		local53 = this.anIntArray289.length;
		if (this.anIntArray289.length == 4096) {
			local45 = 64;
		} else {
			local45 = 128;
		}
		local60 = this.anInt3179 * arg0;
		local64 = local45 - 1;
		if (this.anInt3185 == 1) {
			local60 = -local60;
		}
		for (local73 = 0; local73 < local53; local73 += local45) {
			for (local82 = 0; local82 < local45; local82++) {
				@Pc(169) int local169 = local82 + local73;
				@Pc(177) int local177 = local73 + (local64 & local60 + local82);
				Static133.anIntArray281[local169] = this.anIntArray289[local177];
			}
		}
		local96 = this.anIntArray289;
		this.anIntArray289 = Static133.anIntArray281;
		Static133.anIntArray281 = local96;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(FZLclient!c;ILclient!da;)[I")
	public int[] method2120(@OriginalArg(0) float arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface1 arg3) {
		if (this.anIntArray289 == null || arg0 != this.aFloat3) {
			if (!this.aClass77_1.method2333(arg1, arg3)) {
				return null;
			}
			@Pc(39) int local39 = arg2 >= this.anInt3189 ? this.anInt3189 : arg2;
			this.anIntArray289 = this.aClass77_1.method2331(local39, arg3, local39, true, (double) arg0, arg1);
			this.aFloat3 = arg0;
		}
		return this.anIntArray289;
	}
}
