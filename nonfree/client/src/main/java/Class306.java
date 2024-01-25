import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ria")
public final class Class306 {

	@OriginalMember(owner = "client!ria", name = "e", descriptor = "[Lclient!mg;")
	private Class222_Sub1[] aClass222_Sub1Array2;

	@OriginalMember(owner = "client!ria", name = "i", descriptor = "Lclient!gga;")
	private Class6_Sub23 aClass6_Sub23_8;

	@OriginalMember(owner = "client!ria", name = "l", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!ria", name = "k", descriptor = "Lclient!eda;")
	private final Class80 aClass80_2;

	@OriginalMember(owner = "client!ria", name = "m", descriptor = "Lclient!du;")
	private final Class73 aClass73_3;

	@OriginalMember(owner = "client!ria", name = "h", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!ria", name = "d", descriptor = "Lclient!rha;")
	private Class6_Sub4_Sub11_Sub2 aClass6_Sub4_Sub11_Sub2_2;

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lclient!du;Lclient!eda;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class306(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger5 = arg3;
		this.aClass80_2 = arg1;
		this.aClass73_3 = arg0;
		this.aBigInteger4 = arg2;
		if (!this.aClass73_3.method1816()) {
			this.aClass6_Sub4_Sub11_Sub2_2 = this.aClass73_3.method1809(true, (byte) 0, 255, 255);
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)V")
	public void method7243() {
		if (this.aClass222_Sub1Array2 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.aClass222_Sub1Array2.length; local17++) {
			if (this.aClass222_Sub1Array2[local17] != null) {
				this.aClass222_Sub1Array2[local17].method5290();
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.aClass222_Sub1Array2.length; local38++) {
			if (this.aClass222_Sub1Array2[local38] != null) {
				this.aClass222_Sub1Array2[local38].method5294();
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)Z")
	public boolean method7244() {
		if (this.aClass6_Sub23_8 != null) {
			return true;
		}
		if (this.aClass6_Sub4_Sub11_Sub2_2 == null) {
			if (this.aClass73_3.method1816()) {
				return false;
			}
			this.aClass6_Sub4_Sub11_Sub2_2 = this.aClass73_3.method1809(true, (byte) 0, 255, 255);
		}
		if (this.aClass6_Sub4_Sub11_Sub2_2.aBoolean588) {
			return false;
		}
		@Pc(44) Class6_Sub23 local44 = new Class6_Sub23(this.aClass6_Sub4_Sub11_Sub2_2.method7235());
		local44.anInt9901 = 5;
		@Pc(51) int local51 = local44.method8374();
		local44.anInt9901 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray101.length - local44.anInt9901];
		local44.method8375(local68.length, local68, 0);
		@Pc(96) byte[] local96;
		if (this.aBigInteger4 == null || this.aBigInteger5 == null) {
			local96 = local68;
		} else {
			@Pc(86) BigInteger local86 = new BigInteger(local68);
			@Pc(93) BigInteger local93 = local86.modPow(this.aBigInteger4, this.aBigInteger5);
			local96 = local93.toByteArray();
		}
		if (local96.length != 65) {
			throw new RuntimeException();
		}
		@Pc(123) byte[] local123 = Static474.method6311(local44.anInt9901 - local68.length - 5, 5, local44.aByteArray101);
		for (@Pc(125) int local125 = 0; local125 < 64; local125++) {
			if (local123[local125] != local96[local125 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass6_Sub23_8 = local44;
		this.aClass222_Sub1Array2 = new Class222_Sub1[local51];
		return true;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!pn;ZILclient!pn;I)Lclient!mg;")
	private Class222_Sub1 method7246(@OriginalArg(0) Class274 arg0, @OriginalArg(3) Class274 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass6_Sub23_8 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || arg2 >= this.aClass222_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass222_Sub1Array2[arg2] == null) {
			this.aClass6_Sub23_8.anInt9901 = arg2 * 72 + 6;
			@Pc(55) int local55 = this.aClass6_Sub23_8.method8369();
			@Pc(60) int local60 = this.aClass6_Sub23_8.method8369();
			@Pc(63) byte[] local63 = new byte[64];
			this.aClass6_Sub23_8.method8375(64, local63, 0);
			@Pc(85) Class222_Sub1 local85 = new Class222_Sub1(arg2, arg0, arg1, this.aClass73_3, this.aClass80_2, local55, local63, local60, true);
			this.aClass222_Sub1Array2[arg2] = local85;
			return local85;
		} else {
			return this.aClass222_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ILclient!pn;Lclient!pn;I)Lclient!mg;")
	public Class222_Sub1 method7247(@OriginalArg(1) Class274 arg0, @OriginalArg(2) Class274 arg1, @OriginalArg(3) int arg2) {
		return this.method7246(arg0, arg1, arg2);
	}
}
