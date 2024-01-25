import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class3_Sub7_Sub6 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "[Lclient!gf;")
	public Class110[] aClass110Array1;

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
	private final int anInt2821;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7_Sub6(@OriginalArg(0) int arg0) {
		this.anInt2821 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)Z")
	public boolean method2516(@OriginalArg(1) int arg0) {
		return this.aClass110Array1[arg0].aBoolean268;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)Z")
	public boolean method2517(@OriginalArg(0) int arg0) {
		return this.aClass110Array1[arg0].aBoolean266;
	}

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(II)Z")
	public boolean method2519(@OriginalArg(0) int arg0) {
		return this.aClass110Array1[arg0].aBoolean267;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Z")
	public boolean method2521() {
		if (this.aClass110Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray8 == null) {
			@Pc(15) Class322 local15 = Static203.aClass322_96;
			synchronized (Static203.aClass322_96) {
				if (!Static203.aClass322_96.method6830(this.anInt2821)) {
					return false;
				}
				local35 = Static203.aClass322_96.method6800(this.anInt2821);
				this.aByteArrayArray8 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray8[local42] = Static203.aClass322_96.method6802(this.anInt2821, local35[local42]);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray8.length; local71++) {
			@Pc(78) byte[] local78 = this.aByteArrayArray8[local71];
			@Pc(83) Class3_Sub11 local83 = new Class3_Sub11(local78);
			local83.anInt6128 = 1;
			local42 = local83.method5198();
			@Pc(92) Class322 local92 = Static140.aClass322_56;
			synchronized (Static140.aClass322_56) {
				local69 &= Static140.aClass322_56.method6797(local42);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(125) Class112 local125 = new Class112();
		@Pc(127) Class322 local127 = Static203.aClass322_96;
		synchronized (Static203.aClass322_96) {
			@Pc(137) int local137 = Static203.aClass322_96.method6831(this.anInt2821);
			this.aClass110Array1 = new Class110[local137];
			local35 = Static203.aClass322_96.method6800(this.anInt2821);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(162) byte[] local162 = this.aByteArrayArray8[local42];
			@Pc(167) Class3_Sub11 local167 = new Class3_Sub11(local162);
			local167.anInt6128 = 1;
			@Pc(174) int local174 = local167.method5198();
			@Pc(176) Class3_Sub23 local176 = null;
			for (@Pc(181) Class3_Sub23 local181 = (Class3_Sub23) local125.method3088(); local181 != null; local181 = (Class3_Sub23) local125.method3084()) {
				if (local174 == local181.anInt3478) {
					local176 = local181;
					break;
				}
			}
			if (local176 == null) {
				@Pc(201) Class322 local201 = Static140.aClass322_56;
				synchronized (Static140.aClass322_56) {
					local176 = new Class3_Sub23(local174, Static140.aClass322_56.method6807(local174));
				}
				local125.method3079(local176);
			}
			this.aClass110Array1[local35[local42]] = new Class110(local162, local176);
		}
		this.aByteArrayArray8 = null;
		return true;
	}
}
