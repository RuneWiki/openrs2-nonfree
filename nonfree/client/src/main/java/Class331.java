import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class331 {

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "Lclient!ib;")
	private Class5_Sub23 aClass5_Sub23_9;

	@OriginalMember(owner = "client!tea", name = "g", descriptor = "[Lclient!oga;")
	private Class260_Sub1[] aClass260_Sub1Array2;

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "Lclient!wd;")
	private final Class381 aClass381_3;

	@OriginalMember(owner = "client!tea", name = "l", descriptor = "Lclient!cg;")
	private final Class65 aClass65_3;

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger9;

	@OriginalMember(owner = "client!tea", name = "p", descriptor = "Ljava/math/BigInteger;")
	private BigInteger aBigInteger8;

	@OriginalMember(owner = "client!tea", name = "o", descriptor = "Lclient!ih;")
	private Class5_Sub5_Sub7_Sub1 aClass5_Sub5_Sub7_Sub1_2;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!cg;Lclient!wd;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class331(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class381 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass381_3 = arg1;
		this.aClass65_3 = arg0;
		this.aBigInteger9 = arg2;
		this.aBigInteger8 = arg3;
		if (!this.aClass65_3.method1126()) {
			this.aClass5_Sub5_Sub7_Sub1_2 = this.aClass65_3.method1138(true, 255, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZILclient!lp;ILclient!lp;)Lclient!oga;")
	private Class260_Sub1 method8147(@OriginalArg(2) Class223 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class223 arg2) {
		if (this.aClass5_Sub23_9 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || arg1 >= this.aClass260_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass260_Sub1Array2[arg1] == null) {
			this.aClass5_Sub23_9.anInt9869 = arg1 * 72 + 6;
			@Pc(62) int local62 = this.aClass5_Sub23_9.method8527();
			@Pc(67) int local67 = this.aClass5_Sub23_9.method8527();
			@Pc(70) byte[] local70 = new byte[64];
			this.aClass5_Sub23_9.method8487(local70, 64, 0);
			@Pc(92) Class260_Sub1 local92 = new Class260_Sub1(arg1, arg0, arg2, this.aClass65_3, this.aClass381_3, local62, local70, local67, true);
			this.aClass260_Sub1Array2[arg1] = local92;
			return local92;
		} else {
			return this.aClass260_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)Z")
	public boolean method8149() {
		if (this.aClass5_Sub23_9 != null) {
			return true;
		}
		if (this.aClass5_Sub5_Sub7_Sub1_2 == null) {
			if (this.aClass65_3.method1126()) {
				return false;
			}
			this.aClass5_Sub5_Sub7_Sub1_2 = this.aClass65_3.method1138(true, 255, 255, (byte) 0);
		}
		if (this.aClass5_Sub5_Sub7_Sub1_2.aBoolean613) {
			return false;
		}
		@Pc(49) Class5_Sub23 local49 = new Class5_Sub23(this.aClass5_Sub5_Sub7_Sub1_2.method7061());
		local49.anInt9869 = 5;
		@Pc(56) int local56 = local49.method8529();
		local49.anInt9869 += local56 * 72;
		@Pc(73) byte[] local73 = new byte[local49.aByteArray102.length - local49.anInt9869];
		local49.method8487(local73, local73.length, 0);
		@Pc(92) byte[] local92;
		if (this.aBigInteger9 == null || this.aBigInteger8 == null) {
			local92 = local73;
		} else {
			@Pc(99) BigInteger local99 = new BigInteger(local73);
			@Pc(106) BigInteger local106 = local99.modPow(this.aBigInteger9, this.aBigInteger8);
			local92 = local106.toByteArray();
		}
		if (local92.length != 65) {
			throw new RuntimeException();
		}
		@Pc(142) byte[] local142 = Static470.method7564(local49.anInt9869 - local73.length - 5, 5, local49.aByteArray102);
		for (@Pc(144) int local144 = 0; local144 < 64; local144++) {
			if (local142[local144] != local92[local144 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass260_Sub1Array2 = new Class260_Sub1[local56];
		this.aClass5_Sub23_9 = local49;
		return true;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)V")
	public void method8151() {
		if (this.aClass260_Sub1Array2 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aClass260_Sub1Array2.length; local12++) {
			if (this.aClass260_Sub1Array2[local12] != null) {
				this.aClass260_Sub1Array2[local12].method6263();
			}
		}
		if (-58 <= -114) {
			this.aBigInteger8 = null;
		}
		for (@Pc(53) int local53 = 0; local53 < this.aClass260_Sub1Array2.length; local53++) {
			if (this.aClass260_Sub1Array2[local53] != null) {
				this.aClass260_Sub1Array2[local53].method6264();
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!lp;ILclient!lp;I)Lclient!oga;")
	public Class260_Sub1 method8154(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		return this.method8147(arg2, arg1, arg0);
	}
}
