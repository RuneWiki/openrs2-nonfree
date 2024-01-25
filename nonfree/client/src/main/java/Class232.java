import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class232 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "Lclient!ho;")
	public Class3_Sub19 aClass3_Sub19_1 = null;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "Z")
	public boolean aBoolean453 = false;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
	public int anInt5920 = 0;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Z")
	public boolean aBoolean452 = false;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "[S")
	public short[] aShortArray91;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "[S")
	public short[] aShortArray83;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "[B")
	public byte[] aByteArray84;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "([BLclient!ho;)V")
	public Class232(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub19 arg1) {
		this.aClass3_Sub19_1 = arg1;
		try {
			@Pc(21) Class3_Sub5 local21 = new Class3_Sub5(arg0);
			@Pc(26) Class3_Sub5 local26 = new Class3_Sub5(arg0);
			local21.anInt3121 = 2;
			@Pc(33) int local33 = local21.method2739();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt3121 = local21.anInt3121 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass3_Sub19_1.anIntArray280[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method2739();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static353.aShortArray92[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static353.aShortArray90[local35] = local75;
					} else {
						Static353.aShortArray90[local35] = (short) local26.method2764();
					}
					if ((local62 & 0x2) == 0) {
						Static353.aShortArray85[local35] = local75;
					} else {
						Static353.aShortArray85[local35] = (short) local26.method2764();
					}
					if ((local62 & 0x4) == 0) {
						Static353.aShortArray84[local35] = local75;
					} else {
						Static353.aShortArray84[local35] = (short) local26.method2764();
					}
					Static353.aByteArray85[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static353.aShortArray90[local35] = (short) (((Static353.aShortArray90[local35] & 0xFF) << 3) + (Static353.aShortArray90[local35] >> 8 & 0x7));
						Static353.aShortArray85[local35] = (short) (((Static353.aShortArray85[local35] & 0xFF) << 3) + (Static353.aShortArray85[local35] >> 8 & 0x7));
						Static353.aShortArray84[local35] = (short) (((Static353.aShortArray84[local35] & 0xFF) << 3) + (Static353.aShortArray84[local35] >> 8 & 0x7));
						Static353.aShortArray90[local35] = (short) (Static353.aShortArray90[local35] << 3);
						Static353.aShortArray85[local35] = (short) (Static353.aShortArray85[local35] << 3);
						Static353.aShortArray84[local35] = (short) (Static353.aShortArray84[local35] << 3);
					}
					Static353.aShortArray86[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static353.aShortArray86[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean452 = true;
					} else if (local54 == 7) {
						this.aBoolean453 = true;
					}
					local35++;
				}
			}
			if (local26.anInt3121 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt5920 = local35;
			this.aShortArray87 = new short[local35];
			this.aShortArray91 = new short[local35];
			this.aShortArray89 = new short[local35];
			this.aShortArray83 = new short[local35];
			this.aShortArray88 = new short[local35];
			this.aByteArray84 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray87[local54] = Static353.aShortArray92[local54];
				this.aShortArray91[local54] = Static353.aShortArray90[local54];
				this.aShortArray89[local54] = Static353.aShortArray85[local54];
				this.aShortArray83[local54] = Static353.aShortArray84[local54];
				this.aShortArray88[local54] = Static353.aShortArray86[local54];
				this.aByteArray84[local54] = Static353.aByteArray85[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt5920 = 0;
			this.aBoolean452 = false;
			this.aBoolean453 = false;
		}
	}
}
