import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class127 {

	@OriginalMember(owner = "client!li", name = "h", descriptor = "Lclient!ah;")
	public Class2_Sub4 aClass2_Sub4_1 = null;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	public int anInt4079 = 0;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "Z")
	public boolean aBoolean345 = false;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Z")
	public boolean aBoolean346 = false;

	@OriginalMember(owner = "client!li", name = "c", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "([BLclient!ah;)V")
	public Class127(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		this.aClass2_Sub4_1 = arg1;
		try {
			@Pc(21) Class2_Sub12 local21 = new Class2_Sub12(arg0);
			@Pc(26) Class2_Sub12 local26 = new Class2_Sub12(arg0);
			local21.anInt3606 = 2;
			@Pc(33) int local33 = local21.method3124();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt3606 = local21.anInt3606 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass2_Sub4_1.anIntArray23[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method3124();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static185.aShortArray69[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static185.aShortArray67[local35] = local75;
					} else {
						Static185.aShortArray67[local35] = (short) local26.method3123();
					}
					if ((local62 & 0x2) == 0) {
						Static185.aShortArray61[local35] = local75;
					} else {
						Static185.aShortArray61[local35] = (short) local26.method3123();
					}
					if ((local62 & 0x4) == 0) {
						Static185.aShortArray68[local35] = local75;
					} else {
						Static185.aShortArray68[local35] = (short) local26.method3123();
					}
					Static185.aByteArray45[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static185.aShortArray67[local35] = (short) (((Static185.aShortArray67[local35] & 0xFF) << 3) + (Static185.aShortArray67[local35] >> 8 & 0x7));
						Static185.aShortArray61[local35] = (short) (((Static185.aShortArray61[local35] & 0xFF) << 3) + (Static185.aShortArray61[local35] >> 8 & 0x7));
						Static185.aShortArray68[local35] = (short) (((Static185.aShortArray68[local35] & 0xFF) << 3) + (Static185.aShortArray68[local35] >> 8 & 0x7));
						Static185.aShortArray67[local35] = (short) (Static185.aShortArray67[local35] << 3);
						Static185.aShortArray61[local35] = (short) (Static185.aShortArray61[local35] << 3);
						Static185.aShortArray68[local35] = (short) (Static185.aShortArray68[local35] << 3);
					}
					Static185.aShortArray63[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static185.aShortArray63[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean345 = true;
					} else if (local54 == 7) {
						this.aBoolean346 = true;
					}
					local35++;
				}
			}
			if (local26.anInt3606 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt4079 = local35;
			this.aShortArray62 = new short[local35];
			this.aShortArray66 = new short[local35];
			this.aShortArray60 = new short[local35];
			this.aShortArray64 = new short[local35];
			this.aShortArray65 = new short[local35];
			this.aByteArray46 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray62[local54] = Static185.aShortArray69[local54];
				this.aShortArray66[local54] = Static185.aShortArray67[local54];
				this.aShortArray60[local54] = Static185.aShortArray61[local54];
				this.aShortArray64[local54] = Static185.aShortArray68[local54];
				this.aShortArray65[local54] = Static185.aShortArray63[local54];
				this.aByteArray46[local54] = Static185.aByteArray45[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt4079 = 0;
			this.aBoolean345 = false;
			this.aBoolean346 = false;
		}
	}
}
