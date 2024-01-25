import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class231 {

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Lclient!ns;")
	public Class220 aClass220_5;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "I")
	public int anInt6673;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "Z")
	public boolean aBoolean485 = true;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "Z")
	public boolean aBoolean486 = false;

	@OriginalMember(owner = "client!om", name = "l", descriptor = "I")
	public int anInt6664 = 0;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "I")
	public int anInt6666 = 1190717;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "I")
	public int anInt6659 = 128;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "Z")
	public boolean aBoolean484 = true;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "I")
	public int anInt6668 = -1;

	@OriginalMember(owner = "client!om", name = "t", descriptor = "I")
	public int anInt6671 = 16;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "I")
	public int anInt6665 = 127;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	public int anInt6669 = -1;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "I")
	public int anInt6675 = -1;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "I")
	public int anInt6657 = 8;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!daa;I)V")
	public void method5571(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5216();
			if (local5 == 0) {
				return;
			}
			this.method5574(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IILclient!daa;)V")
	private void method5574(@OriginalArg(1) int arg0, @OriginalArg(2) Class12_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt6664 = Static193.method3682(arg1.method5195());
		} else if (arg0 == 2) {
			this.anInt6668 = arg1.method5216();
			return;
		} else if (arg0 == 3) {
			this.anInt6668 = arg1.method5199();
			if (this.anInt6668 == 65535) {
				this.anInt6668 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean485 = false;
			return;
		} else if (arg0 == 7) {
			this.anInt6669 = Static193.method3682(arg1.method5195());
			return;
		} else if (arg0 == 8) {
			this.aClass220_5.anInt6440 = this.anInt6673;
			return;
		} else if (arg0 == 9) {
			this.anInt6659 = arg1.method5199() << 0;
			return;
		} else {
			if (arg0 == 10) {
				this.aBoolean484 = false;
			} else if (arg0 == 11) {
				this.anInt6657 = arg1.method5216();
				return;
			} else if (arg0 == 12) {
				this.aBoolean486 = true;
				return;
			} else if (arg0 == 13) {
				this.anInt6666 = arg1.method5195();
				return;
			} else if (arg0 == 14) {
				this.anInt6671 = arg1.method5216() << 0;
				return;
			} else if (arg0 == 15) {
				this.anInt6675 = arg1.method5199();
				if (this.anInt6675 == 65535) {
					this.anInt6675 = -1;
					return;
				}
			} else if (arg0 == 16) {
				this.anInt6665 = arg1.method5216();
				return;
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	public void method5575() {
		if (this.anInt6675 == -1) {
			this.anInt6675 = this.anInt6668;
		}
		this.anInt6657 = this.anInt6657 << 8 | this.anInt6673;
	}
}
