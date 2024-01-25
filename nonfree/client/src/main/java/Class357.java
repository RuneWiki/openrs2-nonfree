import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class357 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "Z")
	public boolean aBoolean719 = false;

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "Z")
	public boolean aBoolean720 = false;

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
	public int anInt10346 = 0;

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "Z")
	public boolean aBoolean721 = false;

	@OriginalMember(owner = "client!ut", name = "q", descriptor = "Lclient!he;")
	public Class14_Sub23 aClass14_Sub23_1 = null;

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "[S")
	public short[] aShortArray151;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "[S")
	public short[] aShortArray148;

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "[S")
	public short[] aShortArray145;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "[S")
	public short[] aShortArray146;

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "[S")
	public short[] aShortArray144;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "[B")
	public byte[] aByteArray128;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "([BLclient!he;)V")
	public Class357(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class14_Sub23 arg1) {
		this.aClass14_Sub23_1 = arg1;
		try {
			@Pc(24) Class14_Sub29 local24 = new Class14_Sub29(arg0);
			@Pc(29) Class14_Sub29 local29 = new Class14_Sub29(arg0);
			local24.method5866();
			local24.anInt7264 += 2;
			@Pc(43) int local43 = local24.method5866();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt7264 = local24.anInt7264 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass14_Sub23_1.anIntArray324[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method5866();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static614.aShortArray147[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static614.aShortArray149[local45] = local85;
					} else {
						Static614.aShortArray149[local45] = (short) local29.method5881();
					}
					if ((local72 & 0x2) == 0) {
						Static614.aShortArray142[local45] = local85;
					} else {
						Static614.aShortArray142[local45] = (short) local29.method5881();
					}
					if ((local72 & 0x4) == 0) {
						Static614.aShortArray150[local45] = local85;
					} else {
						Static614.aShortArray150[local45] = (short) local29.method5881();
					}
					Static614.aByteArray129[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static614.aShortArray149[local45] = (short) (Static614.aShortArray149[local45] << 2 & 0x3FFF);
						Static614.aShortArray142[local45] = (short) (Static614.aShortArray142[local45] << 2 & 0x3FFF);
						Static614.aShortArray150[local45] = (short) (Static614.aShortArray150[local45] << 2 & 0x3FFF);
					}
					Static614.aShortArray143[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static614.aShortArray143[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean719 = true;
					} else if (local64 == 7) {
						this.aBoolean720 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean721 = true;
					}
					local45++;
				}
			}
			if (local29.anInt7264 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt10346 = local45;
			this.aShortArray151 = new short[local45];
			this.aShortArray148 = new short[local45];
			this.aShortArray145 = new short[local45];
			this.aShortArray146 = new short[local45];
			this.aShortArray144 = new short[local45];
			this.aByteArray128 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray151[local64] = Static614.aShortArray147[local64];
				this.aShortArray148[local64] = Static614.aShortArray149[local64];
				this.aShortArray145[local64] = Static614.aShortArray142[local64];
				this.aShortArray146[local64] = Static614.aShortArray150[local64];
				this.aShortArray144[local64] = Static614.aShortArray143[local64];
				this.aByteArray128[local64] = Static614.aByteArray129[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt10346 = 0;
			this.aBoolean719 = false;
			this.aBoolean720 = false;
		}
	}
}
