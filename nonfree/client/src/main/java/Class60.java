import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class60 {

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "Z")
	public boolean aBoolean138 = false;

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "Lclient!ed;")
	public Class3_Sub17 aClass3_Sub17_1 = null;

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
	public int anInt2091 = 0;

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "([BLclient!ed;)V")
	public Class60(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub17 arg1) {
		this.aClass3_Sub17_1 = arg1;
		try {
			@Pc(24) Class3_Sub3 local24 = new Class3_Sub3(arg0);
			@Pc(29) Class3_Sub3 local29 = new Class3_Sub3(arg0);
			local24.method4225();
			local24.anInt4736 += 2;
			@Pc(43) int local43 = local24.method4225();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt4736 = local24.anInt4736 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass3_Sub17_1.anIntArray106[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method4225();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static84.aShortArray23[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static84.aShortArray19[local45] = local85;
					} else {
						Static84.aShortArray19[local45] = (short) local29.method4264();
					}
					if ((local72 & 0x2) == 0) {
						Static84.aShortArray17[local45] = local85;
					} else {
						Static84.aShortArray17[local45] = (short) local29.method4264();
					}
					if ((local72 & 0x4) == 0) {
						Static84.aShortArray24[local45] = local85;
					} else {
						Static84.aShortArray24[local45] = (short) local29.method4264();
					}
					Static84.aByteArray10[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static84.aShortArray19[local45] = (short) (Static84.aShortArray19[local45] << 2 & 0x3FFF);
						Static84.aShortArray17[local45] = (short) (Static84.aShortArray17[local45] << 2 & 0x3FFF);
						Static84.aShortArray24[local45] = (short) (Static84.aShortArray24[local45] << 2 & 0x3FFF);
					}
					Static84.aShortArray20[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static84.aShortArray20[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean139 = true;
					} else if (local64 == 7) {
						this.aBoolean138 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean140 = true;
					}
					local45++;
				}
			}
			if (local29.anInt4736 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt2091 = local45;
			this.aShortArray16 = new short[local45];
			this.aShortArray22 = new short[local45];
			this.aShortArray18 = new short[local45];
			this.aShortArray15 = new short[local45];
			this.aShortArray21 = new short[local45];
			this.aByteArray9 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray16[local64] = Static84.aShortArray23[local64];
				this.aShortArray22[local64] = Static84.aShortArray19[local64];
				this.aShortArray18[local64] = Static84.aShortArray17[local64];
				this.aShortArray15[local64] = Static84.aShortArray24[local64];
				this.aShortArray21[local64] = Static84.aShortArray20[local64];
				this.aByteArray9[local64] = Static84.aByteArray10[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt2091 = 0;
			this.aBoolean139 = false;
			this.aBoolean138 = false;
		}
	}
}
