import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class70 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Lclient!po;")
	public Class4_Sub34 aClass4_Sub34_1 = null;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Z")
	public boolean aBoolean161 = false;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "Z")
	public boolean aBoolean163 = false;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "Z")
	public boolean aBoolean162 = false;

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
	public int anInt2270 = 0;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "([BLclient!po;)V")
	public Class70(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub34 arg1) {
		this.aClass4_Sub34_1 = arg1;
		try {
			@Pc(24) Class4_Sub11 local24 = new Class4_Sub11(arg0);
			@Pc(29) Class4_Sub11 local29 = new Class4_Sub11(arg0);
			local24.method4905();
			local24.anInt5831 += 2;
			@Pc(43) int local43 = local24.method4905();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt5831 = local24.anInt5831 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass4_Sub34_1.anIntArray391[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method4905();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static97.aShortArray22[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static97.aShortArray24[local45] = local85;
					} else {
						Static97.aShortArray24[local45] = (short) local29.method4904();
					}
					if ((local72 & 0x2) == 0) {
						Static97.aShortArray25[local45] = local85;
					} else {
						Static97.aShortArray25[local45] = (short) local29.method4904();
					}
					if ((local72 & 0x4) == 0) {
						Static97.aShortArray28[local45] = local85;
					} else {
						Static97.aShortArray28[local45] = (short) local29.method4904();
					}
					Static97.aByteArray20[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static97.aShortArray24[local45] = (short) (Static97.aShortArray24[local45] << 2 & 0x3FFF);
						Static97.aShortArray25[local45] = (short) (Static97.aShortArray25[local45] << 2 & 0x3FFF);
						Static97.aShortArray28[local45] = (short) (Static97.aShortArray28[local45] << 2 & 0x3FFF);
					}
					Static97.aShortArray29[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static97.aShortArray29[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean162 = true;
					} else if (local64 == 7) {
						this.aBoolean161 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean163 = true;
					}
					local45++;
				}
			}
			if (local29.anInt5831 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt2270 = local45;
			this.aShortArray27 = new short[local45];
			this.aShortArray23 = new short[local45];
			this.aShortArray30 = new short[local45];
			this.aShortArray31 = new short[local45];
			this.aShortArray26 = new short[local45];
			this.aByteArray19 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray27[local64] = Static97.aShortArray22[local64];
				this.aShortArray23[local64] = Static97.aShortArray24[local64];
				this.aShortArray30[local64] = Static97.aShortArray25[local64];
				this.aShortArray31[local64] = Static97.aShortArray28[local64];
				this.aShortArray26[local64] = Static97.aShortArray29[local64];
				this.aByteArray19[local64] = Static97.aByteArray20[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt2270 = 0;
			this.aBoolean162 = false;
			this.aBoolean161 = false;
		}
	}
}
