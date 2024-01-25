import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class95 {

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "Lclient!hba;")
	public Class2_Sub18 aClass2_Sub18_1 = null;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
	public int anInt2101 = 0;

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "Z")
	public boolean aBoolean143 = false;

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "([BLclient!hba;)V")
	public Class95(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub18 arg1) {
		this.aClass2_Sub18_1 = arg1;
		try {
			@Pc(24) Class2_Sub7 local24 = new Class2_Sub7(arg0);
			@Pc(29) Class2_Sub7 local29 = new Class2_Sub7(arg0);
			local24.method4464();
			local24.anInt5186 += 2;
			@Pc(43) int local43 = local24.method4464();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt5186 = local24.anInt5186 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass2_Sub18_1.anIntArray230[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method4464();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static126.aShortArray64[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static126.aShortArray63[local45] = local85;
					} else {
						Static126.aShortArray63[local45] = (short) local29.method4507();
					}
					if ((local72 & 0x2) == 0) {
						Static126.aShortArray65[local45] = local85;
					} else {
						Static126.aShortArray65[local45] = (short) local29.method4507();
					}
					if ((local72 & 0x4) == 0) {
						Static126.aShortArray60[local45] = local85;
					} else {
						Static126.aShortArray60[local45] = (short) local29.method4507();
					}
					Static126.aByteArray36[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static126.aShortArray63[local45] = (short) (Static126.aShortArray63[local45] << 2 & 0x3FFF);
						Static126.aShortArray65[local45] = (short) (Static126.aShortArray65[local45] << 2 & 0x3FFF);
						Static126.aShortArray60[local45] = (short) (Static126.aShortArray60[local45] << 2 & 0x3FFF);
					}
					Static126.aShortArray62[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static126.aShortArray62[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean144 = true;
					} else if (local64 == 7) {
						this.aBoolean143 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean142 = true;
					}
					local45++;
				}
			}
			if (local29.anInt5186 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt2101 = local45;
			this.aShortArray66 = new short[local45];
			this.aShortArray58 = new short[local45];
			this.aShortArray67 = new short[local45];
			this.aShortArray61 = new short[local45];
			this.aShortArray59 = new short[local45];
			this.aByteArray37 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray66[local64] = Static126.aShortArray64[local64];
				this.aShortArray58[local64] = Static126.aShortArray63[local64];
				this.aShortArray67[local64] = Static126.aShortArray65[local64];
				this.aShortArray61[local64] = Static126.aShortArray60[local64];
				this.aShortArray59[local64] = Static126.aShortArray62[local64];
				this.aByteArray37[local64] = Static126.aByteArray36[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt2101 = 0;
			this.aBoolean144 = false;
			this.aBoolean143 = false;
		}
	}
}
