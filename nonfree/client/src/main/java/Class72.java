import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class72 {

	@OriginalMember(owner = "client!de", name = "k", descriptor = "[Lclient!jba;")
	private Class21_Sub1[] aClass21_Sub1Array2;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!jc;")
	private Class6_Sub15 aClass6_Sub15_29;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!jh;")
	private final Class189 aClass189_1;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!jg;")
	private final Class188 aClass188_2;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "Lclient!af;")
	private Class6_Sub2_Sub1_Sub1 aClass6_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!jh;Lclient!jg;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class72(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger3 = arg3;
		this.aClass189_1 = arg0;
		this.aClass188_2 = arg1;
		this.aBigInteger4 = arg2;
		if (!this.aClass189_1.method4685()) {
			this.aClass6_Sub2_Sub1_Sub1_1 = this.aClass189_1.method4688((byte) 0, 255, 255, true);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!nha;BLclient!nha;I)Lclient!jba;")
	public Class21_Sub1 method1355(@OriginalArg(0) Class251 arg0, @OriginalArg(2) Class251 arg1, @OriginalArg(3) int arg2) {
		return this.method1356(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZILclient!nha;Lclient!nha;B)Lclient!jba;")
	private Class21_Sub1 method1356(@OriginalArg(1) int arg0, @OriginalArg(2) Class251 arg1, @OriginalArg(3) Class251 arg2) {
		if (this.aClass6_Sub15_29 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || this.aClass21_Sub1Array2.length <= arg0) {
			throw new RuntimeException();
		} else if (this.aClass21_Sub1Array2[arg0] == null) {
			this.aClass6_Sub15_29.anInt3174 = arg0 * 72 + 6;
			@Pc(52) int local52 = this.aClass6_Sub15_29.method3015();
			@Pc(57) int local57 = this.aClass6_Sub15_29.method3015();
			@Pc(60) byte[] local60 = new byte[64];
			this.aClass6_Sub15_29.method3019(64, 0, local60);
			@Pc(82) Class21_Sub1 local82 = new Class21_Sub1(arg0, arg1, arg2, this.aClass189_1, this.aClass188_2, local52, local60, local57, true);
			this.aClass21_Sub1Array2[arg0] = local82;
			return local82;
		} else {
			return this.aClass21_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Z")
	public boolean method1357(@OriginalArg(0) int arg0) {
		if (this.aClass6_Sub15_29 != null) {
			return true;
		}
		if (this.aClass6_Sub2_Sub1_Sub1_1 == null) {
			if (this.aClass189_1.method4685()) {
				return false;
			}
			this.aClass6_Sub2_Sub1_Sub1_1 = this.aClass189_1.method4688((byte) 0, 255, 255, true);
		}
		if (this.aClass6_Sub2_Sub1_Sub1_1.aBoolean259) {
			return false;
		}
		@Pc(49) Class6_Sub15 local49 = new Class6_Sub15(this.aClass6_Sub2_Sub1_Sub1_1.method3112());
		local49.anInt3174 = 5;
		if (arg0 != 23004) {
			this.method1359((byte) -90);
		}
		@Pc(64) int local64 = local49.method3030();
		local49.anInt3174 += local64 * 72;
		@Pc(80) byte[] local80 = new byte[local49.aByteArray20.length - local49.anInt3174];
		local49.method3019(local80.length, 0, local80);
		@Pc(110) byte[] local110;
		if (this.aBigInteger4 == null || this.aBigInteger3 == null) {
			local110 = local80;
		} else {
			@Pc(100) BigInteger local100 = new BigInteger(local80);
			@Pc(107) BigInteger local107 = local100.modPow(this.aBigInteger4, this.aBigInteger3);
			local110 = local107.toByteArray();
		}
		if (local110.length != 65) {
			throw new RuntimeException();
		}
		@Pc(136) byte[] local136 = Static269.method4566(local49.anInt3174 - local80.length - 5, 5, local49.aByteArray20);
		for (@Pc(138) int local138 = 0; local138 < 64; local138++) {
			if (local136[local138] != local110[local138 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass21_Sub1Array2 = new Class21_Sub1[local64];
		this.aClass6_Sub15_29 = local49;
		return true;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public void method1359(@OriginalArg(0) byte arg0) {
		if (this.aClass21_Sub1Array2 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aClass21_Sub1Array2.length; local12++) {
			if (this.aClass21_Sub1Array2[local12] != null) {
				this.aClass21_Sub1Array2[local12].method4622();
			}
		}
		if (arg0 != 110) {
			this.method1357(-93);
		}
		for (@Pc(50) int local50 = 0; local50 < this.aClass21_Sub1Array2.length; local50++) {
			if (this.aClass21_Sub1Array2[local50] != null) {
				this.aClass21_Sub1Array2[local50].method4628();
			}
		}
	}
}
