import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class189 {

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!sv;")
	public Class3_Sub45 aClass3_Sub45_1 = null;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Z")
	public boolean aBoolean379 = false;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Z")
	public boolean aBoolean377 = false;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	public int anInt5904 = 0;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Z")
	public boolean aBoolean378 = false;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "[S")
	public short[] aShortArray113;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "[S")
	public short[] aShortArray119;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "[S")
	public short[] aShortArray117;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([BLclient!sv;)V")
	public Class189(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		this.aClass3_Sub45_1 = arg1;
		try {
			@Pc(24) Class3_Sub27 local24 = new Class3_Sub27(arg0);
			@Pc(29) Class3_Sub27 local29 = new Class3_Sub27(arg0);
			local24.method7548();
			local24.anInt9191 += 2;
			@Pc(43) int local43 = local24.method7548();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt9191 = local24.anInt9191 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass3_Sub45_1.anIntArray708[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method7548();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static292.aShortArray110[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static292.aShortArray116[local45] = local85;
					} else {
						Static292.aShortArray116[local45] = (short) local29.method7564();
					}
					if ((local72 & 0x2) == 0) {
						Static292.aShortArray114[local45] = local85;
					} else {
						Static292.aShortArray114[local45] = (short) local29.method7564();
					}
					if ((local72 & 0x4) == 0) {
						Static292.aShortArray115[local45] = local85;
					} else {
						Static292.aShortArray115[local45] = (short) local29.method7564();
					}
					Static292.aByteArray56[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static292.aShortArray116[local45] = (short) (Static292.aShortArray116[local45] << 2 & 0x3FFF);
						Static292.aShortArray114[local45] = (short) (Static292.aShortArray114[local45] << 2 & 0x3FFF);
						Static292.aShortArray115[local45] = (short) (Static292.aShortArray115[local45] << 2 & 0x3FFF);
					}
					Static292.aShortArray118[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static292.aShortArray118[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean378 = true;
					} else if (local64 == 7) {
						this.aBoolean379 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean377 = true;
					}
					local45++;
				}
			}
			if (local29.anInt9191 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt5904 = local45;
			this.aShortArray111 = new short[local45];
			this.aShortArray112 = new short[local45];
			this.aShortArray113 = new short[local45];
			this.aShortArray119 = new short[local45];
			this.aShortArray117 = new short[local45];
			this.aByteArray55 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray111[local64] = Static292.aShortArray110[local64];
				this.aShortArray112[local64] = Static292.aShortArray116[local64];
				this.aShortArray113[local64] = Static292.aShortArray114[local64];
				this.aShortArray119[local64] = Static292.aShortArray115[local64];
				this.aShortArray117[local64] = Static292.aShortArray118[local64];
				this.aByteArray55[local64] = Static292.aByteArray56[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt5904 = 0;
			this.aBoolean378 = false;
			this.aBoolean379 = false;
		}
	}
}
