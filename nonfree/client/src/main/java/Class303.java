import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class303 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "[Lclient!pv;")
	private Class277_Sub1[] aClass277_Sub1Array2;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Lclient!ee;")
	private Class5_Sub12 aClass5_Sub12_7;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!tk;")
	private final Class331 aClass331_3;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!eia;")
	private final Class94 aClass94_3;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "Lclient!ic;")
	private Class5_Sub4_Sub12_Sub1 aClass5_Sub4_Sub12_Sub1_1;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!tk;Lclient!eia;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class303(@OriginalArg(0) Class331 arg0, @OriginalArg(1) Class94 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger5 = arg2;
		this.aBigInteger6 = arg3;
		this.aClass331_3 = arg0;
		this.aClass94_3 = arg1;
		if (!this.aClass331_3.method7804()) {
			this.aClass5_Sub4_Sub12_Sub1_1 = this.aClass331_3.method7803(true, (byte) 0, 255, 255);
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Z")
	public boolean method7157() {
		if (this.aClass5_Sub12_7 != null) {
			return true;
		}
		if (this.aClass5_Sub4_Sub12_Sub1_1 == null) {
			if (this.aClass331_3.method7804()) {
				return false;
			}
			this.aClass5_Sub4_Sub12_Sub1_1 = this.aClass331_3.method7803(true, (byte) 0, 255, 255);
		}
		if (this.aClass5_Sub4_Sub12_Sub1_1.aBoolean358) {
			return false;
		}
		@Pc(44) Class5_Sub12 local44 = new Class5_Sub12(this.aClass5_Sub4_Sub12_Sub1_1.method4030());
		local44.anInt10154 = 5;
		@Pc(51) int local51 = local44.method8645();
		local44.anInt10154 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray104.length - local44.anInt10154];
		local44.method8625(local68, 0, local68.length);
		@Pc(91) byte[] local91;
		if (this.aBigInteger5 == null || this.aBigInteger6 == null) {
			local91 = local68;
		} else {
			@Pc(98) BigInteger local98 = new BigInteger(local68);
			@Pc(105) BigInteger local105 = local98.modPow(this.aBigInteger5, this.aBigInteger6);
			local91 = local105.toByteArray();
		}
		if (local91.length != 65) {
			throw new RuntimeException();
		}
		@Pc(130) byte[] local130 = Static39.method715(local44.aByteArray104, local44.anInt10154 - local68.length - 5, 5);
		for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
			if (local130[local132] != local91[local132 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass277_Sub1Array2 = new Class277_Sub1[local51];
		this.aClass5_Sub12_7 = local44;
		return true;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZILclient!mi;BLclient!mi;)Lclient!pv;")
	private Class277_Sub1 method7160(@OriginalArg(1) int arg0, @OriginalArg(2) Class229 arg1, @OriginalArg(4) Class229 arg2) {
		if (this.aClass5_Sub12_7 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || this.aClass277_Sub1Array2.length <= arg0) {
			throw new RuntimeException();
		} else if (this.aClass277_Sub1Array2[arg0] == null) {
			this.aClass5_Sub12_7.anInt10154 = arg0 * 72 + 6;
			@Pc(44) int local44 = this.aClass5_Sub12_7.method8623();
			@Pc(57) int local57 = this.aClass5_Sub12_7.method8623();
			@Pc(60) byte[] local60 = new byte[64];
			this.aClass5_Sub12_7.method8625(local60, 0, 64);
			@Pc(82) Class277_Sub1 local82 = new Class277_Sub1(arg0, arg1, arg2, this.aClass331_3, this.aClass94_3, local44, local60, local57, true);
			this.aClass277_Sub1Array2[arg0] = local82;
			return local82;
		} else {
			return this.aClass277_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!mi;ILclient!mi;Z)Lclient!pv;")
	public Class277_Sub1 method7161(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		return this.method7160(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public void method7162() {
		if (this.aClass277_Sub1Array2 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.aClass277_Sub1Array2.length; local16++) {
			if (this.aClass277_Sub1Array2[local16] != null) {
				this.aClass277_Sub1Array2[local16].method6647();
			}
		}
		for (@Pc(43) int local43 = 0; local43 < this.aClass277_Sub1Array2.length; local43++) {
			if (this.aClass277_Sub1Array2[local43] != null) {
				this.aClass277_Sub1Array2[local43].method6644();
			}
		}
	}
}
