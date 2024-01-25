import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class89 {

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "[Lclient!maa;")
	private Class87_Sub1[] aClass87_Sub1Array2;

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "Lclient!sl;")
	private Class2_Sub17 aClass2_Sub17_2;

	@OriginalMember(owner = "client!eba", name = "k", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "Lclient!sw;")
	private final Class322 aClass322_1;

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger2;

	@OriginalMember(owner = "client!eba", name = "j", descriptor = "Lclient!fi;")
	private final Class116 aClass116_1;

	@OriginalMember(owner = "client!eba", name = "l", descriptor = "Lclient!ue;")
	private Class2_Sub7_Sub9_Sub2 aClass2_Sub7_Sub9_Sub2_1;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!sw;Lclient!fi;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class89(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger3 = arg3;
		this.aClass322_1 = arg0;
		this.aBigInteger2 = arg2;
		this.aClass116_1 = arg1;
		if (!this.aClass322_1.method7429()) {
			this.aClass2_Sub7_Sub9_Sub2_1 = this.aClass322_1.method7428(255, true, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
	public void method2194() {
		if (this.aClass87_Sub1Array2 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.aClass87_Sub1Array2.length; local15++) {
			if (this.aClass87_Sub1Array2[local15] != null) {
				this.aClass87_Sub1Array2[local15].method5177();
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.aClass87_Sub1Array2.length; local38++) {
			if (this.aClass87_Sub1Array2[local38] != null) {
				this.aClass87_Sub1Array2[local38].method5176();
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!uj;BLclient!uj;I)Lclient!maa;")
	public Class87_Sub1 method2196(@OriginalArg(0) Class349 arg0, @OriginalArg(2) Class349 arg1, @OriginalArg(3) int arg2) {
		return this.method2197(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!uj;IZLclient!uj;I)Lclient!maa;")
	private Class87_Sub1 method2197(@OriginalArg(0) Class349 arg0, @OriginalArg(3) Class349 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass2_Sub17_2 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || arg2 >= this.aClass87_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass87_Sub1Array2[arg2] == null) {
			this.aClass2_Sub17_2.anInt3378 = arg2 * 72 + 6;
			@Pc(48) int local48 = this.aClass2_Sub17_2.method2881();
			@Pc(53) int local53 = this.aClass2_Sub17_2.method2881();
			@Pc(56) byte[] local56 = new byte[64];
			this.aClass2_Sub17_2.method2832(local56, 64, 0);
			@Pc(83) Class87_Sub1 local83 = new Class87_Sub1(arg2, arg1, arg0, this.aClass322_1, this.aClass116_1, local48, local56, local53, true);
			this.aClass87_Sub1Array2[arg2] = local83;
			return local83;
		} else {
			return this.aClass87_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)Z")
	public boolean method2198() {
		if (this.aClass2_Sub17_2 != null) {
			return true;
		}
		if (this.aClass2_Sub7_Sub9_Sub2_1 == null) {
			if (this.aClass322_1.method7429()) {
				return false;
			}
			this.aClass2_Sub7_Sub9_Sub2_1 = this.aClass322_1.method7428(255, true, 255, (byte) 0);
		}
		if (this.aClass2_Sub7_Sub9_Sub2_1.aBoolean672) {
			return false;
		}
		@Pc(44) Class2_Sub17 local44 = new Class2_Sub17(this.aClass2_Sub7_Sub9_Sub2_1.method7965());
		local44.anInt3378 = 5;
		@Pc(51) int local51 = local44.method2859();
		local44.anInt3378 += local51 * 72;
		@Pc(71) byte[] local71 = new byte[local44.aByteArray26.length - local44.anInt3378];
		local44.method2832(local71, local71.length, 0);
		@Pc(99) byte[] local99;
		if (this.aBigInteger2 == null || this.aBigInteger3 == null) {
			local99 = local71;
		} else {
			@Pc(89) BigInteger local89 = new BigInteger(local71);
			@Pc(96) BigInteger local96 = local89.modPow(this.aBigInteger2, this.aBigInteger3);
			local99 = local96.toByteArray();
		}
		if (local99.length != 65) {
			throw new RuntimeException();
		}
		@Pc(125) byte[] local125 = Static595.method8390(local44.anInt3378 - local71.length - 5, 5, local44.aByteArray26);
		for (@Pc(127) int local127 = 0; local127 < 64; local127++) {
			if (local99[local127 + 1] != local125[local127]) {
				throw new RuntimeException();
			}
		}
		this.aClass87_Sub1Array2 = new Class87_Sub1[local51];
		this.aClass2_Sub17_2 = local44;
		return true;
	}
}
