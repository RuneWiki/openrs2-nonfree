import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class20 {

	@OriginalMember(owner = "client!am", name = "j", descriptor = "Z")
	public boolean aBoolean27 = false;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	public int anInt498 = 0;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "Lclient!jo;")
	public Class6_Sub31 aClass6_Sub31_1 = null;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Z")
	public boolean aBoolean26 = false;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "[S")
	public short[] aShortArray8;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!am", name = "q", descriptor = "[S")
	public short[] aShortArray12;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "[S")
	public short[] aShortArray9;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!am", name = "n", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "([BLclient!jo;)V")
	public Class20(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub31 arg1) {
		this.aClass6_Sub31_1 = arg1;
		try {
			@Pc(24) Class6_Sub23 local24 = new Class6_Sub23(arg0);
			@Pc(29) Class6_Sub23 local29 = new Class6_Sub23(arg0);
			local24.method8374();
			local24.anInt9901 += 2;
			@Pc(43) int local43 = local24.method8374();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt9901 = local24.anInt9901 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass6_Sub31_1.anIntArray277[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method8374();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static21.aShortArray3[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static21.aShortArray4[local45] = local85;
					} else {
						Static21.aShortArray4[local45] = (short) local29.method8383();
					}
					if ((local72 & 0x2) == 0) {
						Static21.aShortArray5[local45] = local85;
					} else {
						Static21.aShortArray5[local45] = (short) local29.method8383();
					}
					if ((local72 & 0x4) == 0) {
						Static21.aShortArray11[local45] = local85;
					} else {
						Static21.aShortArray11[local45] = (short) local29.method8383();
					}
					Static21.aByteArray1[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static21.aShortArray4[local45] = (short) (Static21.aShortArray4[local45] << 2 & 0x3FFF);
						Static21.aShortArray5[local45] = (short) (Static21.aShortArray5[local45] << 2 & 0x3FFF);
						Static21.aShortArray11[local45] = (short) (Static21.aShortArray11[local45] << 2 & 0x3FFF);
					}
					Static21.aShortArray6[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static21.aShortArray6[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean28 = true;
					} else if (local64 == 7) {
						this.aBoolean26 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean27 = true;
					}
					local45++;
				}
			}
			if (local29.anInt9901 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt498 = local45;
			this.aShortArray8 = new short[local45];
			this.aShortArray7 = new short[local45];
			this.aShortArray12 = new short[local45];
			this.aShortArray9 = new short[local45];
			this.aShortArray10 = new short[local45];
			this.aByteArray2 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray8[local64] = Static21.aShortArray3[local64];
				this.aShortArray7[local64] = Static21.aShortArray4[local64];
				this.aShortArray12[local64] = Static21.aShortArray5[local64];
				this.aShortArray9[local64] = Static21.aShortArray11[local64];
				this.aShortArray10[local64] = Static21.aShortArray6[local64];
				this.aByteArray2[local64] = Static21.aByteArray1[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt498 = 0;
			this.aBoolean28 = false;
			this.aBoolean26 = false;
		}
	}
}
