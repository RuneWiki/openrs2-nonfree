import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class80 {

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!eea", name = "o", descriptor = "I")
	public int anInt2606 = 0;

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "Z")
	public boolean aBoolean202 = false;

	@OriginalMember(owner = "client!eea", name = "i", descriptor = "Z")
	public boolean aBoolean203 = false;

	@OriginalMember(owner = "client!eea", name = "q", descriptor = "Lclient!sfa;")
	public Class3_Sub44 aClass3_Sub44_1 = null;

	@OriginalMember(owner = "client!eea", name = "k", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!eea", name = "l", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!eea", name = "f", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!eea", name = "p", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "([BLclient!sfa;)V")
	public Class80(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub44 arg1) {
		this.aClass3_Sub44_1 = arg1;
		try {
			@Pc(24) Class3_Sub7 local24 = new Class3_Sub7(arg0);
			@Pc(29) Class3_Sub7 local29 = new Class3_Sub7(arg0);
			local24.method6538();
			local24.anInt7869 += 2;
			@Pc(43) int local43 = local24.method6538();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt7869 = local24.anInt7869 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass3_Sub44_1.anIntArray580[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method6538();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static111.aShortArray45[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static111.aShortArray46[local45] = local85;
					} else {
						Static111.aShortArray46[local45] = (short) local29.method6511();
					}
					if ((local72 & 0x2) == 0) {
						Static111.aShortArray42[local45] = local85;
					} else {
						Static111.aShortArray42[local45] = (short) local29.method6511();
					}
					if ((local72 & 0x4) == 0) {
						Static111.aShortArray40[local45] = local85;
					} else {
						Static111.aShortArray40[local45] = (short) local29.method6511();
					}
					Static111.aByteArray37[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static111.aShortArray46[local45] = (short) (Static111.aShortArray46[local45] << 2 & 0x3FFF);
						Static111.aShortArray42[local45] = (short) (Static111.aShortArray42[local45] << 2 & 0x3FFF);
						Static111.aShortArray40[local45] = (short) (Static111.aShortArray40[local45] << 2 & 0x3FFF);
					}
					Static111.aShortArray39[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static111.aShortArray39[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean203 = true;
					} else if (local64 == 7) {
						this.aBoolean201 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean202 = true;
					}
					local45++;
				}
			}
			if (local29.anInt7869 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt2606 = local45;
			this.aShortArray43 = new short[local45];
			this.aShortArray44 = new short[local45];
			this.aShortArray38 = new short[local45];
			this.aShortArray41 = new short[local45];
			this.aShortArray47 = new short[local45];
			this.aByteArray36 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray43[local64] = Static111.aShortArray45[local64];
				this.aShortArray44[local64] = Static111.aShortArray46[local64];
				this.aShortArray38[local64] = Static111.aShortArray42[local64];
				this.aShortArray41[local64] = Static111.aShortArray40[local64];
				this.aShortArray47[local64] = Static111.aShortArray39[local64];
				this.aByteArray36[local64] = Static111.aByteArray37[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt2606 = 0;
			this.aBoolean203 = false;
			this.aBoolean201 = false;
		}
	}
}
