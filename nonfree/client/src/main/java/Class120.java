import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class120 {

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "Z")
	public boolean aBoolean329 = false;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "Z")
	public boolean aBoolean328 = false;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "Lclient!raa;")
	public Class2_Sub42 aClass2_Sub42_1 = null;

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "Z")
	public boolean aBoolean330 = false;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
	public int anInt4456 = 0;

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "([BLclient!raa;)V")
	public Class120(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub42 arg1) {
		this.aClass2_Sub42_1 = arg1;
		try {
			@Pc(24) Class2_Sub11 local24 = new Class2_Sub11(arg0);
			@Pc(29) Class2_Sub11 local29 = new Class2_Sub11(arg0);
			local24.method8383();
			local24.anInt10066 += 2;
			@Pc(43) int local43 = local24.method8383();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt10066 = local24.anInt10066 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass2_Sub42_1.anIntArray569[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method8383();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static188.aShortArray50[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static188.aShortArray42[local45] = local85;
					} else {
						Static188.aShortArray42[local45] = (short) local29.method8358();
					}
					if ((local72 & 0x2) == 0) {
						Static188.aShortArray45[local45] = local85;
					} else {
						Static188.aShortArray45[local45] = (short) local29.method8358();
					}
					if ((local72 & 0x4) == 0) {
						Static188.aShortArray51[local45] = local85;
					} else {
						Static188.aShortArray51[local45] = (short) local29.method8358();
					}
					Static188.aByteArray54[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static188.aShortArray42[local45] = (short) (Static188.aShortArray42[local45] << 2 & 0x3FFF);
						Static188.aShortArray45[local45] = (short) (Static188.aShortArray45[local45] << 2 & 0x3FFF);
						Static188.aShortArray51[local45] = (short) (Static188.aShortArray51[local45] << 2 & 0x3FFF);
					}
					Static188.aShortArray48[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static188.aShortArray48[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean330 = true;
					} else if (local64 == 7) {
						this.aBoolean329 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean328 = true;
					}
					local45++;
				}
			}
			if (local29.anInt10066 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt4456 = local45;
			this.aShortArray44 = new short[local45];
			this.aShortArray49 = new short[local45];
			this.aShortArray47 = new short[local45];
			this.aShortArray46 = new short[local45];
			this.aShortArray43 = new short[local45];
			this.aByteArray53 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray44[local64] = Static188.aShortArray50[local64];
				this.aShortArray49[local64] = Static188.aShortArray42[local64];
				this.aShortArray47[local64] = Static188.aShortArray45[local64];
				this.aShortArray46[local64] = Static188.aShortArray51[local64];
				this.aShortArray43[local64] = Static188.aShortArray48[local64];
				this.aByteArray53[local64] = Static188.aByteArray54[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt4456 = 0;
			this.aBoolean330 = false;
			this.aBoolean329 = false;
		}
	}
}
