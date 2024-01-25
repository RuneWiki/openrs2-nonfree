import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class372 {

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "Z")
	public boolean aBoolean727 = false;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	public int anInt10498 = 0;

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "Z")
	public boolean aBoolean728 = false;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "Lclient!cea;")
	public Class3_Sub10 aClass3_Sub10_1 = null;

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "Z")
	public boolean aBoolean729 = false;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "[S")
	public short[] aShortArray141;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "[S")
	public short[] aShortArray139;

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "[S")
	public short[] aShortArray145;

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "[S")
	public short[] aShortArray146;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "[S")
	public short[] aShortArray144;

	@OriginalMember(owner = "client!vg", name = "q", descriptor = "[B")
	public byte[] aByteArray99;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([BLclient!cea;)V")
	public Class372(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub10 arg1) {
		this.aClass3_Sub10_1 = arg1;
		try {
			@Pc(24) Class3_Sub4 local24 = new Class3_Sub4(arg0);
			@Pc(29) Class3_Sub4 local29 = new Class3_Sub4(arg0);
			local24.method7954();
			local24.anInt9739 += 2;
			@Pc(43) int local43 = local24.method7954();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt9739 = local24.anInt9739 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass3_Sub10_1.anIntArray80[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method7954();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static636.aShortArray142[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static636.aShortArray140[local45] = local85;
					} else {
						Static636.aShortArray140[local45] = (short) local29.method7892();
					}
					if ((local72 & 0x2) == 0) {
						Static636.aShortArray143[local45] = local85;
					} else {
						Static636.aShortArray143[local45] = (short) local29.method7892();
					}
					if ((local72 & 0x4) == 0) {
						Static636.aShortArray147[local45] = local85;
					} else {
						Static636.aShortArray147[local45] = (short) local29.method7892();
					}
					Static636.aByteArray98[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static636.aShortArray140[local45] = (short) (Static636.aShortArray140[local45] << 2 & 0x3FFF);
						Static636.aShortArray143[local45] = (short) (Static636.aShortArray143[local45] << 2 & 0x3FFF);
						Static636.aShortArray147[local45] = (short) (Static636.aShortArray147[local45] << 2 & 0x3FFF);
					}
					Static636.aShortArray148[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static636.aShortArray148[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean727 = true;
					} else if (local64 == 7) {
						this.aBoolean728 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean729 = true;
					}
					local45++;
				}
			}
			if (local29.anInt9739 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt10498 = local45;
			this.aShortArray141 = new short[local45];
			this.aShortArray139 = new short[local45];
			this.aShortArray145 = new short[local45];
			this.aShortArray146 = new short[local45];
			this.aShortArray144 = new short[local45];
			this.aByteArray99 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray141[local64] = Static636.aShortArray142[local64];
				this.aShortArray139[local64] = Static636.aShortArray140[local64];
				this.aShortArray145[local64] = Static636.aShortArray143[local64];
				this.aShortArray146[local64] = Static636.aShortArray147[local64];
				this.aShortArray144[local64] = Static636.aShortArray148[local64];
				this.aByteArray99[local64] = Static636.aByteArray98[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt10498 = 0;
			this.aBoolean727 = false;
			this.aBoolean728 = false;
		}
	}
}
