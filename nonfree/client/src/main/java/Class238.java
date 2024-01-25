import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class238 {

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "Lclient!ki;")
	public Class3_Sub28 aClass3_Sub28_1 = null;

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "Z")
	public boolean aBoolean566 = false;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "Z")
	public boolean aBoolean567 = false;

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
	public int anInt6539 = 0;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "Z")
	public boolean aBoolean568 = false;

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "[S")
	public short[] aShortArray137;

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "[S")
	public short[] aShortArray134;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "[S")
	public short[] aShortArray133;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "[S")
	public short[] aShortArray136;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "[S")
	public short[] aShortArray139;

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "[B")
	public byte[] aByteArray83;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "([BLclient!ki;)V")
	public Class238(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		this.aClass3_Sub28_1 = arg1;
		try {
			@Pc(24) Class3_Sub7 local24 = new Class3_Sub7(arg0);
			@Pc(29) Class3_Sub7 local29 = new Class3_Sub7(arg0);
			local24.anInt3235 = 2;
			@Pc(36) int local36 = local24.method2582();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt3235 = local24.anInt3235 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass3_Sub28_1.anIntArray260[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method2582();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static394.aShortArray130[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static394.aShortArray135[local38] = local78;
					} else {
						Static394.aShortArray135[local38] = (short) local29.method2626();
					}
					if ((local65 & 0x2) == 0) {
						Static394.aShortArray131[local38] = local78;
					} else {
						Static394.aShortArray131[local38] = (short) local29.method2626();
					}
					if ((local65 & 0x4) == 0) {
						Static394.aShortArray132[local38] = local78;
					} else {
						Static394.aShortArray132[local38] = (short) local29.method2626();
					}
					Static394.aByteArray82[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static394.aShortArray135[local38] = (short) (((Static394.aShortArray135[local38] & 0xFF) << 3) + (Static394.aShortArray135[local38] >> 8 & 0x7));
						Static394.aShortArray131[local38] = (short) (((Static394.aShortArray131[local38] & 0xFF) << 3) + (Static394.aShortArray131[local38] >> 8 & 0x7));
						Static394.aShortArray132[local38] = (short) (((Static394.aShortArray132[local38] & 0xFF) << 3) + (Static394.aShortArray132[local38] >> 8 & 0x7));
						Static394.aShortArray135[local38] = (short) (Static394.aShortArray135[local38] << 3);
						Static394.aShortArray131[local38] = (short) (Static394.aShortArray131[local38] << 3);
						Static394.aShortArray132[local38] = (short) (Static394.aShortArray132[local38] << 3);
					}
					Static394.aShortArray138[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static394.aShortArray138[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean567 = true;
					} else if (local57 == 7) {
						this.aBoolean566 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean568 = true;
					}
					local38++;
				}
			}
			if (local29.anInt3235 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6539 = local38;
			this.aShortArray137 = new short[local38];
			this.aShortArray134 = new short[local38];
			this.aShortArray133 = new short[local38];
			this.aShortArray136 = new short[local38];
			this.aShortArray139 = new short[local38];
			this.aByteArray83 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray137[local57] = Static394.aShortArray130[local57];
				this.aShortArray134[local57] = Static394.aShortArray135[local57];
				this.aShortArray133[local57] = Static394.aShortArray131[local57];
				this.aShortArray136[local57] = Static394.aShortArray132[local57];
				this.aShortArray139[local57] = Static394.aShortArray138[local57];
				this.aByteArray83[local57] = Static394.aByteArray82[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt6539 = 0;
			this.aBoolean567 = false;
			this.aBoolean566 = false;
		}
	}
}
