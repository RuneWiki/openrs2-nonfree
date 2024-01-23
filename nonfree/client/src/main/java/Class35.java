import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class35 {

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!ki;")
	public Class1_Sub12 aClass1_Sub12_1 = null;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Z")
	public boolean aBoolean67 = false;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public int anInt834 = -1;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "[S")
	public short[] aShortArray2;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "[S")
	public short[] aShortArray4;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "[S")
	public short[] aShortArray1;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "[S")
	public short[] aShortArray8;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([BLclient!ki;)V")
	public Class35(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub12 arg1) {
		this.aClass1_Sub12_1 = arg1;
		@Pc(21) Class1_Sub14 local21 = new Class1_Sub14(arg0);
		@Pc(26) Class1_Sub14 local26 = new Class1_Sub14(arg0);
		local21.anInt3290 = 2;
		@Pc(33) int local33 = local21.method2595();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt3290 = local21.anInt3290 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass1_Sub12_1.anIntArray236[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method2595();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static43.aShortArray9[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static43.aShortArray7[local35] = local77;
				} else {
					Static43.aShortArray7[local35] = (short) local26.method2590();
				}
				if ((local64 & 0x2) == 0) {
					Static43.aShortArray5[local35] = local77;
				} else {
					Static43.aShortArray5[local35] = (short) local26.method2590();
				}
				if ((local64 & 0x4) == 0) {
					Static43.aShortArray6[local35] = local77;
				} else {
					Static43.aShortArray6[local35] = (short) local26.method2590();
				}
				Static43.aByteArray6[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static43.aShortArray7[local35] = (short) (((Static43.aShortArray7[local35] & 0xFF) << 3) + (Static43.aShortArray7[local35] >> 8 & 0x7));
					Static43.aShortArray5[local35] = (short) (((Static43.aShortArray5[local35] & 0xFF) << 3) + (Static43.aShortArray5[local35] >> 8 & 0x7));
					Static43.aShortArray6[local35] = (short) (((Static43.aShortArray6[local35] & 0xFF) << 3) + (Static43.aShortArray6[local35] >> 8 & 0x7));
				}
				Static43.aShortArray3[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static43.aShortArray3[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean67 = true;
				} else if (local56 == 7) {
					this.aBoolean66 = true;
				}
				local35++;
			}
		}
		if (local26.anInt3290 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt834 = local35;
		this.aShortArray2 = new short[local35];
		this.aShortArray10 = new short[local35];
		this.aShortArray4 = new short[local35];
		this.aShortArray1 = new short[local35];
		this.aShortArray8 = new short[local35];
		this.aByteArray7 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray2[local47] = Static43.aShortArray9[local47];
			this.aShortArray10[local47] = Static43.aShortArray7[local47];
			this.aShortArray4[local47] = Static43.aShortArray5[local47];
			this.aShortArray1[local47] = Static43.aShortArray6[local47];
			this.aShortArray8[local47] = Static43.aShortArray3[local47];
			this.aByteArray7[local47] = Static43.aByteArray6[local47];
		}
	}
}
