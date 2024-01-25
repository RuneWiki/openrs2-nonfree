import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class308 {

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "Z")
	public boolean aBoolean580 = false;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Z")
	public boolean aBoolean579 = false;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Lclient!pi;")
	public Class6_Sub38 aClass6_Sub38_1 = null;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "Z")
	public boolean aBoolean581 = false;

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
	public int anInt8195 = 0;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "[S")
	public short[] aShortArray132;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "[S")
	public short[] aShortArray123;

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "[S")
	public short[] aShortArray131;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "[S")
	public short[] aShortArray130;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "[S")
	public short[] aShortArray126;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "[B")
	public byte[] aByteArray104;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "([BLclient!pi;)V")
	public Class308(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub38 arg1) {
		this.aClass6_Sub38_1 = arg1;
		try {
			@Pc(24) Class6_Sub21 local24 = new Class6_Sub21(arg0);
			@Pc(29) Class6_Sub21 local29 = new Class6_Sub21(arg0);
			local24.method6069();
			local24.anInt7338 += 2;
			@Pc(43) int local43 = local24.method6069();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt7338 = local24.anInt7338 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass6_Sub38_1.anIntArray513[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method6069();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static485.aShortArray125[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static485.aShortArray129[local45] = local85;
					} else {
						Static485.aShortArray129[local45] = (short) local29.method6057();
					}
					if ((local72 & 0x2) == 0) {
						Static485.aShortArray127[local45] = local85;
					} else {
						Static485.aShortArray127[local45] = (short) local29.method6057();
					}
					if ((local72 & 0x4) == 0) {
						Static485.aShortArray128[local45] = local85;
					} else {
						Static485.aShortArray128[local45] = (short) local29.method6057();
					}
					Static485.aByteArray105[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static485.aShortArray129[local45] = (short) (Static485.aShortArray129[local45] << 2 & 0x3FFF);
						Static485.aShortArray127[local45] = (short) (Static485.aShortArray127[local45] << 2 & 0x3FFF);
						Static485.aShortArray128[local45] = (short) (Static485.aShortArray128[local45] << 2 & 0x3FFF);
					}
					Static485.aShortArray124[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static485.aShortArray124[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean581 = true;
					} else if (local64 == 7) {
						this.aBoolean580 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean579 = true;
					}
					local45++;
				}
			}
			if (local29.anInt7338 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt8195 = local45;
			this.aShortArray132 = new short[local45];
			this.aShortArray123 = new short[local45];
			this.aShortArray131 = new short[local45];
			this.aShortArray130 = new short[local45];
			this.aShortArray126 = new short[local45];
			this.aByteArray104 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray132[local64] = Static485.aShortArray125[local64];
				this.aShortArray123[local64] = Static485.aShortArray129[local64];
				this.aShortArray131[local64] = Static485.aShortArray127[local64];
				this.aShortArray130[local64] = Static485.aShortArray128[local64];
				this.aShortArray126[local64] = Static485.aShortArray124[local64];
				this.aByteArray104[local64] = Static485.aByteArray105[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt8195 = 0;
			this.aBoolean581 = false;
			this.aBoolean580 = false;
		}
	}
}
