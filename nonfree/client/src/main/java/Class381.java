import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class381 {

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
	public final int anInt10709;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
	public final int anInt10716;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
	public final int anInt10711;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
	public final int anInt10714;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(IIII)V")
	public Class381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10709 = arg1;
		this.anInt10716 = arg3;
		this.anInt10711 = arg0;
		this.anInt10714 = arg2;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IB)Lclient!vo;")
	public Class381 method9147(@OriginalArg(0) int arg0) {
		return new Class381(this.anInt10711, arg0, this.anInt10714, this.anInt10716);
	}
}
