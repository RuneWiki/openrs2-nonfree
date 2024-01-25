import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class298 {

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "[Lclient!uaa;")
	private Class29_Sub1[] aClass29_Sub1Array2;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!mo;")
	private Class1_Sub35 aClass1_Sub35_5;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger7;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "Lclient!aga;")
	private final Class9 aClass9_2;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "Lclient!n;")
	private final Class229 aClass229_2;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Lclient!uh;")
	private Class1_Sub6_Sub2_Sub2 aClass1_Sub6_Sub2_Sub2_2;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!aga;Lclient!n;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class298(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger7 = arg3;
		this.aBigInteger6 = arg2;
		this.aClass9_2 = arg0;
		this.aClass229_2 = arg1;
		if (!this.aClass9_2.method136()) {
			this.aClass1_Sub6_Sub2_Sub2_2 = this.aClass9_2.method140(255, 255, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)Z")
	public boolean method6398() {
		if (this.aClass1_Sub35_5 != null) {
			return true;
		}
		if (this.aClass1_Sub6_Sub2_Sub2_2 == null) {
			if (this.aClass9_2.method136()) {
				return false;
			}
			this.aClass1_Sub6_Sub2_Sub2_2 = this.aClass9_2.method140(255, 255, (byte) 0, true);
		}
		if (this.aClass1_Sub6_Sub2_Sub2_2.aBoolean688) {
			return false;
		}
		@Pc(44) Class1_Sub35 local44 = new Class1_Sub35(this.aClass1_Sub6_Sub2_Sub2_2.method7266());
		local44.anInt7214 = 5;
		@Pc(51) int local51 = local44.method5750();
		local44.anInt7214 += local51 * 72;
		@Pc(74) byte[] local74 = new byte[local44.aByteArray85.length - local44.anInt7214];
		local44.method5800(local74, local74.length);
		@Pc(102) byte[] local102;
		if (this.aBigInteger6 == null || this.aBigInteger7 == null) {
			local102 = local74;
		} else {
			@Pc(92) BigInteger local92 = new BigInteger(local74);
			@Pc(99) BigInteger local99 = local92.modPow(this.aBigInteger6, this.aBigInteger7);
			local102 = local99.toByteArray();
		}
		if (local102.length != 65) {
			throw new RuntimeException();
		}
		@Pc(131) byte[] local131 = Static532.method7304(local44.anInt7214 - local74.length - 5, local44.aByteArray85, 5);
		for (@Pc(133) int local133 = 0; local133 < 64; local133++) {
			if (local131[local133] != local102[local133 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass1_Sub35_5 = local44;
		this.aClass29_Sub1Array2 = new Class29_Sub1[local51];
		return true;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	public void method6399() {
		if (this.aClass29_Sub1Array2 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.aClass29_Sub1Array2.length; local17++) {
			if (this.aClass29_Sub1Array2[local17] != null) {
				this.aClass29_Sub1Array2[local17].method7194();
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.aClass29_Sub1Array2.length; local38++) {
			if (this.aClass29_Sub1Array2[local38] != null) {
				this.aClass29_Sub1Array2[local38].method7189();
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZLclient!wo;ILclient!wo;)Lclient!uaa;")
	private Class29_Sub1 method6402(@OriginalArg(2) Class360 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class360 arg2) {
		if (this.aClass1_Sub35_5 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || this.aClass29_Sub1Array2.length <= arg1) {
			throw new RuntimeException();
		} else if (this.aClass29_Sub1Array2[arg1] == null) {
			this.aClass1_Sub35_5.anInt7214 = arg1 * 72 + 6;
			@Pc(47) int local47 = this.aClass1_Sub35_5.method5804();
			@Pc(52) int local52 = this.aClass1_Sub35_5.method5804();
			@Pc(55) byte[] local55 = new byte[64];
			this.aClass1_Sub35_5.method5800(local55, 64);
			@Pc(88) Class29_Sub1 local88 = new Class29_Sub1(arg1, arg0, arg2, this.aClass9_2, this.aClass229_2, local47, local55, local52, true);
			this.aClass29_Sub1Array2[arg1] = local88;
			return local88;
		} else {
			return this.aClass29_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!wo;Lclient!wo;)Lclient!uaa;")
	public Class29_Sub1 method6403(@OriginalArg(1) int arg0, @OriginalArg(2) Class360 arg1, @OriginalArg(3) Class360 arg2) {
		return this.method6402(arg2, arg0, arg1);
	}
}
