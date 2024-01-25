import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class191 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	public int anInt5282 = 0;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Z")
	public boolean aBoolean340 = false;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Z")
	public boolean aBoolean341 = false;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Z")
	public boolean aBoolean342 = false;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!ds;")
	public Class6_Sub12 aClass6_Sub12_1 = null;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "([BLclient!ds;)V")
	public Class191(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		this.aClass6_Sub12_1 = arg1;
		try {
			@Pc(24) Class6_Sub1 local24 = new Class6_Sub1(arg0);
			@Pc(29) Class6_Sub1 local29 = new Class6_Sub1(arg0);
			local24.anInt7898 = 2;
			@Pc(36) int local36 = local24.method6433();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt7898 = local24.anInt7898 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass6_Sub12_1.anIntArray115[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method6433();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static299.aShortArray74[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static299.aShortArray78[local38] = local78;
					} else {
						Static299.aShortArray78[local38] = (short) local29.method6471();
					}
					if ((local65 & 0x2) == 0) {
						Static299.aShortArray77[local38] = local78;
					} else {
						Static299.aShortArray77[local38] = (short) local29.method6471();
					}
					if ((local65 & 0x4) == 0) {
						Static299.aShortArray79[local38] = local78;
					} else {
						Static299.aShortArray79[local38] = (short) local29.method6471();
					}
					Static299.aByteArray67[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static299.aShortArray78[local38] = (short) (((Static299.aShortArray78[local38] & 0xFF) << 3) + (Static299.aShortArray78[local38] >> 8 & 0x7));
						Static299.aShortArray77[local38] = (short) (((Static299.aShortArray77[local38] & 0xFF) << 3) + (Static299.aShortArray77[local38] >> 8 & 0x7));
						Static299.aShortArray79[local38] = (short) (((Static299.aShortArray79[local38] & 0xFF) << 3) + (Static299.aShortArray79[local38] >> 8 & 0x7));
						Static299.aShortArray78[local38] = (short) (Static299.aShortArray78[local38] << 3);
						Static299.aShortArray77[local38] = (short) (Static299.aShortArray77[local38] << 3);
						Static299.aShortArray79[local38] = (short) (Static299.aShortArray79[local38] << 3);
					}
					Static299.aShortArray76[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static299.aShortArray76[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean342 = true;
					} else if (local57 == 7) {
						this.aBoolean341 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean340 = true;
					}
					local38++;
				}
			}
			if (local29.anInt7898 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt5282 = local38;
			this.aShortArray81 = new short[local38];
			this.aShortArray75 = new short[local38];
			this.aShortArray82 = new short[local38];
			this.aShortArray80 = new short[local38];
			this.aShortArray73 = new short[local38];
			this.aByteArray66 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray81[local57] = Static299.aShortArray74[local57];
				this.aShortArray75[local57] = Static299.aShortArray78[local57];
				this.aShortArray82[local57] = Static299.aShortArray77[local57];
				this.aShortArray80[local57] = Static299.aShortArray79[local57];
				this.aShortArray73[local57] = Static299.aShortArray76[local57];
				this.aByteArray66[local57] = Static299.aByteArray67[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt5282 = 0;
			this.aBoolean342 = false;
			this.aBoolean341 = false;
		}
	}
}
