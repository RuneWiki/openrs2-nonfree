import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class354 {

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!cb;")
	public Class49 aClass49_6;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
	public int anInt10466;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
	public int anInt10457 = 64;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Z")
	public boolean aBoolean717 = true;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
	public int anInt10460 = 8;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public int anInt10459 = 0;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Z")
	public boolean aBoolean718 = true;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Z")
	public boolean aBoolean716 = false;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
	public int anInt10463 = -1;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
	public int anInt10464 = 512;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
	public int anInt10458 = 1190717;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
	public int anInt10468 = -1;

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
	public int anInt10467 = 127;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public void method8732() {
		this.anInt10460 = this.anInt10460 << 8 | this.anInt10466;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!cea;I)V")
	private void method8734(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10459 = Static68.method2103(arg0.method8347());
		} else if (arg1 == 2) {
			this.anInt10468 = arg0.method8383();
			return;
		} else if (arg1 == 3) {
			this.anInt10468 = arg0.method8326();
			if (this.anInt10468 == 65535) {
				this.anInt10468 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean717 = false;
			return;
		} else if (arg1 == 7) {
			this.anInt10463 = Static68.method2103(arg0.method8347());
			return;
		} else if (arg1 == 8) {
			this.aClass49_6.anInt2009 = this.anInt10466;
			return;
		} else if (arg1 == 9) {
			this.anInt10464 = arg0.method8326() << 2;
			return;
		} else if (arg1 == 10) {
			this.aBoolean718 = false;
			return;
		} else if (arg1 == 11) {
			this.anInt10460 = arg0.method8383();
			return;
		} else if (arg1 == 12) {
			this.aBoolean716 = true;
			return;
		} else if (arg1 == 13) {
			this.anInt10458 = arg0.method8347();
			return;
		} else {
			if (arg1 == 14) {
				this.anInt10457 = arg0.method8383() << 2;
			} else if (arg1 == 16) {
				this.anInt10467 = arg0.method8383();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLclient!cea;)V")
	public void method8735(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method8383();
			if (local11 == 0) {
				return;
			}
			this.method8734(arg0, local11);
		}
	}
}
