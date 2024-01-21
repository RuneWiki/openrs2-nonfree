import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class38 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	public int anInt1434 = -1;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Z")
	public boolean aBoolean58 = false;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!mc;")
	public Class5_Sub8 aClass5_Sub8_1 = null;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "[I")
	public final int[] anIntArray165;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
	public final int[] anIntArray166;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
	public final int[] anIntArray163;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "[I")
	public final int[] anIntArray161;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([BLclient!mc;)V")
	public Class38(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub8 arg1) {
		this.aClass5_Sub8_1 = arg1;
		@Pc(18) Class5_Sub11 local18 = new Class5_Sub11(arg0);
		@Pc(23) Class5_Sub11 local23 = new Class5_Sub11(arg0);
		local18.anInt2233 = 2;
		@Pc(30) int local30 = local18.method1546();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2233 = local18.anInt2233 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1546();
			if (local47 > 0) {
				if (this.aClass5_Sub8_1.anIntArray213[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass5_Sub8_1.anIntArray213[local59] == 0) {
							Static55.anIntArray160[local34] = local59;
							Static55.anIntArray164[local34] = 0;
							Static55.anIntArray167[local34] = 0;
							Static55.anIntArray162[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static55.anIntArray160[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass5_Sub8_1.anIntArray213[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static55.anIntArray164[local34] = local94;
				} else {
					Static55.anIntArray164[local34] = local23.method1538();
				}
				if ((local47 & 0x2) == 0) {
					Static55.anIntArray167[local34] = local94;
				} else {
					Static55.anIntArray167[local34] = local23.method1538();
				}
				if ((local47 & 0x4) == 0) {
					Static55.anIntArray162[local34] = local94;
				} else {
					Static55.anIntArray162[local34] = local23.method1538();
				}
				local32 = local42;
				local34++;
				if (this.aClass5_Sub8_1.anIntArray213[local42] == 5) {
					this.aBoolean58 = true;
				}
			}
		}
		if (local23.anInt2233 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1434 = local34;
		this.anIntArray165 = new int[local34];
		this.anIntArray166 = new int[local34];
		this.anIntArray163 = new int[local34];
		this.anIntArray161 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray165[local47] = Static55.anIntArray160[local47];
			this.anIntArray166[local47] = Static55.anIntArray164[local47];
			this.anIntArray163[local47] = Static55.anIntArray167[local47];
			this.anIntArray161[local47] = Static55.anIntArray162[local47];
		}
	}
}
