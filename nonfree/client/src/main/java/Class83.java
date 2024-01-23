import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class83 {

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!co;")
	public Class3_Sub6 aClass3_Sub6_1 = null;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Z")
	public boolean aBoolean186 = false;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	public int anInt2450 = -1;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([BLclient!co;)V")
	public Class83(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub6 arg1) {
		this.aClass3_Sub6_1 = arg1;
		@Pc(21) Class3_Sub26 local21 = new Class3_Sub26(arg0);
		@Pc(26) Class3_Sub26 local26 = new Class3_Sub26(arg0);
		local21.anInt4615 = 2;
		@Pc(33) int local33 = local21.method3915();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt4615 = local21.anInt4615 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass3_Sub6_1.anIntArray67[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method3915();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static127.aShortArray55[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static127.aShortArray57[local35] = local77;
				} else {
					Static127.aShortArray57[local35] = (short) local26.method3937();
				}
				if ((local64 & 0x2) == 0) {
					Static127.aShortArray58[local35] = local77;
				} else {
					Static127.aShortArray58[local35] = (short) local26.method3937();
				}
				if ((local64 & 0x4) == 0) {
					Static127.aShortArray61[local35] = local77;
				} else {
					Static127.aShortArray61[local35] = (short) local26.method3937();
				}
				Static127.aByteArray36[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static127.aShortArray57[local35] = (short) (((Static127.aShortArray57[local35] & 0xFF) << 3) + (Static127.aShortArray57[local35] >> 8 & 0x7));
					Static127.aShortArray58[local35] = (short) (((Static127.aShortArray58[local35] & 0xFF) << 3) + (Static127.aShortArray58[local35] >> 8 & 0x7));
					Static127.aShortArray61[local35] = (short) (((Static127.aShortArray61[local35] & 0xFF) << 3) + (Static127.aShortArray61[local35] >> 8 & 0x7));
				}
				Static127.aShortArray60[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static127.aShortArray60[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean186 = true;
				} else if (local56 == 7) {
					this.aBoolean187 = true;
				}
				local35++;
			}
		}
		if (local26.anInt4615 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2450 = local35;
		this.aShortArray56 = new short[local35];
		this.aShortArray53 = new short[local35];
		this.aShortArray59 = new short[local35];
		this.aShortArray54 = new short[local35];
		this.aShortArray52 = new short[local35];
		this.aByteArray37 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray56[local47] = Static127.aShortArray55[local47];
			this.aShortArray53[local47] = Static127.aShortArray57[local47];
			this.aShortArray59[local47] = Static127.aShortArray58[local47];
			this.aShortArray54[local47] = Static127.aShortArray61[local47];
			this.aShortArray52[local47] = Static127.aShortArray60[local47];
			this.aByteArray37[local47] = Static127.aByteArray36[local47];
		}
	}
}
