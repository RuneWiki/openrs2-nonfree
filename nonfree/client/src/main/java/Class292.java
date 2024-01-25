import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class292 {

	@OriginalMember(owner = "client!vaa", name = "f", descriptor = "Lclient!we;")
	public Class2_Sub49 aClass2_Sub49_1 = null;

	@OriginalMember(owner = "client!vaa", name = "i", descriptor = "Z")
	public boolean aBoolean633 = false;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
	public int anInt8761 = 0;

	@OriginalMember(owner = "client!vaa", name = "o", descriptor = "Z")
	public boolean aBoolean634 = false;

	@OriginalMember(owner = "client!vaa", name = "p", descriptor = "Z")
	public boolean aBoolean635 = false;

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "[S")
	public short[] aShortArray115;

	@OriginalMember(owner = "client!vaa", name = "j", descriptor = "[S")
	public short[] aShortArray120;

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "[S")
	public short[] aShortArray119;

	@OriginalMember(owner = "client!vaa", name = "n", descriptor = "[S")
	public short[] aShortArray123;

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "[S")
	public short[] aShortArray118;

	@OriginalMember(owner = "client!vaa", name = "m", descriptor = "[B")
	public byte[] aByteArray114;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "([BLclient!we;)V")
	public Class292(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		this.aClass2_Sub49_1 = arg1;
		try {
			@Pc(24) Class2_Sub29 local24 = new Class2_Sub29(arg0);
			@Pc(29) Class2_Sub29 local29 = new Class2_Sub29(arg0);
			local24.anInt6132 = 2;
			@Pc(36) int local36 = local24.method5170();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt6132 = local24.anInt6132 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass2_Sub49_1.anIntArray713[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method5170();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static500.aShortArray124[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static500.aShortArray121[local38] = local78;
					} else {
						Static500.aShortArray121[local38] = (short) local29.method5203();
					}
					if ((local65 & 0x2) == 0) {
						Static500.aShortArray116[local38] = local78;
					} else {
						Static500.aShortArray116[local38] = (short) local29.method5203();
					}
					if ((local65 & 0x4) == 0) {
						Static500.aShortArray122[local38] = local78;
					} else {
						Static500.aShortArray122[local38] = (short) local29.method5203();
					}
					Static500.aByteArray113[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static500.aShortArray121[local38] = (short) (((Static500.aShortArray121[local38] & 0xFF) << 3) + (Static500.aShortArray121[local38] >> 8 & 0x7));
						Static500.aShortArray116[local38] = (short) (((Static500.aShortArray116[local38] & 0xFF) << 3) + (Static500.aShortArray116[local38] >> 8 & 0x7));
						Static500.aShortArray122[local38] = (short) (((Static500.aShortArray122[local38] & 0xFF) << 3) + (Static500.aShortArray122[local38] >> 8 & 0x7));
						Static500.aShortArray121[local38] = (short) (Static500.aShortArray121[local38] << 3);
						Static500.aShortArray116[local38] = (short) (Static500.aShortArray116[local38] << 3);
						Static500.aShortArray122[local38] = (short) (Static500.aShortArray122[local38] << 3);
					}
					Static500.aShortArray117[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static500.aShortArray117[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean634 = true;
					} else if (local57 == 7) {
						this.aBoolean633 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean635 = true;
					}
					local38++;
				}
			}
			if (local29.anInt6132 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt8761 = local38;
			this.aShortArray115 = new short[local38];
			this.aShortArray120 = new short[local38];
			this.aShortArray119 = new short[local38];
			this.aShortArray123 = new short[local38];
			this.aShortArray118 = new short[local38];
			this.aByteArray114 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray115[local57] = Static500.aShortArray124[local57];
				this.aShortArray120[local57] = Static500.aShortArray121[local57];
				this.aShortArray119[local57] = Static500.aShortArray116[local57];
				this.aShortArray123[local57] = Static500.aShortArray122[local57];
				this.aShortArray118[local57] = Static500.aShortArray117[local57];
				this.aByteArray114[local57] = Static500.aByteArray113[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt8761 = 0;
			this.aBoolean634 = false;
			this.aBoolean633 = false;
		}
	}
}
