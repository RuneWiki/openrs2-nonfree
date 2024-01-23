import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Z")
	public boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public int anInt1 = -1;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Z")
	public boolean aBoolean2 = false;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!af;")
	public Class4_Sub2 aClass4_Sub2_1 = null;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "[S")
	public short[] aShortArray3;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "[S")
	public short[] aShortArray1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "[S")
	public short[] aShortArray4;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "[S")
	public short[] aShortArray5;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "([BLclient!af;)V")
	public Class1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub2 arg1) {
		this.aClass4_Sub2_1 = arg1;
		@Pc(21) Class4_Sub10 local21 = new Class4_Sub10(arg0);
		@Pc(26) Class4_Sub10 local26 = new Class4_Sub10(arg0);
		local21.anInt5713 = 2;
		@Pc(33) int local33 = local21.method4666();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt5713 = local21.anInt5713 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass4_Sub2_1.anIntArray11[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method4666();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static1.aShortArray9[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static1.aShortArray8[local35] = local77;
				} else {
					Static1.aShortArray8[local35] = (short) local26.method4634();
				}
				if ((local64 & 0x2) == 0) {
					Static1.aShortArray2[local35] = local77;
				} else {
					Static1.aShortArray2[local35] = (short) local26.method4634();
				}
				if ((local64 & 0x4) == 0) {
					Static1.aShortArray6[local35] = local77;
				} else {
					Static1.aShortArray6[local35] = (short) local26.method4634();
				}
				Static1.aByteArray2[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static1.aShortArray8[local35] = (short) (((Static1.aShortArray8[local35] & 0xFF) << 3) + (Static1.aShortArray8[local35] >> 8 & 0x7));
					Static1.aShortArray2[local35] = (short) (((Static1.aShortArray2[local35] & 0xFF) << 3) + (Static1.aShortArray2[local35] >> 8 & 0x7));
					Static1.aShortArray6[local35] = (short) (((Static1.aShortArray6[local35] & 0xFF) << 3) + (Static1.aShortArray6[local35] >> 8 & 0x7));
				}
				Static1.aShortArray7[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static1.aShortArray7[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean1 = true;
				} else if (local56 == 7) {
					this.aBoolean2 = true;
				}
				local35++;
			}
		}
		if (local26.anInt5713 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1 = local35;
		this.aShortArray3 = new short[local35];
		this.aShortArray10 = new short[local35];
		this.aShortArray1 = new short[local35];
		this.aShortArray4 = new short[local35];
		this.aShortArray5 = new short[local35];
		this.aByteArray1 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray3[local47] = Static1.aShortArray9[local47];
			this.aShortArray10[local47] = Static1.aShortArray8[local47];
			this.aShortArray1[local47] = Static1.aShortArray2[local47];
			this.aShortArray4[local47] = Static1.aShortArray6[local47];
			this.aShortArray5[local47] = Static1.aShortArray7[local47];
			this.aByteArray1[local47] = Static1.aByteArray2[local47];
		}
	}
}
