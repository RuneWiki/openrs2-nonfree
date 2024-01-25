import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class365 {

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
	public int anInt10022 = 0;

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "Z")
	public boolean aBoolean815 = false;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "Z")
	public boolean aBoolean816 = false;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "Z")
	public boolean aBoolean817 = false;

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "Lclient!iia;")
	public Class5_Sub21 aClass5_Sub21_1 = null;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "[S")
	public short[] aShortArray178;

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "[S")
	public short[] aShortArray186;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "[S")
	public short[] aShortArray185;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "[S")
	public short[] aShortArray184;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "[S")
	public short[] aShortArray180;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "[B")
	public byte[] aByteArray102;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "([BLclient!iia;)V")
	public Class365(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub21 arg1) {
		this.aClass5_Sub21_1 = arg1;
		try {
			@Pc(24) Class5_Sub12 local24 = new Class5_Sub12(arg0);
			@Pc(29) Class5_Sub12 local29 = new Class5_Sub12(arg0);
			local24.method8645();
			local24.anInt10154 += 2;
			@Pc(43) int local43 = local24.method8645();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt10154 = local24.anInt10154 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass5_Sub21_1.anIntArray341[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method8645();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static615.aShortArray181[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static615.aShortArray179[local45] = local85;
					} else {
						Static615.aShortArray179[local45] = (short) local29.method8646();
					}
					if ((local72 & 0x2) == 0) {
						Static615.aShortArray177[local45] = local85;
					} else {
						Static615.aShortArray177[local45] = (short) local29.method8646();
					}
					if ((local72 & 0x4) == 0) {
						Static615.aShortArray183[local45] = local85;
					} else {
						Static615.aShortArray183[local45] = (short) local29.method8646();
					}
					Static615.aByteArray101[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static615.aShortArray179[local45] = (short) (Static615.aShortArray179[local45] << 2 & 0x3FFF);
						Static615.aShortArray177[local45] = (short) (Static615.aShortArray177[local45] << 2 & 0x3FFF);
						Static615.aShortArray183[local45] = (short) (Static615.aShortArray183[local45] << 2 & 0x3FFF);
					}
					Static615.aShortArray182[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static615.aShortArray182[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean815 = true;
					} else if (local64 == 7) {
						this.aBoolean816 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean817 = true;
					}
					local45++;
				}
			}
			if (local29.anInt10154 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt10022 = local45;
			this.aShortArray178 = new short[local45];
			this.aShortArray186 = new short[local45];
			this.aShortArray185 = new short[local45];
			this.aShortArray184 = new short[local45];
			this.aShortArray180 = new short[local45];
			this.aByteArray102 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray178[local64] = Static615.aShortArray181[local64];
				this.aShortArray186[local64] = Static615.aShortArray179[local64];
				this.aShortArray185[local64] = Static615.aShortArray177[local64];
				this.aShortArray184[local64] = Static615.aShortArray183[local64];
				this.aShortArray180[local64] = Static615.aShortArray182[local64];
				this.aByteArray102[local64] = Static615.aByteArray101[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt10022 = 0;
			this.aBoolean815 = false;
			this.aBoolean816 = false;
		}
	}
}
