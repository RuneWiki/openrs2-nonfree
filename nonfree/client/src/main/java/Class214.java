import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class214 {

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Z")
	public boolean aBoolean408 = false;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
	public int anInt5864 = 0;

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "Z")
	public boolean aBoolean409 = false;

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "Z")
	public boolean aBoolean410 = false;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "Lclient!nr;")
	public Class1_Sub32 aClass1_Sub32_1 = null;

	@OriginalMember(owner = "client!rq", name = "q", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "[S")
	public short[] aShortArray91;

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "[S")
	public short[] aShortArray95;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "([BLclient!nr;)V")
	public Class214(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub32 arg1) {
		this.aClass1_Sub32_1 = arg1;
		try {
			@Pc(24) Class1_Sub5 local24 = new Class1_Sub5(arg0);
			@Pc(29) Class1_Sub5 local29 = new Class1_Sub5(arg0);
			local24.anInt6475 = 2;
			@Pc(36) int local36 = local24.method5366();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt6475 = local24.anInt6475 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass1_Sub32_1.anIntArray422[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method5366();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static354.aShortArray92[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static354.aShortArray96[local38] = local78;
					} else {
						Static354.aShortArray96[local38] = (short) local29.method5413();
					}
					if ((local65 & 0x2) == 0) {
						Static354.aShortArray97[local38] = local78;
					} else {
						Static354.aShortArray97[local38] = (short) local29.method5413();
					}
					if ((local65 & 0x4) == 0) {
						Static354.aShortArray93[local38] = local78;
					} else {
						Static354.aShortArray93[local38] = (short) local29.method5413();
					}
					Static354.aByteArray75[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static354.aShortArray96[local38] = (short) (((Static354.aShortArray96[local38] & 0xFF) << 3) + (Static354.aShortArray96[local38] >> 8 & 0x7));
						Static354.aShortArray97[local38] = (short) (((Static354.aShortArray97[local38] & 0xFF) << 3) + (Static354.aShortArray97[local38] >> 8 & 0x7));
						Static354.aShortArray93[local38] = (short) (((Static354.aShortArray93[local38] & 0xFF) << 3) + (Static354.aShortArray93[local38] >> 8 & 0x7));
						Static354.aShortArray96[local38] = (short) (Static354.aShortArray96[local38] << 3);
						Static354.aShortArray97[local38] = (short) (Static354.aShortArray97[local38] << 3);
						Static354.aShortArray93[local38] = (short) (Static354.aShortArray93[local38] << 3);
					}
					Static354.aShortArray90[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static354.aShortArray90[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean408 = true;
					} else if (local57 == 7) {
						this.aBoolean410 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean409 = true;
					}
					local38++;
				}
			}
			if (local29.anInt6475 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt5864 = local38;
			this.aShortArray98 = new short[local38];
			this.aShortArray91 = new short[local38];
			this.aShortArray95 = new short[local38];
			this.aShortArray89 = new short[local38];
			this.aShortArray94 = new short[local38];
			this.aByteArray74 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray98[local57] = Static354.aShortArray92[local57];
				this.aShortArray91[local57] = Static354.aShortArray96[local57];
				this.aShortArray95[local57] = Static354.aShortArray97[local57];
				this.aShortArray89[local57] = Static354.aShortArray93[local57];
				this.aShortArray94[local57] = Static354.aShortArray90[local57];
				this.aByteArray74[local57] = Static354.aByteArray75[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt5864 = 0;
			this.aBoolean408 = false;
			this.aBoolean410 = false;
		}
	}
}
