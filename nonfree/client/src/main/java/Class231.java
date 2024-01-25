import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class231 {

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!sf;")
	public Class2_Sub45 aClass2_Sub45_1 = null;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Z")
	public boolean aBoolean491 = false;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "Z")
	public boolean aBoolean492 = false;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
	public int anInt6652 = 0;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "Z")
	public boolean aBoolean493 = false;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([BLclient!sf;)V")
	public Class231(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub45 arg1) {
		this.aClass2_Sub45_1 = arg1;
		try {
			@Pc(24) Class2_Sub34 local24 = new Class2_Sub34(arg0);
			@Pc(29) Class2_Sub34 local29 = new Class2_Sub34(arg0);
			local24.method6904();
			local24.anInt8188 += 2;
			@Pc(43) int local43 = local24.method6904();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt8188 = local24.anInt8188 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass2_Sub45_1.anIntArray591[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method6904();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static373.aShortArray76[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static373.aShortArray77[local45] = local85;
					} else {
						Static373.aShortArray77[local45] = (short) local29.method6901();
					}
					if ((local72 & 0x2) == 0) {
						Static373.aShortArray83[local45] = local85;
					} else {
						Static373.aShortArray83[local45] = (short) local29.method6901();
					}
					if ((local72 & 0x4) == 0) {
						Static373.aShortArray79[local45] = local85;
					} else {
						Static373.aShortArray79[local45] = (short) local29.method6901();
					}
					Static373.aByteArray67[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static373.aShortArray77[local45] = (short) (Static373.aShortArray77[local45] << 2 & 0x3FFF);
						Static373.aShortArray83[local45] = (short) (Static373.aShortArray83[local45] << 2 & 0x3FFF);
						Static373.aShortArray79[local45] = (short) (Static373.aShortArray79[local45] << 2 & 0x3FFF);
					}
					Static373.aShortArray82[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static373.aShortArray82[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean492 = true;
					} else if (local64 == 7) {
						this.aBoolean493 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean491 = true;
					}
					local45++;
				}
			}
			if (local29.anInt8188 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6652 = local45;
			this.aShortArray74 = new short[local45];
			this.aShortArray80 = new short[local45];
			this.aShortArray81 = new short[local45];
			this.aShortArray75 = new short[local45];
			this.aShortArray78 = new short[local45];
			this.aByteArray66 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray74[local64] = Static373.aShortArray76[local64];
				this.aShortArray80[local64] = Static373.aShortArray77[local64];
				this.aShortArray81[local64] = Static373.aShortArray83[local64];
				this.aShortArray75[local64] = Static373.aShortArray79[local64];
				this.aShortArray78[local64] = Static373.aShortArray82[local64];
				this.aByteArray66[local64] = Static373.aByteArray67[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt6652 = 0;
			this.aBoolean492 = false;
			this.aBoolean493 = false;
		}
	}
}
