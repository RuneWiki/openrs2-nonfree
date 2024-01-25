import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class145 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public int anInt4125;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public int anInt4127;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	public int anInt4130;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "I")
	public int anInt4131;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "I")
	public int anInt4132;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "I")
	public int anInt4133;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "I")
	public int anInt4139;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	public int anInt4135 = 128;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "I")
	public int anInt4137 = 128;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	public int anInt4129;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
	public Class145(@OriginalArg(0) int arg0) {
		this.anInt4129 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIII)V")
	private Class145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4129 = arg0;
		this.anInt4137 = arg2;
		this.anInt4130 = arg4;
		this.anInt4133 = arg5;
		this.anInt4139 = arg3;
		this.anInt4135 = arg1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Lclient!le;")
	public Class145 method3135() {
		return new Class145(this.anInt4129, this.anInt4135, this.anInt4137, this.anInt4139, this.anInt4130, this.anInt4133);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!le;B)V")
	public void method3140(@OriginalArg(0) Class145 arg0) {
		this.anInt4135 = arg0.anInt4135;
		this.anInt4129 = arg0.anInt4129;
		this.anInt4130 = arg0.anInt4130;
		this.anInt4133 = arg0.anInt4133;
		this.anInt4139 = arg0.anInt4139;
		this.anInt4137 = arg0.anInt4137;
	}
}
