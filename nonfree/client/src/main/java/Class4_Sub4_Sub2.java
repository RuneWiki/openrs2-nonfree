import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class4_Sub4_Sub2 extends Class4_Sub4 {

	@OriginalMember(owner = "client!d", name = "N", descriptor = "I")
	public int anInt571;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "I")
	public int anInt572;

	@OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
	public int anInt580;

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "I")
	public int anInt583;

	@OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
	public int anInt587;

	@OriginalMember(owner = "client!d", name = "mb", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!d", name = "S", descriptor = "I")
	public int anInt576 = -1;

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "Z")
	public boolean aBoolean19 = true;

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
	public int anInt581 = -1;

	@OriginalMember(owner = "client!d", name = "jb", descriptor = "I")
	public int anInt586 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!re;I)V")
	public void method358(@OriginalArg(1) Class4_Sub13 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method1223();
			if (local15 == 0) {
				return;
			}
			this.method364(arg0, arg1, local15);
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public void method361() {
		if (this.anInt576 != -1) {
			this.method363(this.anInt576);
			this.anInt583 = this.anInt587;
			this.anInt588 = this.anInt571;
			this.anInt572 = this.anInt580;
		}
		this.method363(this.anInt586);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V")
	private void method363(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local10;
		@Pc(34) double local34 = local10;
		if (local23 < local10) {
			local32 = local23;
		}
		if (local23 > local10) {
			local34 = local23;
		}
		if (local34 < local30) {
			local34 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(74) double local74 = (local32 + local34) / 2.0D;
		this.anInt580 = (int) (local74 * 256.0D);
		if (local32 != local34) {
			if (local34 == local10) {
				local60 = (local23 - local30) / (local34 - local32);
			} else if (local34 == local23) {
				local60 = (local30 - local10) / (-local32 + local34) + 2.0D;
			} else if (local34 == local30) {
				local60 = (local10 - local23) / (-local32 + local34) + 4.0D;
			}
			if (local74 < 0.5D) {
				local62 = (local34 - local32) / (local32 + local34);
			}
			if (local74 >= 0.5D) {
				local62 = (local34 - local32) / (2.0D - local32 - local34);
			}
		}
		if (this.anInt580 < 0) {
			this.anInt580 = 0;
		} else if (this.anInt580 > 255) {
			this.anInt580 = 255;
		}
		this.anInt587 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		this.anInt571 = (int) (local60 * 256.0D);
		if (this.anInt587 < 0) {
			this.anInt587 = 0;
		} else if (this.anInt587 > 255) {
			this.anInt587 = 255;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!re;III)V")
	private void method364(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt586 = arg0.method1241();
		} else if (arg2 == 2) {
			this.anInt581 = arg0.method1223();
		} else if (arg2 == 5) {
			this.aBoolean19 = false;
		} else if (arg2 == 7) {
			this.anInt576 = arg0.method1241();
		}
	}
}
