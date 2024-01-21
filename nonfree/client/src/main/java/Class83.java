import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class83 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!ha;")
	public Class2_Sub9 aClass2_Sub9_1 = null;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
	public int anInt3747 = -1;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "Z")
	public boolean aBoolean158 = false;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[S")
	public final short[] aShortArray40;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[S")
	public final short[] aShortArray44;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[S")
	public final short[] aShortArray46;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "[S")
	public final short[] aShortArray43;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[S")
	public final short[] aShortArray45;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([BLclient!ha;)V")
	public Class83(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub9 arg1) {
		this.aClass2_Sub9_1 = arg1;
		@Pc(18) Class2_Sub13 local18 = new Class2_Sub13(arg0);
		@Pc(23) Class2_Sub13 local23 = new Class2_Sub13(arg0);
		local18.anInt3940 = 2;
		@Pc(30) int local30 = local18.method2962();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt3940 = local18.anInt3940 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass2_Sub9_1.anIntArray166[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method2962();
			if (local57 > 0) {
				if (this.aClass2_Sub9_1.anIntArray166[local44] == 0) {
					local36 = local44;
				}
				Static172.aShortArray47[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass2_Sub9_1.anIntArray166[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static172.aShortArray42[local32] = local74;
				} else {
					Static172.aShortArray42[local32] = (short) local23.method2914();
				}
				if ((local57 & 0x2) == 0) {
					Static172.aShortArray41[local32] = local74;
				} else {
					Static172.aShortArray41[local32] = (short) local23.method2914();
				}
				if ((local57 & 0x4) == 0) {
					Static172.aShortArray48[local32] = local74;
				} else {
					Static172.aShortArray48[local32] = (short) local23.method2914();
				}
				Static172.aShortArray39[local32] = -1;
				if (this.aClass2_Sub9_1.anIntArray166[local44] >= 1 && this.aClass2_Sub9_1.anIntArray166[local44] <= 3 && local34 > local36) {
					Static172.aShortArray39[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass2_Sub9_1.anIntArray166[local44] == 5) {
					this.aBoolean158 = true;
				}
			}
		}
		if (local23.anInt3940 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3747 = local32;
		this.aShortArray40 = new short[local32];
		this.aShortArray44 = new short[local32];
		this.aShortArray46 = new short[local32];
		this.aShortArray43 = new short[local32];
		this.aShortArray45 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray40[local57] = Static172.aShortArray47[local57];
			this.aShortArray44[local57] = Static172.aShortArray42[local57];
			this.aShortArray46[local57] = Static172.aShortArray41[local57];
			this.aShortArray43[local57] = Static172.aShortArray48[local57];
			this.aShortArray45[local57] = Static172.aShortArray39[local57];
		}
	}
}
