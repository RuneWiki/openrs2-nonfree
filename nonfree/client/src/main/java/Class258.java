import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class258 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	public int anInt7400 = 0;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Z")
	public boolean aBoolean502 = false;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Z")
	public boolean aBoolean501 = false;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!od;")
	public Class6_Sub32 aClass6_Sub32_1 = null;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Z")
	public boolean aBoolean503 = false;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "[S")
	public short[] aShortArray128;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "[S")
	public short[] aShortArray130;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "[S")
	public short[] aShortArray126;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "[S")
	public short[] aShortArray123;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([BLclient!od;)V")
	public Class258(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub32 arg1) {
		this.aClass6_Sub32_1 = arg1;
		try {
			@Pc(24) Class6_Sub12 local24 = new Class6_Sub12(arg0);
			@Pc(29) Class6_Sub12 local29 = new Class6_Sub12(arg0);
			local24.method6019();
			local24.anInt7556 += 2;
			@Pc(43) int local43 = local24.method6019();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt7556 = local24.anInt7556 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass6_Sub32_1.anIntArray469[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method6019();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static414.aShortArray127[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static414.aShortArray131[local45] = local85;
					} else {
						Static414.aShortArray131[local45] = (short) local29.method6010();
					}
					if ((local72 & 0x2) == 0) {
						Static414.aShortArray125[local45] = local85;
					} else {
						Static414.aShortArray125[local45] = (short) local29.method6010();
					}
					if ((local72 & 0x4) == 0) {
						Static414.aShortArray122[local45] = local85;
					} else {
						Static414.aShortArray122[local45] = (short) local29.method6010();
					}
					Static414.aByteArray95[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static414.aShortArray131[local45] = (short) (Static414.aShortArray131[local45] << 2 & 0x3FFF);
						Static414.aShortArray125[local45] = (short) (Static414.aShortArray125[local45] << 2 & 0x3FFF);
						Static414.aShortArray122[local45] = (short) (Static414.aShortArray122[local45] << 2 & 0x3FFF);
					}
					Static414.aShortArray124[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static414.aShortArray124[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean501 = true;
					} else if (local64 == 7) {
						this.aBoolean503 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean502 = true;
					}
					local45++;
				}
			}
			if (local29.anInt7556 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt7400 = local45;
			this.aShortArray128 = new short[local45];
			this.aShortArray130 = new short[local45];
			this.aShortArray129 = new short[local45];
			this.aShortArray126 = new short[local45];
			this.aShortArray123 = new short[local45];
			this.aByteArray94 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray128[local64] = Static414.aShortArray127[local64];
				this.aShortArray130[local64] = Static414.aShortArray131[local64];
				this.aShortArray129[local64] = Static414.aShortArray125[local64];
				this.aShortArray126[local64] = Static414.aShortArray122[local64];
				this.aShortArray123[local64] = Static414.aShortArray124[local64];
				this.aByteArray94[local64] = Static414.aByteArray95[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt7400 = 0;
			this.aBoolean501 = false;
			this.aBoolean503 = false;
		}
	}
}
