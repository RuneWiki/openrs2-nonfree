import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class87 {

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "Z")
	public boolean aBoolean167 = false;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Z")
	public boolean aBoolean168 = false;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Lclient!pd;")
	public Class1_Sub32 aClass1_Sub32_1 = null;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
	public int anInt2100 = 0;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "Z")
	public boolean aBoolean169 = false;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "([BLclient!pd;)V")
	public Class87(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub32 arg1) {
		this.aClass1_Sub32_1 = arg1;
		try {
			@Pc(24) Class1_Sub14 local24 = new Class1_Sub14(arg0);
			@Pc(29) Class1_Sub14 local29 = new Class1_Sub14(arg0);
			local24.anInt5695 = 2;
			@Pc(36) int local36 = local24.method4548();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt5695 = local24.anInt5695 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass1_Sub32_1.anIntArray384[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method4548();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static109.aShortArray18[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static109.aShortArray23[local38] = local78;
					} else {
						Static109.aShortArray23[local38] = (short) local29.method4525();
					}
					if ((local65 & 0x2) == 0) {
						Static109.aShortArray19[local38] = local78;
					} else {
						Static109.aShortArray19[local38] = (short) local29.method4525();
					}
					if ((local65 & 0x4) == 0) {
						Static109.aShortArray22[local38] = local78;
					} else {
						Static109.aShortArray22[local38] = (short) local29.method4525();
					}
					Static109.aByteArray17[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static109.aShortArray23[local38] = (short) (((Static109.aShortArray23[local38] & 0xFF) << 3) + (Static109.aShortArray23[local38] >> 8 & 0x7));
						Static109.aShortArray19[local38] = (short) (((Static109.aShortArray19[local38] & 0xFF) << 3) + (Static109.aShortArray19[local38] >> 8 & 0x7));
						Static109.aShortArray22[local38] = (short) (((Static109.aShortArray22[local38] & 0xFF) << 3) + (Static109.aShortArray22[local38] >> 8 & 0x7));
						Static109.aShortArray23[local38] = (short) (Static109.aShortArray23[local38] << 3);
						Static109.aShortArray19[local38] = (short) (Static109.aShortArray19[local38] << 3);
						Static109.aShortArray22[local38] = (short) (Static109.aShortArray22[local38] << 3);
					}
					Static109.aShortArray21[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static109.aShortArray21[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean169 = true;
					} else if (local57 == 7) {
						this.aBoolean167 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean168 = true;
					}
					local38++;
				}
			}
			if (local29.anInt5695 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt2100 = local38;
			this.aShortArray16 = new short[local38];
			this.aShortArray14 = new short[local38];
			this.aShortArray15 = new short[local38];
			this.aShortArray20 = new short[local38];
			this.aShortArray17 = new short[local38];
			this.aByteArray16 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray16[local57] = Static109.aShortArray18[local57];
				this.aShortArray14[local57] = Static109.aShortArray23[local57];
				this.aShortArray15[local57] = Static109.aShortArray19[local57];
				this.aShortArray20[local57] = Static109.aShortArray22[local57];
				this.aShortArray17[local57] = Static109.aShortArray21[local57];
				this.aByteArray16[local57] = Static109.aByteArray17[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt2100 = 0;
			this.aBoolean169 = false;
			this.aBoolean167 = false;
		}
	}
}
