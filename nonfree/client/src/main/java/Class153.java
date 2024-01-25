import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class153 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	public int anInt4583 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Z")
	public boolean aBoolean331 = false;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!hq;")
	public Class5_Sub22 aClass5_Sub22_1 = null;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Z")
	public boolean aBoolean332 = false;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "([BLclient!hq;)V")
	public Class153(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub22 arg1) {
		this.aClass5_Sub22_1 = arg1;
		try {
			@Pc(21) Class5_Sub1 local21 = new Class5_Sub1(arg0);
			@Pc(26) Class5_Sub1 local26 = new Class5_Sub1(arg0);
			local21.anInt2029 = 2;
			@Pc(33) int local33 = local21.method1832();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt2029 = local21.anInt2029 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass5_Sub22_1.anIntArray157[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method1832();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static235.aShortArray67[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static235.aShortArray71[local35] = local75;
					} else {
						Static235.aShortArray71[local35] = (short) local26.method1854();
					}
					if ((local62 & 0x2) == 0) {
						Static235.aShortArray70[local35] = local75;
					} else {
						Static235.aShortArray70[local35] = (short) local26.method1854();
					}
					if ((local62 & 0x4) == 0) {
						Static235.aShortArray74[local35] = local75;
					} else {
						Static235.aShortArray74[local35] = (short) local26.method1854();
					}
					Static235.aByteArray67[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static235.aShortArray71[local35] = (short) (((Static235.aShortArray71[local35] & 0xFF) << 3) + (Static235.aShortArray71[local35] >> 8 & 0x7));
						Static235.aShortArray70[local35] = (short) (((Static235.aShortArray70[local35] & 0xFF) << 3) + (Static235.aShortArray70[local35] >> 8 & 0x7));
						Static235.aShortArray74[local35] = (short) (((Static235.aShortArray74[local35] & 0xFF) << 3) + (Static235.aShortArray74[local35] >> 8 & 0x7));
						Static235.aShortArray71[local35] = (short) (Static235.aShortArray71[local35] << 3);
						Static235.aShortArray70[local35] = (short) (Static235.aShortArray70[local35] << 3);
						Static235.aShortArray74[local35] = (short) (Static235.aShortArray74[local35] << 3);
					}
					Static235.aShortArray73[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static235.aShortArray73[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean332 = true;
					} else if (local54 == 7) {
						this.aBoolean331 = true;
					}
					local35++;
				}
			}
			if (local26.anInt2029 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt4583 = local35;
			this.aShortArray66 = new short[local35];
			this.aShortArray65 = new short[local35];
			this.aShortArray68 = new short[local35];
			this.aShortArray69 = new short[local35];
			this.aShortArray72 = new short[local35];
			this.aByteArray66 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray66[local54] = Static235.aShortArray67[local54];
				this.aShortArray65[local54] = Static235.aShortArray71[local54];
				this.aShortArray68[local54] = Static235.aShortArray70[local54];
				this.aShortArray69[local54] = Static235.aShortArray74[local54];
				this.aShortArray72[local54] = Static235.aShortArray73[local54];
				this.aByteArray66[local54] = Static235.aByteArray67[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt4583 = 0;
			this.aBoolean332 = false;
			this.aBoolean331 = false;
		}
	}
}
