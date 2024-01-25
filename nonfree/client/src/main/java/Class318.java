import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class318 {

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "[I")
	public static final int[] anIntArray478 = new int[256];

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "[Lclient!tf;")
	private Class222_Sub1[] aClass222_Sub1Array2;

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "Lclient!wq;")
	private Class5_Sub36 aClass5_Sub36_7;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger7;

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "Lclient!mo;")
	private final Class241 aClass241_2;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "Lclient!qh;")
	private final Class301 aClass301_6;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "Lclient!sv;")
	private Class5_Sub1_Sub4_Sub2 aClass5_Sub1_Sub4_Sub2_2;

	static {
		for (@Pc(61) int local61 = 0; local61 < 256; local61++) {
			@Pc(64) int local64 = local61;
			for (@Pc(66) int local66 = 0; local66 < 8; local66++) {
				if ((local64 & 0x1) == 1) {
					local64 = local64 >>> 1 ^ 0xEDB88320;
				} else {
					local64 >>>= 0x1;
				}
			}
			anIntArray478[local61] = local64;
		}
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!mo;Lclient!qh;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class318(@OriginalArg(0) Class241 arg0, @OriginalArg(1) Class301 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger6 = arg3;
		this.aBigInteger7 = arg2;
		this.aClass241_2 = arg0;
		this.aClass301_6 = arg1;
		if (!this.aClass241_2.method5539()) {
			this.aClass5_Sub1_Sub4_Sub2_2 = this.aClass241_2.method5532(255, (byte) 0, 255, true);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!dca;ZILclient!dca;I)Lclient!tf;")
	private Class222_Sub1 method7163(@OriginalArg(0) Class75 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		if (this.aClass5_Sub36_7 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || this.aClass222_Sub1Array2.length <= arg1) {
			throw new RuntimeException();
		} else if (this.aClass222_Sub1Array2[arg1] == null) {
			this.aClass5_Sub36_7.anInt8456 = arg1 * 72 + 6;
			@Pc(51) int local51 = this.aClass5_Sub36_7.method7268();
			@Pc(56) int local56 = this.aClass5_Sub36_7.method7268();
			@Pc(59) byte[] local59 = new byte[64];
			this.aClass5_Sub36_7.method7297(local59, 0, 64);
			@Pc(90) Class222_Sub1 local90 = new Class222_Sub1(arg1, arg2, arg0, this.aClass241_2, this.aClass301_6, local51, local59, local56, true);
			this.aClass222_Sub1Array2[arg1] = local90;
			return local90;
		} else {
			return this.aClass222_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!dca;Lclient!dca;B)Lclient!tf;")
	public Class222_Sub1 method7164(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) Class75 arg2) {
		return this.method7163(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V")
	public void method7165() {
		if (this.aClass222_Sub1Array2 == null) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < this.aClass222_Sub1Array2.length; local24++) {
			if (this.aClass222_Sub1Array2[local24] != null) {
				this.aClass222_Sub1Array2[local24].method7716();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < this.aClass222_Sub1Array2.length; local58++) {
			if (this.aClass222_Sub1Array2[local58] != null) {
				this.aClass222_Sub1Array2[local58].method7713();
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)Z")
	public boolean method7167() {
		if (this.aClass5_Sub36_7 != null) {
			return true;
		}
		if (this.aClass5_Sub1_Sub4_Sub2_2 == null) {
			if (this.aClass241_2.method5539()) {
				return false;
			}
			this.aClass5_Sub1_Sub4_Sub2_2 = this.aClass241_2.method5532(255, (byte) 0, 255, true);
		}
		if (this.aClass5_Sub1_Sub4_Sub2_2.aBoolean589) {
			return false;
		}
		@Pc(57) Class5_Sub36 local57 = new Class5_Sub36(this.aClass5_Sub1_Sub4_Sub2_2.method7596());
		local57.anInt8456 = 5;
		@Pc(64) int local64 = local57.method7291();
		local57.anInt8456 += local64 * 72;
		@Pc(81) byte[] local81 = new byte[local57.aByteArray89.length - local57.anInt8456];
		local57.method7297(local81, 0, local81.length);
		@Pc(98) byte[] local98;
		if (this.aBigInteger7 == null || this.aBigInteger6 == null) {
			local98 = local81;
		} else {
			@Pc(105) BigInteger local105 = new BigInteger(local81);
			@Pc(112) BigInteger local112 = local105.modPow(this.aBigInteger7, this.aBigInteger6);
			local98 = local112.toByteArray();
		}
		if (local98.length != 65) {
			throw new RuntimeException();
		}
		@Pc(140) byte[] local140 = Static645.method8911(local57.anInt8456 - local81.length - 5, local57.aByteArray89, 5);
		for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
			if (local98[local142 + 1] != local140[local142]) {
				throw new RuntimeException();
			}
		}
		this.aClass222_Sub1Array2 = new Class222_Sub1[local64];
		this.aClass5_Sub36_7 = local57;
		return true;
	}
}
