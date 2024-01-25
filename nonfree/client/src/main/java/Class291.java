import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class291 {

	@OriginalMember(owner = "client!pv", name = "q", descriptor = "Z")
	public boolean aBoolean610 = false;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "Z")
	public boolean aBoolean611 = false;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "Lclient!bb;")
	public Class6_Sub5 aClass6_Sub5_1 = null;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "Z")
	public boolean aBoolean612 = false;

	@OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
	public int anInt8089 = 0;

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "([BLclient!bb;)V")
	public Class291(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub5 arg1) {
		this.aClass6_Sub5_1 = arg1;
		try {
			@Pc(24) Class6_Sub15 local24 = new Class6_Sub15(arg0);
			@Pc(29) Class6_Sub15 local29 = new Class6_Sub15(arg0);
			local24.method3030();
			local24.anInt3174 += 2;
			@Pc(43) int local43 = local24.method3030();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt3174 = local24.anInt3174 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass6_Sub5_1.anIntArray28[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method3030();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static474.aShortArray98[local45] = (short) local57;
					@Pc(87) short local87 = 0;
					if (local64 == 3 || local64 == 10) {
						local87 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static474.aShortArray104[local45] = local87;
					} else {
						Static474.aShortArray104[local45] = (short) local29.method3000();
					}
					if ((local72 & 0x2) == 0) {
						Static474.aShortArray105[local45] = local87;
					} else {
						Static474.aShortArray105[local45] = (short) local29.method3000();
					}
					if ((local72 & 0x4) == 0) {
						Static474.aShortArray107[local45] = local87;
					} else {
						Static474.aShortArray107[local45] = (short) local29.method3000();
					}
					Static474.aByteArray81[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static474.aShortArray104[local45] = (short) (Static474.aShortArray104[local45] << 2 & 0x3FFF);
						Static474.aShortArray105[local45] = (short) (Static474.aShortArray105[local45] << 2 & 0x3FFF);
						Static474.aShortArray107[local45] = (short) (Static474.aShortArray107[local45] << 2 & 0x3FFF);
					}
					Static474.aShortArray100[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static474.aShortArray100[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean610 = true;
					} else if (local64 == 7) {
						this.aBoolean612 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean611 = true;
					}
					local45++;
				}
			}
			if (local29.anInt3174 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt8089 = local45;
			this.aShortArray106 = new short[local45];
			this.aShortArray103 = new short[local45];
			this.aShortArray99 = new short[local45];
			this.aShortArray101 = new short[local45];
			this.aShortArray102 = new short[local45];
			this.aByteArray80 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray106[local64] = Static474.aShortArray98[local64];
				this.aShortArray103[local64] = Static474.aShortArray104[local64];
				this.aShortArray99[local64] = Static474.aShortArray105[local64];
				this.aShortArray101[local64] = Static474.aShortArray107[local64];
				this.aShortArray102[local64] = Static474.aShortArray100[local64];
				this.aByteArray80[local64] = Static474.aByteArray81[local64];
			}
		} catch (@Pc(359) Exception local359) {
			this.anInt8089 = 0;
			this.aBoolean610 = false;
			this.aBoolean612 = false;
		}
	}
}
