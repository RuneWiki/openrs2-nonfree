import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class76 {

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "Z")
	public boolean aBoolean217 = false;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	public int anInt2656 = 0;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "Z")
	public boolean aBoolean216 = false;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "Lclient!cs;")
	public Class3_Sub14 aClass3_Sub14_1 = null;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "Z")
	public boolean aBoolean215 = false;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([BLclient!cs;)V")
	public Class76(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub14 arg1) {
		this.aClass3_Sub14_1 = arg1;
		try {
			@Pc(24) Class3_Sub11 local24 = new Class3_Sub11(arg0);
			@Pc(29) Class3_Sub11 local29 = new Class3_Sub11(arg0);
			local24.method3118();
			local24.anInt3520 += 2;
			@Pc(43) int local43 = local24.method3118();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt3520 = local24.anInt3520 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass3_Sub14_1.anIntArray122[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method3118();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static116.aShortArray56[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static116.aShortArray58[local45] = local85;
					} else {
						Static116.aShortArray58[local45] = (short) local29.method3085();
					}
					if ((local72 & 0x2) == 0) {
						Static116.aShortArray51[local45] = local85;
					} else {
						Static116.aShortArray51[local45] = (short) local29.method3085();
					}
					if ((local72 & 0x4) == 0) {
						Static116.aShortArray49[local45] = local85;
					} else {
						Static116.aShortArray49[local45] = (short) local29.method3085();
					}
					Static116.aByteArray25[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static116.aShortArray58[local45] = (short) (Static116.aShortArray58[local45] << 2 & 0x3FFF);
						Static116.aShortArray51[local45] = (short) (Static116.aShortArray51[local45] << 2 & 0x3FFF);
						Static116.aShortArray49[local45] = (short) (Static116.aShortArray49[local45] << 2 & 0x3FFF);
					}
					Static116.aShortArray55[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static116.aShortArray55[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean216 = true;
					} else if (local64 == 7) {
						this.aBoolean217 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean215 = true;
					}
					local45++;
				}
			}
			if (local29.anInt3520 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt2656 = local45;
			this.aShortArray52 = new short[local45];
			this.aShortArray54 = new short[local45];
			this.aShortArray57 = new short[local45];
			this.aShortArray50 = new short[local45];
			this.aShortArray53 = new short[local45];
			this.aByteArray24 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray52[local64] = Static116.aShortArray56[local64];
				this.aShortArray54[local64] = Static116.aShortArray58[local64];
				this.aShortArray57[local64] = Static116.aShortArray51[local64];
				this.aShortArray50[local64] = Static116.aShortArray49[local64];
				this.aShortArray53[local64] = Static116.aShortArray55[local64];
				this.aByteArray24[local64] = Static116.aByteArray25[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt2656 = 0;
			this.aBoolean216 = false;
			this.aBoolean217 = false;
		}
	}
}
