import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class343 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "[Lclient!dj;")
	private Class62_Sub1[] aClass62_Sub1Array2;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "Lclient!fd;")
	private Class3_Sub7 aClass3_Sub7_7;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "Lclient!wb;")
	private final Class349 aClass349_3;

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger8;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "Lclient!rs;")
	private final Class289 aClass289_3;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger7;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "Lclient!tf;")
	private Class3_Sub4_Sub8_Sub2 aClass3_Sub4_Sub8_Sub2_2;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!rs;Lclient!wb;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class343(@OriginalArg(0) Class289 arg0, @OriginalArg(1) Class349 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass349_3 = arg1;
		this.aBigInteger8 = arg2;
		this.aClass289_3 = arg0;
		this.aBigInteger7 = arg3;
		if (!this.aClass289_3.method7100()) {
			this.aClass3_Sub4_Sub8_Sub2_2 = this.aClass289_3.method7091(true, 255, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	public void method8127() {
		if (this.aClass62_Sub1Array2 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.aClass62_Sub1Array2.length; local17++) {
			if (this.aClass62_Sub1Array2[local17] != null) {
				this.aClass62_Sub1Array2[local17].method2088();
			}
		}
		for (@Pc(42) int local42 = 0; local42 < this.aClass62_Sub1Array2.length; local42++) {
			if (this.aClass62_Sub1Array2[local42] != null) {
				this.aClass62_Sub1Array2[local42].method2087();
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)Z")
	public boolean method8128() {
		if (this.aClass3_Sub7_7 != null) {
			return true;
		}
		if (this.aClass3_Sub4_Sub8_Sub2_2 == null) {
			if (this.aClass289_3.method7100()) {
				return false;
			}
			this.aClass3_Sub4_Sub8_Sub2_2 = this.aClass289_3.method7091(true, 255, 255, (byte) 0);
		}
		if (this.aClass3_Sub4_Sub8_Sub2_2.aBoolean781) {
			return false;
		}
		@Pc(44) Class3_Sub7 local44 = new Class3_Sub7(this.aClass3_Sub4_Sub8_Sub2_2.method7551());
		local44.anInt7869 = 5;
		@Pc(51) int local51 = local44.method6538();
		local44.anInt7869 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray86.length - local44.anInt7869];
		local44.method6540(local68, local68.length);
		@Pc(83) byte[] local83;
		if (this.aBigInteger8 == null || this.aBigInteger7 == null) {
			local83 = local68;
		} else {
			@Pc(90) BigInteger local90 = new BigInteger(local68);
			@Pc(97) BigInteger local97 = local90.modPow(this.aBigInteger8, this.aBigInteger7);
			local83 = local97.toByteArray();
		}
		if (local83.length != 65) {
			throw new RuntimeException();
		}
		@Pc(123) byte[] local123 = Static284.method6244(local44.anInt7869 - local68.length - 5, local44.aByteArray86, 5);
		for (@Pc(130) int local130 = 0; local130 < 64; local130++) {
			if (local123[local130] != local83[local130 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass3_Sub7_7 = local44;
		this.aClass62_Sub1Array2 = new Class62_Sub1[local51];
		return true;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!sd;BIZLclient!sd;)Lclient!dj;")
	private Class62_Sub1 method8129(@OriginalArg(0) Class294 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class294 arg2) {
		if (this.aClass3_Sub7_7 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || arg1 >= this.aClass62_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass62_Sub1Array2[arg1] == null) {
			this.aClass3_Sub7_7.anInt7869 = arg1 * 72 + 6;
			@Pc(47) int local47 = this.aClass3_Sub7_7.method6497();
			@Pc(52) int local52 = this.aClass3_Sub7_7.method6497();
			@Pc(61) byte[] local61 = new byte[64];
			this.aClass3_Sub7_7.method6540(local61, 64);
			@Pc(83) Class62_Sub1 local83 = new Class62_Sub1(arg1, arg2, arg0, this.aClass289_3, this.aClass349_3, local47, local61, local52, true);
			this.aClass62_Sub1Array2[arg1] = local83;
			return local83;
		} else {
			return this.aClass62_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BILclient!sd;Lclient!sd;)Lclient!dj;")
	public Class62_Sub1 method8130(@OriginalArg(1) int arg0, @OriginalArg(2) Class294 arg1, @OriginalArg(3) Class294 arg2) {
		return this.method8129(arg1, arg0, arg2);
	}
}
