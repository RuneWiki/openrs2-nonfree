import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class132 {

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
	public int anInt3801 = 0;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "Z")
	public boolean aBoolean315 = false;

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "Z")
	public boolean aBoolean316 = false;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "Lclient!jj;")
	public Class2_Sub25 aClass2_Sub25_1 = null;

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "Z")
	public boolean aBoolean317 = false;

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "([BLclient!jj;)V")
	public Class132(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub25 arg1) {
		this.aClass2_Sub25_1 = arg1;
		try {
			@Pc(24) Class2_Sub15 local24 = new Class2_Sub15(arg0);
			@Pc(29) Class2_Sub15 local29 = new Class2_Sub15(arg0);
			local24.method4325();
			local24.anInt5241 += 2;
			@Pc(43) int local43 = local24.method4325();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt5241 = local24.anInt5241 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass2_Sub25_1.anIntArray315[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method4325();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static184.aShortArray50[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static184.aShortArray53[local45] = local85;
					} else {
						Static184.aShortArray53[local45] = (short) local29.method4289();
					}
					if ((local72 & 0x2) == 0) {
						Static184.aShortArray47[local45] = local85;
					} else {
						Static184.aShortArray47[local45] = (short) local29.method4289();
					}
					if ((local72 & 0x4) == 0) {
						Static184.aShortArray48[local45] = local85;
					} else {
						Static184.aShortArray48[local45] = (short) local29.method4289();
					}
					Static184.aByteArray42[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static184.aShortArray53[local45] = (short) (Static184.aShortArray53[local45] << 2 & 0x3FFF);
						Static184.aShortArray47[local45] = (short) (Static184.aShortArray47[local45] << 2 & 0x3FFF);
						Static184.aShortArray48[local45] = (short) (Static184.aShortArray48[local45] << 2 & 0x3FFF);
					}
					Static184.aShortArray56[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static184.aShortArray56[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean315 = true;
					} else if (local64 == 7) {
						this.aBoolean317 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean316 = true;
					}
					local45++;
				}
			}
			if (local29.anInt5241 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt3801 = local45;
			this.aShortArray51 = new short[local45];
			this.aShortArray49 = new short[local45];
			this.aShortArray52 = new short[local45];
			this.aShortArray55 = new short[local45];
			this.aShortArray54 = new short[local45];
			this.aByteArray41 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray51[local64] = Static184.aShortArray50[local64];
				this.aShortArray49[local64] = Static184.aShortArray53[local64];
				this.aShortArray52[local64] = Static184.aShortArray47[local64];
				this.aShortArray55[local64] = Static184.aShortArray48[local64];
				this.aShortArray54[local64] = Static184.aShortArray56[local64];
				this.aByteArray41[local64] = Static184.aByteArray42[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt3801 = 0;
			this.aBoolean315 = false;
			this.aBoolean317 = false;
		}
	}
}
