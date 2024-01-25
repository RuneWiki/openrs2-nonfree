import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class207 {

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "Z")
	public boolean aBoolean543 = false;

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "Z")
	public boolean aBoolean544 = false;

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
	public int anInt6145 = 0;

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "Lclient!pf;")
	public Class1_Sub30 aClass1_Sub30_1 = null;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "([BLclient!pf;)V")
	public Class207(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub30 arg1) {
		this.aClass1_Sub30_1 = arg1;
		try {
			@Pc(21) Class1_Sub7 local21 = new Class1_Sub7(arg0);
			@Pc(26) Class1_Sub7 local26 = new Class1_Sub7(arg0);
			local21.anInt3368 = 2;
			@Pc(33) int local33 = local21.method3141();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt3368 = local21.anInt3368 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass1_Sub30_1.anIntArray592[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method3141();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static321.aShortArray100[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static321.aShortArray105[local35] = local75;
					} else {
						Static321.aShortArray105[local35] = (short) local26.method3135();
					}
					if ((local62 & 0x2) == 0) {
						Static321.aShortArray97[local35] = local75;
					} else {
						Static321.aShortArray97[local35] = (short) local26.method3135();
					}
					if ((local62 & 0x4) == 0) {
						Static321.aShortArray99[local35] = local75;
					} else {
						Static321.aShortArray99[local35] = (short) local26.method3135();
					}
					Static321.aByteArray92[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static321.aShortArray105[local35] = (short) (((Static321.aShortArray105[local35] & 0xFF) << 3) + (Static321.aShortArray105[local35] >> 8 & 0x7));
						Static321.aShortArray97[local35] = (short) (((Static321.aShortArray97[local35] & 0xFF) << 3) + (Static321.aShortArray97[local35] >> 8 & 0x7));
						Static321.aShortArray99[local35] = (short) (((Static321.aShortArray99[local35] & 0xFF) << 3) + (Static321.aShortArray99[local35] >> 8 & 0x7));
						Static321.aShortArray105[local35] = (short) (Static321.aShortArray105[local35] << 3);
						Static321.aShortArray97[local35] = (short) (Static321.aShortArray97[local35] << 3);
						Static321.aShortArray99[local35] = (short) (Static321.aShortArray99[local35] << 3);
					}
					Static321.aShortArray98[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static321.aShortArray98[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean544 = true;
					} else if (local54 == 7) {
						this.aBoolean543 = true;
					}
					local35++;
				}
			}
			if (local26.anInt3368 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6145 = local35;
			this.aShortArray96 = new short[local35];
			this.aShortArray104 = new short[local35];
			this.aShortArray102 = new short[local35];
			this.aShortArray103 = new short[local35];
			this.aShortArray101 = new short[local35];
			this.aByteArray91 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray96[local54] = Static321.aShortArray100[local54];
				this.aShortArray104[local54] = Static321.aShortArray105[local54];
				this.aShortArray102[local54] = Static321.aShortArray97[local54];
				this.aShortArray103[local54] = Static321.aShortArray99[local54];
				this.aShortArray101[local54] = Static321.aShortArray98[local54];
				this.aByteArray91[local54] = Static321.aByteArray92[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt6145 = 0;
			this.aBoolean544 = false;
			this.aBoolean543 = false;
		}
	}
}
