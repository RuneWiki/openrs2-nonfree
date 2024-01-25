import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class122 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!uv;")
	public Class4_Sub50 aClass4_Sub50_1 = null;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Z")
	public boolean aBoolean241 = false;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Z")
	public boolean aBoolean242 = false;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	public int anInt3369 = 0;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([BLclient!uv;)V")
	public Class122(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub50 arg1) {
		this.aClass4_Sub50_1 = arg1;
		try {
			@Pc(24) Class4_Sub13 local24 = new Class4_Sub13(arg0);
			@Pc(29) Class4_Sub13 local29 = new Class4_Sub13(arg0);
			local24.method7004();
			local24.anInt9170 += 2;
			@Pc(43) int local43 = local24.method7004();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt9170 = local24.anInt9170 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass4_Sub50_1.anIntArray558[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method7004();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static163.aShortArray31[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static163.aShortArray30[local45] = local85;
					} else {
						Static163.aShortArray30[local45] = (short) local29.method7017();
					}
					if ((local72 & 0x2) == 0) {
						Static163.aShortArray35[local45] = local85;
					} else {
						Static163.aShortArray35[local45] = (short) local29.method7017();
					}
					if ((local72 & 0x4) == 0) {
						Static163.aShortArray26[local45] = local85;
					} else {
						Static163.aShortArray26[local45] = (short) local29.method7017();
					}
					Static163.aByteArray29[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static163.aShortArray30[local45] = (short) (Static163.aShortArray30[local45] << 2 & 0x3FFF);
						Static163.aShortArray35[local45] = (short) (Static163.aShortArray35[local45] << 2 & 0x3FFF);
						Static163.aShortArray26[local45] = (short) (Static163.aShortArray26[local45] << 2 & 0x3FFF);
					}
					Static163.aShortArray27[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static163.aShortArray27[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean242 = true;
					} else if (local64 == 7) {
						this.aBoolean241 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean243 = true;
					}
					local45++;
				}
			}
			if (local29.anInt9170 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt3369 = local45;
			this.aShortArray33 = new short[local45];
			this.aShortArray28 = new short[local45];
			this.aShortArray32 = new short[local45];
			this.aShortArray29 = new short[local45];
			this.aShortArray34 = new short[local45];
			this.aByteArray28 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray33[local64] = Static163.aShortArray31[local64];
				this.aShortArray28[local64] = Static163.aShortArray30[local64];
				this.aShortArray32[local64] = Static163.aShortArray35[local64];
				this.aShortArray29[local64] = Static163.aShortArray26[local64];
				this.aShortArray34[local64] = Static163.aShortArray27[local64];
				this.aByteArray28[local64] = Static163.aByteArray29[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt3369 = 0;
			this.aBoolean242 = false;
			this.aBoolean241 = false;
		}
	}
}
