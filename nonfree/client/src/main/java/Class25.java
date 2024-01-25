import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class25 {

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!aw", name = "n", descriptor = "I")
	public int anInt541 = 0;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "Lclient!vca;")
	public Class2_Sub51 aClass2_Sub51_1 = null;

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!aw", name = "q", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!aw", name = "j", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!aw", name = "m", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!aw", name = "o", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "([BLclient!vca;)V")
	public Class25(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub51 arg1) {
		this.aClass2_Sub51_1 = arg1;
		try {
			@Pc(24) Class2_Sub8 local24 = new Class2_Sub8(arg0);
			@Pc(29) Class2_Sub8 local29 = new Class2_Sub8(arg0);
			local24.method5203();
			local24.anInt5725 += 2;
			@Pc(43) int local43 = local24.method5203();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt5725 = local24.anInt5725 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass2_Sub51_1.anIntArray564[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method5203();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static33.aShortArray20[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static33.aShortArray25[local45] = local85;
					} else {
						Static33.aShortArray25[local45] = (short) local29.method5219();
					}
					if ((local72 & 0x2) == 0) {
						Static33.aShortArray26[local45] = local85;
					} else {
						Static33.aShortArray26[local45] = (short) local29.method5219();
					}
					if ((local72 & 0x4) == 0) {
						Static33.aShortArray22[local45] = local85;
					} else {
						Static33.aShortArray22[local45] = (short) local29.method5219();
					}
					Static33.aByteArray11[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static33.aShortArray25[local45] = (short) (Static33.aShortArray25[local45] << 2 & 0x3FFF);
						Static33.aShortArray26[local45] = (short) (Static33.aShortArray26[local45] << 2 & 0x3FFF);
						Static33.aShortArray22[local45] = (short) (Static33.aShortArray22[local45] << 2 & 0x3FFF);
					}
					Static33.aShortArray18[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static33.aShortArray18[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean29 = true;
					} else if (local64 == 7) {
						this.aBoolean30 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean31 = true;
					}
					local45++;
				}
			}
			if (local29.anInt5725 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt541 = local45;
			this.aShortArray23 = new short[local45];
			this.aShortArray24 = new short[local45];
			this.aShortArray21 = new short[local45];
			this.aShortArray27 = new short[local45];
			this.aShortArray19 = new short[local45];
			this.aByteArray12 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray23[local64] = Static33.aShortArray20[local64];
				this.aShortArray24[local64] = Static33.aShortArray25[local64];
				this.aShortArray21[local64] = Static33.aShortArray26[local64];
				this.aShortArray27[local64] = Static33.aShortArray22[local64];
				this.aShortArray19[local64] = Static33.aShortArray18[local64];
				this.aByteArray12[local64] = Static33.aByteArray11[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt541 = 0;
			this.aBoolean29 = false;
			this.aBoolean30 = false;
		}
	}
}
