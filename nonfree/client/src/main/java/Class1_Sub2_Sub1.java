import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!af", name = "R", descriptor = "I")
	public int anInt152;

	@OriginalMember(owner = "client!af", name = "S", descriptor = "I")
	public int anInt153;

	@OriginalMember(owner = "client!af", name = "T", descriptor = "I")
	public int anInt154;

	@OriginalMember(owner = "client!af", name = "X", descriptor = "I")
	public int anInt155;

	@OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
	public int anInt158;

	@OriginalMember(owner = "client!af", name = "fb", descriptor = "I")
	public int anInt160;

	@OriginalMember(owner = "client!af", name = "gb", descriptor = "I")
	public int anInt161 = -1;

	@OriginalMember(owner = "client!af", name = "cb", descriptor = "Z")
	public boolean aBoolean4 = true;

	@OriginalMember(owner = "client!af", name = "kb", descriptor = "I")
	public int anInt165 = -1;

	@OriginalMember(owner = "client!af", name = "mb", descriptor = "I")
	public int anInt167 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!dc;I)V")
	private void method129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub5 arg2) {
		if (arg0 == 1) {
			this.anInt167 = arg2.method660();
		} else if (arg0 == 2) {
			this.anInt165 = arg2.method672();
		} else if (arg0 == 5) {
			this.aBoolean4 = false;
		} else if (arg0 == 7) {
			this.anInt161 = arg2.method660();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!dc;BI)V")
	public void method130(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method672();
			if (local14 == 0) {
				return;
			}
			this.method129(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
	public void method131() {
		if (this.anInt161 != -1) {
			this.method134(this.anInt161);
			this.anInt155 = this.anInt154;
			this.anInt160 = this.anInt152;
			this.anInt153 = this.anInt158;
		}
		this.method134(this.anInt167);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	private void method134(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local10;
		if (local30 < local10) {
			local32 = local30;
		}
		if (local32 > local21) {
			local32 = local21;
		}
		@Pc(51) double local51 = 0.0D;
		@Pc(53) double local53 = local10;
		@Pc(55) double local55 = 0.0D;
		if (local10 < local30) {
			local53 = local30;
		}
		if (local21 > local53) {
			local53 = local21;
		}
		@Pc(73) double local73 = (local32 + local53) / 2.0D;
		this.anInt158 = (int) (local73 * 256.0D);
		if (local53 != local32) {
			if (local10 == local53) {
				local51 = (local30 - local21) / (local53 - local32);
			} else if (local30 == local53) {
				local51 = (local21 - local10) / (local53 - local32) + 2.0D;
			} else if (local53 == local21) {
				local51 = (local10 - local30) / (local53 - local32) + 4.0D;
			}
			if (local73 < 0.5D) {
				local55 = (local53 - local32) / (local32 + local53);
			}
			if (local73 >= 0.5D) {
				local55 = (local53 - local32) / (2.0D - local53 - local32);
			}
		}
		local51 /= 6.0D;
		this.anInt152 = (int) (local55 * 256.0D);
		this.anInt154 = (int) (local51 * 256.0D);
		if (this.anInt158 < 0) {
			this.anInt158 = 0;
		} else if (this.anInt158 > 255) {
			this.anInt158 = 255;
		}
		if (this.anInt152 < 0) {
			this.anInt152 = 0;
		} else if (this.anInt152 > 255) {
			this.anInt152 = 255;
			return;
		}
	}
}
