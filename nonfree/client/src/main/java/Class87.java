import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class87 {

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "[Lclient!at;")
	private Class20_Sub1[] aClass20_Sub1Array1;

	@OriginalMember(owner = "client!ega", name = "o", descriptor = "Lclient!vj;")
	private Class2_Sub22 aClass2_Sub22_3;

	@OriginalMember(owner = "client!ega", name = "j", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger2;

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "Lclient!fd;")
	private final Class104 aClass104_2;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger1;

	@OriginalMember(owner = "client!ega", name = "k", descriptor = "Lclient!wm;")
	private final Class376 aClass376_2;

	@OriginalMember(owner = "client!ega", name = "l", descriptor = "Lclient!ab;")
	private Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lclient!fd;Lclient!wm;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class87(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class376 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger2 = arg3;
		this.aClass104_2 = arg0;
		this.aBigInteger1 = arg2;
		this.aClass376_2 = arg1;
		if (!this.aClass104_2.method2231()) {
			this.aClass2_Sub2_Sub1_Sub1_1 = this.aClass104_2.method2238(255, true, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IILclient!hca;Lclient!hca;Z)Lclient!at;")
	private Class20_Sub1 method1801(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1, @OriginalArg(3) Class135 arg2) {
		if (this.aClass2_Sub22_3 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || this.aClass20_Sub1Array1.length <= arg0) {
			throw new RuntimeException();
		} else if (this.aClass20_Sub1Array1[arg0] == null) {
			this.aClass2_Sub22_3.anInt10247 = arg0 * 72 + 6;
			@Pc(47) int local47 = this.aClass2_Sub22_3.method8542();
			@Pc(54) int local54 = this.aClass2_Sub22_3.method8542();
			@Pc(57) byte[] local57 = new byte[64];
			this.aClass2_Sub22_3.method8502(local57, 0, 64);
			@Pc(79) Class20_Sub1 local79 = new Class20_Sub1(arg0, arg1, arg2, this.aClass104_2, this.aClass376_2, local47, local57, local54, true);
			this.aClass20_Sub1Array1[arg0] = local79;
			return local79;
		} else {
			return this.aClass20_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)Z")
	public boolean method1803() {
		if (this.aClass2_Sub22_3 != null) {
			return true;
		}
		if (this.aClass2_Sub2_Sub1_Sub1_1 == null) {
			if (this.aClass104_2.method2231()) {
				return false;
			}
			this.aClass2_Sub2_Sub1_Sub1_1 = this.aClass104_2.method2238(255, true, (byte) 0, 255);
		}
		if (this.aClass2_Sub2_Sub1_Sub1_1.aBoolean283) {
			return false;
		}
		@Pc(44) Class2_Sub22 local44 = new Class2_Sub22(this.aClass2_Sub2_Sub1_Sub1_1.method3401());
		local44.anInt10247 = 5;
		@Pc(57) int local57 = local44.method8547();
		local44.anInt10247 += local57 * 72;
		@Pc(74) byte[] local74 = new byte[local44.aByteArray115.length - local44.anInt10247];
		local44.method8502(local74, 0, local74.length);
		@Pc(102) byte[] local102;
		if (this.aBigInteger1 == null || this.aBigInteger2 == null) {
			local102 = local74;
		} else {
			@Pc(92) BigInteger local92 = new BigInteger(local74);
			@Pc(99) BigInteger local99 = local92.modPow(this.aBigInteger1, this.aBigInteger2);
			local102 = local99.toByteArray();
		}
		if (local102.length != 65) {
			throw new RuntimeException();
		}
		@Pc(130) byte[] local130 = Static4.method98(local44.anInt10247 - local74.length - 5, 5, local44.aByteArray115);
		for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
			if (local130[local132] != local102[local132 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass2_Sub22_3 = local44;
		this.aClass20_Sub1Array1 = new Class20_Sub1[local57];
		return true;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(BILclient!hca;Lclient!hca;)Lclient!at;")
	public Class20_Sub1 method1805(@OriginalArg(1) int arg0, @OriginalArg(2) Class135 arg1, @OriginalArg(3) Class135 arg2) {
		return this.method1801(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)V")
	public void method1808() {
		if (this.aClass20_Sub1Array1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.aClass20_Sub1Array1.length; local19++) {
			if (this.aClass20_Sub1Array1[local19] != null) {
				this.aClass20_Sub1Array1[local19].method476();
			}
		}
		for (@Pc(40) int local40 = 0; local40 < this.aClass20_Sub1Array1.length; local40++) {
			if (this.aClass20_Sub1Array1[local40] != null) {
				this.aClass20_Sub1Array1[local40].method469();
			}
		}
	}
}
