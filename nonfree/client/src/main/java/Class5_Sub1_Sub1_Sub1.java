import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AZNRLUAT")
public final class Class5_Sub1_Sub1_Sub1 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!AZNRLUAT", name = "s", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!AZNRLUAT", name = "r", descriptor = "B")
	private byte aByte1 = 3;

	@OriginalMember(owner = "client!AZNRLUAT", name = "A", descriptor = "Z")
	private boolean aBoolean24 = true;

	@OriginalMember(owner = "client!AZNRLUAT", name = "t", descriptor = "I")
	private int anInt21;

	@OriginalMember(owner = "client!AZNRLUAT", name = "u", descriptor = "I")
	private int anInt22;

	@OriginalMember(owner = "client!AZNRLUAT", name = "v", descriptor = "I")
	private int anInt23;

	@OriginalMember(owner = "client!AZNRLUAT", name = "w", descriptor = "I")
	private int anInt24;

	@OriginalMember(owner = "client!AZNRLUAT", name = "x", descriptor = "I")
	private int anInt25;

	@OriginalMember(owner = "client!AZNRLUAT", name = "y", descriptor = "I")
	private int anInt26;

	@OriginalMember(owner = "client!AZNRLUAT", name = "z", descriptor = "I")
	private int anInt27;

	@OriginalMember(owner = "client!AZNRLUAT", name = "l", descriptor = "Lclient!MJVHTYCA;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!AZNRLUAT", name = "m", descriptor = "I")
	private int anInt17;

	@OriginalMember(owner = "client!AZNRLUAT", name = "n", descriptor = "I")
	private int anInt18;

	@OriginalMember(owner = "client!AZNRLUAT", name = "o", descriptor = "I")
	private int anInt19;

	@OriginalMember(owner = "client!AZNRLUAT", name = "p", descriptor = "I")
	private int anInt20;

	@OriginalMember(owner = "client!AZNRLUAT", name = "q", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!AZNRLUAT", name = "<init>", descriptor = "(IIIIZIIIII)V")
	public Class5_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt21 = arg2;
			this.anInt22 = arg5;
			this.anInt23 = arg7;
			this.anInt24 = arg1;
			this.anInt25 = arg3;
			this.anInt26 = arg0;
			this.anInt27 = arg9;
			if (arg8 != -1) {
				this.aClass32_1 = Class32.aClass32Array1[arg8];
				this.anInt17 = 0;
				this.anInt18 = client.anInt1022;
				if (arg4 && this.aClass32_1.anInt442 != -1) {
					this.anInt17 = (int) (Math.random() * (double) this.aClass32_1.anInt441);
					this.anInt18 -= (int) (Math.random() * (double) this.aClass32_1.method229(this.anInt17, this.aByte1));
				}
			}
			@Pc(78) Class8 local78 = Class8.method40(this.anInt21);
			this.anInt19 = local78.anInt59;
			this.anInt20 = local78.anInt61;
			this.anIntArray5 = local78.anIntArray13;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("22249, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZNRLUAT", name = "a", descriptor = "(Z)Lclient!BMWIVHMF;")
	private Class8 method23() {
		try {
			@Pc(11) int local11 = -1;
			if (this.anInt19 != -1) {
				@Pc(20) Class18 local20 = Class18.aClass18Array1[this.anInt19];
				@Pc(23) int local23 = local20.anInt273;
				@Pc(26) int local26 = local20.anInt274;
				@Pc(29) int local29 = local20.anInt275;
				@Pc(35) int local35 = client.anIntArray236[local29 - local26];
				local11 = aClient1.anIntArray231[local23] >> local26 & local35;
			} else if (this.anInt20 != -1) {
				local11 = aClient1.anIntArray231[this.anInt20];
			}
			return local11 < 0 || local11 >= this.anIntArray5.length || this.anIntArray5[local11] == -1 ? null : Class8.method40(this.anIntArray5[local11]);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("79176, " + true + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZNRLUAT", name = "a", descriptor = "(I)Lclient!VYUQHOMO;")
	@Override
	protected Class5_Sub1_Sub1_Sub6 method372(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass32_1 != null) {
				@Pc(11) int local11 = client.anInt1022 - this.anInt18;
				if (local11 > 100 && this.aClass32_1.anInt442 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass32_1.method229(this.anInt17, this.aByte1)) {
								break label43;
							}
							local11 -= this.aClass32_1.method229(this.anInt17, this.aByte1);
							this.anInt17++;
						} while (this.anInt17 < this.aClass32_1.anInt441);
						this.anInt17 -= this.aClass32_1.anInt442;
					} while (this.anInt17 >= 0 && this.anInt17 < this.aClass32_1.anInt441);
					this.aClass32_1 = null;
				}
				this.anInt18 = client.anInt1022 - local11;
				if (this.aClass32_1 != null) {
					local3 = this.aClass32_1.anIntArray96[this.anInt17];
				}
			}
			@Pc(97) Class8 local97;
			if (this.anIntArray5 == null) {
				local97 = Class8.method40(this.anInt21);
			} else {
				local97 = this.method23();
			}
			if (local97 == null) {
				return null;
			} else {
				@Pc(123) Class5_Sub1_Sub1_Sub6 local123 = local97.method37(this.anInt22, this.anInt23, this.anInt24, this.anInt25, this.anInt26, this.anInt27, local3);
				@Pc(127) boolean local127 = false;
				return local123;
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("57911, " + arg0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}
}
