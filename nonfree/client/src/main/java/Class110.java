import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class110 {

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Z")
	public boolean aBoolean266 = false;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Z")
	public boolean aBoolean267 = false;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
	public int anInt3382 = 0;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Lclient!go;")
	public Class3_Sub23 aClass3_Sub23_1 = null;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "Z")
	public boolean aBoolean268 = false;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "[S")
	public short[] aShortArray37;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([BLclient!go;)V")
	public Class110(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub23 arg1) {
		this.aClass3_Sub23_1 = arg1;
		try {
			@Pc(24) Class3_Sub11 local24 = new Class3_Sub11(arg0);
			@Pc(29) Class3_Sub11 local29 = new Class3_Sub11(arg0);
			local24.method5175();
			local24.anInt6128 += 2;
			@Pc(43) int local43 = local24.method5175();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt6128 = local24.anInt6128 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass3_Sub23_1.anIntArray179[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method5175();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static170.aShortArray36[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static170.aShortArray38[local45] = local85;
					} else {
						Static170.aShortArray38[local45] = (short) local29.method5172();
					}
					if ((local72 & 0x2) == 0) {
						Static170.aShortArray39[local45] = local85;
					} else {
						Static170.aShortArray39[local45] = (short) local29.method5172();
					}
					if ((local72 & 0x4) == 0) {
						Static170.aShortArray43[local45] = local85;
					} else {
						Static170.aShortArray43[local45] = (short) local29.method5172();
					}
					Static170.aByteArray36[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static170.aShortArray38[local45] = (short) (Static170.aShortArray38[local45] << 2 & 0x3FFF);
						Static170.aShortArray39[local45] = (short) (Static170.aShortArray39[local45] << 2 & 0x3FFF);
						Static170.aShortArray43[local45] = (short) (Static170.aShortArray43[local45] << 2 & 0x3FFF);
					}
					Static170.aShortArray44[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static170.aShortArray44[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean267 = true;
					} else if (local64 == 7) {
						this.aBoolean266 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean268 = true;
					}
					local45++;
				}
			}
			if (local29.anInt6128 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt3382 = local45;
			this.aShortArray37 = new short[local45];
			this.aShortArray35 = new short[local45];
			this.aShortArray40 = new short[local45];
			this.aShortArray42 = new short[local45];
			this.aShortArray41 = new short[local45];
			this.aByteArray35 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray37[local64] = Static170.aShortArray36[local64];
				this.aShortArray35[local64] = Static170.aShortArray38[local64];
				this.aShortArray40[local64] = Static170.aShortArray39[local64];
				this.aShortArray42[local64] = Static170.aShortArray43[local64];
				this.aShortArray41[local64] = Static170.aShortArray44[local64];
				this.aByteArray35[local64] = Static170.aByteArray36[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt3382 = 0;
			this.aBoolean267 = false;
			this.aBoolean266 = false;
		}
	}
}
