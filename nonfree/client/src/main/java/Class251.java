import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class251 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	public int anInt7156 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "Lclient!r;")
	public Class1_Sub37 aClass1_Sub37_1 = null;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Z")
	public boolean aBoolean781 = false;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "Z")
	public boolean aBoolean782 = false;

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "Z")
	public boolean aBoolean783 = false;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "[S")
	public short[] aShortArray107;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "[S")
	public short[] aShortArray108;

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([BLclient!r;)V")
	public Class251(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub37 arg1) {
		this.aClass1_Sub37_1 = arg1;
		try {
			@Pc(24) Class1_Sub28 local24 = new Class1_Sub28(arg0);
			@Pc(29) Class1_Sub28 local29 = new Class1_Sub28(arg0);
			local24.anInt6812 = 2;
			@Pc(36) int local36 = local24.method5337();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt6812 = local24.anInt6812 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass1_Sub37_1.anIntArray401[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method5337();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static424.aShortArray105[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static424.aShortArray110[local38] = local78;
					} else {
						Static424.aShortArray110[local38] = (short) local29.method5338();
					}
					if ((local65 & 0x2) == 0) {
						Static424.aShortArray109[local38] = local78;
					} else {
						Static424.aShortArray109[local38] = (short) local29.method5338();
					}
					if ((local65 & 0x4) == 0) {
						Static424.aShortArray104[local38] = local78;
					} else {
						Static424.aShortArray104[local38] = (short) local29.method5338();
					}
					Static424.aByteArray88[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static424.aShortArray110[local38] = (short) (((Static424.aShortArray110[local38] & 0xFF) << 3) + (Static424.aShortArray110[local38] >> 8 & 0x7));
						Static424.aShortArray109[local38] = (short) (((Static424.aShortArray109[local38] & 0xFF) << 3) + (Static424.aShortArray109[local38] >> 8 & 0x7));
						Static424.aShortArray104[local38] = (short) (((Static424.aShortArray104[local38] & 0xFF) << 3) + (Static424.aShortArray104[local38] >> 8 & 0x7));
						Static424.aShortArray110[local38] = (short) (Static424.aShortArray110[local38] << 3);
						Static424.aShortArray109[local38] = (short) (Static424.aShortArray109[local38] << 3);
						Static424.aShortArray104[local38] = (short) (Static424.aShortArray104[local38] << 3);
					}
					Static424.aShortArray112[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static424.aShortArray112[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean781 = true;
					} else if (local57 == 7) {
						this.aBoolean783 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean782 = true;
					}
					local38++;
				}
			}
			if (local29.anInt6812 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt7156 = local38;
			this.aShortArray106 = new short[local38];
			this.aShortArray107 = new short[local38];
			this.aShortArray103 = new short[local38];
			this.aShortArray111 = new short[local38];
			this.aShortArray108 = new short[local38];
			this.aByteArray89 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray106[local57] = Static424.aShortArray105[local57];
				this.aShortArray107[local57] = Static424.aShortArray110[local57];
				this.aShortArray103[local57] = Static424.aShortArray109[local57];
				this.aShortArray111[local57] = Static424.aShortArray104[local57];
				this.aShortArray108[local57] = Static424.aShortArray112[local57];
				this.aByteArray89[local57] = Static424.aByteArray88[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt7156 = 0;
			this.aBoolean781 = false;
			this.aBoolean783 = false;
		}
	}
}
