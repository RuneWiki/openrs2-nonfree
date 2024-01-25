import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class342 {

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	public int anInt9372 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Z")
	public boolean aBoolean656 = false;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Z")
	public boolean aBoolean657 = false;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Lclient!mf;")
	public Class6_Sub35 aClass6_Sub35_1 = null;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Z")
	public boolean aBoolean658 = false;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "[S")
	public short[] aShortArray153;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "[S")
	public short[] aShortArray147;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "[S")
	public short[] aShortArray149;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "[S")
	public short[] aShortArray146;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "[S")
	public short[] aShortArray154;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "[B")
	public byte[] aByteArray124;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "([BLclient!mf;)V")
	public Class342(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub35 arg1) {
		this.aClass6_Sub35_1 = arg1;
		try {
			@Pc(24) Class6_Sub14 local24 = new Class6_Sub14(arg0);
			@Pc(29) Class6_Sub14 local29 = new Class6_Sub14(arg0);
			local24.method6041();
			local24.anInt7244 += 2;
			@Pc(43) int local43 = local24.method6041();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt7244 = local24.anInt7244 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass6_Sub35_1.anIntArray510[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method6041();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static561.aShortArray155[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static561.aShortArray151[local45] = local85;
					} else {
						Static561.aShortArray151[local45] = (short) local29.method6015();
					}
					if ((local72 & 0x2) == 0) {
						Static561.aShortArray152[local45] = local85;
					} else {
						Static561.aShortArray152[local45] = (short) local29.method6015();
					}
					if ((local72 & 0x4) == 0) {
						Static561.aShortArray150[local45] = local85;
					} else {
						Static561.aShortArray150[local45] = (short) local29.method6015();
					}
					Static561.aByteArray123[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static561.aShortArray151[local45] = (short) (Static561.aShortArray151[local45] << 2 & 0x3FFF);
						Static561.aShortArray152[local45] = (short) (Static561.aShortArray152[local45] << 2 & 0x3FFF);
						Static561.aShortArray150[local45] = (short) (Static561.aShortArray150[local45] << 2 & 0x3FFF);
					}
					Static561.aShortArray148[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static561.aShortArray148[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean656 = true;
					} else if (local64 == 7) {
						this.aBoolean658 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean657 = true;
					}
					local45++;
				}
			}
			if (local29.anInt7244 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt9372 = local45;
			this.aShortArray153 = new short[local45];
			this.aShortArray147 = new short[local45];
			this.aShortArray149 = new short[local45];
			this.aShortArray146 = new short[local45];
			this.aShortArray154 = new short[local45];
			this.aByteArray124 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray153[local64] = Static561.aShortArray155[local64];
				this.aShortArray147[local64] = Static561.aShortArray151[local64];
				this.aShortArray149[local64] = Static561.aShortArray152[local64];
				this.aShortArray146[local64] = Static561.aShortArray150[local64];
				this.aShortArray154[local64] = Static561.aShortArray148[local64];
				this.aByteArray124[local64] = Static561.aByteArray123[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt9372 = 0;
			this.aBoolean656 = false;
			this.aBoolean658 = false;
		}
	}
}
