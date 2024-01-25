import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class126 {

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "Lclient!ji;")
	private Class6_Sub8 aClass6_Sub8_4;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "[Lclient!lw;")
	private Class193_Sub1[] aClass193_Sub1Array2;

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "Lclient!jd;")
	private final Class152 aClass152_1;

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger2;

	@OriginalMember(owner = "client!gu", name = "q", descriptor = "Lclient!pt;")
	private final Class267 aClass267_1;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "Lclient!gb;")
	private Class6_Sub5_Sub12_Sub1 aClass6_Sub5_Sub12_Sub1_1;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!jd;Lclient!pt;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class126(@OriginalArg(0) Class152 arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass152_1 = arg0;
		this.aBigInteger3 = arg3;
		this.aBigInteger2 = arg2;
		this.aClass267_1 = arg1;
		if (!this.aClass152_1.method4602()) {
			this.aClass6_Sub5_Sub12_Sub1_1 = this.aClass152_1.method4601(255, (byte) 0, 255, true);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!bg;Lclient!bg;I)Lclient!lw;")
	public Class193_Sub1 method3585(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		return this.method3589(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Z")
	public boolean method3586() {
		if (this.aClass6_Sub8_4 != null) {
			return true;
		}
		if (this.aClass6_Sub5_Sub12_Sub1_1 == null) {
			if (this.aClass152_1.method4602()) {
				return false;
			}
			this.aClass6_Sub5_Sub12_Sub1_1 = this.aClass152_1.method4601(255, (byte) 0, 255, true);
		}
		if (this.aClass6_Sub5_Sub12_Sub1_1.aBoolean682) {
			return false;
		}
		@Pc(46) Class6_Sub8 local46 = new Class6_Sub8(this.aClass6_Sub5_Sub12_Sub1_1.method7125());
		local46.anInt10061 = 5;
		@Pc(53) int local53 = local46.method8246();
		local46.anInt10061 += local53 * 72;
		@Pc(69) byte[] local69 = new byte[local46.aByteArray102.length - local46.anInt10061];
		local46.method8207(local69, local69.length, 0);
		@Pc(97) byte[] local97;
		if (this.aBigInteger2 == null || this.aBigInteger3 == null) {
			local97 = local69;
		} else {
			@Pc(87) BigInteger local87 = new BigInteger(local69);
			@Pc(94) BigInteger local94 = local87.modPow(this.aBigInteger2, this.aBigInteger3);
			local97 = local94.toByteArray();
		}
		if (local97.length != 65) {
			throw new RuntimeException();
		}
		@Pc(123) byte[] local123 = Static221.method4083(5, local46.aByteArray102, local46.anInt10061 - local69.length - 5);
		for (@Pc(125) int local125 = 0; local125 < 64; local125++) {
			if (local123[local125] != local97[local125 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass6_Sub8_4 = local46;
		this.aClass193_Sub1Array2 = new Class193_Sub1[local53];
		return true;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
	public void method3587() {
		if (this.aClass193_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass193_Sub1Array2.length; local11++) {
			if (this.aClass193_Sub1Array2[local11] != null) {
				this.aClass193_Sub1Array2[local11].method5581();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass193_Sub1Array2.length; local36++) {
			if (this.aClass193_Sub1Array2[local36] != null) {
				this.aClass193_Sub1Array2[local36].method5580();
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZLclient!bg;ILclient!bg;I)Lclient!lw;")
	private Class193_Sub1 method3589(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26 arg2) {
		if (this.aClass6_Sub8_4 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || this.aClass193_Sub1Array2.length <= arg1) {
			throw new RuntimeException();
		} else if (this.aClass193_Sub1Array2[arg1] == null) {
			this.aClass6_Sub8_4.anInt10061 = arg1 * 72 + 6;
			@Pc(44) int local44 = this.aClass6_Sub8_4.method8236();
			@Pc(49) int local49 = this.aClass6_Sub8_4.method8236();
			@Pc(60) byte[] local60 = new byte[64];
			this.aClass6_Sub8_4.method8207(local60, 64, 0);
			@Pc(82) Class193_Sub1 local82 = new Class193_Sub1(arg1, arg0, arg2, this.aClass152_1, this.aClass267_1, local44, local60, local49, true);
			this.aClass193_Sub1Array2[arg1] = local82;
			return local82;
		} else {
			return this.aClass193_Sub1Array2[arg1];
		}
	}
}
