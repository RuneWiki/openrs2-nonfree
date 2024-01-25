import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class294 {

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "Lclient!pfa;")
	public Class5_Sub39 aClass5_Sub39_1 = null;

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "Z")
	public boolean aBoolean612 = false;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "Z")
	public boolean aBoolean610 = false;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
	public int anInt8153 = 0;

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "Z")
	public boolean aBoolean611 = false;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "([BLclient!pfa;)V")
	public Class294(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub39 arg1) {
		this.aClass5_Sub39_1 = arg1;
		try {
			@Pc(24) Class5_Sub23 local24 = new Class5_Sub23(arg0);
			@Pc(29) Class5_Sub23 local29 = new Class5_Sub23(arg0);
			local24.method8529();
			local24.anInt9869 += 2;
			@Pc(43) int local43 = local24.method8529();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt9869 = local24.anInt9869 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass5_Sub39_1.anIntArray463[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method8529();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static485.aShortArray110[local45] = (short) local57;
					@Pc(87) short local87 = 0;
					if (local64 == 3 || local64 == 10) {
						local87 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static485.aShortArray107[local45] = local87;
					} else {
						Static485.aShortArray107[local45] = (short) local29.method8481();
					}
					if ((local72 & 0x2) == 0) {
						Static485.aShortArray108[local45] = local87;
					} else {
						Static485.aShortArray108[local45] = (short) local29.method8481();
					}
					if ((local72 & 0x4) == 0) {
						Static485.aShortArray102[local45] = local87;
					} else {
						Static485.aShortArray102[local45] = (short) local29.method8481();
					}
					Static485.aByteArray81[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static485.aShortArray107[local45] = (short) (Static485.aShortArray107[local45] << 2 & 0x3FFF);
						Static485.aShortArray108[local45] = (short) (Static485.aShortArray108[local45] << 2 & 0x3FFF);
						Static485.aShortArray102[local45] = (short) (Static485.aShortArray102[local45] << 2 & 0x3FFF);
					}
					Static485.aShortArray109[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static485.aShortArray109[local45] = (short) local47;
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
			if (local29.anInt9869 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt8153 = local45;
			this.aShortArray106 = new short[local45];
			this.aShortArray105 = new short[local45];
			this.aShortArray103 = new short[local45];
			this.aShortArray111 = new short[local45];
			this.aShortArray104 = new short[local45];
			this.aByteArray80 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray106[local64] = Static485.aShortArray110[local64];
				this.aShortArray105[local64] = Static485.aShortArray107[local64];
				this.aShortArray103[local64] = Static485.aShortArray108[local64];
				this.aShortArray111[local64] = Static485.aShortArray102[local64];
				this.aShortArray104[local64] = Static485.aShortArray109[local64];
				this.aByteArray80[local64] = Static485.aByteArray81[local64];
			}
		} catch (@Pc(359) Exception local359) {
			this.anInt8153 = 0;
			this.aBoolean610 = false;
			this.aBoolean612 = false;
		}
	}
}
