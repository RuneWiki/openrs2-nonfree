import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class20_Sub2_Sub4_Sub2 extends Class20_Sub2_Sub4 {

	@OriginalMember(owner = "client!no", name = "Z", descriptor = "Lclient!ii;")
	private Class20_Sub5 aClass20_Sub5_3;

	@OriginalMember(owner = "client!no", name = "X", descriptor = "I")
	private int anInt6282 = 0;

	@OriginalMember(owner = "client!no", name = "V", descriptor = "Z")
	public boolean aBoolean448 = false;

	@OriginalMember(owner = "client!no", name = "kb", descriptor = "Z")
	private boolean aBoolean449 = false;

	@OriginalMember(owner = "client!no", name = "ib", descriptor = "I")
	private int anInt6291 = 0;

	@OriginalMember(owner = "client!no", name = "ob", descriptor = "I")
	private int anInt6295 = 0;

	@OriginalMember(owner = "client!no", name = "ub", descriptor = "I")
	private final int anInt6301 = -1;

	@OriginalMember(owner = "client!no", name = "qb", descriptor = "I")
	private int anInt6297 = 0;

	@OriginalMember(owner = "client!no", name = "W", descriptor = "I")
	private int anInt6281 = 0;

	@OriginalMember(owner = "client!no", name = "nb", descriptor = "I")
	public final int anInt6294;

	@OriginalMember(owner = "client!no", name = "tb", descriptor = "I")
	private final int anInt6300;

	@OriginalMember(owner = "client!no", name = "db", descriptor = "Lclient!hca;")
	private Class131 aClass131_1;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class20_Sub2_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt6294 = arg2 + arg1;
		this.anInt6300 = arg0;
		this.anInt6281 = arg12;
		@Pc(53) Class116 local53 = Static592.aClass98_2.method2295(this.anInt6300);
		@Pc(56) int local56 = local53.anInt3012;
		if (local56 == -1) {
			this.aBoolean448 = true;
		} else {
			this.aClass131_1 = Static594.aClass311_2.method7009(local56);
			this.aBoolean448 = false;
		}
		if (arg2 == this.anInt6294) {
			Static171.method2603(this.anInt6297, super.anInt8796, this.aClass131_1, super.anInt8795, super.aByte116, false);
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	@Override
	public Class60 method7262(@OriginalArg(0) Class12 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	@Override
	public Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0) {
		@Pc(29) Class61 local29 = this.method5259(arg0, (this.anInt6281 == 0 ? 0 : 5) | 0x800, this.anInt6300);
		if (local29 == null) {
			return null;
		}
		if (this.anInt6281 != 0) {
			local29.M(this.anInt6281 * 2048);
		}
		@Pc(45) Class209 local45 = arg0.method6441();
		local45.NA(super.anInt8796, super.anInt8790, super.anInt8795);
		this.method5257(local29, arg0, local45);
		if (Static188.aBoolean320) {
			local29.method7592(local45, null, Static33.anInt894, 0);
		} else {
			local29.method7587(local45, null, 0);
		}
		if (this.aClass20_Sub5_3 != null) {
			@Pc(81) Class82 local81 = this.aClass20_Sub5_3.method3664();
			if (Static188.aBoolean320) {
				arg0.method6404(local81, Static33.anInt894);
			} else {
				arg0.method6460(local81);
			}
		}
		this.aBoolean449 = local29.LA();
		this.anInt6282 = local29.J();
		this.anInt6295 = local29.RA();
		return null;
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(B)I")
	@Override
	public int method7264() {
		return this.anInt6282;
	}

	@OriginalMember(owner = "client!no", name = "l", descriptor = "(I)I")
	@Override
	public int method7261(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.anInt6295 : -6;
	}

	@OriginalMember(owner = "client!no", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7256() {
		return this.aBoolean449;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!da;Lclient!r;Lclient!q;)V")
	private void method5257(@OriginalArg(1) Class61 arg0, @OriginalArg(2) Class12 arg1, @OriginalArg(3) Class209 arg2) {
		arg0.method7588(arg2);
		@Pc(16) Class219[] local16 = arg0.method7597();
		@Pc(19) Class101[] local19 = arg0.method7599();
		if ((this.aClass20_Sub5_3 == null || this.aClass20_Sub5_3.aBoolean342) && (local16 != null || local19 != null)) {
			this.aClass20_Sub5_3 = Static220.method3658(Static81.anInt1910, true);
		}
		if (this.aClass20_Sub5_3 != null) {
			this.aClass20_Sub5_3.method3656(arg1, (long) Static81.anInt1910, local16, local19);
			this.aClass20_Sub5_3.method3655(super.aByte116, super.aShort100, super.aShort98, super.aShort97, super.aShort99);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!ir;ZILclient!r;IB)V")
	@Override
	public void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!no", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub5_3 != null) {
			this.aClass20_Sub5_3.method3661();
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(II)V")
	public void method5258(@OriginalArg(1) int arg0) {
		if (this.aBoolean448) {
			return;
		}
		this.anInt6291 += arg0;
		while (this.anInt6291 > this.aClass131_1.anIntArray204[this.anInt6297]) {
			this.anInt6291 -= this.aClass131_1.anIntArray204[this.anInt6297];
			this.anInt6297++;
			if (this.aClass131_1.anIntArray202.length <= this.anInt6297) {
				this.aBoolean448 = true;
				break;
			}
		}
		if (!this.aBoolean448) {
			Static171.method2603(this.anInt6297, super.anInt8796, this.aClass131_1, super.anInt8795, super.aByte116, false);
		}
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7249() {
		return false;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLclient!r;II)Z")
	@Override
	public boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!no", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7254() {
		return false;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!r;IIZ)Lclient!da;")
	private Class61 method5259(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class116 local8 = Static592.aClass98_2.method2295(arg2);
		@Pc(18) Class17 local18 = Static158.aClass17Array2[super.aByte116];
		@Pc(33) Class17 local33 = super.aByte117 < 3 ? Static158.aClass17Array2[super.aByte117 + 1] : null;
		return this.aBoolean448 ? local8.method2545(Static594.aClass311_2, local33, arg1, arg0, -1, super.anInt8790, 0, super.anInt8795, local18, -1, super.anInt8796) : local8.method2545(Static594.aClass311_2, local33, arg1, arg0, this.anInt6297, super.anInt8790, this.anInt6291, super.anInt8795, local18, this.anInt6301, super.anInt8796);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V")
	@Override
	public void method7263() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7265(@OriginalArg(0) Class12 arg0) {
		@Pc(11) Class61 local11 = this.method5259(arg0, 0, this.anInt6300);
		if (local11 != null) {
			@Pc(16) Class209 local16 = arg0.method6441();
			local16.NA(super.anInt8796, super.anInt8790, super.anInt8795);
			this.method5257(local11, arg0, local16);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
	public void method5261() {
		if (this.aClass20_Sub5_3 != null) {
			this.aClass20_Sub5_3.method3661();
		}
	}
}
