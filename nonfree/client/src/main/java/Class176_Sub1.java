import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class176_Sub1 extends Class176 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILclient!lw;)Lclient!lw;")
	@Override
	public Class6_Sub4_Sub8 method5274(@OriginalArg(1) Class6_Sub4_Sub8 arg0) {
		return new Class6_Sub4_Sub8_Sub1(arg0.anInterface11_3, arg0.method4615(), arg0.anInt5381);
	}
}
