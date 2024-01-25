import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public final class Class115 {

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
	public int anInt2982;

	@OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
	public int anInt2989;

	@OriginalMember(owner = "client!gda", name = "l", descriptor = "I")
	public int anInt2990;

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
	public int anInt2984 = 128;

	@OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
	public int anInt2991 = 128;

	@OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
	public int anInt2985;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(I)V")
	public Class115(@OriginalArg(0) int arg0) {
		this.anInt2985 = arg0;
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(IIIIII)V")
	private Class115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2985 = arg0;
		this.anInt2984 = arg1;
		this.anInt2982 = arg3;
		this.anInt2989 = arg4;
		this.anInt2990 = arg5;
		this.anInt2991 = arg2;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!gda;I)V")
	public void method2526(@OriginalArg(0) Class115 arg0) {
		this.anInt2982 = arg0.anInt2982;
		this.anInt2984 = arg0.anInt2984;
		this.anInt2985 = arg0.anInt2985;
		this.anInt2989 = arg0.anInt2989;
		this.anInt2990 = arg0.anInt2990;
		this.anInt2991 = arg0.anInt2991;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)Lclient!gda;")
	public Class115 method2528() {
		return new Class115(this.anInt2985, this.anInt2984, this.anInt2991, this.anInt2982, this.anInt2989, this.anInt2990);
	}
}
