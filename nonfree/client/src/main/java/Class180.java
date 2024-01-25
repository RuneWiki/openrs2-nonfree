import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class180 implements Interface22 {

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
	public final int anInt4852;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V")
	public Class180(@OriginalArg(0) int arg0) {
		this.anInt4852 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lclient!ib;")
	@Override
	public Class140 method7197() {
		return Static27.aClass140_12;
	}
}
