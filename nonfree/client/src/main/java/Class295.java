import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class295 {

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Z")
	public boolean aBoolean625 = false;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "Z")
	public boolean aBoolean627 = false;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "Z")
	public boolean aBoolean626 = false;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
	public int anInt8869 = 0;

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "Lclient!dp;")
	public Class12_Sub11 aClass12_Sub11_1 = null;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "[S")
	public short[] aShortArray130;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "[S")
	public short[] aShortArray128;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "[S")
	public short[] aShortArray135;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "[S")
	public short[] aShortArray132;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "[B")
	public byte[] aByteArray111;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([BLclient!dp;)V")
	public Class295(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class12_Sub11 arg1) {
		this.aClass12_Sub11_1 = arg1;
		try {
			@Pc(24) Class12_Sub8 local24 = new Class12_Sub8(arg0);
			@Pc(29) Class12_Sub8 local29 = new Class12_Sub8(arg0);
			local24.anInt6217 = 2;
			@Pc(36) int local36 = local24.method5216();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt6217 = local24.anInt6217 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass12_Sub11_1.anIntArray200[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method5216();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static489.aShortArray131[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static489.aShortArray134[local38] = local78;
					} else {
						Static489.aShortArray134[local38] = (short) local29.method5203();
					}
					if ((local65 & 0x2) == 0) {
						Static489.aShortArray133[local38] = local78;
					} else {
						Static489.aShortArray133[local38] = (short) local29.method5203();
					}
					if ((local65 & 0x4) == 0) {
						Static489.aShortArray127[local38] = local78;
					} else {
						Static489.aShortArray127[local38] = (short) local29.method5203();
					}
					Static489.aByteArray110[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static489.aShortArray134[local38] = (short) (((Static489.aShortArray134[local38] & 0xFF) << 3) + (Static489.aShortArray134[local38] >> 8 & 0x7));
						Static489.aShortArray133[local38] = (short) (((Static489.aShortArray133[local38] & 0xFF) << 3) + (Static489.aShortArray133[local38] >> 8 & 0x7));
						Static489.aShortArray127[local38] = (short) (((Static489.aShortArray127[local38] & 0xFF) << 3) + (Static489.aShortArray127[local38] >> 8 & 0x7));
						Static489.aShortArray134[local38] = (short) (Static489.aShortArray134[local38] << 3);
						Static489.aShortArray133[local38] = (short) (Static489.aShortArray133[local38] << 3);
						Static489.aShortArray127[local38] = (short) (Static489.aShortArray127[local38] << 3);
					}
					Static489.aShortArray126[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static489.aShortArray126[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean627 = true;
					} else if (local57 == 7) {
						this.aBoolean625 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean626 = true;
					}
					local38++;
				}
			}
			if (local29.anInt6217 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt8869 = local38;
			this.aShortArray130 = new short[local38];
			this.aShortArray129 = new short[local38];
			this.aShortArray128 = new short[local38];
			this.aShortArray135 = new short[local38];
			this.aShortArray132 = new short[local38];
			this.aByteArray111 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray130[local57] = Static489.aShortArray131[local57];
				this.aShortArray129[local57] = Static489.aShortArray134[local57];
				this.aShortArray128[local57] = Static489.aShortArray133[local57];
				this.aShortArray135[local57] = Static489.aShortArray127[local57];
				this.aShortArray132[local57] = Static489.aShortArray126[local57];
				this.aByteArray111[local57] = Static489.aByteArray110[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt8869 = 0;
			this.aBoolean627 = false;
			this.aBoolean625 = false;
		}
	}
}
