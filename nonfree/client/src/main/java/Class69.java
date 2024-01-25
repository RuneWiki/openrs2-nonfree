import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class69 {

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Z")
	public boolean aBoolean138 = false;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Lclient!na;")
	public Class1_Sub36 aClass1_Sub36_1 = null;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	public int anInt1772 = 0;

	@OriginalMember(owner = "client!df", name = "q", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "([BLclient!na;)V")
	public Class69(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub36 arg1) {
		this.aClass1_Sub36_1 = arg1;
		try {
			@Pc(24) Class1_Sub35 local24 = new Class1_Sub35(arg0);
			@Pc(29) Class1_Sub35 local29 = new Class1_Sub35(arg0);
			local24.method5750();
			local24.anInt7214 += 2;
			@Pc(43) int local43 = local24.method5750();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt7214 = local24.anInt7214 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass1_Sub36_1.anIntArray463[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method5750();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static81.aShortArray21[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static81.aShortArray22[local45] = local85;
					} else {
						Static81.aShortArray22[local45] = (short) local29.method5752();
					}
					if ((local72 & 0x2) == 0) {
						Static81.aShortArray26[local45] = local85;
					} else {
						Static81.aShortArray26[local45] = (short) local29.method5752();
					}
					if ((local72 & 0x4) == 0) {
						Static81.aShortArray23[local45] = local85;
					} else {
						Static81.aShortArray23[local45] = (short) local29.method5752();
					}
					Static81.aByteArray14[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static81.aShortArray22[local45] = (short) (Static81.aShortArray22[local45] << 2 & 0x3FFF);
						Static81.aShortArray26[local45] = (short) (Static81.aShortArray26[local45] << 2 & 0x3FFF);
						Static81.aShortArray23[local45] = (short) (Static81.aShortArray23[local45] << 2 & 0x3FFF);
					}
					Static81.aShortArray27[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static81.aShortArray27[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean140 = true;
					} else if (local64 == 7) {
						this.aBoolean138 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean139 = true;
					}
					local45++;
				}
			}
			if (local29.anInt7214 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt1772 = local45;
			this.aShortArray20 = new short[local45];
			this.aShortArray25 = new short[local45];
			this.aShortArray28 = new short[local45];
			this.aShortArray24 = new short[local45];
			this.aShortArray29 = new short[local45];
			this.aByteArray15 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray20[local64] = Static81.aShortArray21[local64];
				this.aShortArray25[local64] = Static81.aShortArray22[local64];
				this.aShortArray28[local64] = Static81.aShortArray26[local64];
				this.aShortArray24[local64] = Static81.aShortArray23[local64];
				this.aShortArray29[local64] = Static81.aShortArray27[local64];
				this.aByteArray15[local64] = Static81.aByteArray14[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt1772 = 0;
			this.aBoolean140 = false;
			this.aBoolean138 = false;
		}
	}
}
