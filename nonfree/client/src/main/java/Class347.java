import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class347 {

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "Lclient!so;")
	private Class14_Sub29 aClass14_Sub29_9;

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "[Lclient!im;")
	private Class167_Sub1[] aClass167_Sub1Array2;

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger10;

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "Lclient!rf;")
	private final Class298 aClass298_3;

	@OriginalMember(owner = "client!uca", name = "i", descriptor = "Lclient!gu;")
	private final Class135 aClass135_9;

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger9;

	@OriginalMember(owner = "client!uca", name = "l", descriptor = "Lclient!kka;")
	private Class14_Sub3_Sub2_Sub1 aClass14_Sub3_Sub2_Sub1_2;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lclient!gu;Lclient!rf;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class347(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class298 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger10 = arg3;
		this.aClass298_3 = arg1;
		this.aClass135_9 = arg0;
		this.aBigInteger9 = arg2;
		if (!this.aClass135_9.method3071()) {
			this.aClass14_Sub3_Sub2_Sub1_2 = this.aClass135_9.method3060(255, 255, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILclient!uaa;Lclient!uaa;I)Lclient!im;")
	public Class167_Sub1 method8433(@OriginalArg(0) int arg0, @OriginalArg(1) Class345 arg1, @OriginalArg(2) Class345 arg2) {
		return this.method8439(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
	public void method8434() {
		if (this.aClass167_Sub1Array2 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.aClass167_Sub1Array2.length; local16++) {
			if (this.aClass167_Sub1Array2[local16] != null) {
				this.aClass167_Sub1Array2[local16].method3706();
			}
		}
		for (@Pc(43) int local43 = 0; local43 < this.aClass167_Sub1Array2.length; local43++) {
			if (this.aClass167_Sub1Array2[local43] != null) {
				this.aClass167_Sub1Array2[local43].method3711();
			}
		}
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(B)Z")
	public boolean method8435() {
		if (this.aClass14_Sub29_9 != null) {
			return true;
		}
		if (this.aClass14_Sub3_Sub2_Sub1_2 == null) {
			if (this.aClass135_9.method3071()) {
				return false;
			}
			this.aClass14_Sub3_Sub2_Sub1_2 = this.aClass135_9.method3060(255, 255, (byte) 0, true);
		}
		if (this.aClass14_Sub3_Sub2_Sub1_2.aBoolean494) {
			return false;
		}
		@Pc(44) Class14_Sub29 local44 = new Class14_Sub29(this.aClass14_Sub3_Sub2_Sub1_2.method5605());
		local44.anInt7264 = 5;
		@Pc(51) int local51 = local44.method5866();
		local44.anInt7264 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray84.length - local44.anInt7264];
		local44.method5860(local68, 0, local68.length);
		@Pc(96) byte[] local96;
		if (this.aBigInteger9 == null || this.aBigInteger10 == null) {
			local96 = local68;
		} else {
			@Pc(86) BigInteger local86 = new BigInteger(local68);
			@Pc(93) BigInteger local93 = local86.modPow(this.aBigInteger9, this.aBigInteger10);
			local96 = local93.toByteArray();
		}
		if (local96.length != 65) {
			throw new RuntimeException();
		}
		@Pc(124) byte[] local124 = Static53.method1112(5, local44.aByteArray84, local44.anInt7264 - local68.length - 5);
		for (@Pc(126) int local126 = 0; local126 < 64; local126++) {
			if (local96[local126 + 1] != local124[local126]) {
				throw new RuntimeException();
			}
		}
		this.aClass14_Sub29_9 = local44;
		this.aClass167_Sub1Array2 = new Class167_Sub1[local51];
		return true;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BILclient!uaa;Lclient!uaa;Z)Lclient!im;")
	private Class167_Sub1 method8439(@OriginalArg(1) int arg0, @OriginalArg(2) Class345 arg1, @OriginalArg(3) Class345 arg2) {
		if (this.aClass14_Sub29_9 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass167_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass167_Sub1Array2[arg0] == null) {
			this.aClass14_Sub29_9.anInt7264 = arg0 * 72 + 6;
			@Pc(54) int local54 = this.aClass14_Sub29_9.method5878();
			@Pc(59) int local59 = this.aClass14_Sub29_9.method5878();
			@Pc(62) byte[] local62 = new byte[64];
			this.aClass14_Sub29_9.method5860(local62, 0, 64);
			@Pc(84) Class167_Sub1 local84 = new Class167_Sub1(arg0, arg1, arg2, this.aClass135_9, this.aClass298_3, local54, local62, local59, true);
			this.aClass167_Sub1Array2[arg0] = local84;
			return local84;
		} else {
			return this.aClass167_Sub1Array2[arg0];
		}
	}
}
