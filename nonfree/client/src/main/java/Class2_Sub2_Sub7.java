import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!g", name = "P", descriptor = "I")
	public int anInt1366;

	@OriginalMember(owner = "client!g", name = "T", descriptor = "I")
	public int anInt1370;

	@OriginalMember(owner = "client!g", name = "W", descriptor = "I")
	public int anInt1372;

	@OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
	public int anInt1374;

	@OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
	public int anInt1376;

	@OriginalMember(owner = "client!g", name = "ib", descriptor = "I")
	public int anInt1381;

	@OriginalMember(owner = "client!g", name = "R", descriptor = "I")
	public int anInt1368 = 0;

	@OriginalMember(owner = "client!g", name = "U", descriptor = "Z")
	public boolean aBoolean69 = true;

	@OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
	public int anInt1377 = -1;

	@OriginalMember(owner = "client!g", name = "db", descriptor = "I")
	public int anInt1378 = -1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V")
	private void method958(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local21;
		if (local30 < local21) {
			local32 = local30;
		}
		@Pc(48) double local48 = 0.0D;
		if (local12 < local32) {
			local32 = local12;
		}
		@Pc(56) double local56 = local21;
		if (local30 > local21) {
			local56 = local30;
		}
		if (local56 < local12) {
			local56 = local12;
		}
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local56 + local32) / 2.0D;
		if (local56 != local32) {
			if (local56 == local21) {
				local48 = (local30 - local12) / (local56 - local32);
			} else if (local56 == local30) {
				local48 = (local12 - local21) / (-local32 + local56) + 2.0D;
			} else if (local12 == local56) {
				local48 = (local21 - local30) / (local56 - local32) + 4.0D;
			}
			if (local76 < 0.5D) {
				local70 = (local56 - local32) / (local32 + local56);
			}
			if (local76 >= 0.5D) {
				local70 = (local56 - local32) / ((2.0D - local56) - local32);
			}
		}
		this.anInt1374 = (int) (local70 * 256.0D);
		if (this.anInt1374 < 0) {
			this.anInt1374 = 0;
		} else if (this.anInt1374 > 255) {
			this.anInt1374 = 255;
		}
		local48 /= 6.0D;
		this.anInt1381 = (int) (local48 * 256.0D);
		this.anInt1370 = (int) (local76 * 256.0D);
		if (this.anInt1370 < 0) {
			this.anInt1370 = 0;
		} else if (this.anInt1370 > 255) {
			this.anInt1370 = 255;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!oa;IIZ)V")
	private void method959(@OriginalArg(0) Class2_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt1368 = arg0.method2341();
		} else if (arg1 == 2) {
			this.anInt1378 = arg0.method2387();
		} else if (arg1 == 3) {
			this.anInt1378 = arg0.method2353();
			if (this.anInt1378 == 65535) {
				this.anInt1378 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean69 = false;
		} else if (arg1 == 7) {
			this.anInt1377 = arg0.method2341();
		} else if (arg1 != 8 && arg1 == 9) {
			arg0.method2353();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!oa;I)V")
	public void method960(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method2387();
			if (local5 == 0) {
				return;
			}
			this.method959(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V")
	public void method963() {
		if (this.anInt1377 != -1) {
			this.method958(this.anInt1377);
			this.anInt1366 = this.anInt1370;
			this.anInt1372 = this.anInt1374;
			this.anInt1376 = this.anInt1381;
		}
		this.method958(this.anInt1368);
		Static158.method2686(this.anInt1370, this.anInt1374, this.anInt1381);
	}
}
