import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class218 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	public int anInt6481 = 0;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Z")
	public boolean aBoolean442 = false;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Z")
	public boolean aBoolean444 = false;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!sg;")
	public Class5_Sub44 aClass5_Sub44_1 = null;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Z")
	public boolean aBoolean443 = false;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "[S")
	public short[] aShortArray107;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([BLclient!sg;)V")
	public Class218(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub44 arg1) {
		this.aClass5_Sub44_1 = arg1;
		try {
			@Pc(24) Class5_Sub3 local24 = new Class5_Sub3(arg0);
			@Pc(29) Class5_Sub3 local29 = new Class5_Sub3(arg0);
			local24.anInt4960 = 2;
			@Pc(36) int local36 = local24.method4220();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt4960 = local24.anInt4960 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass5_Sub44_1.anIntArray590[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method4220();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static346.aShortArray106[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static346.aShortArray103[local38] = local78;
					} else {
						Static346.aShortArray103[local38] = (short) local29.method4190();
					}
					if ((local65 & 0x2) == 0) {
						Static346.aShortArray104[local38] = local78;
					} else {
						Static346.aShortArray104[local38] = (short) local29.method4190();
					}
					if ((local65 & 0x4) == 0) {
						Static346.aShortArray100[local38] = local78;
					} else {
						Static346.aShortArray100[local38] = (short) local29.method4190();
					}
					Static346.aByteArray87[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static346.aShortArray103[local38] = (short) (((Static346.aShortArray103[local38] & 0xFF) << 3) + (Static346.aShortArray103[local38] >> 8 & 0x7));
						Static346.aShortArray104[local38] = (short) (((Static346.aShortArray104[local38] & 0xFF) << 3) + (Static346.aShortArray104[local38] >> 8 & 0x7));
						Static346.aShortArray100[local38] = (short) (((Static346.aShortArray100[local38] & 0xFF) << 3) + (Static346.aShortArray100[local38] >> 8 & 0x7));
						Static346.aShortArray103[local38] = (short) (Static346.aShortArray103[local38] << 3);
						Static346.aShortArray104[local38] = (short) (Static346.aShortArray104[local38] << 3);
						Static346.aShortArray100[local38] = (short) (Static346.aShortArray100[local38] << 3);
					}
					Static346.aShortArray98[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static346.aShortArray98[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean444 = true;
					} else if (local57 == 7) {
						this.aBoolean443 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean442 = true;
					}
					local38++;
				}
			}
			if (local29.anInt4960 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6481 = local38;
			this.aShortArray102 = new short[local38];
			this.aShortArray107 = new short[local38];
			this.aShortArray101 = new short[local38];
			this.aShortArray99 = new short[local38];
			this.aShortArray105 = new short[local38];
			this.aByteArray88 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray102[local57] = Static346.aShortArray106[local57];
				this.aShortArray107[local57] = Static346.aShortArray103[local57];
				this.aShortArray101[local57] = Static346.aShortArray104[local57];
				this.aShortArray99[local57] = Static346.aShortArray100[local57];
				this.aShortArray105[local57] = Static346.aShortArray98[local57];
				this.aByteArray88[local57] = Static346.aByteArray87[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt6481 = 0;
			this.aBoolean444 = false;
			this.aBoolean443 = false;
		}
	}
}
