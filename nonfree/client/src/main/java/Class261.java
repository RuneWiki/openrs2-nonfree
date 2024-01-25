import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class261 {

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "Z")
	public boolean aBoolean537 = false;

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
	public int anInt7981 = 0;

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "Lclient!tca;")
	public Class6_Sub44 aClass6_Sub44_1 = null;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "Z")
	public boolean aBoolean538 = false;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "Z")
	public boolean aBoolean536 = false;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "[S")
	public short[] aShortArray100;

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "([BLclient!tca;)V")
	public Class261(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub44 arg1) {
		this.aClass6_Sub44_1 = arg1;
		try {
			@Pc(24) Class6_Sub40 local24 = new Class6_Sub40(arg0);
			@Pc(29) Class6_Sub40 local29 = new Class6_Sub40(arg0);
			local24.method8604();
			local24.anInt10169 += 2;
			@Pc(43) int local43 = local24.method8604();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt10169 = local24.anInt10169 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass6_Sub44_1.anIntArray570[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method8604();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static444.aShortArray101[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static444.aShortArray98[local45] = local85;
					} else {
						Static444.aShortArray98[local45] = (short) local29.method8600();
					}
					if ((local72 & 0x2) == 0) {
						Static444.aShortArray102[local45] = local85;
					} else {
						Static444.aShortArray102[local45] = (short) local29.method8600();
					}
					if ((local72 & 0x4) == 0) {
						Static444.aShortArray103[local45] = local85;
					} else {
						Static444.aShortArray103[local45] = (short) local29.method8600();
					}
					Static444.aByteArray90[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static444.aShortArray98[local45] = (short) (Static444.aShortArray98[local45] << 2 & 0x3FFF);
						Static444.aShortArray102[local45] = (short) (Static444.aShortArray102[local45] << 2 & 0x3FFF);
						Static444.aShortArray103[local45] = (short) (Static444.aShortArray103[local45] << 2 & 0x3FFF);
					}
					Static444.aShortArray107[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static444.aShortArray107[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean538 = true;
					} else if (local64 == 7) {
						this.aBoolean536 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean537 = true;
					}
					local45++;
				}
			}
			if (local29.anInt10169 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt7981 = local45;
			this.aShortArray99 = new short[local45];
			this.aShortArray106 = new short[local45];
			this.aShortArray105 = new short[local45];
			this.aShortArray104 = new short[local45];
			this.aShortArray100 = new short[local45];
			this.aByteArray91 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray99[local64] = Static444.aShortArray101[local64];
				this.aShortArray106[local64] = Static444.aShortArray98[local64];
				this.aShortArray105[local64] = Static444.aShortArray102[local64];
				this.aShortArray104[local64] = Static444.aShortArray103[local64];
				this.aShortArray100[local64] = Static444.aShortArray107[local64];
				this.aByteArray91[local64] = Static444.aByteArray90[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt7981 = 0;
			this.aBoolean538 = false;
			this.aBoolean536 = false;
		}
	}
}
