import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class61 {

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "Lclient!dg;")
	public Class1_Sub6 aClass1_Sub6_1 = null;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Z")
	public boolean aBoolean150 = false;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Z")
	public boolean aBoolean149 = false;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
	public int anInt2775 = -1;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "[S")
	public short[] aShortArray37;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "([BLclient!dg;)V")
	public Class61(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub6 arg1) {
		this.aClass1_Sub6_1 = arg1;
		@Pc(21) Class1_Sub13 local21 = new Class1_Sub13(arg0);
		@Pc(26) Class1_Sub13 local26 = new Class1_Sub13(arg0);
		local21.anInt2395 = 2;
		@Pc(33) int local33 = local21.method1772();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt2395 = local21.anInt2395 + local33;
		@Pc(54) int local54;
		for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
			local54 = this.aClass1_Sub6_1.anIntArray103[local47];
			if (local54 == 0) {
				local37 = local47;
			}
			@Pc(62) int local62 = local21.method1772();
			if (local62 > 0) {
				if (local54 == 0) {
					local39 = local47;
				}
				Static103.aShortArray43[local35] = (short) local47;
				@Pc(75) short local75 = 0;
				if (local54 == 3) {
					local75 = 128;
				}
				if ((local62 & 0x1) == 0) {
					Static103.aShortArray42[local35] = local75;
				} else {
					Static103.aShortArray42[local35] = (short) local26.method1790();
				}
				if ((local62 & 0x2) == 0) {
					Static103.aShortArray36[local35] = local75;
				} else {
					Static103.aShortArray36[local35] = (short) local26.method1790();
				}
				if ((local62 & 0x4) == 0) {
					Static103.aShortArray38[local35] = local75;
				} else {
					Static103.aShortArray38[local35] = (short) local26.method1790();
				}
				Static103.aByteArray32[local35] = (byte) (local62 >>> 3 & 0x3);
				if (local54 == 2) {
					Static103.aShortArray42[local35] = (short) (((Static103.aShortArray42[local35] & 0xFF) << 3) + (Static103.aShortArray42[local35] >> 8 & 0x7));
					Static103.aShortArray36[local35] = (short) (((Static103.aShortArray36[local35] & 0xFF) << 3) + (Static103.aShortArray36[local35] >> 8 & 0x7));
					Static103.aShortArray38[local35] = (short) (((Static103.aShortArray38[local35] & 0xFF) << 3) + (Static103.aShortArray38[local35] >> 8 & 0x7));
				}
				Static103.aShortArray40[local35] = -1;
				if (local54 == 1 || local54 == 2 || local54 == 3) {
					if (local37 > local39) {
						Static103.aShortArray40[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local54 == 5) {
					this.aBoolean149 = true;
				} else if (local54 == 7) {
					this.aBoolean150 = true;
				}
				local35++;
			}
		}
		if (local26.anInt2395 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2775 = local35;
		this.aShortArray34 = new short[local35];
		this.aShortArray35 = new short[local35];
		this.aShortArray37 = new short[local35];
		this.aShortArray39 = new short[local35];
		this.aShortArray41 = new short[local35];
		this.aByteArray33 = new byte[local35];
		for (local54 = 0; local54 < local35; local54++) {
			this.aShortArray34[local54] = Static103.aShortArray43[local54];
			this.aShortArray35[local54] = Static103.aShortArray42[local54];
			this.aShortArray37[local54] = Static103.aShortArray36[local54];
			this.aShortArray39[local54] = Static103.aShortArray38[local54];
			this.aShortArray41[local54] = Static103.aShortArray40[local54];
			this.aByteArray33[local54] = Static103.aByteArray32[local54];
		}
	}
}
