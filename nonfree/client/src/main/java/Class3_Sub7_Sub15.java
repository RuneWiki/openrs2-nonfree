import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public final class Class3_Sub7_Sub15 extends Class3_Sub7 {

	@OriginalMember(owner = "client!pea", name = "E", descriptor = "[Lclient!sda;")
	public Class299[] aClass299Array1;

	@OriginalMember(owner = "client!pea", name = "G", descriptor = "[[B")
	private byte[][] aByteArrayArray37;

	@OriginalMember(owner = "client!pea", name = "H", descriptor = "I")
	private final int anInt7339;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7_Sub15(@OriginalArg(0) int arg0) {
		this.anInt7339 = arg0;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(II)Z")
	public boolean method5741(@OriginalArg(1) int arg0) {
		return this.aClass299Array1[arg0].aBoolean573;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IB)Z")
	public boolean method5743(@OriginalArg(0) int arg0) {
		return this.aClass299Array1[arg0].aBoolean572;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)Z")
	public boolean method5744() {
		if (this.aClass299Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray37 == null) {
			@Pc(15) Class284 local15 = Static573.aClass284_165;
			synchronized (Static573.aClass284_165) {
				if (!Static573.aClass284_165.method6349(this.anInt7339)) {
					return false;
				}
				local35 = Static573.aClass284_165.method6324(this.anInt7339);
				this.aByteArrayArray37 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray37[local42] = Static573.aClass284_165.method6331(this.anInt7339, local35[local42]);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray37.length; local71++) {
			@Pc(78) byte[] local78 = this.aByteArrayArray37[local71];
			@Pc(83) Class3_Sub26 local83 = new Class3_Sub26(local78);
			local83.anInt8703 = 1;
			local42 = local83.method6811();
			@Pc(92) Class284 local92 = Static34.aClass284_46;
			synchronized (Static34.aClass284_46) {
				local69 &= Static34.aClass284_46.method6347(local42);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(130) Class244 local130 = new Class244();
		@Pc(132) Class284 local132 = Static573.aClass284_165;
		synchronized (Static573.aClass284_165) {
			@Pc(140) int local140 = Static573.aClass284_165.method6354(this.anInt7339);
			this.aClass299Array1 = new Class299[local140];
			local35 = Static573.aClass284_165.method6324(this.anInt7339);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(165) byte[] local165 = this.aByteArrayArray37[local42];
			@Pc(170) Class3_Sub26 local170 = new Class3_Sub26(local165);
			local170.anInt8703 = 1;
			@Pc(179) int local179 = local170.method6811();
			@Pc(181) Class3_Sub37 local181 = null;
			for (@Pc(186) Class3_Sub37 local186 = (Class3_Sub37) local130.method5572(); local186 != null; local186 = (Class3_Sub37) local130.method5576()) {
				if (local179 == local186.anInt6465) {
					local181 = local186;
					break;
				}
			}
			if (local181 == null) {
				@Pc(206) Class284 local206 = Static34.aClass284_46;
				synchronized (Static34.aClass284_46) {
					local181 = new Class3_Sub37(local179, Static34.aClass284_46.method6357(local179));
				}
				local130.method5570(local181);
			}
			this.aClass299Array1[local35[local42]] = new Class299(local165, local181);
		}
		this.aByteArrayArray37 = null;
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BI)Z")
	public boolean method5745(@OriginalArg(1) int arg0) {
		return this.aClass299Array1[arg0].aBoolean571;
	}
}
