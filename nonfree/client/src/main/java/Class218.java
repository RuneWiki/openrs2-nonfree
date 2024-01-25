import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class218 {

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Z")
	public boolean aBoolean368 = false;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "I")
	public int anInt5534 = 0;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
	public boolean aBoolean367 = false;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Lclient!maa;")
	public Class5_Sub35 aClass5_Sub35_1 = null;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Z")
	public boolean aBoolean369 = false;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "([BLclient!maa;)V")
	public Class218(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub35 arg1) {
		this.aClass5_Sub35_1 = arg1;
		try {
			@Pc(24) Class5_Sub36 local24 = new Class5_Sub36(arg0);
			@Pc(29) Class5_Sub36 local29 = new Class5_Sub36(arg0);
			local24.method7291();
			local24.anInt8456 += 2;
			@Pc(43) int local43 = local24.method7291();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt8456 = local24.anInt8456 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass5_Sub35_1.anIntArray336[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method7291();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static327.aShortArray78[local45] = (short) local57;
					@Pc(87) short local87 = 0;
					if (local64 == 3 || local64 == 10) {
						local87 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static327.aShortArray82[local45] = local87;
					} else {
						Static327.aShortArray82[local45] = (short) local29.method7273();
					}
					if ((local72 & 0x2) == 0) {
						Static327.aShortArray80[local45] = local87;
					} else {
						Static327.aShortArray80[local45] = (short) local29.method7273();
					}
					if ((local72 & 0x4) == 0) {
						Static327.aShortArray83[local45] = local87;
					} else {
						Static327.aShortArray83[local45] = (short) local29.method7273();
					}
					Static327.aByteArray62[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static327.aShortArray82[local45] = (short) (Static327.aShortArray82[local45] << 2 & 0x3FFF);
						Static327.aShortArray80[local45] = (short) (Static327.aShortArray80[local45] << 2 & 0x3FFF);
						Static327.aShortArray83[local45] = (short) (Static327.aShortArray83[local45] << 2 & 0x3FFF);
					}
					Static327.aShortArray84[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static327.aShortArray84[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean367 = true;
					} else if (local64 == 7) {
						this.aBoolean368 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean369 = true;
					}
					local45++;
				}
			}
			if (local29.anInt8456 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt5534 = local45;
			this.aShortArray77 = new short[local45];
			this.aShortArray75 = new short[local45];
			this.aShortArray81 = new short[local45];
			this.aShortArray76 = new short[local45];
			this.aShortArray79 = new short[local45];
			this.aByteArray61 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray77[local64] = Static327.aShortArray78[local64];
				this.aShortArray75[local64] = Static327.aShortArray82[local64];
				this.aShortArray81[local64] = Static327.aShortArray80[local64];
				this.aShortArray76[local64] = Static327.aShortArray83[local64];
				this.aShortArray79[local64] = Static327.aShortArray84[local64];
				this.aByteArray61[local64] = Static327.aByteArray62[local64];
			}
		} catch (@Pc(359) Exception local359) {
			this.anInt5534 = 0;
			this.aBoolean367 = false;
			this.aBoolean368 = false;
		}
	}
}
