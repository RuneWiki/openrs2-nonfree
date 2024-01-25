import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class208 {

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
	public int anInt5883;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
	public int anInt5887;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
	public int anInt5888;

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
	public int anInt5891;

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
	public int anInt5892;

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
	public int anInt5893;

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
	public int anInt5896;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
	public int anInt5884 = 128;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
	public int anInt5894 = 128;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
	public int anInt5885;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I)V")
	public Class208(@OriginalArg(0) int arg0) {
		this.anInt5885 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(IIIIII)V")
	private Class208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5896 = arg4;
		this.anInt5885 = arg0;
		this.anInt5888 = arg3;
		this.anInt5884 = arg2;
		this.anInt5891 = arg5;
		this.anInt5894 = arg1;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Lclient!qj;")
	public Class208 method4889() {
		return new Class208(this.anInt5885, this.anInt5894, this.anInt5884, this.anInt5888, this.anInt5896, this.anInt5891);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!qj;)V")
	public void method4892(@OriginalArg(1) Class208 arg0) {
		this.anInt5885 = arg0.anInt5885;
		this.anInt5888 = arg0.anInt5888;
		this.anInt5896 = arg0.anInt5896;
		this.anInt5884 = arg0.anInt5884;
		this.anInt5894 = arg0.anInt5894;
		this.anInt5891 = arg0.anInt5891;
	}
}
