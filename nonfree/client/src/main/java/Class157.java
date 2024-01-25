import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class157 {

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "Lclient!wi;")
	public Class7_Sub42 aClass7_Sub42_1 = null;

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "Z")
	public boolean aBoolean348 = false;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
	public int anInt4695 = 0;

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "Z")
	public boolean aBoolean349 = false;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "[S")
	public short[] aShortArray100;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "[S")
	public short[] aShortArray95;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([BLclient!wi;)V")
	public Class157(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class7_Sub42 arg1) {
		this.aClass7_Sub42_1 = arg1;
		try {
			@Pc(21) Class7_Sub3 local21 = new Class7_Sub3(arg0);
			@Pc(26) Class7_Sub3 local26 = new Class7_Sub3(arg0);
			local21.anInt3005 = 2;
			@Pc(33) int local33 = local21.method2772();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt3005 = local21.anInt3005 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass7_Sub42_1.anIntArray845[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method2772();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static236.aShortArray101[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static236.aShortArray104[local35] = local75;
					} else {
						Static236.aShortArray104[local35] = (short) local26.method2752();
					}
					if ((local62 & 0x2) == 0) {
						Static236.aShortArray99[local35] = local75;
					} else {
						Static236.aShortArray99[local35] = (short) local26.method2752();
					}
					if ((local62 & 0x4) == 0) {
						Static236.aShortArray103[local35] = local75;
					} else {
						Static236.aShortArray103[local35] = (short) local26.method2752();
					}
					Static236.aByteArray71[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static236.aShortArray104[local35] = (short) (((Static236.aShortArray104[local35] & 0xFF) << 3) + (Static236.aShortArray104[local35] >> 8 & 0x7));
						Static236.aShortArray99[local35] = (short) (((Static236.aShortArray99[local35] & 0xFF) << 3) + (Static236.aShortArray99[local35] >> 8 & 0x7));
						Static236.aShortArray103[local35] = (short) (((Static236.aShortArray103[local35] & 0xFF) << 3) + (Static236.aShortArray103[local35] >> 8 & 0x7));
						Static236.aShortArray104[local35] = (short) (Static236.aShortArray104[local35] << 3);
						Static236.aShortArray99[local35] = (short) (Static236.aShortArray99[local35] << 3);
						Static236.aShortArray103[local35] = (short) (Static236.aShortArray103[local35] << 3);
					}
					Static236.aShortArray98[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static236.aShortArray98[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean349 = true;
					} else if (local54 == 7) {
						this.aBoolean348 = true;
					}
					local35++;
				}
			}
			if (local26.anInt3005 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt4695 = local35;
			this.aShortArray100 = new short[local35];
			this.aShortArray96 = new short[local35];
			this.aShortArray97 = new short[local35];
			this.aShortArray102 = new short[local35];
			this.aShortArray95 = new short[local35];
			this.aByteArray70 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray100[local54] = Static236.aShortArray101[local54];
				this.aShortArray96[local54] = Static236.aShortArray104[local54];
				this.aShortArray97[local54] = Static236.aShortArray99[local54];
				this.aShortArray102[local54] = Static236.aShortArray103[local54];
				this.aShortArray95[local54] = Static236.aShortArray98[local54];
				this.aByteArray70[local54] = Static236.aByteArray71[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt4695 = 0;
			this.aBoolean349 = false;
			this.aBoolean348 = false;
		}
	}
}
