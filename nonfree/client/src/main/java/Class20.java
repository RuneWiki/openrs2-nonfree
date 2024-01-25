import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class20 {

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "Z")
	public boolean aBoolean39 = false;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
	public int anInt520 = 0;

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "Z")
	public boolean aBoolean40 = false;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "Lclient!wha;")
	public Class3_Sub55 aClass3_Sub55_1 = null;

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "Z")
	public boolean aBoolean41 = false;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "[S")
	public short[] aShortArray9;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "[S")
	public short[] aShortArray12;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "([BLclient!wha;)V")
	public Class20(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		this.aClass3_Sub55_1 = arg1;
		try {
			@Pc(24) Class3_Sub25 local24 = new Class3_Sub25(arg0);
			@Pc(29) Class3_Sub25 local29 = new Class3_Sub25(arg0);
			local24.method8632();
			local24.anInt9765 += 2;
			@Pc(43) int local43 = local24.method8632();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt9765 = local24.anInt9765 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass3_Sub55_1.anIntArray935[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method8632();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static23.aShortArray18[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static23.aShortArray16[local45] = local85;
					} else {
						Static23.aShortArray16[local45] = (short) local29.method8591();
					}
					if ((local72 & 0x2) == 0) {
						Static23.aShortArray10[local45] = local85;
					} else {
						Static23.aShortArray10[local45] = (short) local29.method8591();
					}
					if ((local72 & 0x4) == 0) {
						Static23.aShortArray11[local45] = local85;
					} else {
						Static23.aShortArray11[local45] = (short) local29.method8591();
					}
					Static23.aByteArray3[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static23.aShortArray16[local45] = (short) (Static23.aShortArray16[local45] << 2 & 0x3FFF);
						Static23.aShortArray10[local45] = (short) (Static23.aShortArray10[local45] << 2 & 0x3FFF);
						Static23.aShortArray11[local45] = (short) (Static23.aShortArray11[local45] << 2 & 0x3FFF);
					}
					Static23.aShortArray17[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static23.aShortArray17[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean41 = true;
					} else if (local64 == 7) {
						this.aBoolean40 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean39 = true;
					}
					local45++;
				}
			}
			if (local29.anInt9765 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt520 = local45;
			this.aShortArray9 = new short[local45];
			this.aShortArray12 = new short[local45];
			this.aShortArray14 = new short[local45];
			this.aShortArray15 = new short[local45];
			this.aShortArray13 = new short[local45];
			this.aByteArray4 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray9[local64] = Static23.aShortArray18[local64];
				this.aShortArray12[local64] = Static23.aShortArray16[local64];
				this.aShortArray14[local64] = Static23.aShortArray10[local64];
				this.aShortArray15[local64] = Static23.aShortArray11[local64];
				this.aShortArray13[local64] = Static23.aShortArray17[local64];
				this.aByteArray4[local64] = Static23.aByteArray3[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt520 = 0;
			this.aBoolean41 = false;
			this.aBoolean40 = false;
		}
	}
}
