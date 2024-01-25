import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class2_Sub5_Sub5 extends Class2_Sub5 {

	@OriginalMember(owner = "client!eca", name = "C", descriptor = "[Lclient!nf;")
	public Class231[] aClass231Array1;

	@OriginalMember(owner = "client!eca", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!eca", name = "B", descriptor = "I")
	private final int anInt2169;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(I)V")
	public Class2_Sub5_Sub5(@OriginalArg(0) int arg0) {
		this.anInt2169 = arg0;
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)Z")
	public boolean method1833() {
		if (this.aClass231Array1 != null) {
			return true;
		}
		@Pc(33) int[] local33;
		@Pc(40) int local40;
		if (this.aByteArrayArray5 == null) {
			@Pc(13) Class97 local13 = Static493.aClass97_124;
			synchronized (Static493.aClass97_124) {
				if (!Static493.aClass97_124.method2550(this.anInt2169)) {
					return false;
				}
				local33 = Static493.aClass97_124.method2571(this.anInt2169);
				this.aByteArrayArray5 = new byte[local33.length][];
				for (local40 = 0; local40 < local33.length; local40++) {
					this.aByteArrayArray5[local40] = Static493.aClass97_124.method2545(local33[local40], this.anInt2169);
				}
			}
		}
		@Pc(66) boolean local66 = true;
		for (@Pc(68) int local68 = 0; local68 < this.aByteArrayArray5.length; local68++) {
			@Pc(74) byte[] local74 = this.aByteArrayArray5[local68];
			@Pc(79) Class2_Sub34 local79 = new Class2_Sub34(local74);
			local79.anInt8188 = 1;
			local40 = local79.method6884();
			@Pc(88) Class97 local88 = Static498.aClass97_125;
			synchronized (Static498.aClass97_125) {
				local66 &= Static498.aClass97_125.method2564(local40);
			}
		}
		if (!local66) {
			return false;
		}
		@Pc(117) Class238 local117 = new Class238();
		@Pc(119) Class97 local119 = Static493.aClass97_124;
		synchronized (Static493.aClass97_124) {
			@Pc(127) int local127 = Static493.aClass97_124.method2569(this.anInt2169);
			this.aClass231Array1 = new Class231[local127];
			local33 = Static493.aClass97_124.method2571(this.anInt2169);
		}
		for (local40 = 0; local40 < local33.length; local40++) {
			@Pc(159) byte[] local159 = this.aByteArrayArray5[local40];
			@Pc(164) Class2_Sub34 local164 = new Class2_Sub34(local159);
			local164.anInt8188 = 1;
			@Pc(171) int local171 = local164.method6884();
			@Pc(173) Class2_Sub45 local173 = null;
			for (@Pc(178) Class2_Sub45 local178 = (Class2_Sub45) local117.method5833(); local178 != null; local178 = (Class2_Sub45) local117.method5838()) {
				if (local171 == local178.anInt8599) {
					local173 = local178;
					break;
				}
			}
			if (local173 == null) {
				@Pc(201) Class97 local201 = Static498.aClass97_125;
				synchronized (Static498.aClass97_125) {
					local173 = new Class2_Sub45(local171, Static498.aClass97_125.method2570(local171));
				}
				local117.method5837(local173);
			}
			this.aClass231Array1[local33[local40]] = new Class231(local159, local173);
		}
		this.aByteArrayArray5 = null;
		return true;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)Z")
	public boolean method1835(@OriginalArg(1) int arg0) {
		return this.aClass231Array1[arg0].aBoolean493;
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)Z")
	public boolean method1837(@OriginalArg(1) int arg0) {
		return this.aClass231Array1[arg0].aBoolean491;
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(II)Z")
	public boolean method1838(@OriginalArg(1) int arg0) {
		return this.aClass231Array1[arg0].aBoolean492;
	}
}
