import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class299 {

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "Z")
	public boolean aBoolean571 = false;

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "Lclient!no;")
	public Class3_Sub37 aClass3_Sub37_1 = null;

	@OriginalMember(owner = "client!sda", name = "j", descriptor = "Z")
	public boolean aBoolean572 = false;

	@OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
	public int anInt8360 = 0;

	@OriginalMember(owner = "client!sda", name = "l", descriptor = "Z")
	public boolean aBoolean573 = false;

	@OriginalMember(owner = "client!sda", name = "n", descriptor = "[S")
	public short[] aShortArray122;

	@OriginalMember(owner = "client!sda", name = "h", descriptor = "[S")
	public short[] aShortArray119;

	@OriginalMember(owner = "client!sda", name = "q", descriptor = "[S")
	public short[] aShortArray125;

	@OriginalMember(owner = "client!sda", name = "p", descriptor = "[S")
	public short[] aShortArray124;

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "[S")
	public short[] aShortArray116;

	@OriginalMember(owner = "client!sda", name = "g", descriptor = "[B")
	public byte[] aByteArray204;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "([BLclient!no;)V")
	public Class299(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub37 arg1) {
		this.aClass3_Sub37_1 = arg1;
		try {
			@Pc(24) Class3_Sub26 local24 = new Class3_Sub26(arg0);
			@Pc(29) Class3_Sub26 local29 = new Class3_Sub26(arg0);
			local24.method6814();
			local24.anInt8703 += 2;
			@Pc(43) int local43 = local24.method6814();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt8703 = local24.anInt8703 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass3_Sub37_1.anIntArray359[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method6814();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static482.aShortArray123[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static482.aShortArray118[local45] = local85;
					} else {
						Static482.aShortArray118[local45] = (short) local29.method6784();
					}
					if ((local72 & 0x2) == 0) {
						Static482.aShortArray117[local45] = local85;
					} else {
						Static482.aShortArray117[local45] = (short) local29.method6784();
					}
					if ((local72 & 0x4) == 0) {
						Static482.aShortArray120[local45] = local85;
					} else {
						Static482.aShortArray120[local45] = (short) local29.method6784();
					}
					Static482.aByteArray203[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static482.aShortArray118[local45] = (short) (Static482.aShortArray118[local45] << 2 & 0x3FFF);
						Static482.aShortArray117[local45] = (short) (Static482.aShortArray117[local45] << 2 & 0x3FFF);
						Static482.aShortArray120[local45] = (short) (Static482.aShortArray120[local45] << 2 & 0x3FFF);
					}
					Static482.aShortArray121[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static482.aShortArray121[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean572 = true;
					} else if (local64 == 7) {
						this.aBoolean571 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean573 = true;
					}
					local45++;
				}
			}
			if (local29.anInt8703 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt8360 = local45;
			this.aShortArray122 = new short[local45];
			this.aShortArray119 = new short[local45];
			this.aShortArray125 = new short[local45];
			this.aShortArray124 = new short[local45];
			this.aShortArray116 = new short[local45];
			this.aByteArray204 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray122[local64] = Static482.aShortArray123[local64];
				this.aShortArray119[local64] = Static482.aShortArray118[local64];
				this.aShortArray125[local64] = Static482.aShortArray117[local64];
				this.aShortArray124[local64] = Static482.aShortArray120[local64];
				this.aShortArray116[local64] = Static482.aShortArray121[local64];
				this.aByteArray204[local64] = Static482.aByteArray203[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt8360 = 0;
			this.aBoolean572 = false;
			this.aBoolean571 = false;
		}
	}
}
