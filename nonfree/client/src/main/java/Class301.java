import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class301 {

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "Z")
	public boolean aBoolean607 = false;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "Z")
	public boolean aBoolean608 = false;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Z")
	public boolean aBoolean606 = false;

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "Lclient!kk;")
	public Class2_Sub25 aClass2_Sub25_1 = null;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
	public int anInt8080 = 0;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "[S")
	public short[] aShortArray126;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "[S")
	public short[] aShortArray128;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "[S")
	public short[] aShortArray125;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "[S")
	public short[] aShortArray124;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "[B")
	public byte[] aByteArray96;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "([BLclient!kk;)V")
	public Class301(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub25 arg1) {
		this.aClass2_Sub25_1 = arg1;
		try {
			@Pc(24) Class2_Sub22 local24 = new Class2_Sub22(arg0);
			@Pc(29) Class2_Sub22 local29 = new Class2_Sub22(arg0);
			local24.method8547();
			local24.anInt10247 += 2;
			@Pc(43) int local43 = local24.method8547();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt10247 = local24.anInt10247 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass2_Sub25_1.anIntArray327[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method8547();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static492.aShortArray127[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static492.aShortArray131[local45] = local85;
					} else {
						Static492.aShortArray131[local45] = (short) local29.method8536();
					}
					if ((local72 & 0x2) == 0) {
						Static492.aShortArray130[local45] = local85;
					} else {
						Static492.aShortArray130[local45] = (short) local29.method8536();
					}
					if ((local72 & 0x4) == 0) {
						Static492.aShortArray123[local45] = local85;
					} else {
						Static492.aShortArray123[local45] = (short) local29.method8536();
					}
					Static492.aByteArray95[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static492.aShortArray131[local45] = (short) (Static492.aShortArray131[local45] << 2 & 0x3FFF);
						Static492.aShortArray130[local45] = (short) (Static492.aShortArray130[local45] << 2 & 0x3FFF);
						Static492.aShortArray123[local45] = (short) (Static492.aShortArray123[local45] << 2 & 0x3FFF);
					}
					Static492.aShortArray132[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static492.aShortArray132[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean607 = true;
					} else if (local64 == 7) {
						this.aBoolean606 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean608 = true;
					}
					local45++;
				}
			}
			if (local29.anInt10247 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt8080 = local45;
			this.aShortArray129 = new short[local45];
			this.aShortArray126 = new short[local45];
			this.aShortArray128 = new short[local45];
			this.aShortArray125 = new short[local45];
			this.aShortArray124 = new short[local45];
			this.aByteArray96 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray129[local64] = Static492.aShortArray127[local64];
				this.aShortArray126[local64] = Static492.aShortArray131[local64];
				this.aShortArray128[local64] = Static492.aShortArray130[local64];
				this.aShortArray125[local64] = Static492.aShortArray123[local64];
				this.aShortArray124[local64] = Static492.aShortArray132[local64];
				this.aByteArray96[local64] = Static492.aByteArray95[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt8080 = 0;
			this.aBoolean607 = false;
			this.aBoolean606 = false;
		}
	}
}
