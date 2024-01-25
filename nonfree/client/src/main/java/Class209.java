import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class209 {

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "Z")
	public boolean aBoolean429 = false;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Z")
	public boolean aBoolean428 = false;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "Z")
	public boolean aBoolean430 = false;

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "Lclient!md;")
	public Class4_Sub29 aClass4_Sub29_1 = null;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
	public int anInt6293 = 0;

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "[S")
	public short[] aShortArray86;

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "[S")
	public short[] aShortArray91;

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "([BLclient!md;)V")
	public Class209(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub29 arg1) {
		this.aClass4_Sub29_1 = arg1;
		try {
			@Pc(24) Class4_Sub30 local24 = new Class4_Sub30(arg0);
			@Pc(29) Class4_Sub30 local29 = new Class4_Sub30(arg0);
			local24.anInt6244 = 2;
			@Pc(36) int local36 = local24.method4864();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt6244 = local24.anInt6244 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass4_Sub29_1.anIntArray361[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method4864();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static347.aShortArray92[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static347.aShortArray94[local38] = local78;
					} else {
						Static347.aShortArray94[local38] = (short) local29.method4862();
					}
					if ((local65 & 0x2) == 0) {
						Static347.aShortArray87[local38] = local78;
					} else {
						Static347.aShortArray87[local38] = (short) local29.method4862();
					}
					if ((local65 & 0x4) == 0) {
						Static347.aShortArray93[local38] = local78;
					} else {
						Static347.aShortArray93[local38] = (short) local29.method4862();
					}
					Static347.aByteArray80[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static347.aShortArray94[local38] = (short) (((Static347.aShortArray94[local38] & 0xFF) << 3) + (Static347.aShortArray94[local38] >> 8 & 0x7));
						Static347.aShortArray87[local38] = (short) (((Static347.aShortArray87[local38] & 0xFF) << 3) + (Static347.aShortArray87[local38] >> 8 & 0x7));
						Static347.aShortArray93[local38] = (short) (((Static347.aShortArray93[local38] & 0xFF) << 3) + (Static347.aShortArray93[local38] >> 8 & 0x7));
						Static347.aShortArray94[local38] = (short) (Static347.aShortArray94[local38] << 3);
						Static347.aShortArray87[local38] = (short) (Static347.aShortArray87[local38] << 3);
						Static347.aShortArray93[local38] = (short) (Static347.aShortArray93[local38] << 3);
					}
					Static347.aShortArray95[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static347.aShortArray95[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean430 = true;
					} else if (local57 == 7) {
						this.aBoolean429 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean428 = true;
					}
					local38++;
				}
			}
			if (local29.anInt6244 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6293 = local38;
			this.aShortArray90 = new short[local38];
			this.aShortArray86 = new short[local38];
			this.aShortArray89 = new short[local38];
			this.aShortArray91 = new short[local38];
			this.aShortArray88 = new short[local38];
			this.aByteArray81 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray90[local57] = Static347.aShortArray92[local57];
				this.aShortArray86[local57] = Static347.aShortArray94[local57];
				this.aShortArray89[local57] = Static347.aShortArray87[local57];
				this.aShortArray91[local57] = Static347.aShortArray93[local57];
				this.aShortArray88[local57] = Static347.aShortArray95[local57];
				this.aByteArray81[local57] = Static347.aByteArray80[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt6293 = 0;
			this.aBoolean430 = false;
			this.aBoolean429 = false;
		}
	}
}
