import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class268 {

	@OriginalMember(owner = "client!np", name = "c", descriptor = "I")
	public int anInt6890 = 0;

	@OriginalMember(owner = "client!np", name = "b", descriptor = "Lclient!sga;")
	public Class3_Sub53 aClass3_Sub53_1 = null;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Z")
	public boolean aBoolean458 = false;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "Z")
	public boolean aBoolean459 = false;

	@OriginalMember(owner = "client!np", name = "o", descriptor = "Z")
	public boolean aBoolean460 = false;

	@OriginalMember(owner = "client!np", name = "h", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!np", name = "i", descriptor = "[S")
	public short[] aShortArray84;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!np", name = "m", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "([BLclient!sga;)V")
	public Class268(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub53 arg1) {
		this.aClass3_Sub53_1 = arg1;
		try {
			@Pc(24) Class3_Sub2 local24 = new Class3_Sub2(arg0);
			@Pc(29) Class3_Sub2 local29 = new Class3_Sub2(arg0);
			local24.method2048(255);
			local24.anInt2178 += 2;
			@Pc(43) int local43 = local24.method2048(255);
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt2178 = local24.anInt2178 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass3_Sub53_1.anIntArray653[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method2048(255);
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static450.aShortArray88[local45] = (short) local57;
					@Pc(87) short local87 = 0;
					if (local64 == 3 || local64 == 10) {
						local87 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static450.aShortArray92[local45] = local87;
					} else {
						Static450.aShortArray92[local45] = (short) local29.method2009(128);
					}
					if ((local72 & 0x2) == 0) {
						Static450.aShortArray90[local45] = local87;
					} else {
						Static450.aShortArray90[local45] = (short) local29.method2009(128);
					}
					if ((local72 & 0x4) == 0) {
						Static450.aShortArray91[local45] = local87;
					} else {
						Static450.aShortArray91[local45] = (short) local29.method2009(128);
					}
					Static450.aByteArray65[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static450.aShortArray92[local45] = (short) (Static450.aShortArray92[local45] << 2 & 0x3FFF);
						Static450.aShortArray90[local45] = (short) (Static450.aShortArray90[local45] << 2 & 0x3FFF);
						Static450.aShortArray91[local45] = (short) (Static450.aShortArray91[local45] << 2 & 0x3FFF);
					}
					Static450.aShortArray86[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static450.aShortArray86[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean460 = true;
					} else if (local64 == 7) {
						this.aBoolean459 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean458 = true;
					}
					local45++;
				}
			}
			if (local29.anInt2178 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6890 = local45;
			this.aShortArray87 = new short[local45];
			this.aShortArray84 = new short[local45];
			this.aShortArray93 = new short[local45];
			this.aShortArray85 = new short[local45];
			this.aShortArray89 = new short[local45];
			this.aByteArray64 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray87[local64] = Static450.aShortArray88[local64];
				this.aShortArray84[local64] = Static450.aShortArray92[local64];
				this.aShortArray93[local64] = Static450.aShortArray90[local64];
				this.aShortArray85[local64] = Static450.aShortArray91[local64];
				this.aShortArray89[local64] = Static450.aShortArray86[local64];
				this.aByteArray64[local64] = Static450.aByteArray65[local64];
			}
		} catch (@Pc(359) Exception local359) {
			this.anInt6890 = 0;
			this.aBoolean460 = false;
			this.aBoolean459 = false;
		}
	}
}
