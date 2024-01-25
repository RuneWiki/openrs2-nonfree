import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class4_Sub6_Sub8 extends Class4_Sub6 {

	@OriginalMember(owner = "client!hea", name = "G", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!hea", name = "K", descriptor = "[Lclient!ge;")
	public Class122[] aClass122Array1;

	@OriginalMember(owner = "client!hea", name = "A", descriptor = "I")
	private final int anInt3882;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(I)V")
	public Class4_Sub6_Sub8(@OriginalArg(0) int arg0) {
		this.anInt3882 = arg0;
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(IB)Z")
	public boolean method3076(@OriginalArg(0) int arg0) {
		return this.aClass122Array1[arg0].aBoolean242;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)Z")
	public boolean method3077(@OriginalArg(1) int arg0) {
		return this.aClass122Array1[arg0].aBoolean243;
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(II)Z")
	public boolean method3080(@OriginalArg(1) int arg0) {
		return this.aClass122Array1[arg0].aBoolean241;
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)Z")
	public boolean method3081() {
		if (this.aClass122Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray17 == null) {
			@Pc(15) Class348 local15 = Static426.aClass348_100;
			synchronized (Static426.aClass348_100) {
				if (!Static426.aClass348_100.method7984(this.anInt3882)) {
					return false;
				}
				local35 = Static426.aClass348_100.method7976(this.anInt3882);
				this.aByteArrayArray17 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray17[local42] = Static426.aClass348_100.method7964(local35[local42], this.anInt3882);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray17.length; local71++) {
			@Pc(78) byte[] local78 = this.aByteArrayArray17[local71];
			@Pc(83) Class4_Sub13 local83 = new Class4_Sub13(local78);
			local83.anInt9170 = 1;
			local42 = local83.method7054();
			@Pc(92) Class348 local92 = Static424.aClass348_99;
			synchronized (Static424.aClass348_99) {
				local69 &= Static424.aClass348_99.method7960(local42);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(127) Class22 local127 = new Class22();
		@Pc(134) Class348 local134 = Static426.aClass348_100;
		synchronized (Static426.aClass348_100) {
			@Pc(142) int local142 = Static426.aClass348_100.method7981(this.anInt3882);
			this.aClass122Array1 = new Class122[local142];
			local35 = Static426.aClass348_100.method7976(this.anInt3882);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(167) byte[] local167 = this.aByteArrayArray17[local42];
			@Pc(172) Class4_Sub13 local172 = new Class4_Sub13(local167);
			local172.anInt9170 = 1;
			@Pc(179) int local179 = local172.method7054();
			@Pc(181) Class4_Sub50 local181 = null;
			for (@Pc(188) Class4_Sub50 local188 = (Class4_Sub50) local127.method895(); local188 != null; local188 = (Class4_Sub50) local127.method889()) {
				if (local179 == local188.anInt9986) {
					local181 = local188;
					break;
				}
			}
			if (local181 == null) {
				@Pc(212) Class348 local212 = Static424.aClass348_99;
				synchronized (Static424.aClass348_99) {
					local181 = new Class4_Sub50(local179, Static424.aClass348_99.method7969(local179));
				}
				local127.method894(local181);
			}
			this.aClass122Array1[local35[local42]] = new Class122(local167, local181);
		}
		this.aByteArrayArray17 = null;
		return true;
	}
}
