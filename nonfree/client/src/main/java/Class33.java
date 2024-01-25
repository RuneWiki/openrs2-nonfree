import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class33 {

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "[Lclient!eo;")
	private Class102_Sub1[] aClass102_Sub1Array1;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!ika;")
	private Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger1;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!su;")
	private final Class349 aClass349_1;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "Lclient!ig;")
	private final Class176 aClass176_1;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger2;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!jga;")
	private Class3_Sub7_Sub7_Sub1 aClass3_Sub7_Sub7_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!su;Lclient!ig;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class33(@OriginalArg(0) Class349 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger1 = arg2;
		this.aClass349_1 = arg0;
		this.aClass176_1 = arg1;
		this.aBigInteger2 = arg3;
		if (!this.aClass349_1.method7773()) {
			this.aClass3_Sub7_Sub7_Sub1_1 = this.aClass349_1.method7774(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)Z")
	public boolean method1148() {
		if (this.aClass3_Sub2_1 != null) {
			return true;
		}
		if (this.aClass3_Sub7_Sub7_Sub1_1 == null) {
			if (this.aClass349_1.method7773()) {
				return false;
			}
			this.aClass3_Sub7_Sub7_Sub1_1 = this.aClass349_1.method7774(255, 255, true, (byte) 0);
		}
		if (this.aClass3_Sub7_Sub7_Sub1_1.aBoolean537) {
			return false;
		}
		@Pc(49) Class3_Sub2 local49 = new Class3_Sub2(this.aClass3_Sub7_Sub7_Sub1_1.method6874());
		local49.anInt2178 = 5;
		@Pc(56) int local56 = local49.method2048(255);
		local49.anInt2178 += local56 * 72;
		@Pc(79) byte[] local79 = new byte[local49.aByteArray20.length - local49.anInt2178];
		local49.method2064(local79.length, 0, local79);
		@Pc(111) byte[] local111;
		if (this.aBigInteger1 == null || this.aBigInteger2 == null) {
			local111 = local79;
		} else {
			@Pc(101) BigInteger local101 = new BigInteger(local79);
			@Pc(108) BigInteger local108 = local101.modPow(this.aBigInteger1, this.aBigInteger2);
			local111 = local108.toByteArray();
		}
		if (local111.length != 65) {
			throw new RuntimeException();
		}
		@Pc(140) byte[] local140 = Static101.method1985(5, local49.aByteArray20, local49.anInt2178 - local79.length - 5);
		for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
			if (local111[local142 + 1] != local140[local142]) {
				throw new RuntimeException();
			}
		}
		this.aClass3_Sub2_1 = local49;
		this.aClass102_Sub1Array1 = new Class102_Sub1[local56];
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public void method1150() {
		if (this.aClass102_Sub1Array1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aClass102_Sub1Array1.length; local12++) {
			if (this.aClass102_Sub1Array1[local12] != null) {
				this.aClass102_Sub1Array1[local12].method2519();
			}
		}
		for (@Pc(41) int local41 = 0; local41 < this.aClass102_Sub1Array1.length; local41++) {
			if (this.aClass102_Sub1Array1[local41] != null) {
				this.aClass102_Sub1Array1[local41].method2517();
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!jq;Lclient!jq;ZII)Lclient!eo;")
	private Class102_Sub1 method1151(@OriginalArg(0) Class199 arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass3_Sub2_1 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || this.aClass102_Sub1Array1.length <= arg2) {
			throw new RuntimeException();
		} else if (this.aClass102_Sub1Array1[arg2] == null) {
			this.aClass3_Sub2_1.anInt2178 = arg2 * 72 + 6;
			@Pc(53) int local53 = this.aClass3_Sub2_1.method2036();
			@Pc(60) int local60 = this.aClass3_Sub2_1.method2036();
			@Pc(63) byte[] local63 = new byte[64];
			this.aClass3_Sub2_1.method2064(64, 0, local63);
			@Pc(85) Class102_Sub1 local85 = new Class102_Sub1(arg2, arg1, arg0, this.aClass349_1, this.aClass176_1, local53, local63, local60, true);
			this.aClass102_Sub1Array1[arg2] = local85;
			return local85;
		} else {
			return this.aClass102_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!jq;Lclient!jq;II)Lclient!eo;")
	public Class102_Sub1 method1153(@OriginalArg(0) Class199 arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(2) int arg2) {
		return this.method1151(arg1, arg0, arg2);
	}
}
