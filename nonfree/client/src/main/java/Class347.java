import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class347 {

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!mt;")
	public Class5_Sub37 aClass5_Sub37_1 = null;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public int anInt9616 = 0;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "Z")
	public boolean aBoolean705 = false;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Z")
	public boolean aBoolean704 = false;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
	public boolean aBoolean703 = false;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "[S")
	public short[] aShortArray119;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "[S")
	public short[] aShortArray120;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "[S")
	public short[] aShortArray114;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "[S")
	public short[] aShortArray116;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "([BLclient!mt;)V")
	public Class347(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub37 arg1) {
		this.aClass5_Sub37_1 = arg1;
		try {
			@Pc(24) Class5_Sub15 local24 = new Class5_Sub15(arg0);
			@Pc(29) Class5_Sub15 local29 = new Class5_Sub15(arg0);
			local24.method3642();
			local24.anInt4144 += 2;
			@Pc(43) int local43 = local24.method3642();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt4144 = local24.anInt4144 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass5_Sub37_1.anIntArray371[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method3642();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static585.aShortArray113[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static585.aShortArray118[local45] = local85;
					} else {
						Static585.aShortArray118[local45] = (short) local29.method3657();
					}
					if ((local72 & 0x2) == 0) {
						Static585.aShortArray115[local45] = local85;
					} else {
						Static585.aShortArray115[local45] = (short) local29.method3657();
					}
					if ((local72 & 0x4) == 0) {
						Static585.aShortArray121[local45] = local85;
					} else {
						Static585.aShortArray121[local45] = (short) local29.method3657();
					}
					Static585.aByteArray91[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static585.aShortArray118[local45] = (short) (Static585.aShortArray118[local45] << 2 & 0x3FFF);
						Static585.aShortArray115[local45] = (short) (Static585.aShortArray115[local45] << 2 & 0x3FFF);
						Static585.aShortArray121[local45] = (short) (Static585.aShortArray121[local45] << 2 & 0x3FFF);
					}
					Static585.aShortArray117[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static585.aShortArray117[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean705 = true;
					} else if (local64 == 7) {
						this.aBoolean703 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean704 = true;
					}
					local45++;
				}
			}
			if (local29.anInt4144 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt9616 = local45;
			this.aShortArray119 = new short[local45];
			this.aShortArray120 = new short[local45];
			this.aShortArray114 = new short[local45];
			this.aShortArray116 = new short[local45];
			this.aShortArray112 = new short[local45];
			this.aByteArray92 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray119[local64] = Static585.aShortArray113[local64];
				this.aShortArray120[local64] = Static585.aShortArray118[local64];
				this.aShortArray114[local64] = Static585.aShortArray115[local64];
				this.aShortArray116[local64] = Static585.aShortArray121[local64];
				this.aShortArray112[local64] = Static585.aShortArray117[local64];
				this.aByteArray92[local64] = Static585.aByteArray91[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt9616 = 0;
			this.aBoolean705 = false;
			this.aBoolean703 = false;
		}
	}
}
