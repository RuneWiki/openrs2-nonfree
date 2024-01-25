import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class247 {

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "Z")
	public boolean aBoolean537 = false;

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
	public int anInt7322 = 0;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Lclient!ju;")
	public Class6_Sub32 aClass6_Sub32_1 = null;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Z")
	public boolean aBoolean538 = false;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Z")
	public boolean aBoolean539 = false;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "[S")
	public short[] aShortArray86;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "[S")
	public short[] aShortArray84;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([BLclient!ju;)V")
	public Class247(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub32 arg1) {
		this.aClass6_Sub32_1 = arg1;
		try {
			@Pc(24) Class6_Sub26 local24 = new Class6_Sub26(arg0);
			@Pc(29) Class6_Sub26 local29 = new Class6_Sub26(arg0);
			local24.method4966();
			local24.anInt5769 += 2;
			@Pc(43) int local43 = local24.method4966();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt5769 = local24.anInt5769 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass6_Sub32_1.anIntArray331[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method4966();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static391.aShortArray91[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static391.aShortArray92[local45] = local85;
					} else {
						Static391.aShortArray92[local45] = (short) local29.method4997();
					}
					if ((local72 & 0x2) == 0) {
						Static391.aShortArray90[local45] = local85;
					} else {
						Static391.aShortArray90[local45] = (short) local29.method4997();
					}
					if ((local72 & 0x4) == 0) {
						Static391.aShortArray93[local45] = local85;
					} else {
						Static391.aShortArray93[local45] = (short) local29.method4997();
					}
					Static391.aByteArray81[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static391.aShortArray92[local45] = (short) (Static391.aShortArray92[local45] << 2 & 0x3FFF);
						Static391.aShortArray90[local45] = (short) (Static391.aShortArray90[local45] << 2 & 0x3FFF);
						Static391.aShortArray93[local45] = (short) (Static391.aShortArray93[local45] << 2 & 0x3FFF);
					}
					Static391.aShortArray89[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static391.aShortArray89[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean539 = true;
					} else if (local64 == 7) {
						this.aBoolean538 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean537 = true;
					}
					local45++;
				}
			}
			if (local29.anInt5769 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt7322 = local45;
			this.aShortArray85 = new short[local45];
			this.aShortArray86 = new short[local45];
			this.aShortArray87 = new short[local45];
			this.aShortArray84 = new short[local45];
			this.aShortArray88 = new short[local45];
			this.aByteArray82 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray85[local64] = Static391.aShortArray91[local64];
				this.aShortArray86[local64] = Static391.aShortArray92[local64];
				this.aShortArray87[local64] = Static391.aShortArray90[local64];
				this.aShortArray84[local64] = Static391.aShortArray93[local64];
				this.aShortArray88[local64] = Static391.aShortArray89[local64];
				this.aByteArray82[local64] = Static391.aByteArray81[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt7322 = 0;
			this.aBoolean539 = false;
			this.aBoolean538 = false;
		}
	}
}
