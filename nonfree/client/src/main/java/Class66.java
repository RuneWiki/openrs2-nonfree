import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class66 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
	public int anInt1638 = 0;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "Lclient!mf;")
	public Class2_Sub39 aClass2_Sub39_1 = null;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "Z")
	public boolean aBoolean192 = false;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "Z")
	public boolean aBoolean194 = false;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "Z")
	public boolean aBoolean193 = false;

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "([BLclient!mf;)V")
	public Class66(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub39 arg1) {
		this.aClass2_Sub39_1 = arg1;
		try {
			@Pc(24) Class2_Sub20 local24 = new Class2_Sub20(arg0);
			@Pc(29) Class2_Sub20 local29 = new Class2_Sub20(arg0);
			local24.method8581(-17416);
			local24.anInt9723 += 2;
			@Pc(43) int local43 = local24.method8581(-17416);
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt9723 = local24.anInt9723 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass2_Sub39_1.anIntArray451[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method8581(-17416);
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static92.aShortArray25[local45] = (short) local57;
					@Pc(87) short local87 = 0;
					if (local64 == 3 || local64 == 10) {
						local87 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static92.aShortArray21[local45] = local87;
					} else {
						Static92.aShortArray21[local45] = (short) local29.method8560();
					}
					if ((local72 & 0x2) == 0) {
						Static92.aShortArray22[local45] = local87;
					} else {
						Static92.aShortArray22[local45] = (short) local29.method8560();
					}
					if ((local72 & 0x4) == 0) {
						Static92.aShortArray19[local45] = local87;
					} else {
						Static92.aShortArray19[local45] = (short) local29.method8560();
					}
					Static92.aByteArray19[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static92.aShortArray21[local45] = (short) (Static92.aShortArray21[local45] << 2 & 0x3FFF);
						Static92.aShortArray22[local45] = (short) (Static92.aShortArray22[local45] << 2 & 0x3FFF);
						Static92.aShortArray19[local45] = (short) (Static92.aShortArray19[local45] << 2 & 0x3FFF);
					}
					Static92.aShortArray18[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static92.aShortArray18[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean194 = true;
					} else if (local64 == 7) {
						this.aBoolean193 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean192 = true;
					}
					local45++;
				}
			}
			if (local29.anInt9723 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt1638 = local45;
			this.aShortArray23 = new short[local45];
			this.aShortArray20 = new short[local45];
			this.aShortArray24 = new short[local45];
			this.aShortArray27 = new short[local45];
			this.aShortArray26 = new short[local45];
			this.aByteArray18 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray23[local64] = Static92.aShortArray25[local64];
				this.aShortArray20[local64] = Static92.aShortArray21[local64];
				this.aShortArray24[local64] = Static92.aShortArray22[local64];
				this.aShortArray27[local64] = Static92.aShortArray19[local64];
				this.aShortArray26[local64] = Static92.aShortArray18[local64];
				this.aByteArray18[local64] = Static92.aByteArray19[local64];
			}
		} catch (@Pc(359) Exception local359) {
			this.anInt1638 = 0;
			this.aBoolean194 = false;
			this.aBoolean193 = false;
		}
	}
}
