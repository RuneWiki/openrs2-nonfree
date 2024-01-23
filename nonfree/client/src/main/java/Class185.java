import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class185 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
	public int anInt5740;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	public int anInt5743;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
	public int anInt5745;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Lclient!hm;")
	public Class75 aClass75_1;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIII)V")
	public Class185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class75 local5 = Static255.method4018(arg0);
		this.anInt5740 = arg3;
		this.anInt5743 = arg2;
		this.anInt5745 = arg1;
		if (Static116.aBoolean184 || local5.anInt2529 == -1) {
			this.aClass75_1 = local5;
		} else {
			this.aClass75_1 = Static255.method4018(local5.anInt2529);
		}
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!hm;III)V")
	public Class185(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass75_1 = arg0;
		this.anInt5743 = arg2;
		this.anInt5740 = arg3;
		this.anInt5745 = arg1;
	}
}
