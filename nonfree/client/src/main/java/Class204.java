import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class204 {

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "[Lclient!jf;")
	private Class164_Sub1[] aClass164_Sub1Array2;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Lclient!iaa;")
	private Class6_Sub26 aClass6_Sub26_3;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger8;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "Lclient!np;")
	private final Class228 aClass228_2;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "Lclient!sc;")
	private final Class281 aClass281_2;

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger7;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "Lclient!lba;")
	private Class6_Sub4_Sub9_Sub1 aClass6_Sub4_Sub9_Sub1_1;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!np;Lclient!sc;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class204(@OriginalArg(0) Class228 arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger8 = arg2;
		this.aClass228_2 = arg0;
		this.aClass281_2 = arg1;
		this.aBigInteger7 = arg3;
		if (!this.aClass228_2.method5712()) {
			this.aClass6_Sub4_Sub9_Sub1_1 = this.aClass228_2.method5719(true, 255, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	public void method4912() {
		if (this.aClass164_Sub1Array2 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.aClass164_Sub1Array2.length; local17++) {
			if (this.aClass164_Sub1Array2[local17] != null) {
				this.aClass164_Sub1Array2[local17].method4273();
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.aClass164_Sub1Array2.length; local38++) {
			if (this.aClass164_Sub1Array2[local38] != null) {
				this.aClass164_Sub1Array2[local38].method4269();
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)Z")
	public boolean method4914() {
		if (this.aClass6_Sub26_3 != null) {
			return true;
		}
		if (this.aClass6_Sub4_Sub9_Sub1_1 == null) {
			if (this.aClass228_2.method5712()) {
				return false;
			}
			this.aClass6_Sub4_Sub9_Sub1_1 = this.aClass228_2.method5719(true, 255, 255, (byte) 0);
		}
		if (this.aClass6_Sub4_Sub9_Sub1_1.aBoolean715) {
			return false;
		}
		@Pc(49) Class6_Sub26 local49 = new Class6_Sub26(this.aClass6_Sub4_Sub9_Sub1_1.method8037());
		local49.anInt5769 = 5;
		@Pc(56) int local56 = local49.method4966();
		local49.anInt5769 += local56 * 72;
		@Pc(72) byte[] local72 = new byte[local49.aByteArray65.length - local49.anInt5769];
		local49.method4977(local72.length, local72);
		@Pc(87) byte[] local87;
		if (this.aBigInteger8 == null || this.aBigInteger7 == null) {
			local87 = local72;
		} else {
			@Pc(94) BigInteger local94 = new BigInteger(local72);
			@Pc(101) BigInteger local101 = local94.modPow(this.aBigInteger8, this.aBigInteger7);
			local87 = local101.toByteArray();
		}
		if (local87.length != 65) {
			throw new RuntimeException();
		}
		@Pc(125) byte[] local125 = Static137.method2579(local49.anInt5769 - local72.length - 5, local49.aByteArray65, 5);
		for (@Pc(127) int local127 = 0; local127 < 64; local127++) {
			if (local125[local127] != local87[local127 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass164_Sub1Array2 = new Class164_Sub1[local56];
		this.aClass6_Sub26_3 = local49;
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!qn;Lclient!qn;II)Lclient!jf;")
	public Class164_Sub1 method4915(@OriginalArg(0) Class266 arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(3) int arg2) {
		return this.method4916(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BIZLclient!qn;Lclient!qn;)Lclient!jf;")
	private Class164_Sub1 method4916(@OriginalArg(1) int arg0, @OriginalArg(3) Class266 arg1, @OriginalArg(4) Class266 arg2) {
		if (this.aClass6_Sub26_3 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || this.aClass164_Sub1Array2.length <= arg0) {
			throw new RuntimeException();
		} else if (this.aClass164_Sub1Array2[arg0] == null) {
			this.aClass6_Sub26_3.anInt5769 = arg0 * 72 + 6;
			@Pc(51) int local51 = this.aClass6_Sub26_3.method5000();
			@Pc(56) int local56 = this.aClass6_Sub26_3.method5000();
			@Pc(59) byte[] local59 = new byte[64];
			this.aClass6_Sub26_3.method4977(64, local59);
			@Pc(86) Class164_Sub1 local86 = new Class164_Sub1(arg0, arg1, arg2, this.aClass228_2, this.aClass281_2, local51, local59, local56, true);
			this.aClass164_Sub1Array2[arg0] = local86;
			return local86;
		} else {
			return this.aClass164_Sub1Array2[arg0];
		}
	}
}
