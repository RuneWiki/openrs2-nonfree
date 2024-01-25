import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class184 {

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Z")
	public boolean aBoolean474 = false;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
	public int anInt5683 = 0;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "Lclient!ms;")
	public Class1_Sub28 aClass1_Sub28_1 = null;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "Z")
	public boolean aBoolean475 = false;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "[S")
	public short[] aShortArray91;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([BLclient!ms;)V")
	public Class184(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub28 arg1) {
		this.aClass1_Sub28_1 = arg1;
		try {
			@Pc(21) Class1_Sub21 local21 = new Class1_Sub21(arg0);
			@Pc(26) Class1_Sub21 local26 = new Class1_Sub21(arg0);
			local21.anInt6611 = 2;
			@Pc(33) int local33 = local21.method5720();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt6611 = local21.anInt6611 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass1_Sub28_1.anIntArray382[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method5720();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static279.aShortArray93[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static279.aShortArray99[local35] = local75;
					} else {
						Static279.aShortArray99[local35] = (short) local26.method5723();
					}
					if ((local62 & 0x2) == 0) {
						Static279.aShortArray97[local35] = local75;
					} else {
						Static279.aShortArray97[local35] = (short) local26.method5723();
					}
					if ((local62 & 0x4) == 0) {
						Static279.aShortArray95[local35] = local75;
					} else {
						Static279.aShortArray95[local35] = (short) local26.method5723();
					}
					Static279.aByteArray65[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static279.aShortArray99[local35] = (short) (((Static279.aShortArray99[local35] & 0xFF) << 3) + (Static279.aShortArray99[local35] >> 8 & 0x7));
						Static279.aShortArray97[local35] = (short) (((Static279.aShortArray97[local35] & 0xFF) << 3) + (Static279.aShortArray97[local35] >> 8 & 0x7));
						Static279.aShortArray95[local35] = (short) (((Static279.aShortArray95[local35] & 0xFF) << 3) + (Static279.aShortArray95[local35] >> 8 & 0x7));
						Static279.aShortArray99[local35] = (short) (Static279.aShortArray99[local35] << 3);
						Static279.aShortArray97[local35] = (short) (Static279.aShortArray97[local35] << 3);
						Static279.aShortArray95[local35] = (short) (Static279.aShortArray95[local35] << 3);
					}
					Static279.aShortArray96[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static279.aShortArray96[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean474 = true;
					} else if (local54 == 7) {
						this.aBoolean475 = true;
					}
					local35++;
				}
			}
			if (local26.anInt6611 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt5683 = local35;
			this.aShortArray90 = new short[local35];
			this.aShortArray92 = new short[local35];
			this.aShortArray98 = new short[local35];
			this.aShortArray91 = new short[local35];
			this.aShortArray94 = new short[local35];
			this.aByteArray64 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray90[local54] = Static279.aShortArray93[local54];
				this.aShortArray92[local54] = Static279.aShortArray99[local54];
				this.aShortArray98[local54] = Static279.aShortArray97[local54];
				this.aShortArray91[local54] = Static279.aShortArray95[local54];
				this.aShortArray94[local54] = Static279.aShortArray96[local54];
				this.aByteArray64[local54] = Static279.aByteArray65[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt5683 = 0;
			this.aBoolean474 = false;
			this.aBoolean475 = false;
		}
	}
}
