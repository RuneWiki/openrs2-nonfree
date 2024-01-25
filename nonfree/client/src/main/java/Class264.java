import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class264 {

	@OriginalMember(owner = "client!of", name = "l", descriptor = "I")
	public int anInt6763 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Z")
	public boolean aBoolean521 = false;

	@OriginalMember(owner = "client!of", name = "j", descriptor = "Z")
	public boolean aBoolean522 = false;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Z")
	public boolean aBoolean523 = false;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "Lclient!ov;")
	public Class4_Sub39 aClass4_Sub39_1 = null;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "[S")
	public short[] aShortArray83;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "([BLclient!ov;)V")
	public Class264(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub39 arg1) {
		this.aClass4_Sub39_1 = arg1;
		try {
			@Pc(24) Class4_Sub11 local24 = new Class4_Sub11(arg0);
			@Pc(29) Class4_Sub11 local29 = new Class4_Sub11(arg0);
			local24.method8865();
			local24.anInt10466 += 2;
			@Pc(43) int local43 = local24.method8865();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt10466 = local24.anInt10466 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass4_Sub39_1.anIntArray483[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method8865();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static428.aShortArray84[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static428.aShortArray86[local45] = local85;
					} else {
						Static428.aShortArray86[local45] = (short) local29.method8842();
					}
					if ((local72 & 0x2) == 0) {
						Static428.aShortArray87[local45] = local85;
					} else {
						Static428.aShortArray87[local45] = (short) local29.method8842();
					}
					if ((local72 & 0x4) == 0) {
						Static428.aShortArray81[local45] = local85;
					} else {
						Static428.aShortArray81[local45] = (short) local29.method8842();
					}
					Static428.aByteArray63[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static428.aShortArray86[local45] = (short) (Static428.aShortArray86[local45] << 2 & 0x3FFF);
						Static428.aShortArray87[local45] = (short) (Static428.aShortArray87[local45] << 2 & 0x3FFF);
						Static428.aShortArray81[local45] = (short) (Static428.aShortArray81[local45] << 2 & 0x3FFF);
					}
					Static428.aShortArray80[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static428.aShortArray80[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean522 = true;
					} else if (local64 == 7) {
						this.aBoolean521 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean523 = true;
					}
					local45++;
				}
			}
			if (local29.anInt10466 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6763 = local45;
			this.aShortArray83 = new short[local45];
			this.aShortArray79 = new short[local45];
			this.aShortArray78 = new short[local45];
			this.aShortArray82 = new short[local45];
			this.aShortArray85 = new short[local45];
			this.aByteArray62 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray83[local64] = Static428.aShortArray84[local64];
				this.aShortArray79[local64] = Static428.aShortArray86[local64];
				this.aShortArray78[local64] = Static428.aShortArray87[local64];
				this.aShortArray82[local64] = Static428.aShortArray81[local64];
				this.aShortArray85[local64] = Static428.aShortArray80[local64];
				this.aByteArray62[local64] = Static428.aByteArray63[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt6763 = 0;
			this.aBoolean522 = false;
			this.aBoolean521 = false;
		}
	}
}
