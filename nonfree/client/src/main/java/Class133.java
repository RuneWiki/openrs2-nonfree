import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class133 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Lclient!ss;")
	public Class3_Sub45 aClass3_Sub45_1 = null;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
	public int anInt4928 = 0;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "Z")
	public boolean aBoolean431 = false;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "Z")
	public boolean aBoolean430 = false;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "Z")
	public boolean aBoolean432 = false;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "([BLclient!ss;)V")
	public Class133(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		this.aClass3_Sub45_1 = arg1;
		try {
			@Pc(24) Class3_Sub15 local24 = new Class3_Sub15(arg0);
			@Pc(29) Class3_Sub15 local29 = new Class3_Sub15(arg0);
			local24.method8401();
			local24.anInt10282 += 2;
			@Pc(43) int local43 = local24.method8401();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt10282 = local24.anInt10282 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass3_Sub45_1.anIntArray570[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method8401();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static213.aShortArray50[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static213.aShortArray45[local45] = local85;
					} else {
						Static213.aShortArray45[local45] = (short) local29.method8435();
					}
					if ((local72 & 0x2) == 0) {
						Static213.aShortArray46[local45] = local85;
					} else {
						Static213.aShortArray46[local45] = (short) local29.method8435();
					}
					if ((local72 & 0x4) == 0) {
						Static213.aShortArray48[local45] = local85;
					} else {
						Static213.aShortArray48[local45] = (short) local29.method8435();
					}
					Static213.aByteArray48[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static213.aShortArray45[local45] = (short) (Static213.aShortArray45[local45] << 2 & 0x3FFF);
						Static213.aShortArray46[local45] = (short) (Static213.aShortArray46[local45] << 2 & 0x3FFF);
						Static213.aShortArray48[local45] = (short) (Static213.aShortArray48[local45] << 2 & 0x3FFF);
					}
					Static213.aShortArray53[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static213.aShortArray53[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean431 = true;
					} else if (local64 == 7) {
						this.aBoolean432 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean430 = true;
					}
					local45++;
				}
			}
			if (local29.anInt10282 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt4928 = local45;
			this.aShortArray54 = new short[local45];
			this.aShortArray49 = new short[local45];
			this.aShortArray52 = new short[local45];
			this.aShortArray47 = new short[local45];
			this.aShortArray51 = new short[local45];
			this.aByteArray47 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray54[local64] = Static213.aShortArray50[local64];
				this.aShortArray49[local64] = Static213.aShortArray45[local64];
				this.aShortArray52[local64] = Static213.aShortArray46[local64];
				this.aShortArray47[local64] = Static213.aShortArray48[local64];
				this.aShortArray51[local64] = Static213.aShortArray53[local64];
				this.aByteArray47[local64] = Static213.aByteArray48[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt4928 = 0;
			this.aBoolean431 = false;
			this.aBoolean432 = false;
		}
	}
}
