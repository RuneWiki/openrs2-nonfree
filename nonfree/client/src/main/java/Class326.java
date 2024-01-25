import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class326 {

	@OriginalMember(owner = "client!tw", name = "l", descriptor = "[Lclient!fca;")
	public static final Class109[] aClass109Array1 = new Class109[5];

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
	private int anInt8617;

	@OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
	private int anInt8621;

	@OriginalMember(owner = "client!tw", name = "n", descriptor = "Lclient!f;")
	private Class39 aClass39_37;

	@OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
	private int anInt8622 = -1;

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "Z")
	private boolean aBoolean663 = true;

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
	private final int anInt8616;

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "[Lclient!raa;")
	private final Class278[] aClass278Array2;

	@OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
	private final int anInt8623;

	@OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
	private final int anInt8620;

	@OriginalMember(owner = "client!tw", name = "o", descriptor = "I")
	private final int anInt8624;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "[Lclient!raa;")
	private final Class278[] aClass278Array1;

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "Lclient!raa;")
	private final Class278 aClass278_1;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass109Array1.length; local4++) {
			aClass109Array1[local4] = new Class109();
		}
	}

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(I[Lclient!raa;IIII)V")
	public Class326(@OriginalArg(0) int arg0, @OriginalArg(1) Class278[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8616 = arg3;
		this.aClass278Array2 = arg1;
		this.anInt8623 = arg5;
		this.anInt8620 = arg0;
		this.anInt8624 = arg4;
		if (arg1 == null) {
			this.aClass278_1 = null;
			this.aClass278Array1 = null;
		} else {
			this.aClass278Array1 = new Class278[arg1.length];
			this.aClass278_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V")
	public void method7195() {
		if (this.aClass278Array2 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass278Array2.length; local14++) {
				this.aClass278Array2[local14].method6431();
			}
		}
		this.aClass39_37 = null;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BILclient!r;)Z")
	public boolean method7196(@OriginalArg(1) int arg0, @OriginalArg(2) Class100 arg1) {
		if (this.anInt8622 != arg0) {
			this.anInt8622 = arg0;
			@Pc(16) int local16 = Static285.method5287(arg0);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt8621 != local16) {
				this.anInt8621 = local16;
				this.aClass39_37 = null;
			}
			if (this.aClass278Array2 != null) {
				this.anInt8617 = 0;
				@Pc(46) int[] local46 = new int[this.aClass278Array2.length];
				for (@Pc(48) int local48 = 0; local48 < this.aClass278Array2.length; local48++) {
					@Pc(55) Class278 local55 = this.aClass278Array2[local48];
					if (local55.method6429(this.anInt8616, this.anInt8624, this.anInt8623, this.anInt8622)) {
						local46[this.anInt8617] = local55.anInt7814;
						this.aClass278Array1[this.anInt8617++] = local55;
					}
				}
				Static61.method967(this.anInt8617 - 1, local46, this.aClass278Array1, 0);
			}
			this.aBoolean663 = true;
		}
		@Pc(108) boolean local108 = false;
		if (this.aBoolean663) {
			this.aBoolean663 = false;
			for (@Pc(119) int local119 = this.anInt8617 - 1; local119 >= 0; local119--) {
				@Pc(130) boolean local130 = this.aClass278Array1[local119].method6426(arg1, this.aClass278_1);
				local108 |= local130;
				this.aBoolean663 |= !local130;
			}
		}
		return local108;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIBIIIILclient!r;)V")
	public void method7198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class100 arg8) {
		@Pc(7) int local7 = arg6 + arg4 & 0x3FFF;
		if (this.anInt8620 == -1) {
			arg8.J(arg1, arg2, arg5, arg3, arg0, 0);
		} else {
			@Pc(25) Class343 local25 = Static64.anInterface5_1.method917(this.anInt8620);
			if (this.aClass39_37 == null && Static64.anInterface5_1.method914(this.anInt8620)) {
				@Pc(61) int[] local61 = local25.aBoolean702 ? Static64.anInterface5_1.method915(0.7F, this.anInt8621, this.anInt8621, this.anInt8620) : Static64.anInterface5_1.method916(this.anInt8620, 0.7F, false, this.anInt8621, this.anInt8621);
				this.aClass39_37 = arg8.method6226(local61, this.anInt8621, this.anInt8621, this.anInt8621);
			}
			if (local25.aBoolean702) {
				arg8.J(arg1, arg2, arg5, arg3, arg0, 0);
			}
			if (this.aClass39_37 != null) {
				@Pc(94) int local94 = local25.aBoolean702 ? 1 : 0;
				@Pc(100) int local100 = arg7 * arg3 / -4096;
				@Pc(113) int local113;
				for (local113 = arg3 * local7 / 4096 + (arg5 - arg3) / 2; local113 > arg3; local113 -= arg3) {
				}
				while (local100 > arg3) {
					local100 -= arg3;
				}
				while (local113 < 0) {
					local113 += arg3;
				}
				while (local100 < 0) {
					local100 += arg3;
				}
				for (@Pc(155) int local155 = local113 - arg3; local155 < arg5; local155 += arg3) {
					for (@Pc(162) int local162 = local100 - arg3; local162 < arg3; local162 += arg3) {
						this.aClass39_37.method7850(local155 + arg1, arg2 + local162, arg3, arg3, 1, 0, local94);
					}
				}
			}
		}
		for (@Pc(211) int local211 = this.anInt8617 - 1; local211 >= 0; local211--) {
			this.aClass278Array1[local211].method6421(arg8, arg1, arg2, arg5, arg3, arg7, local7);
		}
	}
}
