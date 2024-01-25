import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class13 {

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!ah;")
	public Class6_Sub2 aClass6_Sub2_1 = null;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
	public int anInt532 = 0;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "Z")
	public boolean aBoolean57 = false;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Z")
	public boolean aBoolean56 = false;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Z")
	public boolean aBoolean58 = false;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "[S")
	public short[] aShortArray12;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "([BLclient!ah;)V")
	public Class13(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub2 arg1) {
		this.aClass6_Sub2_1 = arg1;
		try {
			@Pc(24) Class6_Sub8 local24 = new Class6_Sub8(arg0);
			@Pc(29) Class6_Sub8 local29 = new Class6_Sub8(arg0);
			local24.method8246();
			local24.anInt10061 += 2;
			@Pc(43) int local43 = local24.method8246();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt10061 = local24.anInt10061 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass6_Sub2_1.anIntArray16[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method8246();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static11.aShortArray11[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static11.aShortArray10[local45] = local85;
					} else {
						Static11.aShortArray10[local45] = (short) local29.method8256();
					}
					if ((local72 & 0x2) == 0) {
						Static11.aShortArray8[local45] = local85;
					} else {
						Static11.aShortArray8[local45] = (short) local29.method8256();
					}
					if ((local72 & 0x4) == 0) {
						Static11.aShortArray6[local45] = local85;
					} else {
						Static11.aShortArray6[local45] = (short) local29.method8256();
					}
					Static11.aByteArray2[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static11.aShortArray10[local45] = (short) (Static11.aShortArray10[local45] << 2 & 0x3FFF);
						Static11.aShortArray8[local45] = (short) (Static11.aShortArray8[local45] << 2 & 0x3FFF);
						Static11.aShortArray6[local45] = (short) (Static11.aShortArray6[local45] << 2 & 0x3FFF);
					}
					Static11.aShortArray9[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static11.aShortArray9[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean57 = true;
					} else if (local64 == 7) {
						this.aBoolean58 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean56 = true;
					}
					local45++;
				}
			}
			if (local29.anInt10061 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt532 = local45;
			this.aShortArray15 = new short[local45];
			this.aShortArray7 = new short[local45];
			this.aShortArray12 = new short[local45];
			this.aShortArray13 = new short[local45];
			this.aShortArray14 = new short[local45];
			this.aByteArray3 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray15[local64] = Static11.aShortArray11[local64];
				this.aShortArray7[local64] = Static11.aShortArray10[local64];
				this.aShortArray12[local64] = Static11.aShortArray8[local64];
				this.aShortArray13[local64] = Static11.aShortArray6[local64];
				this.aShortArray14[local64] = Static11.aShortArray9[local64];
				this.aByteArray3[local64] = Static11.aByteArray2[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt532 = 0;
			this.aBoolean57 = false;
			this.aBoolean58 = false;
		}
	}
}
