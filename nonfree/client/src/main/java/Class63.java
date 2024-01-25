import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class63 {

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	public int anInt1547 = 0;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "Lclient!ih;")
	public Class2_Sub19 aClass2_Sub19_1 = null;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Z")
	public boolean aBoolean129 = false;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "Z")
	public boolean aBoolean130 = false;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!em", name = "m", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "([BLclient!ih;)V")
	public Class63(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub19 arg1) {
		this.aClass2_Sub19_1 = arg1;
		try {
			@Pc(21) Class2_Sub13 local21 = new Class2_Sub13(arg0);
			@Pc(26) Class2_Sub13 local26 = new Class2_Sub13(arg0);
			local21.anInt4788 = 2;
			@Pc(33) int local33 = local21.method4240();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt4788 = local21.anInt4788 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass2_Sub19_1.anIntArray310[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method4240();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static81.aShortArray35[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static81.aShortArray31[local35] = local75;
					} else {
						Static81.aShortArray31[local35] = (short) local26.method4192();
					}
					if ((local62 & 0x2) == 0) {
						Static81.aShortArray37[local35] = local75;
					} else {
						Static81.aShortArray37[local35] = (short) local26.method4192();
					}
					if ((local62 & 0x4) == 0) {
						Static81.aShortArray32[local35] = local75;
					} else {
						Static81.aShortArray32[local35] = (short) local26.method4192();
					}
					Static81.aByteArray29[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static81.aShortArray31[local35] = (short) (((Static81.aShortArray31[local35] & 0xFF) << 3) + (Static81.aShortArray31[local35] >> 8 & 0x7));
						Static81.aShortArray37[local35] = (short) (((Static81.aShortArray37[local35] & 0xFF) << 3) + (Static81.aShortArray37[local35] >> 8 & 0x7));
						Static81.aShortArray32[local35] = (short) (((Static81.aShortArray32[local35] & 0xFF) << 3) + (Static81.aShortArray32[local35] >> 8 & 0x7));
						Static81.aShortArray31[local35] = (short) (Static81.aShortArray31[local35] << 3);
						Static81.aShortArray37[local35] = (short) (Static81.aShortArray37[local35] << 3);
						Static81.aShortArray32[local35] = (short) (Static81.aShortArray32[local35] << 3);
					}
					Static81.aShortArray36[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static81.aShortArray36[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean129 = true;
					} else if (local54 == 7) {
						this.aBoolean130 = true;
					}
					local35++;
				}
			}
			if (local26.anInt4788 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt1547 = local35;
			this.aShortArray28 = new short[local35];
			this.aShortArray33 = new short[local35];
			this.aShortArray29 = new short[local35];
			this.aShortArray34 = new short[local35];
			this.aShortArray30 = new short[local35];
			this.aByteArray28 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray28[local54] = Static81.aShortArray35[local54];
				this.aShortArray33[local54] = Static81.aShortArray31[local54];
				this.aShortArray29[local54] = Static81.aShortArray37[local54];
				this.aShortArray34[local54] = Static81.aShortArray32[local54];
				this.aShortArray30[local54] = Static81.aShortArray36[local54];
				this.aByteArray28[local54] = Static81.aByteArray29[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt1547 = 0;
			this.aBoolean129 = false;
			this.aBoolean130 = false;
		}
	}
}
