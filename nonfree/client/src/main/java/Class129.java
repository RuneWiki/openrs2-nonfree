import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class129 {

	@OriginalMember(owner = "client!gea", name = "f", descriptor = "Lclient!en;")
	public Class3_Sub21 aClass3_Sub21_1 = null;

	@OriginalMember(owner = "client!gea", name = "e", descriptor = "I")
	public int anInt3537 = 0;

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "Z")
	public boolean aBoolean286 = false;

	@OriginalMember(owner = "client!gea", name = "p", descriptor = "Z")
	public boolean aBoolean288 = false;

	@OriginalMember(owner = "client!gea", name = "m", descriptor = "Z")
	public boolean aBoolean287 = false;

	@OriginalMember(owner = "client!gea", name = "k", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!gea", name = "g", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!gea", name = "n", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!gea", name = "j", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!gea", name = "h", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "([BLclient!en;)V")
	public Class129(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub21 arg1) {
		this.aClass3_Sub21_1 = arg1;
		try {
			@Pc(24) Class3_Sub28 local24 = new Class3_Sub28(arg0);
			@Pc(29) Class3_Sub28 local29 = new Class3_Sub28(arg0);
			local24.method5322(-28);
			local24.anInt6241 += 2;
			@Pc(43) int local43 = local24.method5322(-25);
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt6241 = local24.anInt6241 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass3_Sub21_1.anIntArray135[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method5322(-110);
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static205.aShortArray59[local45] = (short) local57;
					@Pc(87) short local87 = 0;
					if (local64 == 3 || local64 == 10) {
						local87 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static205.aShortArray62[local45] = local87;
					} else {
						Static205.aShortArray62[local45] = (short) local29.method5285();
					}
					if ((local72 & 0x2) == 0) {
						Static205.aShortArray53[local45] = local87;
					} else {
						Static205.aShortArray53[local45] = (short) local29.method5285();
					}
					if ((local72 & 0x4) == 0) {
						Static205.aShortArray54[local45] = local87;
					} else {
						Static205.aShortArray54[local45] = (short) local29.method5285();
					}
					Static205.aByteArray20[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static205.aShortArray62[local45] = (short) (Static205.aShortArray62[local45] << 2 & 0x3FFF);
						Static205.aShortArray53[local45] = (short) (Static205.aShortArray53[local45] << 2 & 0x3FFF);
						Static205.aShortArray54[local45] = (short) (Static205.aShortArray54[local45] << 2 & 0x3FFF);
					}
					Static205.aShortArray58[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static205.aShortArray58[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean286 = true;
					} else if (local64 == 7) {
						this.aBoolean287 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean288 = true;
					}
					local45++;
				}
			}
			if (local29.anInt6241 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt3537 = local45;
			this.aShortArray55 = new short[local45];
			this.aShortArray60 = new short[local45];
			this.aShortArray56 = new short[local45];
			this.aShortArray61 = new short[local45];
			this.aShortArray57 = new short[local45];
			this.aByteArray19 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray55[local64] = Static205.aShortArray59[local64];
				this.aShortArray60[local64] = Static205.aShortArray62[local64];
				this.aShortArray56[local64] = Static205.aShortArray53[local64];
				this.aShortArray61[local64] = Static205.aShortArray54[local64];
				this.aShortArray57[local64] = Static205.aShortArray58[local64];
				this.aByteArray19[local64] = Static205.aByteArray20[local64];
			}
		} catch (@Pc(359) Exception local359) {
			this.anInt3537 = 0;
			this.aBoolean286 = false;
			this.aBoolean287 = false;
		}
	}
}
