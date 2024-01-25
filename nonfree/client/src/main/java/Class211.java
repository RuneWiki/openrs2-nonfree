import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class211 {

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Lclient!ed;")
	public Class1_Sub16 aClass1_Sub16_1 = null;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Z")
	public boolean aBoolean476 = false;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "Z")
	public boolean aBoolean477 = false;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
	public int anInt6359 = 0;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[S")
	public short[] aShortArray108;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "[S")
	public short[] aShortArray113;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[S")
	public short[] aShortArray110;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[S")
	public short[] aShortArray107;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([BLclient!ed;)V")
	public Class211(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		this.aClass1_Sub16_1 = arg1;
		try {
			@Pc(21) Class1_Sub7 local21 = new Class1_Sub7(arg0);
			@Pc(26) Class1_Sub7 local26 = new Class1_Sub7(arg0);
			local21.anInt2219 = 2;
			@Pc(33) int local33 = local21.method2132();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt2219 = local21.anInt2219 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass1_Sub16_1.anIntArray134[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method2132();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static335.aShortArray105[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static335.aShortArray109[local35] = local75;
					} else {
						Static335.aShortArray109[local35] = (short) local26.method2110();
					}
					if ((local62 & 0x2) == 0) {
						Static335.aShortArray111[local35] = local75;
					} else {
						Static335.aShortArray111[local35] = (short) local26.method2110();
					}
					if ((local62 & 0x4) == 0) {
						Static335.aShortArray106[local35] = local75;
					} else {
						Static335.aShortArray106[local35] = (short) local26.method2110();
					}
					Static335.aByteArray91[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static335.aShortArray109[local35] = (short) (((Static335.aShortArray109[local35] & 0xFF) << 3) + (Static335.aShortArray109[local35] >> 8 & 0x7));
						Static335.aShortArray111[local35] = (short) (((Static335.aShortArray111[local35] & 0xFF) << 3) + (Static335.aShortArray111[local35] >> 8 & 0x7));
						Static335.aShortArray106[local35] = (short) (((Static335.aShortArray106[local35] & 0xFF) << 3) + (Static335.aShortArray106[local35] >> 8 & 0x7));
						Static335.aShortArray109[local35] = (short) (Static335.aShortArray109[local35] << 3);
						Static335.aShortArray111[local35] = (short) (Static335.aShortArray111[local35] << 3);
						Static335.aShortArray106[local35] = (short) (Static335.aShortArray106[local35] << 3);
					}
					Static335.aShortArray114[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static335.aShortArray114[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean476 = true;
					} else if (local54 == 7) {
						this.aBoolean477 = true;
					}
					local35++;
				}
			}
			if (local26.anInt2219 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6359 = local35;
			this.aShortArray108 = new short[local35];
			this.aShortArray113 = new short[local35];
			this.aShortArray112 = new short[local35];
			this.aShortArray110 = new short[local35];
			this.aShortArray107 = new short[local35];
			this.aByteArray92 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray108[local54] = Static335.aShortArray105[local54];
				this.aShortArray113[local54] = Static335.aShortArray109[local54];
				this.aShortArray112[local54] = Static335.aShortArray111[local54];
				this.aShortArray110[local54] = Static335.aShortArray106[local54];
				this.aShortArray107[local54] = Static335.aShortArray114[local54];
				this.aByteArray92[local54] = Static335.aByteArray91[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt6359 = 0;
			this.aBoolean476 = false;
			this.aBoolean477 = false;
		}
	}
}
