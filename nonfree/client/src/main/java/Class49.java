import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class49 {

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public int anInt1765 = 0;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Z")
	public boolean aBoolean174 = false;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Lclient!uf;")
	public Class1_Sub36 aClass1_Sub36_1 = null;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([BLclient!uf;)V")
	public Class49(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub36 arg1) {
		this.aClass1_Sub36_1 = arg1;
		try {
			@Pc(21) Class1_Sub8 local21 = new Class1_Sub8(arg0);
			@Pc(26) Class1_Sub8 local26 = new Class1_Sub8(arg0);
			local21.anInt5182 = 2;
			@Pc(33) int local33 = local21.method4532();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt5182 = local21.anInt5182 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass1_Sub36_1.anIntArray501[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method4532();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static61.aShortArray15[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static61.aShortArray20[local35] = local75;
					} else {
						Static61.aShortArray20[local35] = (short) local26.method4522();
					}
					if ((local62 & 0x2) == 0) {
						Static61.aShortArray14[local35] = local75;
					} else {
						Static61.aShortArray14[local35] = (short) local26.method4522();
					}
					if ((local62 & 0x4) == 0) {
						Static61.aShortArray17[local35] = local75;
					} else {
						Static61.aShortArray17[local35] = (short) local26.method4522();
					}
					Static61.aByteArray24[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static61.aShortArray20[local35] = (short) (((Static61.aShortArray20[local35] & 0xFF) << 3) + (Static61.aShortArray20[local35] >> 8 & 0x7));
						Static61.aShortArray14[local35] = (short) (((Static61.aShortArray14[local35] & 0xFF) << 3) + (Static61.aShortArray14[local35] >> 8 & 0x7));
						Static61.aShortArray17[local35] = (short) (((Static61.aShortArray17[local35] & 0xFF) << 3) + (Static61.aShortArray17[local35] >> 8 & 0x7));
						Static61.aShortArray20[local35] = (short) (Static61.aShortArray20[local35] << 3);
						Static61.aShortArray14[local35] = (short) (Static61.aShortArray14[local35] << 3);
						Static61.aShortArray17[local35] = (short) (Static61.aShortArray17[local35] << 3);
					}
					Static61.aShortArray13[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static61.aShortArray13[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean174 = true;
					} else if (local54 == 7) {
						this.aBoolean175 = true;
					}
					local35++;
				}
			}
			if (local26.anInt5182 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt1765 = local35;
			this.aShortArray22 = new short[local35];
			this.aShortArray16 = new short[local35];
			this.aShortArray21 = new short[local35];
			this.aShortArray18 = new short[local35];
			this.aShortArray19 = new short[local35];
			this.aByteArray23 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray22[local54] = Static61.aShortArray15[local54];
				this.aShortArray16[local54] = Static61.aShortArray20[local54];
				this.aShortArray21[local54] = Static61.aShortArray14[local54];
				this.aShortArray18[local54] = Static61.aShortArray17[local54];
				this.aShortArray19[local54] = Static61.aShortArray13[local54];
				this.aByteArray23[local54] = Static61.aByteArray24[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt1765 = 0;
			this.aBoolean174 = false;
			this.aBoolean175 = false;
		}
	}
}
