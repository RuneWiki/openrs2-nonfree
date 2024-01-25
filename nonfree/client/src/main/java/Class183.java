import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class183 {

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "Lclient!dc;")
	private Class3_Sub9 aClass3_Sub9_4;

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "[Lclient!rt;")
	private Class40_Sub1[] aClass40_Sub1Array1;

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "Lclient!qw;")
	private final Class286 aClass286_2;

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "Lclient!th;")
	private final Class323 aClass323_2;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "Lclient!ch;")
	private Class3_Sub7_Sub4_Sub1 aClass3_Sub7_Sub4_Sub1_1;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!th;Lclient!qw;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class183(@OriginalArg(0) Class323 arg0, @OriginalArg(1) Class286 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass286_2 = arg1;
		this.aClass323_2 = arg0;
		this.aBigInteger4 = arg2;
		this.aBigInteger3 = arg3;
		if (!this.aClass323_2.method7839()) {
			this.aClass3_Sub7_Sub4_Sub1_1 = this.aClass323_2.method7834(255, true, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZILclient!kv;Lclient!kv;)Lclient!rt;")
	private Class40_Sub1 method4574(@OriginalArg(0) int arg0, @OriginalArg(3) Class196 arg1, @OriginalArg(4) Class196 arg2) {
		if (this.aClass3_Sub9_4 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || this.aClass40_Sub1Array1.length <= arg0) {
			throw new RuntimeException();
		} else if (this.aClass40_Sub1Array1[arg0] == null) {
			this.aClass3_Sub9_4.anInt6453 = arg0 * 72 + 6;
			@Pc(52) int local52 = this.aClass3_Sub9_4.method5585();
			@Pc(57) int local57 = this.aClass3_Sub9_4.method5585();
			@Pc(60) byte[] local60 = new byte[64];
			this.aClass3_Sub9_4.method5577(0, 64, local60);
			@Pc(82) Class40_Sub1 local82 = new Class40_Sub1(arg0, arg2, arg1, this.aClass323_2, this.aClass286_2, local52, local60, local57, true);
			this.aClass40_Sub1Array1[arg0] = local82;
			return local82;
		} else {
			return this.aClass40_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!kv;ILclient!kv;)Lclient!rt;")
	public Class40_Sub1 method4575(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(3) Class196 arg2) {
		return this.method4574(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)Z")
	public boolean method4579() {
		if (this.aClass3_Sub9_4 != null) {
			return true;
		}
		if (this.aClass3_Sub7_Sub4_Sub1_1 == null) {
			if (this.aClass323_2.method7839()) {
				return false;
			}
			this.aClass3_Sub7_Sub4_Sub1_1 = this.aClass323_2.method7834(255, true, 255, (byte) 0);
		}
		if (this.aClass3_Sub7_Sub4_Sub1_1.aBoolean126) {
			return false;
		}
		@Pc(44) Class3_Sub9 local44 = new Class3_Sub9(this.aClass3_Sub7_Sub4_Sub1_1.method1504());
		local44.anInt6453 = 5;
		@Pc(56) int local56 = local44.method5633();
		local44.anInt6453 += local56 * 72;
		@Pc(73) byte[] local73 = new byte[local44.aByteArray51.length - local44.anInt6453];
		local44.method5577(0, local73.length, local73);
		@Pc(88) byte[] local88;
		if (this.aBigInteger4 == null || this.aBigInteger3 == null) {
			local88 = local73;
		} else {
			@Pc(95) BigInteger local95 = new BigInteger(local73);
			@Pc(102) BigInteger local102 = local95.modPow(this.aBigInteger4, this.aBigInteger3);
			local88 = local102.toByteArray();
		}
		if (local88.length != 65) {
			throw new RuntimeException();
		}
		@Pc(128) byte[] local128 = Static152.method2720(5, local44.aByteArray51, local44.anInt6453 - local73.length - 5);
		for (@Pc(130) int local130 = 0; local130 < 64; local130++) {
			if (local88[local130 + 1] != local128[local130]) {
				throw new RuntimeException();
			}
		}
		this.aClass40_Sub1Array1 = new Class40_Sub1[local56];
		this.aClass3_Sub9_4 = local44;
		return true;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V")
	public void method4580() {
		if (this.aClass40_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass40_Sub1Array1.length; local11++) {
			if (this.aClass40_Sub1Array1[local11] != null) {
				this.aClass40_Sub1Array1[local11].method7346();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass40_Sub1Array1.length; local36++) {
			if (this.aClass40_Sub1Array1[local36] != null) {
				this.aClass40_Sub1Array1[local36].method7345();
			}
		}
	}
}
