import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class115 {

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Lclient!gea;")
	public Class1_Sub20 aClass1_Sub20_1 = null;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "Z")
	public boolean aBoolean211 = false;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "Z")
	public boolean aBoolean210 = false;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "Z")
	public boolean aBoolean212 = false;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "I")
	public int anInt3074 = 0;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!h", name = "l", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!h", name = "n", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "([BLclient!gea;)V")
	public Class115(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		this.aClass1_Sub20_1 = arg1;
		try {
			@Pc(24) Class1_Sub6 local24 = new Class1_Sub6(arg0);
			@Pc(29) Class1_Sub6 local29 = new Class1_Sub6(arg0);
			local24.method3922();
			local24.anInt4555 += 2;
			@Pc(43) int local43 = local24.method3922();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt4555 = local24.anInt4555 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass1_Sub20_1.anIntArray276[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method3922();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static172.aShortArray62[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static172.aShortArray63[local45] = local85;
					} else {
						Static172.aShortArray63[local45] = (short) local29.method3946();
					}
					if ((local72 & 0x2) == 0) {
						Static172.aShortArray61[local45] = local85;
					} else {
						Static172.aShortArray61[local45] = (short) local29.method3946();
					}
					if ((local72 & 0x4) == 0) {
						Static172.aShortArray58[local45] = local85;
					} else {
						Static172.aShortArray58[local45] = (short) local29.method3946();
					}
					Static172.aByteArray46[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static172.aShortArray63[local45] = (short) (Static172.aShortArray63[local45] << 2 & 0x3FFF);
						Static172.aShortArray61[local45] = (short) (Static172.aShortArray61[local45] << 2 & 0x3FFF);
						Static172.aShortArray58[local45] = (short) (Static172.aShortArray58[local45] << 2 & 0x3FFF);
					}
					Static172.aShortArray59[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static172.aShortArray59[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean211 = true;
					} else if (local64 == 7) {
						this.aBoolean210 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean212 = true;
					}
					local45++;
				}
			}
			if (local29.anInt4555 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt3074 = local45;
			this.aShortArray55 = new short[local45];
			this.aShortArray60 = new short[local45];
			this.aShortArray57 = new short[local45];
			this.aShortArray54 = new short[local45];
			this.aShortArray56 = new short[local45];
			this.aByteArray45 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray55[local64] = Static172.aShortArray62[local64];
				this.aShortArray60[local64] = Static172.aShortArray63[local64];
				this.aShortArray57[local64] = Static172.aShortArray61[local64];
				this.aShortArray54[local64] = Static172.aShortArray58[local64];
				this.aShortArray56[local64] = Static172.aShortArray59[local64];
				this.aByteArray45[local64] = Static172.aByteArray46[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt3074 = 0;
			this.aBoolean211 = false;
			this.aBoolean210 = false;
		}
	}
}
