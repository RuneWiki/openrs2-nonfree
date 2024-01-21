import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class83 {

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public int anInt4471 = -1;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!rd;")
	public Class1_Sub22 aClass1_Sub22_1 = null;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "[S")
	public final short[] aShortArray39;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "[S")
	public final short[] aShortArray43;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "[S")
	public final short[] aShortArray44;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "[S")
	public final short[] aShortArray40;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "[S")
	public final short[] aShortArray41;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "([BLclient!rd;)V")
	public Class83(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub22 arg1) {
		this.aClass1_Sub22_1 = arg1;
		@Pc(18) Class1_Sub9 local18 = new Class1_Sub9(arg0);
		@Pc(23) Class1_Sub9 local23 = new Class1_Sub9(arg0);
		local18.anInt1592 = 2;
		@Pc(30) int local30 = local18.method1234();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt1592 = local18.anInt1592 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass1_Sub22_1.anIntArray362[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method1234();
			if (local57 > 0) {
				if (this.aClass1_Sub22_1.anIntArray362[local44] == 0) {
					local36 = local44;
				}
				Static175.aShortArray37[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass1_Sub22_1.anIntArray362[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static175.aShortArray38[local32] = local74;
				} else {
					Static175.aShortArray38[local32] = (short) local23.method1247();
				}
				if ((local57 & 0x2) == 0) {
					Static175.aShortArray46[local32] = local74;
				} else {
					Static175.aShortArray46[local32] = (short) local23.method1247();
				}
				if ((local57 & 0x4) == 0) {
					Static175.aShortArray45[local32] = local74;
				} else {
					Static175.aShortArray45[local32] = (short) local23.method1247();
				}
				Static175.aShortArray42[local32] = -1;
				if ((this.aClass1_Sub22_1.anIntArray362[local44] == 2 || this.aClass1_Sub22_1.anIntArray362[local44] == 3) && local34 > local36) {
					Static175.aShortArray42[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass1_Sub22_1.anIntArray362[local44] == 5) {
					this.aBoolean175 = true;
				}
			}
		}
		if (local23.anInt1592 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt4471 = local32;
		this.aShortArray39 = new short[local32];
		this.aShortArray43 = new short[local32];
		this.aShortArray44 = new short[local32];
		this.aShortArray40 = new short[local32];
		this.aShortArray41 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray39[local57] = Static175.aShortArray37[local57];
			this.aShortArray43[local57] = Static175.aShortArray38[local57];
			this.aShortArray44[local57] = Static175.aShortArray46[local57];
			this.aShortArray40[local57] = Static175.aShortArray45[local57];
			this.aShortArray41[local57] = Static175.aShortArray42[local57];
		}
	}
}
