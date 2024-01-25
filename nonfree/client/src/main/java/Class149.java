import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class149 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	public int anInt4578 = 0;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "Z")
	public boolean aBoolean368 = false;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "Z")
	public boolean aBoolean369 = false;

	@OriginalMember(owner = "client!og", name = "p", descriptor = "Lclient!ak;")
	public Class5_Sub4 aClass5_Sub4_1 = null;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "([BLclient!ak;)V")
	public Class149(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub4 arg1) {
		this.aClass5_Sub4_1 = arg1;
		try {
			@Pc(21) Class5_Sub12 local21 = new Class5_Sub12(arg0);
			@Pc(26) Class5_Sub12 local26 = new Class5_Sub12(arg0);
			local21.anInt5731 = 2;
			@Pc(33) int local33 = local21.method5115();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt5731 = local21.anInt5731 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass5_Sub4_1.anIntArray43[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method5115();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static228.aShortArray68[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static228.aShortArray63[local35] = local75;
					} else {
						Static228.aShortArray63[local35] = (short) local26.method5103();
					}
					if ((local62 & 0x2) == 0) {
						Static228.aShortArray69[local35] = local75;
					} else {
						Static228.aShortArray69[local35] = (short) local26.method5103();
					}
					if ((local62 & 0x4) == 0) {
						Static228.aShortArray64[local35] = local75;
					} else {
						Static228.aShortArray64[local35] = (short) local26.method5103();
					}
					Static228.aByteArray63[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static228.aShortArray63[local35] = (short) (((Static228.aShortArray63[local35] & 0xFF) << 3) + (Static228.aShortArray63[local35] >> 8 & 0x7));
						Static228.aShortArray69[local35] = (short) (((Static228.aShortArray69[local35] & 0xFF) << 3) + (Static228.aShortArray69[local35] >> 8 & 0x7));
						Static228.aShortArray64[local35] = (short) (((Static228.aShortArray64[local35] & 0xFF) << 3) + (Static228.aShortArray64[local35] >> 8 & 0x7));
						Static228.aShortArray63[local35] = (short) (Static228.aShortArray63[local35] << 3);
						Static228.aShortArray69[local35] = (short) (Static228.aShortArray69[local35] << 3);
						Static228.aShortArray64[local35] = (short) (Static228.aShortArray64[local35] << 3);
					}
					Static228.aShortArray65[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static228.aShortArray65[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean368 = true;
					} else if (local54 == 7) {
						this.aBoolean369 = true;
					}
					local35++;
				}
			}
			if (local26.anInt5731 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt4578 = local35;
			this.aShortArray67 = new short[local35];
			this.aShortArray71 = new short[local35];
			this.aShortArray62 = new short[local35];
			this.aShortArray66 = new short[local35];
			this.aShortArray70 = new short[local35];
			this.aByteArray62 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray67[local54] = Static228.aShortArray68[local54];
				this.aShortArray71[local54] = Static228.aShortArray63[local54];
				this.aShortArray62[local54] = Static228.aShortArray69[local54];
				this.aShortArray66[local54] = Static228.aShortArray64[local54];
				this.aShortArray70[local54] = Static228.aShortArray65[local54];
				this.aByteArray62[local54] = Static228.aByteArray63[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt4578 = 0;
			this.aBoolean368 = false;
			this.aBoolean369 = false;
		}
	}
}
