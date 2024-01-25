import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class224 {

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "Lclient!mc;")
	private Class5_Sub41 aClass5_Sub41_5;

	@OriginalMember(owner = "client!mda", name = "m", descriptor = "[Lclient!lda;")
	private Class210_Sub1[] aClass210_Sub1Array1;

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!mda", name = "o", descriptor = "Lclient!qv;")
	private final Class296 aClass296_2;

	@OriginalMember(owner = "client!mda", name = "h", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "Lclient!hh;")
	private final Class147 aClass147_2;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "Lclient!kd;")
	private Class5_Sub3_Sub11_Sub1 aClass5_Sub3_Sub11_Sub1_1;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!qv;Lclient!hh;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class224(@OriginalArg(0) Class296 arg0, @OriginalArg(1) Class147 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger4 = arg2;
		this.aClass296_2 = arg0;
		this.aBigInteger5 = arg3;
		this.aClass147_2 = arg1;
		if (!this.aClass296_2.method7095()) {
			this.aClass5_Sub3_Sub11_Sub1_1 = this.aClass296_2.method7094(true, 255, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IZLclient!cr;Lclient!cr;I)Lclient!lda;")
	private Class210_Sub1 method5527(@OriginalArg(2) Class71 arg0, @OriginalArg(3) Class71 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass5_Sub41_5 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || this.aClass210_Sub1Array1.length <= arg2) {
			throw new RuntimeException();
		} else if (this.aClass210_Sub1Array1[arg2] == null) {
			this.aClass5_Sub41_5.anInt9230 = arg2 * 72 + 6;
			@Pc(51) int local51 = this.aClass5_Sub41_5.method7804();
			@Pc(56) int local56 = this.aClass5_Sub41_5.method7804();
			@Pc(59) byte[] local59 = new byte[64];
			this.aClass5_Sub41_5.method7802(64, 0, local59);
			@Pc(89) Class210_Sub1 local89 = new Class210_Sub1(arg2, arg1, arg0, this.aClass296_2, this.aClass147_2, local51, local59, local56, true);
			this.aClass210_Sub1Array1[arg2] = local89;
			return local89;
		} else {
			return this.aClass210_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
	public void method5529() {
		if (this.aClass210_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass210_Sub1Array1.length; local11++) {
			if (this.aClass210_Sub1Array1[local11] != null) {
				this.aClass210_Sub1Array1[local11].method5150();
			}
		}
		for (@Pc(42) int local42 = 0; local42 < this.aClass210_Sub1Array1.length; local42++) {
			if (this.aClass210_Sub1Array1[local42] != null) {
				this.aClass210_Sub1Array1[local42].method5148();
			}
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILclient!cr;ILclient!cr;)Lclient!lda;")
	public Class210_Sub1 method5531(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(3) Class71 arg2) {
		return this.method5527(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)Z")
	public boolean method5532() {
		if (this.aClass5_Sub41_5 != null) {
			return true;
		}
		if (this.aClass5_Sub3_Sub11_Sub1_1 == null) {
			if (this.aClass296_2.method7095()) {
				return false;
			}
			this.aClass5_Sub3_Sub11_Sub1_1 = this.aClass296_2.method7094(true, 255, (byte) 0, 255);
		}
		if (this.aClass5_Sub3_Sub11_Sub1_1.aBoolean664) {
			return false;
		}
		@Pc(46) Class5_Sub41 local46 = new Class5_Sub41(this.aClass5_Sub3_Sub11_Sub1_1.method6567());
		local46.anInt9230 = 5;
		@Pc(53) int local53 = local46.method7816();
		local46.anInt9230 += local53 * 72;
		@Pc(70) byte[] local70 = new byte[local46.aByteArray93.length - local46.anInt9230];
		local46.method7802(local70.length, 0, local70);
		@Pc(85) byte[] local85;
		if (this.aBigInteger4 == null || this.aBigInteger5 == null) {
			local85 = local70;
		} else {
			@Pc(92) BigInteger local92 = new BigInteger(local70);
			@Pc(99) BigInteger local99 = local92.modPow(this.aBigInteger4, this.aBigInteger5);
			local85 = local99.toByteArray();
		}
		if (local85.length != 65) {
			throw new RuntimeException();
		}
		@Pc(126) byte[] local126 = Static257.method4017(local46.aByteArray93, local46.anInt9230 - local70.length - 5, 5);
		for (@Pc(133) int local133 = 0; local133 < 64; local133++) {
			if (local85[local133 + 1] != local126[local133]) {
				throw new RuntimeException();
			}
		}
		this.aClass210_Sub1Array1 = new Class210_Sub1[local53];
		this.aClass5_Sub41_5 = local46;
		return true;
	}
}
