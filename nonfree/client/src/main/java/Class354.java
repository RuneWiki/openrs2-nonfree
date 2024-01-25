import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class354 {

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "Z")
	public boolean aBoolean846 = false;

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
	public int anInt9977 = 0;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "Lclient!wha;")
	public Class5_Sub55 aClass5_Sub55_1 = null;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "Z")
	public boolean aBoolean845 = false;

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "Z")
	public boolean aBoolean847 = false;

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "[S")
	public short[] aShortArray147;

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "[S")
	public short[] aShortArray146;

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "[S")
	public short[] aShortArray148;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "[S")
	public short[] aShortArray140;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "[S")
	public short[] aShortArray139;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "[B")
	public byte[] aByteArray101;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "([BLclient!wha;)V")
	public Class354(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub55 arg1) {
		this.aClass5_Sub55_1 = arg1;
		try {
			@Pc(24) Class5_Sub41 local24 = new Class5_Sub41(arg0);
			@Pc(29) Class5_Sub41 local29 = new Class5_Sub41(arg0);
			local24.method7816();
			local24.anInt9230 += 2;
			@Pc(43) int local43 = local24.method7816();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt9230 = local24.anInt9230 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass5_Sub55_1.anIntArray604[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method7816();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static608.aShortArray142[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static608.aShortArray143[local45] = local85;
					} else {
						Static608.aShortArray143[local45] = (short) local29.method7845();
					}
					if ((local72 & 0x2) == 0) {
						Static608.aShortArray145[local45] = local85;
					} else {
						Static608.aShortArray145[local45] = (short) local29.method7845();
					}
					if ((local72 & 0x4) == 0) {
						Static608.aShortArray141[local45] = local85;
					} else {
						Static608.aShortArray141[local45] = (short) local29.method7845();
					}
					Static608.aByteArray102[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static608.aShortArray143[local45] = (short) (Static608.aShortArray143[local45] << 2 & 0x3FFF);
						Static608.aShortArray145[local45] = (short) (Static608.aShortArray145[local45] << 2 & 0x3FFF);
						Static608.aShortArray141[local45] = (short) (Static608.aShortArray141[local45] << 2 & 0x3FFF);
					}
					Static608.aShortArray144[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static608.aShortArray144[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean847 = true;
					} else if (local64 == 7) {
						this.aBoolean846 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean845 = true;
					}
					local45++;
				}
			}
			if (local29.anInt9230 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt9977 = local45;
			this.aShortArray147 = new short[local45];
			this.aShortArray146 = new short[local45];
			this.aShortArray148 = new short[local45];
			this.aShortArray140 = new short[local45];
			this.aShortArray139 = new short[local45];
			this.aByteArray101 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray147[local64] = Static608.aShortArray142[local64];
				this.aShortArray146[local64] = Static608.aShortArray143[local64];
				this.aShortArray148[local64] = Static608.aShortArray145[local64];
				this.aShortArray140[local64] = Static608.aShortArray141[local64];
				this.aShortArray139[local64] = Static608.aShortArray144[local64];
				this.aByteArray101[local64] = Static608.aByteArray102[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt9977 = 0;
			this.aBoolean847 = false;
			this.aBoolean846 = false;
		}
	}
}
