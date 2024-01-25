import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class266 {

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
	public int anInt7169 = 0;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "Lclient!bg;")
	public Class2_Sub4 aClass2_Sub4_1 = null;

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "Z")
	public boolean aBoolean520 = false;

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "Z")
	public boolean aBoolean521 = false;

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "Z")
	public boolean aBoolean522 = false;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "[S")
	public short[] aShortArray107;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "[S")
	public short[] aShortArray113;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "[S")
	public short[] aShortArray108;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "[S")
	public short[] aShortArray115;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "([BLclient!bg;)V")
	public Class266(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		this.aClass2_Sub4_1 = arg1;
		try {
			@Pc(24) Class2_Sub13 local24 = new Class2_Sub13(arg0);
			@Pc(29) Class2_Sub13 local29 = new Class2_Sub13(arg0);
			local24.anInt4347 = 2;
			@Pc(36) int local36 = local24.method3580();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt4347 = local24.anInt4347 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass2_Sub4_1.anIntArray49[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method3580();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static448.aShortArray109[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static448.aShortArray110[local38] = local78;
					} else {
						Static448.aShortArray110[local38] = (short) local29.method3581();
					}
					if ((local65 & 0x2) == 0) {
						Static448.aShortArray116[local38] = local78;
					} else {
						Static448.aShortArray116[local38] = (short) local29.method3581();
					}
					if ((local65 & 0x4) == 0) {
						Static448.aShortArray114[local38] = local78;
					} else {
						Static448.aShortArray114[local38] = (short) local29.method3581();
					}
					Static448.aByteArray94[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static448.aShortArray110[local38] = (short) (((Static448.aShortArray110[local38] & 0xFF) << 3) + (Static448.aShortArray110[local38] >> 8 & 0x7));
						Static448.aShortArray116[local38] = (short) (((Static448.aShortArray116[local38] & 0xFF) << 3) + (Static448.aShortArray116[local38] >> 8 & 0x7));
						Static448.aShortArray114[local38] = (short) (((Static448.aShortArray114[local38] & 0xFF) << 3) + (Static448.aShortArray114[local38] >> 8 & 0x7));
						Static448.aShortArray110[local38] = (short) (Static448.aShortArray110[local38] << 3);
						Static448.aShortArray116[local38] = (short) (Static448.aShortArray116[local38] << 3);
						Static448.aShortArray114[local38] = (short) (Static448.aShortArray114[local38] << 3);
					}
					Static448.aShortArray111[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static448.aShortArray111[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean521 = true;
					} else if (local57 == 7) {
						this.aBoolean522 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean520 = true;
					}
					local38++;
				}
			}
			if (local29.anInt4347 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt7169 = local38;
			this.aShortArray107 = new short[local38];
			this.aShortArray113 = new short[local38];
			this.aShortArray108 = new short[local38];
			this.aShortArray112 = new short[local38];
			this.aShortArray115 = new short[local38];
			this.aByteArray93 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray107[local57] = Static448.aShortArray109[local57];
				this.aShortArray113[local57] = Static448.aShortArray110[local57];
				this.aShortArray108[local57] = Static448.aShortArray116[local57];
				this.aShortArray112[local57] = Static448.aShortArray114[local57];
				this.aShortArray115[local57] = Static448.aShortArray111[local57];
				this.aByteArray93[local57] = Static448.aByteArray94[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt7169 = 0;
			this.aBoolean521 = false;
			this.aBoolean522 = false;
		}
	}
}
