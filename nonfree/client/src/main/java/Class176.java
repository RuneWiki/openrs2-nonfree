import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class176 {

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "[Lclient!pda;")
	private Class251_Sub1[] aClass251_Sub1Array1;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Lclient!es;")
	private Class2_Sub15 aClass2_Sub15_3;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "Lclient!th;")
	private final Class319 aClass319_1;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Lclient!uaa;")
	private final Class327 aClass327_2;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "Lclient!nf;")
	private Class2_Sub3_Sub5_Sub2 aClass2_Sub3_Sub5_Sub2_1;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!uaa;Lclient!th;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class176(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class319 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass319_1 = arg1;
		this.aBigInteger3 = arg2;
		this.aBigInteger4 = arg3;
		this.aClass327_2 = arg0;
		if (!this.aClass327_2.method7232()) {
			this.aClass2_Sub3_Sub5_Sub2_1 = this.aClass327_2.method7221(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Z")
	public boolean method3948() {
		if (this.aClass2_Sub15_3 != null) {
			return true;
		}
		if (this.aClass2_Sub3_Sub5_Sub2_1 == null) {
			if (this.aClass327_2.method7232()) {
				return false;
			}
			this.aClass2_Sub3_Sub5_Sub2_1 = this.aClass327_2.method7221(255, 255, true, (byte) 0);
		}
		if (this.aClass2_Sub3_Sub5_Sub2_1.aBoolean501) {
			return false;
		}
		@Pc(46) Class2_Sub15 local46 = new Class2_Sub15(this.aClass2_Sub3_Sub5_Sub2_1.method5301());
		local46.anInt5241 = 5;
		@Pc(53) int local53 = local46.method4325();
		local46.anInt5241 += local53 * 72;
		@Pc(69) byte[] local69 = new byte[local46.aByteArray62.length - local46.anInt5241];
		local46.method4346(local69, local69.length);
		@Pc(97) byte[] local97;
		if (this.aBigInteger3 == null || this.aBigInteger4 == null) {
			local97 = local69;
		} else {
			@Pc(87) BigInteger local87 = new BigInteger(local69);
			@Pc(94) BigInteger local94 = local87.modPow(this.aBigInteger3, this.aBigInteger4);
			local97 = local94.toByteArray();
		}
		if (local97.length != 65) {
			throw new RuntimeException();
		}
		@Pc(125) byte[] local125 = Static1.method1(local46.anInt5241 - local69.length - 5, local46.aByteArray62, 5);
		for (@Pc(127) int local127 = 0; local127 < 64; local127++) {
			if (local125[local127] != local97[local127 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass2_Sub15_3 = local46;
		this.aClass251_Sub1Array1 = new Class251_Sub1[local53];
		return true;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	public void method3949() {
		if (this.aClass251_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass251_Sub1Array1.length; local11++) {
			if (this.aClass251_Sub1Array1[local11] != null) {
				this.aClass251_Sub1Array1[local11].method5865();
			}
		}
		for (@Pc(37) int local37 = 0; local37 < this.aClass251_Sub1Array1.length; local37++) {
			if (this.aClass251_Sub1Array1[local37] != null) {
				this.aClass251_Sub1Array1[local37].method5868();
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZLclient!lf;ILclient!lf;)Lclient!pda;")
	private Class251_Sub1 method3950(@OriginalArg(2) Class207 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class207 arg2) {
		if (this.aClass2_Sub15_3 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || arg1 >= this.aClass251_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass251_Sub1Array1[arg1] == null) {
			this.aClass2_Sub15_3.anInt5241 = arg1 * 72 + 6;
			@Pc(48) int local48 = this.aClass2_Sub15_3.method4307();
			@Pc(53) int local53 = this.aClass2_Sub15_3.method4307();
			@Pc(56) byte[] local56 = new byte[64];
			this.aClass2_Sub15_3.method4346(local56, 64);
			@Pc(78) Class251_Sub1 local78 = new Class251_Sub1(arg1, arg2, arg0, this.aClass327_2, this.aClass319_1, local48, local56, local53, true);
			this.aClass251_Sub1Array1[arg1] = local78;
			return local78;
		} else {
			return this.aClass251_Sub1Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!lf;Lclient!lf;B)Lclient!pda;")
	public Class251_Sub1 method3951(@OriginalArg(0) int arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class207 arg2) {
		return this.method3950(arg1, arg0, arg2);
	}
}
