import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class164 {

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Z")
	public boolean aBoolean328 = false;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!b;")
	public Class6_Sub4 aClass6_Sub4_1 = null;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
	public boolean aBoolean327 = false;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "I")
	public int anInt4664 = 0;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "[S")
	public short[] aShortArray86;

	@OriginalMember(owner = "client!q", name = "m", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "[S")
	public short[] aShortArray84;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "([BLclient!b;)V")
	public Class164(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub4 arg1) {
		this.aClass6_Sub4_1 = arg1;
		try {
			@Pc(21) Class6_Sub10 local21 = new Class6_Sub10(arg0);
			@Pc(26) Class6_Sub10 local26 = new Class6_Sub10(arg0);
			local21.anInt4188 = 2;
			@Pc(33) int local33 = local21.method3972();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt4188 = local21.anInt4188 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass6_Sub4_1.anIntArray31[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method3972();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static251.aShortArray80[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static251.aShortArray83[local35] = local75;
					} else {
						Static251.aShortArray83[local35] = (short) local26.method3964();
					}
					if ((local62 & 0x2) == 0) {
						Static251.aShortArray81[local35] = local75;
					} else {
						Static251.aShortArray81[local35] = (short) local26.method3964();
					}
					if ((local62 & 0x4) == 0) {
						Static251.aShortArray79[local35] = local75;
					} else {
						Static251.aShortArray79[local35] = (short) local26.method3964();
					}
					Static251.aByteArray74[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static251.aShortArray83[local35] = (short) (((Static251.aShortArray83[local35] & 0xFF) << 3) + (Static251.aShortArray83[local35] >> 8 & 0x7));
						Static251.aShortArray81[local35] = (short) (((Static251.aShortArray81[local35] & 0xFF) << 3) + (Static251.aShortArray81[local35] >> 8 & 0x7));
						Static251.aShortArray79[local35] = (short) (((Static251.aShortArray79[local35] & 0xFF) << 3) + (Static251.aShortArray79[local35] >> 8 & 0x7));
						Static251.aShortArray83[local35] = (short) (Static251.aShortArray83[local35] << 3);
						Static251.aShortArray81[local35] = (short) (Static251.aShortArray81[local35] << 3);
						Static251.aShortArray79[local35] = (short) (Static251.aShortArray79[local35] << 3);
					}
					Static251.aShortArray77[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static251.aShortArray77[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean327 = true;
					} else if (local54 == 7) {
						this.aBoolean328 = true;
					}
					local35++;
				}
			}
			if (local26.anInt4188 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt4664 = local35;
			this.aShortArray86 = new short[local35];
			this.aShortArray85 = new short[local35];
			this.aShortArray82 = new short[local35];
			this.aShortArray78 = new short[local35];
			this.aShortArray84 = new short[local35];
			this.aByteArray75 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray86[local54] = Static251.aShortArray80[local54];
				this.aShortArray85[local54] = Static251.aShortArray83[local54];
				this.aShortArray82[local54] = Static251.aShortArray81[local54];
				this.aShortArray78[local54] = Static251.aShortArray79[local54];
				this.aShortArray84[local54] = Static251.aShortArray77[local54];
				this.aByteArray75[local54] = Static251.aByteArray74[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt4664 = 0;
			this.aBoolean327 = false;
			this.aBoolean328 = false;
		}
	}
}
