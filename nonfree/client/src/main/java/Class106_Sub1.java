import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class106_Sub1 extends Class106 {

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!oh;Lclient!oh;Lclient!aca;)V")
	public Class106_Sub1(@OriginalArg(0) Class237 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class6_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZIIZ)V")
	@Override
	protected void method7195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = this.method7191() * super.aClass6_5.anInt10335 / 10000;
		Static171.aClass16_5.aa(arg0, arg1 + 2, local22, super.aClass6_5.anInt10336 - 2, ((Class6_Sub1) super.aClass6_5).anInt70, 0);
		Static171.aClass16_5.aa(arg0 + local22, arg1 + 2, super.aClass6_5.anInt10335 - local22, super.aClass6_5.anInt10336 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static171.aClass16_5.method6106(arg1 - 2, arg0, super.aClass6_5.anInt10335 + 4, super.aClass6_5.anInt10336 + 2, ((Class6_Sub1) super.aClass6_5).anInt72, 0);
		Static171.aClass16_5.method6106(arg1 - 1, arg0 + 1, super.aClass6_5.anInt10335 + 2, super.aClass6_5.anInt10336, 0, 0);
	}
}
