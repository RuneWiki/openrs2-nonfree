import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class191 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
	public int anInt6623 = -1;

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
	public int anInt6625 = 64;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
	public int anInt6628 = 64;

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "Z")
	public boolean aBoolean521 = false;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "Z")
	public boolean aBoolean522 = false;

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
	public int anInt6631 = 1;

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
	public int anInt6627 = 2;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!ji;III)V")
	private void method5540(@OriginalArg(0) Class6_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt6623 = arg0.method8220();
			if (this.anInt6623 == 65535) {
				this.anInt6623 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt6625 = arg0.method8220() + 1;
			this.anInt6628 = arg0.method8220() + 1;
		} else if (arg1 == 3) {
			arg0.method8208();
		} else if (arg1 == 4) {
			this.anInt6627 = arg0.method8246();
		} else if (arg1 == 5) {
			this.anInt6631 = arg0.method8246();
		} else if (arg1 == 6) {
			this.aBoolean522 = true;
		} else if (arg1 == 7) {
			this.aBoolean521 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BLclient!ji;I)V")
	public void method5543(@OriginalArg(1) Class6_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method8246();
			if (local9 == 0) {
				return;
			}
			this.method5540(arg0, local9, arg1);
		}
	}
}
