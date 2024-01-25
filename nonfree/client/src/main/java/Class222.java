import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class222 {

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "Z")
	public boolean aBoolean487 = false;

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "Z")
	public boolean aBoolean486 = false;

	@OriginalMember(owner = "client!nfa", name = "k", descriptor = "I")
	public int anInt6931 = 0;

	@OriginalMember(owner = "client!nfa", name = "m", descriptor = "Z")
	public boolean aBoolean488 = false;

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "Lclient!fda;")
	public Class8_Sub22 aClass8_Sub22_1 = null;

	@OriginalMember(owner = "client!nfa", name = "q", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!nfa", name = "i", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!nfa", name = "o", descriptor = "[S")
	public short[] aShortArray95;

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "([BLclient!fda;)V")
	public Class222(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class8_Sub22 arg1) {
		this.aClass8_Sub22_1 = arg1;
		try {
			@Pc(24) Class8_Sub8 local24 = new Class8_Sub8(arg0);
			@Pc(29) Class8_Sub8 local29 = new Class8_Sub8(arg0);
			local24.method8525();
			local24.anInt10588 += 2;
			@Pc(43) int local43 = local24.method8525();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt10588 = local24.anInt10588 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass8_Sub22_1.anIntArray190[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method8525();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static363.aShortArray91[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static363.aShortArray94[local45] = local85;
					} else {
						Static363.aShortArray94[local45] = (short) local29.method8529();
					}
					if ((local72 & 0x2) == 0) {
						Static363.aShortArray88[local45] = local85;
					} else {
						Static363.aShortArray88[local45] = (short) local29.method8529();
					}
					if ((local72 & 0x4) == 0) {
						Static363.aShortArray96[local45] = local85;
					} else {
						Static363.aShortArray96[local45] = (short) local29.method8529();
					}
					Static363.aByteArray53[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static363.aShortArray94[local45] = (short) (Static363.aShortArray94[local45] << 2 & 0x3FFF);
						Static363.aShortArray88[local45] = (short) (Static363.aShortArray88[local45] << 2 & 0x3FFF);
						Static363.aShortArray96[local45] = (short) (Static363.aShortArray96[local45] << 2 & 0x3FFF);
					}
					Static363.aShortArray93[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static363.aShortArray93[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean488 = true;
					} else if (local64 == 7) {
						this.aBoolean487 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean486 = true;
					}
					local45++;
				}
			}
			if (local29.anInt10588 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6931 = local45;
			this.aShortArray97 = new short[local45];
			this.aShortArray92 = new short[local45];
			this.aShortArray90 = new short[local45];
			this.aShortArray89 = new short[local45];
			this.aShortArray95 = new short[local45];
			this.aByteArray52 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray97[local64] = Static363.aShortArray91[local64];
				this.aShortArray92[local64] = Static363.aShortArray94[local64];
				this.aShortArray90[local64] = Static363.aShortArray88[local64];
				this.aShortArray89[local64] = Static363.aShortArray96[local64];
				this.aShortArray95[local64] = Static363.aShortArray93[local64];
				this.aByteArray52[local64] = Static363.aByteArray53[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt6931 = 0;
			this.aBoolean488 = false;
			this.aBoolean487 = false;
		}
	}
}
