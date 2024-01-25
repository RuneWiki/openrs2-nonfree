import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class268 {

	@OriginalMember(owner = "client!qea", name = "i", descriptor = "Lclient!xa;")
	private Class58 aClass58_38;

	@OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
	private int anInt7278;

	@OriginalMember(owner = "client!qea", name = "s", descriptor = "I")
	private int anInt7282;

	@OriginalMember(owner = "client!qea", name = "f", descriptor = "Z")
	private boolean aBoolean506 = true;

	@OriginalMember(owner = "client!qea", name = "m", descriptor = "I")
	private int anInt7277 = -1;

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
	private final int anInt7274;

	@OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
	private final int anInt7275;

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
	private final int anInt7273;

	@OriginalMember(owner = "client!qea", name = "k", descriptor = "[Lclient!ol;")
	private final Class240[] aClass240Array2;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
	private final int anInt7271;

	@OriginalMember(owner = "client!qea", name = "g", descriptor = "[Lclient!ol;")
	private final Class240[] aClass240Array1;

	@OriginalMember(owner = "client!qea", name = "o", descriptor = "Lclient!ol;")
	private final Class240 aClass240_1;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(I[Lclient!ol;IIII)V")
	public Class268(@OriginalArg(0) int arg0, @OriginalArg(1) Class240[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7274 = arg5;
		this.anInt7275 = arg4;
		this.anInt7273 = arg3;
		this.aClass240Array2 = arg1;
		this.anInt7271 = arg0;
		if (arg1 == null) {
			this.aClass240_1 = null;
			this.aClass240Array1 = null;
		} else {
			this.aClass240Array1 = new Class240[arg1.length];
			this.aClass240_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIBIIIILclient!oa;II)V")
	public void method5996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class14 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg5 + arg3 & 0x3FFF;
		if (this.anInt7271 == -1) {
			arg6.C(arg0, arg1, arg2, arg4, arg8, 0);
		} else {
			@Pc(32) Class313 local32 = Static116.anInterface4_5.method4234(this.anInt7271);
			if (this.aClass58_38 == null && Static116.anInterface4_5.method4233(this.anInt7271)) {
				@Pc(68) int[] local68 = local32.aBoolean596 ? Static116.anInterface4_5.method4231(this.anInt7282, this.anInt7282, this.anInt7271, 0.7F) : Static116.anInterface4_5.method4230(0.7F, this.anInt7271, this.anInt7282, false, this.anInt7282);
				this.aClass58_38 = arg6.method6863(local68, this.anInt7282, this.anInt7282, this.anInt7282);
			}
			if (local32.aBoolean596) {
				arg6.C(arg0, arg1, arg2, arg4, arg8, 0);
			}
			if (this.aClass58_38 != null) {
				@Pc(101) int local101 = local32.aBoolean596 ? 1 : 0;
				@Pc(107) int local107 = arg4 * arg7 / -4096;
				@Pc(120) int local120;
				for (local120 = (arg2 - arg4) / 2 + arg4 * local7 / 4096; local120 > arg4; local120 -= arg4) {
				}
				while (local120 < 0) {
					local120 += arg4;
				}
				while (local107 > arg4) {
					local107 -= arg4;
				}
				while (local107 < 0) {
					local107 += arg4;
				}
				for (@Pc(169) int local169 = local120 - arg4; local169 < arg2; local169 += arg4) {
					for (@Pc(175) int local175 = local107 - arg4; local175 < arg4; local175 += arg4) {
						this.aClass58_38.KA(arg0 + local169, arg1 + local175, arg4, arg4, 1, 0, local101);
					}
				}
			}
		}
		for (@Pc(214) int local214 = this.anInt7278 - 1; local214 >= 0; local214--) {
			this.aClass240Array1[local214].method5566(arg6, arg0, arg1, arg2, arg4, arg7, local7);
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILclient!oa;I)Z")
	public boolean method5997(@OriginalArg(1) Class14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt7277) {
			this.anInt7277 = arg1;
			@Pc(16) int local16 = Static505.method6819(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt7282 != local16) {
				this.aClass58_38 = null;
				this.anInt7282 = local16;
			}
			if (this.aClass240Array2 != null) {
				this.anInt7278 = 0;
				@Pc(46) int[] local46 = new int[this.aClass240Array2.length];
				for (@Pc(48) int local48 = 0; local48 < this.aClass240Array2.length; local48++) {
					@Pc(55) Class240 local55 = this.aClass240Array2[local48];
					if (local55.method5561(this.anInt7273, this.anInt7275, this.anInt7274, this.anInt7277)) {
						local46[this.anInt7278] = local55.anInt6591;
						this.aClass240Array1[this.anInt7278++] = local55;
					}
				}
				Static533.method7239(this.aClass240Array1, 0, local46, this.anInt7278 - 1);
			}
			this.aBoolean506 = true;
		}
		@Pc(113) boolean local113 = false;
		if (this.aBoolean506) {
			this.aBoolean506 = false;
			for (@Pc(124) int local124 = this.anInt7278 - 1; local124 >= 0; local124--) {
				@Pc(135) boolean local135 = this.aClass240Array1[local124].method5563(arg0, this.aClass240_1);
				local113 |= local135;
				this.aBoolean506 |= !local135;
			}
		}
		return local113;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
	public void method5998() {
		if (this.aClass240Array2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass240Array2.length; local10++) {
				this.aClass240Array2[local10].method5565();
			}
		}
		this.aClass58_38 = null;
	}
}
