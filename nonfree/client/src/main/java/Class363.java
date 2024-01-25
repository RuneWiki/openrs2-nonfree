import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class363 {

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
	public int anInt9533 = 0;

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "Z")
	public boolean aBoolean694 = false;

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "Lclient!ms;")
	public Class1_Sub31 aClass1_Sub31_1 = null;

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "Z")
	public boolean aBoolean695 = false;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "Z")
	public boolean aBoolean693 = false;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "[S")
	public short[] aShortArray130;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "[S")
	public short[] aShortArray133;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "[S")
	public short[] aShortArray136;

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "[S")
	public short[] aShortArray134;

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "[B")
	public byte[] aByteArray103;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "([BLclient!ms;)V")
	public Class363(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub31 arg1) {
		this.aClass1_Sub31_1 = arg1;
		try {
			@Pc(24) Class1_Sub20 local24 = new Class1_Sub20(arg0);
			@Pc(29) Class1_Sub20 local29 = new Class1_Sub20(arg0);
			local24.method4393();
			local24.anInt5238 += 2;
			@Pc(43) int local43 = local24.method4393();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt5238 = local24.anInt5238 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass1_Sub31_1.anIntArray404[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method4393();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static591.aShortArray138[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static591.aShortArray131[local45] = local85;
					} else {
						Static591.aShortArray131[local45] = (short) local29.method4434();
					}
					if ((local72 & 0x2) == 0) {
						Static591.aShortArray132[local45] = local85;
					} else {
						Static591.aShortArray132[local45] = (short) local29.method4434();
					}
					if ((local72 & 0x4) == 0) {
						Static591.aShortArray137[local45] = local85;
					} else {
						Static591.aShortArray137[local45] = (short) local29.method4434();
					}
					Static591.aByteArray102[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static591.aShortArray131[local45] = (short) (Static591.aShortArray131[local45] << 2 & 0x3FFF);
						Static591.aShortArray132[local45] = (short) (Static591.aShortArray132[local45] << 2 & 0x3FFF);
						Static591.aShortArray137[local45] = (short) (Static591.aShortArray137[local45] << 2 & 0x3FFF);
					}
					Static591.aShortArray135[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static591.aShortArray135[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean694 = true;
					} else if (local64 == 7) {
						this.aBoolean695 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean693 = true;
					}
					local45++;
				}
			}
			if (local29.anInt5238 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt9533 = local45;
			this.aShortArray130 = new short[local45];
			this.aShortArray133 = new short[local45];
			this.aShortArray129 = new short[local45];
			this.aShortArray136 = new short[local45];
			this.aShortArray134 = new short[local45];
			this.aByteArray103 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray130[local64] = Static591.aShortArray138[local64];
				this.aShortArray133[local64] = Static591.aShortArray131[local64];
				this.aShortArray129[local64] = Static591.aShortArray132[local64];
				this.aShortArray136[local64] = Static591.aShortArray137[local64];
				this.aShortArray134[local64] = Static591.aShortArray135[local64];
				this.aByteArray103[local64] = Static591.aByteArray102[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt9533 = 0;
			this.aBoolean694 = false;
			this.aBoolean695 = false;
		}
	}
}
