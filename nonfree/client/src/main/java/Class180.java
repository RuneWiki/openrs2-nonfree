import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class180 {

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "Z")
	public boolean aBoolean377 = false;

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "Z")
	public boolean aBoolean378 = false;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "Z")
	public boolean aBoolean376 = false;

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
	public int anInt5003 = 0;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "Lclient!rh;")
	public Class4_Sub42 aClass4_Sub42_1 = null;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "([BLclient!rh;)V")
	public Class180(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub42 arg1) {
		this.aClass4_Sub42_1 = arg1;
		try {
			@Pc(24) Class4_Sub9 local24 = new Class4_Sub9(arg0);
			@Pc(29) Class4_Sub9 local29 = new Class4_Sub9(arg0);
			local24.method6015();
			local24.anInt7219 += 2;
			@Pc(43) int local43 = local24.method6015();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt7219 = local24.anInt7219 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass4_Sub42_1.anIntArray629[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method6015();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static254.aShortArray95[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static254.aShortArray103[local45] = local85;
					} else {
						Static254.aShortArray103[local45] = (short) local29.method6007();
					}
					if ((local72 & 0x2) == 0) {
						Static254.aShortArray100[local45] = local85;
					} else {
						Static254.aShortArray100[local45] = (short) local29.method6007();
					}
					if ((local72 & 0x4) == 0) {
						Static254.aShortArray94[local45] = local85;
					} else {
						Static254.aShortArray94[local45] = (short) local29.method6007();
					}
					Static254.aByteArray55[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static254.aShortArray103[local45] = (short) (Static254.aShortArray103[local45] << 2 & 0x3FFF);
						Static254.aShortArray100[local45] = (short) (Static254.aShortArray100[local45] << 2 & 0x3FFF);
						Static254.aShortArray94[local45] = (short) (Static254.aShortArray94[local45] << 2 & 0x3FFF);
					}
					Static254.aShortArray98[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static254.aShortArray98[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean378 = true;
					} else if (local64 == 7) {
						this.aBoolean376 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean377 = true;
					}
					local45++;
				}
			}
			if (local29.anInt7219 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt5003 = local45;
			this.aShortArray99 = new short[local45];
			this.aShortArray96 = new short[local45];
			this.aShortArray102 = new short[local45];
			this.aShortArray101 = new short[local45];
			this.aShortArray97 = new short[local45];
			this.aByteArray56 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray99[local64] = Static254.aShortArray95[local64];
				this.aShortArray96[local64] = Static254.aShortArray103[local64];
				this.aShortArray102[local64] = Static254.aShortArray100[local64];
				this.aShortArray101[local64] = Static254.aShortArray94[local64];
				this.aShortArray97[local64] = Static254.aShortArray98[local64];
				this.aByteArray56[local64] = Static254.aByteArray55[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt5003 = 0;
			this.aBoolean378 = false;
			this.aBoolean376 = false;
		}
	}
}
