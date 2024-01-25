import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class136 {

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Z")
	public boolean aBoolean277 = false;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Z")
	public boolean aBoolean276 = false;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!uja;")
	public Class3_Sub52 aClass3_Sub52_1 = null;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Z")
	public boolean aBoolean278 = false;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "I")
	public int anInt3404 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "([BLclient!uja;)V")
	public Class136(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub52 arg1) {
		this.aClass3_Sub52_1 = arg1;
		try {
			@Pc(24) Class3_Sub17 local24 = new Class3_Sub17(arg0);
			@Pc(29) Class3_Sub17 local29 = new Class3_Sub17(arg0);
			local24.method4888();
			local24.lb += 2;
			@Pc(43) int local43 = local24.method4888();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.lb = local24.lb + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass3_Sub52_1.anIntArray622[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method4888();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static183.aShortArray64[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static183.aShortArray68[local45] = local85;
					} else {
						Static183.aShortArray68[local45] = (short) local29.method4837();
					}
					if ((local72 & 0x2) == 0) {
						Static183.aShortArray67[local45] = local85;
					} else {
						Static183.aShortArray67[local45] = (short) local29.method4837();
					}
					if ((local72 & 0x4) == 0) {
						Static183.aShortArray65[local45] = local85;
					} else {
						Static183.aShortArray65[local45] = (short) local29.method4837();
					}
					Static183.aByteArray27[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static183.aShortArray68[local45] = (short) (Static183.aShortArray68[local45] << 2 & 0x3FFF);
						Static183.aShortArray67[local45] = (short) (Static183.aShortArray67[local45] << 2 & 0x3FFF);
						Static183.aShortArray65[local45] = (short) (Static183.aShortArray65[local45] << 2 & 0x3FFF);
					}
					Static183.aShortArray63[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static183.aShortArray63[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean278 = true;
					} else if (local64 == 7) {
						this.aBoolean276 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean277 = true;
					}
					local45++;
				}
			}
			if (local29.lb != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt3404 = local45;
			this.aShortArray59 = new short[local45];
			this.aShortArray61 = new short[local45];
			this.aShortArray60 = new short[local45];
			this.aShortArray66 = new short[local45];
			this.aShortArray62 = new short[local45];
			this.aByteArray26 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray59[local64] = Static183.aShortArray64[local64];
				this.aShortArray61[local64] = Static183.aShortArray68[local64];
				this.aShortArray60[local64] = Static183.aShortArray67[local64];
				this.aShortArray66[local64] = Static183.aShortArray65[local64];
				this.aShortArray62[local64] = Static183.aShortArray63[local64];
				this.aByteArray26[local64] = Static183.aByteArray27[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt3404 = 0;
			this.aBoolean278 = false;
			this.aBoolean276 = false;
		}
	}
}
