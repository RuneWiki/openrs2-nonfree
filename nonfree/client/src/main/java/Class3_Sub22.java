import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class3_Sub22 extends Class3 {

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
	public int anInt4429 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
	public int anInt4430 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
	public int anInt4428 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
	public int anInt4431 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
	public int anInt4434 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
	public int anInt4433 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
	public int anInt4432 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
	public int anInt4438 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "Lclient!kq;")
	public final Class3_Sub32 aClass3_Sub32_1;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!kq;)V")
	public Class3_Sub22(@OriginalArg(0) Class3_Sub32 arg0) {
		this.aClass3_Sub32_1 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Z")
	public boolean method3768(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4432 <= arg0 && this.anInt4431 >= arg0 && this.anInt4428 <= arg1 && this.anInt4433 >= arg1) {
			return true;
		} else {
			return this.anInt4430 <= arg0 && this.anInt4434 >= arg0 && this.anInt4429 <= arg1 && this.anInt4438 >= arg1;
		}
	}
}
