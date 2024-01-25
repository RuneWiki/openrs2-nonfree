import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class266 {

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
	public int anInt7405 = 0;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "Lclient!gp;")
	public Class1_Sub17 aClass1_Sub17_1 = null;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "Z")
	public boolean aBoolean609 = false;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "Z")
	public boolean aBoolean608 = false;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "Z")
	public boolean aBoolean610 = false;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "[S")
	public short[] aShortArray126;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "[S")
	public short[] aShortArray130;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "[S")
	public short[] aShortArray134;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "[S")
	public short[] aShortArray125;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "[S")
	public short[] aShortArray132;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "([BLclient!gp;)V")
	public Class266(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub17 arg1) {
		this.aClass1_Sub17_1 = arg1;
		try {
			@Pc(24) Class1_Sub11 local24 = new Class1_Sub11(arg0);
			@Pc(29) Class1_Sub11 local29 = new Class1_Sub11(arg0);
			local24.anInt5766 = 2;
			@Pc(36) int local36 = local24.method4463();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt5766 = local24.anInt5766 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass1_Sub17_1.anIntArray115[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method4463();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static451.aShortArray128[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static451.aShortArray129[local38] = local78;
					} else {
						Static451.aShortArray129[local38] = (short) local29.method4449();
					}
					if ((local65 & 0x2) == 0) {
						Static451.aShortArray133[local38] = local78;
					} else {
						Static451.aShortArray133[local38] = (short) local29.method4449();
					}
					if ((local65 & 0x4) == 0) {
						Static451.aShortArray127[local38] = local78;
					} else {
						Static451.aShortArray127[local38] = (short) local29.method4449();
					}
					Static451.aByteArray95[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static451.aShortArray129[local38] = (short) (((Static451.aShortArray129[local38] & 0xFF) << 3) + (Static451.aShortArray129[local38] >> 8 & 0x7));
						Static451.aShortArray133[local38] = (short) (((Static451.aShortArray133[local38] & 0xFF) << 3) + (Static451.aShortArray133[local38] >> 8 & 0x7));
						Static451.aShortArray127[local38] = (short) (((Static451.aShortArray127[local38] & 0xFF) << 3) + (Static451.aShortArray127[local38] >> 8 & 0x7));
						Static451.aShortArray129[local38] = (short) (Static451.aShortArray129[local38] << 3);
						Static451.aShortArray133[local38] = (short) (Static451.aShortArray133[local38] << 3);
						Static451.aShortArray127[local38] = (short) (Static451.aShortArray127[local38] << 3);
					}
					Static451.aShortArray131[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static451.aShortArray131[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean608 = true;
					} else if (local57 == 7) {
						this.aBoolean609 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean610 = true;
					}
					local38++;
				}
			}
			if (local29.anInt5766 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt7405 = local38;
			this.aShortArray126 = new short[local38];
			this.aShortArray130 = new short[local38];
			this.aShortArray134 = new short[local38];
			this.aShortArray125 = new short[local38];
			this.aShortArray132 = new short[local38];
			this.aByteArray94 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray126[local57] = Static451.aShortArray128[local57];
				this.aShortArray130[local57] = Static451.aShortArray129[local57];
				this.aShortArray134[local57] = Static451.aShortArray133[local57];
				this.aShortArray125[local57] = Static451.aShortArray127[local57];
				this.aShortArray132[local57] = Static451.aShortArray131[local57];
				this.aByteArray94[local57] = Static451.aByteArray95[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt7405 = 0;
			this.aBoolean608 = false;
			this.aBoolean609 = false;
		}
	}
}
