import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class54 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "[Lclient!cm;")
	private Class58_Sub1[] aClass58_Sub1Array1;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Lclient!jr;")
	private Class6_Sub12 aClass6_Sub12_1;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger2;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!lba;")
	private final Class180 aClass180_1;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "Lclient!np;")
	private final Class219 aClass219_1;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "Lclient!pi;")
	private Class6_Sub5_Sub3_Sub2 aClass6_Sub5_Sub3_Sub2_1;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!lba;Lclient!np;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class54(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger3 = arg2;
		this.aBigInteger2 = arg3;
		this.aClass180_1 = arg0;
		this.aClass219_1 = arg1;
		if (!this.aClass180_1.method4353()) {
			this.aClass6_Sub5_Sub3_Sub2_1 = this.aClass180_1.method4354(255, true, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public void method982() {
		if (this.aClass58_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass58_Sub1Array1.length; local11++) {
			if (this.aClass58_Sub1Array1[local11] != null) {
				this.aClass58_Sub1Array1[local11].method1071();
			}
		}
		for (@Pc(42) int local42 = 0; local42 < this.aClass58_Sub1Array1.length; local42++) {
			if (this.aClass58_Sub1Array1[local42] != null) {
				this.aClass58_Sub1Array1[local42].method1072();
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!fo;Lclient!fo;IZZ)Lclient!cm;")
	private Class58_Sub1 method983(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass6_Sub12_1 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || arg2 >= this.aClass58_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass58_Sub1Array1[arg2] == null) {
			this.aClass6_Sub12_1.anInt7556 = arg2 * 72 + 6;
			@Pc(48) int local48 = this.aClass6_Sub12_1.method6015();
			@Pc(53) int local53 = this.aClass6_Sub12_1.method6015();
			@Pc(56) byte[] local56 = new byte[64];
			this.aClass6_Sub12_1.method6020(local56, 64);
			@Pc(78) Class58_Sub1 local78 = new Class58_Sub1(arg2, arg1, arg0, this.aClass180_1, this.aClass219_1, local48, local56, local53, true);
			this.aClass58_Sub1Array1[arg2] = local78;
			return local78;
		} else {
			return this.aClass58_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!fo;ZILclient!fo;)Lclient!cm;")
	public Class58_Sub1 method985(@OriginalArg(0) Class109 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class109 arg2) {
		return this.method983(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Z")
	public boolean method986() {
		if (this.aClass6_Sub12_1 != null) {
			return true;
		}
		if (this.aClass6_Sub5_Sub3_Sub2_1 == null) {
			if (this.aClass180_1.method4353()) {
				return false;
			}
			this.aClass6_Sub5_Sub3_Sub2_1 = this.aClass180_1.method4354(255, true, 255, (byte) 0);
		}
		if (this.aClass6_Sub5_Sub3_Sub2_1.aBoolean492) {
			return false;
		}
		@Pc(44) Class6_Sub12 local44 = new Class6_Sub12(this.aClass6_Sub5_Sub3_Sub2_1.method5767());
		local44.anInt7556 = 5;
		@Pc(58) int local58 = local44.method6019();
		local44.anInt7556 += local58 * 72;
		@Pc(75) byte[] local75 = new byte[local44.aByteArray97.length - local44.anInt7556];
		local44.method6020(local75, local75.length);
		@Pc(103) byte[] local103;
		if (this.aBigInteger3 == null || this.aBigInteger2 == null) {
			local103 = local75;
		} else {
			@Pc(93) BigInteger local93 = new BigInteger(local75);
			@Pc(100) BigInteger local100 = local93.modPow(this.aBigInteger3, this.aBigInteger2);
			local103 = local100.toByteArray();
		}
		if (local103.length != 65) {
			throw new RuntimeException();
		}
		@Pc(129) byte[] local129 = Static557.method7739(local44.anInt7556 - local75.length - 5, local44.aByteArray97, 5);
		for (@Pc(131) int local131 = 0; local131 < 64; local131++) {
			if (local103[local131 + 1] != local129[local131]) {
				throw new RuntimeException();
			}
		}
		this.aClass6_Sub12_1 = local44;
		this.aClass58_Sub1Array1 = new Class58_Sub1[local58];
		return true;
	}
}
