import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class1_Sub3_Sub5 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
	public int anInt497;

	@OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
	public int anInt499;

	@OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
	public int anInt504;

	@OriginalMember(owner = "client!cc", name = "gb", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!cc", name = "ib", descriptor = "I")
	public int anInt507 = 0;

	@OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
	public int anInt501 = -1;

	@OriginalMember(owner = "client!cc", name = "nb", descriptor = "Z")
	public boolean aBoolean14 = true;

	@OriginalMember(owner = "client!cc", name = "tb", descriptor = "I")
	public int anInt513 = -1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZIILclient!rd;)V")
	private void method417(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub20 arg2) {
		if (arg1 == 1) {
			this.anInt507 = arg2.method2075();
		} else if (arg1 == 2) {
			this.anInt513 = arg2.method2053();
		} else if (arg1 == 5) {
			this.aBoolean14 = false;
		} else if (arg1 == 7) {
			this.anInt501 = arg2.method2075();
			return;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!rd;)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2053();
			if (local9 == 0) {
				return;
			}
			this.method417(arg0, local9, arg1);
		}
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
	public void method422() {
		if (this.anInt501 != -1) {
			this.method424(this.anInt501);
			this.anInt506 = this.anInt497;
			this.anInt504 = this.anInt509;
			this.anInt502 = this.anInt499;
		}
		this.method424(this.anInt507);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
	private void method424(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local23;
		@Pc(34) double local34 = local23;
		if (local14 < local23) {
			local32 = local14;
		}
		@Pc(42) double local42 = 0.0D;
		if (local14 > local23) {
			local34 = local14;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		if (local34 < local30) {
			local34 = local30;
		}
		@Pc(62) double local62 = 0.0D;
		@Pc(76) double local76 = (local34 + local32) / 2.0D;
		this.anInt499 = (int) (local76 * 256.0D);
		if (this.anInt499 < 0) {
			this.anInt499 = 0;
		} else if (this.anInt499 > 255) {
			this.anInt499 = 255;
		}
		if (local34 != local32) {
			if (local76 < 0.5D) {
				local62 = (local34 - local32) / (local34 + local32);
			}
			if (local23 == local34) {
				local42 = (local14 - local30) / (local34 - local32);
			} else if (local14 == local34) {
				local42 = (local30 - local23) / (-local32 + local34) + 2.0D;
			} else if (local34 == local30) {
				local42 = (local23 - local14) / (local34 - local32) + 4.0D;
			}
			if (local76 >= 0.5D) {
				local62 = (local34 - local32) / (2.0D - local32 - local34);
			}
		}
		local42 /= 6.0D;
		this.anInt497 = (int) (local62 * 256.0D);
		this.anInt509 = (int) (local42 * 256.0D);
		if (this.anInt497 < 0) {
			this.anInt497 = 0;
		} else if (this.anInt497 > 255) {
			this.anInt497 = 255;
			return;
		}
	}
}
