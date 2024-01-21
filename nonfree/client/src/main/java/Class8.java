import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class8 {

	@OriginalMember(owner = "client!b", name = "b", descriptor = "I")
	public int anInt268 = -1;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!nb;")
	public Class1_Sub17 aClass1_Sub17_1 = null;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Z")
	public boolean aBoolean12 = false;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "[S")
	public final short[] aShortArray10;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "[S")
	public final short[] aShortArray8;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "[S")
	public final short[] aShortArray12;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "[S")
	public final short[] aShortArray9;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "[S")
	public final short[] aShortArray5;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "([BLclient!nb;)V")
	public Class8(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub17 arg1) {
		this.aClass1_Sub17_1 = arg1;
		@Pc(18) Class1_Sub7 local18 = new Class1_Sub7(arg0);
		@Pc(23) Class1_Sub7 local23 = new Class1_Sub7(arg0);
		local18.anInt3592 = 2;
		@Pc(30) int local30 = local18.method2771();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt3592 = local18.anInt3592 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass1_Sub17_1.anIntArray223[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method2771();
			if (local57 > 0) {
				if (this.aClass1_Sub17_1.anIntArray223[local44] == 0) {
					local36 = local44;
				}
				Static11.aShortArray7[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass1_Sub17_1.anIntArray223[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static11.aShortArray11[local32] = local74;
				} else {
					Static11.aShortArray11[local32] = (short) local23.method2759();
				}
				if ((local57 & 0x2) == 0) {
					Static11.aShortArray6[local32] = local74;
				} else {
					Static11.aShortArray6[local32] = (short) local23.method2759();
				}
				if ((local57 & 0x4) == 0) {
					Static11.aShortArray13[local32] = local74;
				} else {
					Static11.aShortArray13[local32] = (short) local23.method2759();
				}
				if (this.aClass1_Sub17_1.anIntArray223[local44] == 2) {
					Static11.aShortArray11[local32] = (short) (((Static11.aShortArray11[local32] & 0xFF) << 3) + (Static11.aShortArray11[local32] >> 8 & 0x7));
					Static11.aShortArray6[local32] = (short) (((Static11.aShortArray6[local32] & 0xFF) << 3) + (Static11.aShortArray6[local32] >> 8 & 0x7));
					Static11.aShortArray13[local32] = (short) (((Static11.aShortArray13[local32] & 0xFF) << 3) + (Static11.aShortArray13[local32] >> 8 & 0x7));
				}
				Static11.aShortArray14[local32] = -1;
				if (this.aClass1_Sub17_1.anIntArray223[local44] >= 1 && this.aClass1_Sub17_1.anIntArray223[local44] <= 3 && local34 > local36) {
					Static11.aShortArray14[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass1_Sub17_1.anIntArray223[local44] == 5) {
					this.aBoolean12 = true;
				}
			}
		}
		if (local23.anInt3592 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt268 = local32;
		this.aShortArray10 = new short[local32];
		this.aShortArray8 = new short[local32];
		this.aShortArray12 = new short[local32];
		this.aShortArray9 = new short[local32];
		this.aShortArray5 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray10[local57] = Static11.aShortArray7[local57];
			this.aShortArray8[local57] = Static11.aShortArray11[local57];
			this.aShortArray12[local57] = Static11.aShortArray6[local57];
			this.aShortArray9[local57] = Static11.aShortArray13[local57];
			this.aShortArray5[local57] = Static11.aShortArray14[local57];
		}
	}
}
