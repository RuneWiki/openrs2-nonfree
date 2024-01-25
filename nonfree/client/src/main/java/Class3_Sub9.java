import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
	private final int anInt711;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private final int anInt703;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	public final int anInt704;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private final int anInt701;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private final int anInt710;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	public final int anInt706;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	public final int anInt696;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	public final int anInt700;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	private final int anInt698;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt711 = arg3;
		this.anInt703 = arg1;
		this.anInt704 = arg5;
		this.anInt701 = arg4;
		this.anInt710 = arg2;
		this.anInt706 = arg6;
		this.anInt696 = arg7;
		this.anInt700 = arg8;
		this.anInt698 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)Z")
	public boolean method552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt704 <= arg0 && this.anInt696 >= arg0 && this.anInt706 <= arg1 && arg1 <= this.anInt700;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[III)V")
	public void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = arg2 + this.anInt703 - this.anInt704;
		arg1[2] = arg0 + this.anInt710 - this.anInt706;
		arg1[0] = this.anInt698;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III[I)V")
	public void method555(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[2] = arg0 + this.anInt706 - this.anInt710;
		arg2[1] = this.anInt704 + arg1 - this.anInt703;
		arg2[0] = 0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBI)Z")
	public boolean method556(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt703 && arg1 <= this.anInt711 && arg0 >= this.anInt710 && arg0 <= this.anInt701;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZI)Z")
	public boolean method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg1 == this.anInt698 && this.anInt703 <= arg2 && this.anInt711 >= arg2 && arg0 >= this.anInt710 && arg0 <= this.anInt701;
	}
}
