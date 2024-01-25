import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class169 {

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	public int anInt4722;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
	public int anInt4727;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	public int anInt4730;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
	public int anInt4725 = 128;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
	public int anInt4728 = 128;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
	public int anInt4726;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
	public Class169(@OriginalArg(0) int arg0) {
		this.anInt4726 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIII)V")
	private Class169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4728 = arg1;
		this.anInt4722 = arg4;
		this.anInt4726 = arg0;
		this.anInt4725 = arg2;
		this.anInt4727 = arg3;
		this.anInt4730 = arg5;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLclient!ke;)V")
	public void method4004(@OriginalArg(1) Class169 arg0) {
		this.anInt4726 = arg0.anInt4726;
		this.anInt4728 = arg0.anInt4728;
		this.anInt4727 = arg0.anInt4727;
		this.anInt4725 = arg0.anInt4725;
		this.anInt4722 = arg0.anInt4722;
		this.anInt4730 = arg0.anInt4730;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Lclient!ke;")
	public Class169 method4008() {
		return new Class169(this.anInt4726, this.anInt4728, this.anInt4725, this.anInt4727, this.anInt4722, this.anInt4730);
	}
}
