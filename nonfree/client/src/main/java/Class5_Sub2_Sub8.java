import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class5_Sub2_Sub8 extends Class5_Sub2 {

	@OriginalMember(owner = "client!id", name = "O", descriptor = "I")
	public int anInt1369;

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
	public int anInt1371;

	@OriginalMember(owner = "client!id", name = "T", descriptor = "I")
	public int anInt1373;

	@OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
	public int anInt1376;

	@OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
	public int anInt1377;

	@OriginalMember(owner = "client!id", name = "db", descriptor = "I")
	public int anInt1381;

	@OriginalMember(owner = "client!id", name = "V", descriptor = "I")
	public int anInt1375 = -1;

	@OriginalMember(owner = "client!id", name = "S", descriptor = "Z")
	public boolean aBoolean46 = true;

	@OriginalMember(owner = "client!id", name = "R", descriptor = "I")
	public int anInt1372 = -1;

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
	public int anInt1383 = 0;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)V")
	private void method980(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = 0.0D;
		if (local14 > local23) {
			local32 = local23;
		}
		@Pc(42) double local42 = 0.0D;
		@Pc(44) double local44 = local14;
		if (local32 > local30) {
			local32 = local30;
		}
		if (local23 > local14) {
			local44 = local23;
		}
		if (local30 > local44) {
			local44 = local30;
		}
		@Pc(68) double local68 = (local32 + local44) / 2.0D;
		this.anInt1376 = (int) (local68 * 256.0D);
		if (this.anInt1376 < 0) {
			this.anInt1376 = 0;
		} else if (this.anInt1376 > 255) {
			this.anInt1376 = 255;
		}
		if (local44 != local32) {
			if (local68 < 0.5D) {
				local42 = (local44 - local32) / (local44 + local32);
			}
			if (local44 == local14) {
				local34 = (local23 - local30) / (local44 - local32);
			} else if (local44 == local23) {
				local34 = (local30 - local14) / (-local32 + local44) + 2.0D;
			} else if (local30 == local44) {
				local34 = (local14 - local23) / (local44 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local42 = (local44 - local32) / (2.0D - local32 - local44);
			}
		}
		this.anInt1381 = (int) (local42 * 256.0D);
		if (this.anInt1381 < 0) {
			this.anInt1381 = 0;
		} else if (this.anInt1381 > 255) {
			this.anInt1381 = 255;
		}
		local34 /= 6.0D;
		this.anInt1377 = (int) (local34 * 256.0D);
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(B)V")
	public void method981() {
		if (this.anInt1375 != -1) {
			this.method980(this.anInt1375);
			this.anInt1369 = this.anInt1376;
			this.anInt1371 = this.anInt1377;
			this.anInt1373 = this.anInt1381;
		}
		this.method980(this.anInt1383);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!pa;)V")
	public void method982(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub14 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method1471();
			if (local9 == 0) {
				return;
			}
			this.method986(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!pa;IIB)V")
	private void method986(@OriginalArg(0) Class5_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt1383 = arg0.method1439();
		} else if (arg1 == 2) {
			this.anInt1372 = arg0.method1471();
		} else if (arg1 == 3) {
			this.anInt1372 = arg0.method1478();
			if (this.anInt1372 == 65535) {
				this.anInt1372 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean46 = false;
			return;
		} else if (arg1 == 7) {
			this.anInt1375 = arg0.method1439();
		} else {
			return;
		}
	}
}
