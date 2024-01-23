import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class117 {

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Z")
	public boolean aBoolean266 = false;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "Lclient!cc;")
	public Class2_Sub9 aClass2_Sub9_1 = null;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "I")
	public int anInt3912 = -1;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
	public boolean aBoolean265 = false;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "([BLclient!cc;)V")
	public Class117(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub9 arg1) {
		this.aClass2_Sub9_1 = arg1;
		@Pc(21) Class2_Sub16 local21 = new Class2_Sub16(arg0);
		@Pc(26) Class2_Sub16 local26 = new Class2_Sub16(arg0);
		local21.anInt2789 = 2;
		@Pc(33) int local33 = local21.method2146();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt2789 = local21.anInt2789 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass2_Sub9_1.anIntArray75[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method2146();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static181.aShortArray52[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static181.aShortArray54[local35] = local77;
				} else {
					Static181.aShortArray54[local35] = (short) local26.method2174();
				}
				if ((local64 & 0x2) == 0) {
					Static181.aShortArray53[local35] = local77;
				} else {
					Static181.aShortArray53[local35] = (short) local26.method2174();
				}
				if ((local64 & 0x4) == 0) {
					Static181.aShortArray56[local35] = local77;
				} else {
					Static181.aShortArray56[local35] = (short) local26.method2174();
				}
				Static181.aByteArray39[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static181.aShortArray54[local35] = (short) (((Static181.aShortArray54[local35] & 0xFF) << 3) + (Static181.aShortArray54[local35] >> 8 & 0x7));
					Static181.aShortArray53[local35] = (short) (((Static181.aShortArray53[local35] & 0xFF) << 3) + (Static181.aShortArray53[local35] >> 8 & 0x7));
					Static181.aShortArray56[local35] = (short) (((Static181.aShortArray56[local35] & 0xFF) << 3) + (Static181.aShortArray56[local35] >> 8 & 0x7));
				}
				Static181.aShortArray55[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static181.aShortArray55[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean265 = true;
				} else if (local56 == 7) {
					this.aBoolean266 = true;
				}
				local35++;
			}
		}
		if (local26.anInt2789 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3912 = local35;
		this.aShortArray48 = new short[local35];
		this.aShortArray49 = new short[local35];
		this.aShortArray57 = new short[local35];
		this.aShortArray51 = new short[local35];
		this.aShortArray50 = new short[local35];
		this.aByteArray40 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray48[local47] = Static181.aShortArray52[local47];
			this.aShortArray49[local47] = Static181.aShortArray54[local47];
			this.aShortArray57[local47] = Static181.aShortArray53[local47];
			this.aShortArray51[local47] = Static181.aShortArray56[local47];
			this.aShortArray50[local47] = Static181.aShortArray55[local47];
			this.aByteArray40[local47] = Static181.aByteArray39[local47];
		}
	}
}
