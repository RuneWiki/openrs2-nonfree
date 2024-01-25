import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class6_Sub23 extends Class6 {

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
	public final int anInt3151;

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
	public int anInt3148;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(II)V")
	public Class6_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3151 = arg0;
		this.anInt3148 = arg1;
	}
}
