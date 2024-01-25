import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class176 {

	@OriginalMember(owner = "client!os", name = "n", descriptor = "I")
	public int anInt4868 = 0;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "Lclient!wm;")
	public Class2_Sub42 aClass2_Sub42_1 = null;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "Z")
	public boolean aBoolean357 = false;

	@OriginalMember(owner = "client!os", name = "k", descriptor = "Z")
	public boolean aBoolean358 = false;

	@OriginalMember(owner = "client!os", name = "j", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!os", name = "b", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!os", name = "i", descriptor = "[S")
	public short[] aShortArray86;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!os", name = "l", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!os", name = "h", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "([BLclient!wm;)V")
	public Class176(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub42 arg1) {
		this.aClass2_Sub42_1 = arg1;
		try {
			@Pc(21) Class2_Sub24 local21 = new Class2_Sub24(arg0);
			@Pc(26) Class2_Sub24 local26 = new Class2_Sub24(arg0);
			local21.anInt6669 = 2;
			@Pc(33) int local33 = local21.method5732();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt6669 = local21.anInt6669 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass2_Sub42_1.anIntArray587[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method5732();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static254.aShortArray83[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static254.aShortArray84[local35] = local75;
					} else {
						Static254.aShortArray84[local35] = (short) local26.method5768();
					}
					if ((local62 & 0x2) == 0) {
						Static254.aShortArray85[local35] = local75;
					} else {
						Static254.aShortArray85[local35] = (short) local26.method5768();
					}
					if ((local62 & 0x4) == 0) {
						Static254.aShortArray89[local35] = local75;
					} else {
						Static254.aShortArray89[local35] = (short) local26.method5768();
					}
					Static254.aByteArray73[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static254.aShortArray84[local35] = (short) (((Static254.aShortArray84[local35] & 0xFF) << 3) + (Static254.aShortArray84[local35] >> 8 & 0x7));
						Static254.aShortArray85[local35] = (short) (((Static254.aShortArray85[local35] & 0xFF) << 3) + (Static254.aShortArray85[local35] >> 8 & 0x7));
						Static254.aShortArray89[local35] = (short) (((Static254.aShortArray89[local35] & 0xFF) << 3) + (Static254.aShortArray89[local35] >> 8 & 0x7));
						Static254.aShortArray84[local35] = (short) (Static254.aShortArray84[local35] << 3);
						Static254.aShortArray85[local35] = (short) (Static254.aShortArray85[local35] << 3);
						Static254.aShortArray89[local35] = (short) (Static254.aShortArray89[local35] << 3);
					}
					Static254.aShortArray80[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static254.aShortArray80[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean357 = true;
					} else if (local54 == 7) {
						this.aBoolean358 = true;
					}
					local35++;
				}
			}
			if (local26.anInt6669 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt4868 = local35;
			this.aShortArray87 = new short[local35];
			this.aShortArray81 = new short[local35];
			this.aShortArray86 = new short[local35];
			this.aShortArray82 = new short[local35];
			this.aShortArray88 = new short[local35];
			this.aByteArray72 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray87[local54] = Static254.aShortArray83[local54];
				this.aShortArray81[local54] = Static254.aShortArray84[local54];
				this.aShortArray86[local54] = Static254.aShortArray85[local54];
				this.aShortArray82[local54] = Static254.aShortArray89[local54];
				this.aShortArray88[local54] = Static254.aShortArray80[local54];
				this.aByteArray72[local54] = Static254.aByteArray73[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt4868 = 0;
			this.aBoolean357 = false;
			this.aBoolean358 = false;
		}
	}
}
