import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class341 {

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
	public int anInt9122 = 0;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Lclient!kaa;")
	public Class1_Sub31 aClass1_Sub31_1 = null;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
	public boolean aBoolean682 = false;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Z")
	public boolean aBoolean683 = false;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Z")
	public boolean aBoolean681 = false;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "[S")
	public short[] aShortArray125;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[S")
	public short[] aShortArray128;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[S")
	public short[] aShortArray127;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[S")
	public short[] aShortArray124;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([BLclient!kaa;)V")
	public Class341(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub31 arg1) {
		this.aClass1_Sub31_1 = arg1;
		try {
			@Pc(24) Class1_Sub3 local24 = new Class1_Sub3(arg0);
			@Pc(29) Class1_Sub3 local29 = new Class1_Sub3(arg0);
			local24.method7974();
			local24.anInt9802 += 2;
			@Pc(43) int local43 = local24.method7974();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt9802 = local24.anInt9802 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass1_Sub31_1.anIntArray261[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method7974();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static545.aShortArray130[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static545.aShortArray123[local45] = local85;
					} else {
						Static545.aShortArray123[local45] = (short) local29.method7955();
					}
					if ((local72 & 0x2) == 0) {
						Static545.aShortArray126[local45] = local85;
					} else {
						Static545.aShortArray126[local45] = (short) local29.method7955();
					}
					if ((local72 & 0x4) == 0) {
						Static545.aShortArray131[local45] = local85;
					} else {
						Static545.aShortArray131[local45] = (short) local29.method7955();
					}
					Static545.aByteArray90[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static545.aShortArray123[local45] = (short) (Static545.aShortArray123[local45] << 2 & 0x3FFF);
						Static545.aShortArray126[local45] = (short) (Static545.aShortArray126[local45] << 2 & 0x3FFF);
						Static545.aShortArray131[local45] = (short) (Static545.aShortArray131[local45] << 2 & 0x3FFF);
					}
					Static545.aShortArray132[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static545.aShortArray132[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean681 = true;
					} else if (local64 == 7) {
						this.aBoolean683 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean682 = true;
					}
					local45++;
				}
			}
			if (local29.anInt9802 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt9122 = local45;
			this.aShortArray125 = new short[local45];
			this.aShortArray128 = new short[local45];
			this.aShortArray129 = new short[local45];
			this.aShortArray127 = new short[local45];
			this.aShortArray124 = new short[local45];
			this.aByteArray89 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray125[local64] = Static545.aShortArray130[local64];
				this.aShortArray128[local64] = Static545.aShortArray123[local64];
				this.aShortArray129[local64] = Static545.aShortArray126[local64];
				this.aShortArray127[local64] = Static545.aShortArray131[local64];
				this.aShortArray124[local64] = Static545.aShortArray132[local64];
				this.aByteArray89[local64] = Static545.aByteArray90[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt9122 = 0;
			this.aBoolean681 = false;
			this.aBoolean683 = false;
		}
	}
}
