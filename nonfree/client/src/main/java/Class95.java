import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class95 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "Z")
	public boolean aBoolean217 = false;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "Lclient!via;")
	public Class2_Sub46 aClass2_Sub46_1 = null;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
	public int anInt2696 = 0;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Z")
	public boolean aBoolean218 = false;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "Z")
	public boolean aBoolean219 = false;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([BLclient!via;)V")
	public Class95(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub46 arg1) {
		this.aClass2_Sub46_1 = arg1;
		try {
			@Pc(24) Class2_Sub17 local24 = new Class2_Sub17(arg0);
			@Pc(29) Class2_Sub17 local29 = new Class2_Sub17(arg0);
			local24.method2859();
			local24.anInt3378 += 2;
			@Pc(43) int local43 = local24.method2859();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt3378 = local24.anInt3378 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass2_Sub46_1.anIntArray712[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method2859();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static128.aShortArray38[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static128.aShortArray39[local45] = local85;
					} else {
						Static128.aShortArray39[local45] = (short) local29.method2823();
					}
					if ((local72 & 0x2) == 0) {
						Static128.aShortArray43[local45] = local85;
					} else {
						Static128.aShortArray43[local45] = (short) local29.method2823();
					}
					if ((local72 & 0x4) == 0) {
						Static128.aShortArray37[local45] = local85;
					} else {
						Static128.aShortArray37[local45] = (short) local29.method2823();
					}
					Static128.aByteArray20[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static128.aShortArray39[local45] = (short) (Static128.aShortArray39[local45] << 2 & 0x3FFF);
						Static128.aShortArray43[local45] = (short) (Static128.aShortArray43[local45] << 2 & 0x3FFF);
						Static128.aShortArray37[local45] = (short) (Static128.aShortArray37[local45] << 2 & 0x3FFF);
					}
					Static128.aShortArray42[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static128.aShortArray42[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean218 = true;
					} else if (local64 == 7) {
						this.aBoolean217 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean219 = true;
					}
					local45++;
				}
			}
			if (local29.anInt3378 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt2696 = local45;
			this.aShortArray41 = new short[local45];
			this.aShortArray44 = new short[local45];
			this.aShortArray46 = new short[local45];
			this.aShortArray40 = new short[local45];
			this.aShortArray45 = new short[local45];
			this.aByteArray19 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray41[local64] = Static128.aShortArray38[local64];
				this.aShortArray44[local64] = Static128.aShortArray39[local64];
				this.aShortArray46[local64] = Static128.aShortArray43[local64];
				this.aShortArray40[local64] = Static128.aShortArray37[local64];
				this.aShortArray45[local64] = Static128.aShortArray42[local64];
				this.aByteArray19[local64] = Static128.aByteArray20[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt2696 = 0;
			this.aBoolean218 = false;
			this.aBoolean217 = false;
		}
	}
}
