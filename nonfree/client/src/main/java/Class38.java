import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class38 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
	public int anInt1340 = -1;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "Lclient!dj;")
	public Class1_Sub6 aClass1_Sub6_1 = null;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "Z")
	public boolean aBoolean78 = false;

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "Z")
	public boolean aBoolean79 = false;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([BLclient!dj;)V")
	public Class38(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub6 arg1) {
		this.aClass1_Sub6_1 = arg1;
		@Pc(21) Class1_Sub16 local21 = new Class1_Sub16(arg0);
		@Pc(26) Class1_Sub16 local26 = new Class1_Sub16(arg0);
		local21.anInt3328 = 2;
		@Pc(33) int local33 = local21.method2655();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt3328 = local21.anInt3328 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass1_Sub6_1.anIntArray141[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method2655();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static47.aShortArray32[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static47.aShortArray34[local35] = local77;
				} else {
					Static47.aShortArray34[local35] = (short) local26.method2658();
				}
				if ((local64 & 0x2) == 0) {
					Static47.aShortArray37[local35] = local77;
				} else {
					Static47.aShortArray37[local35] = (short) local26.method2658();
				}
				if ((local64 & 0x4) == 0) {
					Static47.aShortArray30[local35] = local77;
				} else {
					Static47.aShortArray30[local35] = (short) local26.method2658();
				}
				Static47.aByteArray11[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static47.aShortArray34[local35] = (short) (((Static47.aShortArray34[local35] & 0xFF) << 3) + (Static47.aShortArray34[local35] >> 8 & 0x7));
					Static47.aShortArray37[local35] = (short) (((Static47.aShortArray37[local35] & 0xFF) << 3) + (Static47.aShortArray37[local35] >> 8 & 0x7));
					Static47.aShortArray30[local35] = (short) (((Static47.aShortArray30[local35] & 0xFF) << 3) + (Static47.aShortArray30[local35] >> 8 & 0x7));
				}
				Static47.aShortArray31[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static47.aShortArray31[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean79 = true;
				} else if (local56 == 7) {
					this.aBoolean78 = true;
				}
				local35++;
			}
		}
		if (local26.anInt3328 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1340 = local35;
		this.aShortArray36 = new short[local35];
		this.aShortArray39 = new short[local35];
		this.aShortArray38 = new short[local35];
		this.aShortArray35 = new short[local35];
		this.aShortArray33 = new short[local35];
		this.aByteArray12 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray36[local47] = Static47.aShortArray32[local47];
			this.aShortArray39[local47] = Static47.aShortArray34[local47];
			this.aShortArray38[local47] = Static47.aShortArray37[local47];
			this.aShortArray35[local47] = Static47.aShortArray30[local47];
			this.aShortArray33[local47] = Static47.aShortArray31[local47];
			this.aByteArray12[local47] = Static47.aByteArray11[local47];
		}
	}
}
