import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class332 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Z")
	public boolean aBoolean666 = false;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "Z")
	public boolean aBoolean667 = false;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "I")
	public int anInt9180 = 0;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "Lclient!df;")
	public Class5_Sub16 aClass5_Sub16_1 = null;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "Z")
	public boolean aBoolean668 = false;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "[S")
	public short[] aShortArray135;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "[S")
	public short[] aShortArray132;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "[S")
	public short[] aShortArray138;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "[S")
	public short[] aShortArray140;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "[S")
	public short[] aShortArray137;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "[B")
	public byte[] aByteArray96;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "([BLclient!df;)V")
	public Class332(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub16 arg1) {
		this.aClass5_Sub16_1 = arg1;
		try {
			@Pc(24) Class5_Sub22 local24 = new Class5_Sub22(arg0);
			@Pc(29) Class5_Sub22 local29 = new Class5_Sub22(arg0);
			local24.method5966();
			local24.anInt6629 += 2;
			@Pc(43) int local43 = local24.method5966();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt6629 = local24.anInt6629 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass5_Sub16_1.anIntArray120[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method5966();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static539.aShortArray133[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static539.aShortArray136[local45] = local85;
					} else {
						Static539.aShortArray136[local45] = (short) local29.method5964();
					}
					if ((local72 & 0x2) == 0) {
						Static539.aShortArray131[local45] = local85;
					} else {
						Static539.aShortArray131[local45] = (short) local29.method5964();
					}
					if ((local72 & 0x4) == 0) {
						Static539.aShortArray139[local45] = local85;
					} else {
						Static539.aShortArray139[local45] = (short) local29.method5964();
					}
					Static539.aByteArray95[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static539.aShortArray136[local45] = (short) (Static539.aShortArray136[local45] << 2 & 0x3FFF);
						Static539.aShortArray131[local45] = (short) (Static539.aShortArray131[local45] << 2 & 0x3FFF);
						Static539.aShortArray139[local45] = (short) (Static539.aShortArray139[local45] << 2 & 0x3FFF);
					}
					Static539.aShortArray134[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static539.aShortArray134[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean666 = true;
					} else if (local64 == 7) {
						this.aBoolean668 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean667 = true;
					}
					local45++;
				}
			}
			if (local29.anInt6629 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt9180 = local45;
			this.aShortArray135 = new short[local45];
			this.aShortArray132 = new short[local45];
			this.aShortArray138 = new short[local45];
			this.aShortArray140 = new short[local45];
			this.aShortArray137 = new short[local45];
			this.aByteArray96 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray135[local64] = Static539.aShortArray133[local64];
				this.aShortArray132[local64] = Static539.aShortArray136[local64];
				this.aShortArray138[local64] = Static539.aShortArray131[local64];
				this.aShortArray140[local64] = Static539.aShortArray139[local64];
				this.aShortArray137[local64] = Static539.aShortArray134[local64];
				this.aByteArray96[local64] = Static539.aByteArray95[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt9180 = 0;
			this.aBoolean666 = false;
			this.aBoolean668 = false;
		}
	}
}
