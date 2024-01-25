import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class337 {

	@OriginalMember(owner = "client!so", name = "g", descriptor = "Lclient!jf;")
	public Class14_Sub22 aClass14_Sub22_1 = null;

	@OriginalMember(owner = "client!so", name = "m", descriptor = "I")
	public int anInt9428 = 0;

	@OriginalMember(owner = "client!so", name = "e", descriptor = "Z")
	public boolean aBoolean652 = false;

	@OriginalMember(owner = "client!so", name = "p", descriptor = "Z")
	public boolean aBoolean651 = false;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "Z")
	public boolean aBoolean653 = false;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "[S")
	public short[] aShortArray124;

	@OriginalMember(owner = "client!so", name = "d", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "[S")
	public short[] aShortArray120;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "[S")
	public short[] aShortArray123;

	@OriginalMember(owner = "client!so", name = "i", descriptor = "[S")
	public short[] aShortArray126;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "[B")
	public byte[] aByteArray101;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "([BLclient!jf;)V")
	public Class337(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		this.aClass14_Sub22_1 = arg1;
		try {
			@Pc(24) Class14_Sub21 local24 = new Class14_Sub21(arg0);
			@Pc(29) Class14_Sub21 local29 = new Class14_Sub21(arg0);
			local24.method7695(111);
			local24.anInt8936 += 2;
			@Pc(43) int local43 = local24.method7695(112);
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt8936 = local24.anInt8936 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass14_Sub22_1.anIntArray285[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method7695(109);
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static568.aShortArray121[local45] = (short) local57;
					@Pc(87) short local87 = 0;
					if (local64 == 3 || local64 == 10) {
						local87 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static568.aShortArray122[local45] = local87;
					} else {
						Static568.aShortArray122[local45] = (short) local29.method7753();
					}
					if ((local72 & 0x2) == 0) {
						Static568.aShortArray125[local45] = local87;
					} else {
						Static568.aShortArray125[local45] = (short) local29.method7753();
					}
					if ((local72 & 0x4) == 0) {
						Static568.aShortArray128[local45] = local87;
					} else {
						Static568.aShortArray128[local45] = (short) local29.method7753();
					}
					Static568.aByteArray102[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static568.aShortArray122[local45] = (short) (Static568.aShortArray122[local45] << 2 & 0x3FFF);
						Static568.aShortArray125[local45] = (short) (Static568.aShortArray125[local45] << 2 & 0x3FFF);
						Static568.aShortArray128[local45] = (short) (Static568.aShortArray128[local45] << 2 & 0x3FFF);
					}
					Static568.aShortArray127[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static568.aShortArray127[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean653 = true;
					} else if (local64 == 7) {
						this.aBoolean651 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean652 = true;
					}
					local45++;
				}
			}
			if (local29.anInt8936 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt9428 = local45;
			this.aShortArray124 = new short[local45];
			this.aShortArray129 = new short[local45];
			this.aShortArray120 = new short[local45];
			this.aShortArray123 = new short[local45];
			this.aShortArray126 = new short[local45];
			this.aByteArray101 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray124[local64] = Static568.aShortArray121[local64];
				this.aShortArray129[local64] = Static568.aShortArray122[local64];
				this.aShortArray120[local64] = Static568.aShortArray125[local64];
				this.aShortArray123[local64] = Static568.aShortArray128[local64];
				this.aShortArray126[local64] = Static568.aShortArray127[local64];
				this.aByteArray101[local64] = Static568.aByteArray102[local64];
			}
		} catch (@Pc(359) Exception local359) {
			this.anInt9428 = 0;
			this.aBoolean653 = false;
			this.aBoolean651 = false;
		}
	}
}
