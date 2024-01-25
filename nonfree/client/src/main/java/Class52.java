import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class52 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Lclient!jc;")
	private Class14_Sub21 aClass14_Sub21_3;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "[Lclient!qb;")
	private Class293_Sub1[] aClass293_Sub1Array1;

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "Lclient!as;")
	private final Class24 aClass24_1;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!uga;")
	private final Class364 aClass364_1;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger2;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!rr;")
	private Class14_Sub2_Sub7_Sub2 aClass14_Sub2_Sub7_Sub2_2;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!as;Lclient!uga;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class52(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class364 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass24_1 = arg0;
		this.aBigInteger3 = arg2;
		this.aClass364_1 = arg1;
		this.aBigInteger2 = arg3;
		if (!this.aClass24_1.method369()) {
			this.aClass14_Sub2_Sub7_Sub2_2 = this.aClass24_1.method373(true, 255, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)Z")
	public boolean method1025() {
		if (this.aClass14_Sub21_3 != null) {
			return true;
		}
		if (this.aClass14_Sub2_Sub7_Sub2_2 == null) {
			if (this.aClass24_1.method369()) {
				return false;
			}
			this.aClass14_Sub2_Sub7_Sub2_2 = this.aClass24_1.method373(true, 255, 255, (byte) 0);
		}
		if (this.aClass14_Sub2_Sub7_Sub2_2.aBoolean637) {
			return false;
		}
		@Pc(49) Class14_Sub21 local49 = new Class14_Sub21(this.aClass14_Sub2_Sub7_Sub2_2.method7931());
		local49.anInt8936 = 5;
		@Pc(56) int local56 = local49.method7695(120);
		local49.anInt8936 += local56 * 72;
		@Pc(72) byte[] local72 = new byte[local49.aByteArray99.length - local49.anInt8936];
		local49.method7750(local72.length, 0, local72);
		@Pc(89) byte[] local89;
		if (this.aBigInteger3 == null || this.aBigInteger2 == null) {
			local89 = local72;
		} else {
			@Pc(96) BigInteger local96 = new BigInteger(local72);
			@Pc(103) BigInteger local103 = local96.modPow(this.aBigInteger3, this.aBigInteger2);
			local89 = local103.toByteArray();
		}
		if (local89.length != 65) {
			throw new RuntimeException();
		}
		@Pc(129) byte[] local129 = Static197.method2948(local49.anInt8936 - local72.length - 5, local49.aByteArray99, 5);
		for (@Pc(139) int local139 = 0; local139 < 64; local139++) {
			if (local129[local139] != local89[local139 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass293_Sub1Array1 = new Class293_Sub1[local56];
		this.aClass14_Sub21_3 = local49;
		return true;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!vw;BILclient!vw;)Lclient!qb;")
	public Class293_Sub1 method1027(@OriginalArg(0) Class384 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class384 arg2) {
		return this.method1030(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	public void method1028() {
		if (this.aClass293_Sub1Array1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aClass293_Sub1Array1.length; local12++) {
			if (this.aClass293_Sub1Array1[local12] != null) {
				this.aClass293_Sub1Array1[local12].method7315();
			}
		}
		if (-60 <= -104) {
			this.method1025();
		}
		for (@Pc(50) int local50 = 0; local50 < this.aClass293_Sub1Array1.length; local50++) {
			if (this.aClass293_Sub1Array1[local50] != null) {
				this.aClass293_Sub1Array1[local50].method7321();
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!vw;IIZLclient!vw;)Lclient!qb;")
	private Class293_Sub1 method1030(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class384 arg2) {
		if (this.aClass14_Sub21_3 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || this.aClass293_Sub1Array1.length <= arg1) {
			throw new RuntimeException();
		} else if (this.aClass293_Sub1Array1[arg1] == null) {
			this.aClass14_Sub21_3.anInt8936 = arg1 * 72 + 6;
			@Pc(62) int local62 = this.aClass14_Sub21_3.method7748();
			@Pc(67) int local67 = this.aClass14_Sub21_3.method7748();
			@Pc(70) byte[] local70 = new byte[64];
			this.aClass14_Sub21_3.method7750(64, 0, local70);
			@Pc(92) Class293_Sub1 local92 = new Class293_Sub1(arg1, arg2, arg0, this.aClass24_1, this.aClass364_1, local62, local70, local67, true);
			this.aClass293_Sub1Array1[arg1] = local92;
			return local92;
		} else {
			return this.aClass293_Sub1Array1[arg1];
		}
	}
}
