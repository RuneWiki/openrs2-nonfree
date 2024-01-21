import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!g", name = "V", descriptor = "I")
	public int anInt894;

	@OriginalMember(owner = "client!g", name = "W", descriptor = "I")
	public int anInt895;

	@OriginalMember(owner = "client!g", name = "X", descriptor = "I")
	public int anInt896;

	@OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
	public int anInt897;

	@OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
	public int anInt901;

	@OriginalMember(owner = "client!g", name = "mb", descriptor = "I")
	public int anInt906;

	@OriginalMember(owner = "client!g", name = "pb", descriptor = "I")
	public int anInt908 = 0;

	@OriginalMember(owner = "client!g", name = "ob", descriptor = "Z")
	public boolean aBoolean48 = true;

	@OriginalMember(owner = "client!g", name = "nb", descriptor = "I")
	public int anInt907 = -1;

	@OriginalMember(owner = "client!g", name = "tb", descriptor = "I")
	public int anInt911 = -1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!wd;IB)V")
	public void method701(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method1399();
			if (local13 == 0) {
				return;
			}
			this.method704(local13, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)V")
	private void method703(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local14 > local30) {
			local32 = local30;
		}
		if (local21 < local32) {
			local32 = local21;
		}
		@Pc(53) double local53 = 0.0D;
		@Pc(55) double local55 = 0.0D;
		if (local14 < local30) {
			local34 = local30;
		}
		if (local21 > local34) {
			local34 = local21;
		}
		@Pc(73) double local73 = (local32 + local34) / 2.0D;
		if (local32 != local34) {
			if (local73 < 0.5D) {
				local53 = (local34 - local32) / (local32 + local34);
			}
			if (local73 >= 0.5D) {
				local53 = (local34 - local32) / (2.0D - local34 - local32);
			}
			if (local34 == local14) {
				local55 = (local30 - local21) / (-local32 + local34);
			} else if (local34 == local30) {
				local55 = (local21 - local14) / (-local32 + local34) + 2.0D;
			} else if (local34 == local21) {
				local55 = (local14 - local30) / (local34 - local32) + 4.0D;
			}
		}
		local55 /= 6.0D;
		this.anInt906 = (int) (local53 * 256.0D);
		if (this.anInt906 < 0) {
			this.anInt906 = 0;
		} else if (this.anInt906 > 255) {
			this.anInt906 = 255;
		}
		this.anInt896 = (int) (local73 * 256.0D);
		if (this.anInt896 < 0) {
			this.anInt896 = 0;
		} else if (this.anInt896 > 255) {
			this.anInt896 = 255;
		}
		this.anInt901 = (int) (local55 * 256.0D);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BIILclient!wd;)V")
	private void method704(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub12 arg2) {
		if (arg0 == 1) {
			this.anInt908 = arg2.method1408();
		} else if (arg0 == 2) {
			this.anInt911 = arg2.method1399();
		} else if (arg0 == 5) {
			this.aBoolean48 = false;
		} else if (arg0 == 7) {
			this.anInt907 = arg2.method1408();
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
	public void method706() {
		if (this.anInt907 != -1) {
			this.method703(this.anInt907);
			this.anInt895 = this.anInt896;
			this.anInt897 = this.anInt901;
			this.anInt894 = this.anInt906;
		}
		this.method703(this.anInt908);
	}
}
