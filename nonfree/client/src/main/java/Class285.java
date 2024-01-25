import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class285 {

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "Z")
	public boolean aBoolean559 = false;

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
	public int anInt8222 = 0;

	@OriginalMember(owner = "client!uca", name = "k", descriptor = "Z")
	public boolean aBoolean560 = false;

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "Lclient!kw;")
	public Class1_Sub29 aClass1_Sub29_1 = null;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "Z")
	public boolean aBoolean558 = false;

	@OriginalMember(owner = "client!uca", name = "q", descriptor = "[S")
	public short[] aShortArray150;

	@OriginalMember(owner = "client!uca", name = "i", descriptor = "[S")
	public short[] aShortArray145;

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "[S")
	public short[] aShortArray142;

	@OriginalMember(owner = "client!uca", name = "j", descriptor = "[S")
	public short[] aShortArray146;

	@OriginalMember(owner = "client!uca", name = "g", descriptor = "[S")
	public short[] aShortArray144;

	@OriginalMember(owner = "client!uca", name = "n", descriptor = "[B")
	public byte[] aByteArray101;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "([BLclient!kw;)V")
	public Class285(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub29 arg1) {
		this.aClass1_Sub29_1 = arg1;
		try {
			@Pc(24) Class1_Sub13 local24 = new Class1_Sub13(arg0);
			@Pc(29) Class1_Sub13 local29 = new Class1_Sub13(arg0);
			local24.anInt3400 = 2;
			@Pc(36) int local36 = local24.method3043();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt3400 = local24.anInt3400 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass1_Sub29_1.anIntArray366[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method3043();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static482.aShortArray148[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static482.aShortArray149[local38] = local78;
					} else {
						Static482.aShortArray149[local38] = (short) local29.method3078();
					}
					if ((local65 & 0x2) == 0) {
						Static482.aShortArray147[local38] = local78;
					} else {
						Static482.aShortArray147[local38] = (short) local29.method3078();
					}
					if ((local65 & 0x4) == 0) {
						Static482.aShortArray141[local38] = local78;
					} else {
						Static482.aShortArray141[local38] = (short) local29.method3078();
					}
					Static482.aByteArray100[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static482.aShortArray149[local38] = (short) (((Static482.aShortArray149[local38] & 0xFF) << 3) + (Static482.aShortArray149[local38] >> 8 & 0x7));
						Static482.aShortArray147[local38] = (short) (((Static482.aShortArray147[local38] & 0xFF) << 3) + (Static482.aShortArray147[local38] >> 8 & 0x7));
						Static482.aShortArray141[local38] = (short) (((Static482.aShortArray141[local38] & 0xFF) << 3) + (Static482.aShortArray141[local38] >> 8 & 0x7));
						Static482.aShortArray149[local38] = (short) (Static482.aShortArray149[local38] << 3);
						Static482.aShortArray147[local38] = (short) (Static482.aShortArray147[local38] << 3);
						Static482.aShortArray141[local38] = (short) (Static482.aShortArray141[local38] << 3);
					}
					Static482.aShortArray143[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static482.aShortArray143[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean558 = true;
					} else if (local57 == 7) {
						this.aBoolean559 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean560 = true;
					}
					local38++;
				}
			}
			if (local29.anInt3400 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt8222 = local38;
			this.aShortArray150 = new short[local38];
			this.aShortArray145 = new short[local38];
			this.aShortArray142 = new short[local38];
			this.aShortArray146 = new short[local38];
			this.aShortArray144 = new short[local38];
			this.aByteArray101 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray150[local57] = Static482.aShortArray148[local57];
				this.aShortArray145[local57] = Static482.aShortArray149[local57];
				this.aShortArray142[local57] = Static482.aShortArray147[local57];
				this.aShortArray146[local57] = Static482.aShortArray141[local57];
				this.aShortArray144[local57] = Static482.aShortArray143[local57];
				this.aByteArray101[local57] = Static482.aByteArray100[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt8222 = 0;
			this.aBoolean558 = false;
			this.aBoolean559 = false;
		}
	}
}
